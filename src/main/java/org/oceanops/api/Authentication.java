package org.oceanops.api;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.apache.commons.codec.binary.Hex;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.cayenne.query.SelectById;
import org.oceanops.api.orm.ApiToken;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.WebConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

/**
 * This class handles the authentication for the API calls, based on a API user ID and token.
 * It uses Argon2 algorythm to hask the provided token and compare it to what is in the database.
 * This class is instanciated with the ID and token and sets static values, this can be then read from anywhere in the APIs.
 */
public class Authentication {
    private static Logger logger = LoggerFactory.getLogger(Authentication.class);
    // Final boolean indicating the authentication
    private static boolean isAuthenticated = false;
    // Indicates if the requester has provided a token
    private static boolean useToken = false;
    // Indicates if the contact has been matched
    private static Contact contact = null;

    /**
     * Returns true is the request has passed the authentication, false otherwise.
     * @return 
     */
    public static boolean isAuthenticated() {
        return isAuthenticated;
    }

    /**
     * Returns true is a token has been provided in the request, false otherwise.
     * @return
     */
    public static boolean isUseToken() {
        return useToken;
    }

    /**
     * Returns true if a contact has been found for the API ID provided, false otherwise.
     * @return
     */
    public static Contact getContact() {
        return contact;
    }

    /**
     * Main constructor of this class. Checks and validates the authentication based on the ID and raw token provided.
     * It uses Argon2 to hash the given token and compare it to the database value.
     * @param id the API ID required to validate the authentication. Can indicate the service originating the request or the user.
     * @param rawToken the raw token to be checked against the associated hashed token with the ID.
     * @param rawServiceIdentifier the raw identifier used to authenticate the user from a given service (e.g., the contact web identifier for the web dashboard)
     * @param rawServiceToken the raw token used to authenticate the user from a given service (e.g., the contact web identifier for the web dashboard)
     */
    public Authentication(Integer id, String rawToken, String rawServiceIdentifier, String rawServiceToken){
        // Resetting authentication before proceeding
        Authentication.reset();
        // Check if parameters are not null, otherwise reset of Authentication
        if (id != null && rawToken != null) {
            Authentication.useToken = true;
            ObjectContext context = Utils.getCayenneContext();
            Argon2PasswordEncoder encoder = new Argon2PasswordEncoder();
            ApiToken apiToken = SelectById.query(ApiToken.class, id).selectOne(context);

            // If record found in the database
            if (apiToken != null) {
                // Check token validity
                if(apiToken.getIsValid().intValue() == 1 && 
                    (apiToken.getEndValidity() == null || (apiToken.getEndValidity() != null && apiToken.getEndValidity().isAfter(LocalDateTime.now())))){
                    // Check token matching
                    if(encoder.matches(rawToken, apiToken.getToken())){
                        logger.debug("Token authenticated:" + apiToken.getToken());
                        Authentication.isAuthenticated = true;
                        // updating last used timestamp
                        apiToken.setLastUsed(LocalDateTime.now(ZoneOffset.UTC));
                        context.commitChanges();
                    }
                }
                // Getting contact information. If service authentication, verifying service-user authentication, potentially revoking the authentication
                // Outside of the first authentication scope to keep track of the contact for future usage
                Authentication.contact = apiToken.getContact();
                if(Authentication.contact == null){
                    // Authentication through internal token and service credentials
                    switch (id){
                        case 41: // Web dashboard, require contact
                            Authentication.contact = Authentication.identifyWebUser(rawServiceIdentifier, rawServiceToken, context);
                            if(Authentication.contact == null){
                                Authentication.isAuthenticated = false;
                                logger.debug("Authentication failed");
                            }
                            break;
                        // Some services might use the API without any contact information
                        default:
                            Authentication.contact = null;
                            if(Authentication.contact == null){
                                Authentication.isAuthenticated = false;
                                logger.debug("Authentication failed");
                            }
                            break;
                    }
                }
                else
                    logger.debug("Contact authenticated (ApiToken): " + Authentication.contact.getId().toString());
            }
        }          
    }

    /**
     * Performs an authentication of a user for a request coming from the web dashboard.
     * @param rawIdentifier the identifier used to identify the user.
     * @param rawToken the corresponding token
     * @param context a Cayenne context to fetch the object
     * @return the contact record if matched
     */
    private static Contact identifyWebUser(String rawIdentifier, String rawToken, ObjectContext context) {
        Contact result = null;
        if(rawToken != null && rawIdentifier != null) {
            try {
                MessageDigest mdToken = null;
                mdToken = MessageDigest.getInstance("SHA-1");
                mdToken.reset();
                mdToken.update(rawToken.getBytes("utf8"));
                String cryptedTokenCode = new String(Hex.encodeHex(mdToken.digest()));
                MessageDigest mdIdent = null;
                mdIdent = MessageDigest.getInstance("SHA-1");
                mdIdent.reset();
                mdIdent.update(rawIdentifier.getBytes("utf8"));
                String cryptedIdentCode = new String(Hex.encodeHex(mdIdent.digest()));
                
                WebConnection wc = ObjectSelect.query(WebConnection.class)
                    .where(WebConnection.TOKEN.eq(cryptedTokenCode).andExp(WebConnection.IDENTIFIER.eq(cryptedIdentCode))).selectOne(context);
                   
                if(wc != null && wc.getContact() != null) {
                    logger.debug("Contact authenticated (web dashboard): " + wc.getContact().getId().toString());
                    result = wc.getContact();                    
                }
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
                logger.error("Error while authenticating service user");
            }
        }

        return result;
    }
        
    
    /**
     * Resets the authentication
     */
    public static void reset(){
        Authentication.useToken = false;
        Authentication.isAuthenticated = false;
        Authentication.contact = null;
    }
}
