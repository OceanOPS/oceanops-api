package org.oceanops.api;

import java.util.ArrayList;

import org.apache.cayenne.query.ObjectSelect;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.ProgramContact;
import org.oceanops.api.orm.PtfDeployment;
import org.oceanops.api.orm.Ship;

import io.agrest.SelectBuilder;
import io.agrest.meta.AgEntityOverlay;
import io.agrest.runtime.AgBuilder;

/**
 * Applies the different constraints based on the identity provided to query the API
 */
public class Authorization {
    public Authorization(){        
    }

    /**
     * Checks if a authenticated user can edit elements associated with a given program.
     * The method will check, by order of importance:
     * <ul>
     *  <li>if the user is authenticated: return false if not</li>
     *  <li>if the user is administrator: return true if yes</li>
     *  <li>if the user is associated to the program: return true if yes, false if not</li>
     * </ul>
     * @param programId The ID of the concerned program.
     * @return A boolean resulting of the algorythm described above.
     */
    public static boolean hasEditRightForProgram(Integer programId){
        boolean result = false;
        if(Authentication.isAuthenticated()){
            // If admin, has the rights
            if(Authentication.getContact().getAdmin() == 1)
                result = true;
            else{
                // Checking in ProgramContact
                long count = ObjectSelect.query(ProgramContact.class)
                    .where(
                        ProgramContact.CONTACT.eq(Authentication.getContact())
                            .andExp(ProgramContact.PROGRAM.eqId(programId))
                    ).selectCount(Utils.getCayenneContext());
                if(count > 0)
                    result = true;
            }
        }
        
        return result;
    }

    /**
     * When then AgRest engine starts, aplying global authorization.
     * @param agBuilder The AgBuilder used for the request engine.
     * @return The input AgBuilder, modified.
     */
    public static AgBuilder applyGlobalAuthorization(AgBuilder agBuilder){
        // Overlaying Contact entity
		agBuilder.entityOverlay(new AgEntityOverlay<Contact>(Contact.class).exclude(
			Contact.LOGIN.getName(), 
			Contact.PASSWD.getName(),
			Contact.IS_PRIVATE.getName(),
			Contact.ADMIN.getName(),
			Contact.GREETINGS.getName(),
            Contact.GDPR_APPROVED.getName()
		));

		// ProgramContact MZMS exclusion
		agBuilder.entityOverlay(new AgEntityOverlay<ProgramContact>(ProgramContact.class).exclude(
			ProgramContact.MZMS_AUTO_CHECK.getName(),
			ProgramContact.MZMS_WARNING_ENABLED.getName()
		));

        

        return agBuilder;
    }

    /**
     * Applies filtering on a request based on the presence or not of an authenticated user.
     * @param sBuilder The SelectBuilder used for the current query.
     * @return The provided SelectBuilder, modified.
     */
    public static SelectBuilder<?> applySelectAuthorization(SelectBuilder<?> sBuilder){
        // If the user is not authenticated as an administrator
        if(!(Authentication.isAuthenticated() && Authentication.getContact().getAdmin().intValue() == 1)){
            // Overlaying PtfDeployment
            sBuilder.entityOverlay(new AgEntityOverlay<PtfDeployment>(PtfDeployment.class).redefineToOne(
                    PtfDeployment.SHIP.getName(), Ship.class,
                    eo -> {
                        if(eo.getShip() != null){
                            if(eo.getShip().getHideMetadata().intValue() == 1){
                                return null;
                            }
                            else
                                return eo.getShip();
                        }
                        else
                            return null;       
                    }             
                )
            );
            
            // Overlaying ship
            sBuilder.entityOverlay(new AgEntityOverlay<Ship>(Ship.class).exclude(
                Ship.CONTACT_SEA_EMAIL.getName(),
                Ship.CONTACT_SHORE_EMAIL.getName(),
                Ship.CONTACT_SEA_EMAIL2.getName(),
                Ship.CONTACT_SHORE_EMAIL2.getName(),
                Ship.CONTACT_SEA_EMAIL3.getName(),
                Ship.CONTACT_SHORE_EMAIL3.getName(),
                Ship.CONTACT_SHORE_NAME.getName()
            ).redefineToMany(
                Ship.PTF_DEPLOYMENTS.getName(), PtfDeployment.class,
                eo -> {
                    if(eo.getHideMetadata().intValue() == 1){
                        return new ArrayList<PtfDeployment>();
                    }
                    else
                        return eo.getPtfDeployments();     
                }             
            ).redefineToMany(
                Ship.CRUISES.getName(), Cruise.class,
                eo -> {
                    if(eo.getHideMetadata().intValue() == 1){
                        return new ArrayList<Cruise>();
                    }
                    else
                        return eo.getCruises();     
                }             
            ));

            sBuilder.entityOverlay(new AgEntityOverlay<Contact>(Contact.class)
                .redefineAttribute(Contact.EMAIL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail(): null)
                .redefineAttribute(Contact.EMAIL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail2(): null)
                .redefineAttribute(Contact.TEL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel(): null)
                .redefineAttribute(Contact.TEL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel2(): null)
                .redefineAttribute(Contact.ADDRESS.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getAddress(): null)
                .redefineAttribute(Contact.FAX.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getFax(): null)
                .exclude("ncNotifications","ncSubscriptions","webConnections","webContactModules",
                    "webContactPreferences","webFrequentations","webQueries","webWorkspaces")
            );
            
            sBuilder.entityOverlay(new AgEntityOverlay<ProgramContact>(ProgramContact.class)
                .exclude("mzmsAutoCheck","mzmsWarningEnabled")
            );
        }

        if(!(Authentication.isAuthenticated())){
            // Non logged user filtering
        }

        return sBuilder;
    }
}
