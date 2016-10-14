package jcommops.db.orm.rest.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Doc;
import jcommops.db.orm.rest.MasterProg;
import jcommops.db.orm.rest.UserGroupAgency;
import jcommops.db.orm.rest.UserGroupContact;
import jcommops.db.orm.rest.Weblink;

/**
 * Class _UserGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserGroup extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EMAIL_PROPERTY = "email";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String DOC_ARRAY_PROPERTY = "docArray";
    public static final String TO_MASTER_PROG_PROPERTY = "toMasterProg";
    public static final String USER_GROUP_AGENCY_ARRAY_PROPERTY = "userGroupAgencyArray";
    public static final String USER_GROUP_CONTACT_ARRAY_PROPERTY = "userGroupContactArray";
    public static final String WEBLINK_ARRAY_PROPERTY = "weblinkArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setEmail(String email) {
        writeProperty(EMAIL_PROPERTY, email);
    }
    public String getEmail() {
        return (String)readProperty(EMAIL_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToDocArray(Doc obj) {
        addToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromDocArray(Doc obj) {
        removeToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocArray() {
        return (List<Doc>)readProperty(DOC_ARRAY_PROPERTY);
    }


    public void setToMasterProg(MasterProg toMasterProg) {
        setToOneTarget(TO_MASTER_PROG_PROPERTY, toMasterProg, true);
    }

    public MasterProg getToMasterProg() {
        return (MasterProg)readProperty(TO_MASTER_PROG_PROPERTY);
    }


    public void addToUserGroupAgencyArray(UserGroupAgency obj) {
        addToManyTarget(USER_GROUP_AGENCY_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromUserGroupAgencyArray(UserGroupAgency obj) {
        removeToManyTarget(USER_GROUP_AGENCY_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupAgency> getUserGroupAgencyArray() {
        return (List<UserGroupAgency>)readProperty(USER_GROUP_AGENCY_ARRAY_PROPERTY);
    }


    public void addToUserGroupContactArray(UserGroupContact obj) {
        addToManyTarget(USER_GROUP_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromUserGroupContactArray(UserGroupContact obj) {
        removeToManyTarget(USER_GROUP_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupContact> getUserGroupContactArray() {
        return (List<UserGroupContact>)readProperty(USER_GROUP_CONTACT_ARRAY_PROPERTY);
    }


    public void addToWeblinkArray(Weblink obj) {
        addToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromWeblinkArray(Weblink obj) {
        removeToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Weblink> getWeblinkArray() {
        return (List<Weblink>)readProperty(WEBLINK_ARRAY_PROPERTY);
    }


}
