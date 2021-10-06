package org.oceanops.api;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.SelectById;
import org.oceanops.api.orm.ApiToken;
import org.oceanops.api.orm.Contact;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

/**
 * This class handles the authentication for the API calls, based on a API user ID and token.
 * It uses Argon2 algorythm to hask the provided token and compare it to what is in the database.
 * This class is instanciated with the ID and token and sets static values, this can be then read from anywhere in the APIs.
 */
public class Authentication {
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
     * @param id the API ID required to validate the authentication.
     * @param rawToken the raw token to be checked against the associated hashed token with the ID.
     */
    public Authentication(Integer id, String rawToken){
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
                Contact contact = apiToken.getContact();
                // Setting contact. This can differenciates internal tokens (no contact) from outside tokens
                Authentication.contact = contact;
                // Check token validity
                if(apiToken.getIsValid().intValue() == 1 && apiToken.getEndValidity().isAfter(LocalDateTime.now())){
                    // Check token matching
                    if(encoder.matches(rawToken, apiToken.getToken())){
                        Authentication.isAuthenticated = true;
                        // updating last used timestamp
                        apiToken.setLastUsed(LocalDateTime.now(ZoneOffset.UTC));
                        context.commitChanges();
                    }
                }
            }
        }          
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
