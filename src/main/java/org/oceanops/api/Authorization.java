package org.oceanops.api;

import java.util.ArrayList;

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

    public static AgBuilder applyGlobalAuthorization(AgBuilder agBuilder){
        // Overlaying Contact entity
		agBuilder.entityOverlay(new AgEntityOverlay<Contact>(Contact.class).exclude(
			Contact.LOGIN.getName(), 
			Contact.PASSWD.getName(),
			Contact.IS_PRIVATE.getName(),
			Contact.ADMIN.getName(),
			Contact.GREETINGS.getName()
		).redefineAttribute(Contact.EMAIL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail(): null)
			.redefineAttribute(Contact.EMAIL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getEmail2(): null)
			.redefineAttribute(Contact.TEL.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel(): null)
			.redefineAttribute(Contact.TEL2.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getTel2(): null)
			.redefineAttribute(Contact.ADDRESS.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getAddress(): null)
			.redefineAttribute(Contact.FAX.getName(), String.class, ea -> ea.getIsPrivate().intValue() == 0 ? ea.getFax(): null)
		);

		// ProgramContact MZMS exclusion
		agBuilder.entityOverlay(new AgEntityOverlay<ProgramContact>(ProgramContact.class).exclude(
			ProgramContact.MZMS_AUTO_CHECK.getName(),
			ProgramContact.MZMS_WARNING_ENABLED.getName()
		));

        

        return agBuilder;
    }

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
        }

        return sBuilder;
    }
}
