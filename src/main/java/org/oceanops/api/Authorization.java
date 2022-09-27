package org.oceanops.api;

import java.util.ArrayList;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.ProgramContact;
import org.oceanops.api.orm.PtfDeployment;
import org.oceanops.api.orm.Ship;
import org.oceanops.api.orm.Telecom;

import io.agrest.SelectBuilder;
import io.agrest.meta.AgEntityOverlay;
import io.agrest.runtime.AgRuntimeBuilder;

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
    public static boolean hasEditRightForProgram(Integer programId, ObjectContext providedContext){
        ObjectContext context = providedContext;
        if(providedContext == null)
            context = Utils.getCayenneContext();
        else
            context = providedContext;
        boolean result = false;
        if(Authentication.isAuthenticated() && Authentication.getContact() != null){
            // If admin, has the rights
            if(Authentication.getContact().getAdmin() == 1)
                result = true;
            else{
                // Checking in ProgramContact
                long count = ObjectSelect.query(ProgramContact.class)
                    .where(
                        ProgramContact.CONTACT.eq(Authentication.getContact())
                            .andExp(ProgramContact.PROGRAM.eqId(programId))
                    ).selectCount(context);
                if(count > 0)
                    result = true;
            }
        }
        // If service without contact authenticated
        else if(Authentication.isAuthenticated())
            result = true;
        
        return result;
    }

    /**
     * When then AgRest engine starts, aplying global authorization.
     * @param agBuilder The AgRuntimeBuilder used for the request engine.
     * @return The input AgRuntimeBuilder, modified.
     */
    public static AgRuntimeBuilder applyGlobalAuthorization(AgRuntimeBuilder agBuilder){
        // Overlaying Contact entity
		agBuilder.entityOverlay(new AgEntityOverlay<Contact>(Contact.class).readablePropFilter(
            b -> b.property(Contact.LOGIN.getName(), false)
                .property(Contact.PASSWD.getName(), false)
                .property(Contact.IS_PRIVATE.getName(), false)
                .property(Contact.ADMIN.getName(), false)
                .property(Contact.GREETINGS.getName(), false)
                .property(Contact.GDPR_APPROVED.getName(), false)
            ).writablePropFilter(
            b -> b.property(Contact.LOGIN.getName(), false)
                .property(Contact.PASSWD.getName(), false)
                .property(Contact.IS_PRIVATE.getName(), false)
                .property(Contact.ADMIN.getName(), false)
                .property(Contact.GREETINGS.getName(), false)
                .property(Contact.GDPR_APPROVED.getName(), false)
            )
        );

		// ProgramContact MZMS exclusion
		agBuilder.entityOverlay(new AgEntityOverlay<ProgramContact>(ProgramContact.class).readablePropFilter(
            b -> b.property(ProgramContact.MZMS_AUTO_CHECK.getName(), false)
                .property(ProgramContact.MZMS_WARNING_ENABLED.getName(), false)
            ).writablePropFilter(
            b -> b.property(ProgramContact.MZMS_AUTO_CHECK.getName(), false)
                .property(ProgramContact.MZMS_WARNING_ENABLED.getName(), false)
            )
        );

        

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
            sBuilder.entityOverlay(new AgEntityOverlay<PtfDeployment>(PtfDeployment.class).toOne(
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
            sBuilder.entityOverlay(new AgEntityOverlay<Ship>(Ship.class).readablePropFilter(
                b -> b.property(Ship.CONTACT_SEA_EMAIL.getName(), false)
                .property(Ship.CONTACT_SHORE_EMAIL.getName(), false)
                .property(Ship.CONTACT_SEA_EMAIL2.getName(), false)
                .property(Ship.CONTACT_SHORE_EMAIL2.getName(), false)
                .property(Ship.CONTACT_SEA_EMAIL3.getName(), false)
                .property(Ship.CONTACT_SHORE_EMAIL3.getName(), false)
                .property(Ship.CONTACT_SHORE_NAME.getName(), false)
            ).toMany(
                Ship.PTF_DEPLOYMENTS.getName(), PtfDeployment.class,
                eo -> {
                    if(eo.getHideMetadata().intValue() == 1){
                        return new ArrayList<PtfDeployment>();
                    }
                    else
                        return eo.getPtfDeployments();     
                }             
            ).toMany(
                Ship.CRUISES.getName(), Cruise.class,
                eo -> {
                    if(eo.getHideMetadata().intValue() == 1){
                        return new ArrayList<Cruise>();
                    }
                    else
                        return eo.getCruises();     
                }             
            ));

            // Contact overlaying
            sBuilder.entityOverlay(new AgEntityOverlay<Contact>(Contact.class)
                .attribute(Contact.EMAIL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail(): null)
                .attribute(Contact.EMAIL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail2(): null)
                .attribute(Contact.TEL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel(): null)
                .attribute(Contact.TEL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel2(): null)
                .attribute(Contact.ADDRESS.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getAddress(): null)
                .attribute(Contact.FAX.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getFax(): null)
                .readablePropFilter(
                    b -> b.property(Contact.NC_NOTIFICATIONS.getName(), false)
                    .property(Contact.NC_SUBSCRIPTIONS.getName(), false)
                    .property(Contact.WEB_CONNECTIONS.getName(), false)
                    .property(Contact.WEB_CONTACT_MODULES.getName(), false)
                    .property(Contact.WEB_CONTACT_PREFERENCES.getName(), false)
                    .property(Contact.WEB_FREQUENTATIONS.getName(), false)
                    .property(Contact.WEB_QUERIES.getName(), false)
                    .property(Contact.WEB_WORKSPACES.getName(), false)
                )
            );
            
            // ProgramContact overlaying
            sBuilder.entityOverlay(new AgEntityOverlay<ProgramContact>(ProgramContact.class)
                .readablePropFilter(
                    b -> b.property(ProgramContact.MZMS_AUTO_CHECK.getName(), false)
                    .property(ProgramContact.MZMS_WARNING_ENABLED.getName(), false)
                )
            );
        }

        if(!(Authentication.isAuthenticated())){
            // Non logged user filtering
            // Telecom IMEI only visible if authenticated
            sBuilder.entityOverlay(new AgEntityOverlay<Telecom>(Telecom.class)
                .readablePropFilter(
                    b -> b.property(Telecom.IMEI.getName(), false)
                )
            );
        }

        return sBuilder;
    }
}
