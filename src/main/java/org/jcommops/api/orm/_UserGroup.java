package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _UserGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserGroup extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> EMAIL = Property.create("email", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<List<Doc>> DOCS = Property.create("docs", List.class);
    public static final Property<Network> NETWORK = Property.create("network", Network.class);
    public static final Property<List<UserGroupAgency>> USER_GROUP_AGENCIES = Property.create("userGroupAgencies", List.class);
    public static final Property<List<UserGroupContact>> USER_GROUP_CONTACTS = Property.create("userGroupContacts", List.class);
    public static final Property<List<Weblink>> WEBLINKS = Property.create("weblinks", List.class);

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setNameShort(String nameShort) {
        writeProperty("nameShort", nameShort);
    }
    public String getNameShort() {
        return (String)readProperty("nameShort");
    }

    public void addToDocs(Doc obj) {
        addToManyTarget("docs", obj, true);
    }
    public void removeFromDocs(Doc obj) {
        removeToManyTarget("docs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocs() {
        return (List<Doc>)readProperty("docs");
    }


    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }


    public void addToUserGroupAgencies(UserGroupAgency obj) {
        addToManyTarget("userGroupAgencies", obj, true);
    }
    public void removeFromUserGroupAgencies(UserGroupAgency obj) {
        removeToManyTarget("userGroupAgencies", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupAgency> getUserGroupAgencies() {
        return (List<UserGroupAgency>)readProperty("userGroupAgencies");
    }


    public void addToUserGroupContacts(UserGroupContact obj) {
        addToManyTarget("userGroupContacts", obj, true);
    }
    public void removeFromUserGroupContacts(UserGroupContact obj) {
        removeToManyTarget("userGroupContacts", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupContact> getUserGroupContacts() {
        return (List<UserGroupContact>)readProperty("userGroupContacts");
    }


    public void addToWeblinks(Weblink obj) {
        addToManyTarget("weblinks", obj, true);
    }
    public void removeFromWeblinks(Weblink obj) {
        removeToManyTarget("weblinks", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Weblink> getWeblinks() {
        return (List<Weblink>)readProperty("weblinks");
    }


}
