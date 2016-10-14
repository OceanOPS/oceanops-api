package jcommops.db.orm.rest.auto;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Contact;
import jcommops.db.orm.rest.Program;
import jcommops.db.orm.rest.Role;

/**
 * Class _ProgramContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ProgramContact extends CayenneDataObject {

    public static final String MZMS_AUTO_CHECK_PROPERTY = "mzmsAutoCheck";
    public static final String MZMS_WARNING_ENABLED_PROPERTY = "mzmsWarningEnabled";
    public static final String TO_CONTACT_PROPERTY = "toContact";
    public static final String TO_PROGRAM_PROPERTY = "toProgram";
    public static final String TO_ROLE_PROPERTY = "toRole";

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String PROGRAM_ID_PK_COLUMN = "PROGRAM_ID";
    public static final String ROLE_ID_PK_COLUMN = "ROLE_ID";

    public void setMzmsAutoCheck(Integer mzmsAutoCheck) {
        writeProperty(MZMS_AUTO_CHECK_PROPERTY, mzmsAutoCheck);
    }
    public Integer getMzmsAutoCheck() {
        return (Integer)readProperty(MZMS_AUTO_CHECK_PROPERTY);
    }

    public void setMzmsWarningEnabled(Integer mzmsWarningEnabled) {
        writeProperty(MZMS_WARNING_ENABLED_PROPERTY, mzmsWarningEnabled);
    }
    public Integer getMzmsWarningEnabled() {
        return (Integer)readProperty(MZMS_WARNING_ENABLED_PROPERTY);
    }

    public void setToContact(Contact toContact) {
        setToOneTarget(TO_CONTACT_PROPERTY, toContact, true);
    }

    public Contact getToContact() {
        return (Contact)readProperty(TO_CONTACT_PROPERTY);
    }


    public void setToProgram(Program toProgram) {
        setToOneTarget(TO_PROGRAM_PROPERTY, toProgram, true);
    }

    public Program getToProgram() {
        return (Program)readProperty(TO_PROGRAM_PROPERTY);
    }


    public void setToRole(Role toRole) {
        setToOneTarget(TO_ROLE_PROPERTY, toRole, true);
    }

    public Role getToRole() {
        return (Role)readProperty(TO_ROLE_PROPERTY);
    }


}
