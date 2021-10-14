package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Doc;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.UserGroupAgency;
import org.oceanops.api.orm.UserGroupContact;
import org.oceanops.api.orm.Weblink;

/**
 * Class _UserGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserGroup extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final StringProperty<String> EMAIL = PropertyFactory.createString("email", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final ListProperty<Doc> DOCS = PropertyFactory.createList("docs", Doc.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final ListProperty<UserGroupAgency> USER_GROUP_AGENCIES = PropertyFactory.createList("userGroupAgencies", UserGroupAgency.class);
    public static final ListProperty<UserGroupContact> USER_GROUP_CONTACTS = PropertyFactory.createList("userGroupContacts", UserGroupContact.class);
    public static final ListProperty<Weblink> WEBLINKS = PropertyFactory.createList("weblinks", Weblink.class);

    protected String description;
    protected String email;
    protected Integer id;
    protected String name;
    protected String nameShort;

    protected Object docs;
    protected Object network;
    protected Object userGroupAgencies;
    protected Object userGroupContacts;
    protected Object weblinks;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setEmail(String email) {
        beforePropertyWrite("email", this.email, email);
        this.email = email;
    }

    public String getEmail() {
        beforePropertyRead("email");
        return this.email;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
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

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "email":
                return this.email;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "docs":
                return this.docs;
            case "network":
                return this.network;
            case "userGroupAgencies":
                return this.userGroupAgencies;
            case "userGroupContacts":
                return this.userGroupContacts;
            case "weblinks":
                return this.weblinks;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "description":
                this.description = (String)val;
                break;
            case "email":
                this.email = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "docs":
                this.docs = val;
                break;
            case "network":
                this.network = val;
                break;
            case "userGroupAgencies":
                this.userGroupAgencies = val;
                break;
            case "userGroupContacts":
                this.userGroupContacts = val;
                break;
            case "weblinks":
                this.weblinks = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.description);
        out.writeObject(this.email);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.docs);
        out.writeObject(this.network);
        out.writeObject(this.userGroupAgencies);
        out.writeObject(this.userGroupContacts);
        out.writeObject(this.weblinks);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.email = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.docs = in.readObject();
        this.network = in.readObject();
        this.userGroupAgencies = in.readObject();
        this.userGroupContacts = in.readObject();
        this.weblinks = in.readObject();
    }

}
