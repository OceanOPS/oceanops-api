package org.oceanops.api;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.SelectById;
import org.oceanops.api.orm.ApiToken;
import org.oceanops.api.orm.Contact;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class Authentication {
    private static boolean isAuthenticated = false;
    private static boolean useToken = false;
    private static Contact contact = null;

    public static boolean isAuthenticated() {
        return isAuthenticated;
    }

    public static boolean isUseToken() {
        return useToken;
    }

    public static void setUseToken(boolean useToken) {
        Authentication.useToken = useToken;
    }

    public static Contact getContact() {
        return contact;
    }

    public Authentication(Integer id, String rawToken){
        if (id != null && rawToken != null) {
            Authentication.setUseToken(true);
            ObjectContext context = Utils.getCayenneContext();
            Argon2PasswordEncoder encoder = new Argon2PasswordEncoder();
            ApiToken apiToken = SelectById.query(ApiToken.class, id).selectOne(context);

            if (apiToken != null) {
                Contact contact = apiToken.getContact();
                if(contact != null){
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
    }
    
    
}
