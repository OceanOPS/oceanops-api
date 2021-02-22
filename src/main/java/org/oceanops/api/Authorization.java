package org.oceanops.api;

import org.oceanops.api.orm.Contact;
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
        // Overlaying PtfDeployment
        if(!(Authentication.isAuthenticated() && Authentication.getContact().getAdmin().intValue() == 1)){
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
        }

        return sBuilder;
    }
}
