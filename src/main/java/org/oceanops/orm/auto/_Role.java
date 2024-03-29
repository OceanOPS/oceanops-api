package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.ContactPtfRole;
import org.oceanops.orm.ContactSiteRole;
import org.oceanops.orm.CruiseContact;
import org.oceanops.orm.NetworkContact;
import org.oceanops.orm.ProgramContact;
import org.oceanops.orm.UserGroupContact;

/**
 * Class _Role was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Role extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_ALTER = PropertyFactory.createString("nameAlter", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final NumericProperty<Integer> RANK = PropertyFactory.createNumeric("rank", Integer.class);
    public static final ListProperty<ContactPtfRole> CONTACT_PTF_ROLES = PropertyFactory.createList("contactPtfRoles", ContactPtfRole.class);
    public static final ListProperty<ContactSiteRole> CONTACT_SITE_ROLES = PropertyFactory.createList("contactSiteRoles", ContactSiteRole.class);
    public static final ListProperty<CruiseContact> CRUISE_CONTACTS = PropertyFactory.createList("cruiseContacts", CruiseContact.class);
    public static final ListProperty<NetworkContact> NETWORK_CONTACTS = PropertyFactory.createList("networkContacts", NetworkContact.class);
    public static final ListProperty<ProgramContact> PROGRAM_CONTACTS = PropertyFactory.createList("programContacts", ProgramContact.class);
    public static final ListProperty<UserGroupContact> USER_GROUP_CONTACTS = PropertyFactory.createList("userGroupContacts", UserGroupContact.class);

    protected String description;
    protected Integer id;
    protected String name;
    protected String nameAlter;
    protected String nameShort;
    protected Integer rank;

    protected Object contactPtfRoles;
    protected Object contactSiteRoles;
    protected Object cruiseContacts;
    protected Object networkContacts;
    protected Object programContacts;
    protected Object userGroupContacts;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
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

    public void setNameAlter(String nameAlter) {
        beforePropertyWrite("nameAlter", this.nameAlter, nameAlter);
        this.nameAlter = nameAlter;
    }

    public String getNameAlter() {
        beforePropertyRead("nameAlter");
        return this.nameAlter;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setRank(Integer rank) {
        beforePropertyWrite("rank", this.rank, rank);
        this.rank = rank;
    }

    public Integer getRank() {
        beforePropertyRead("rank");
        return this.rank;
    }

    public void addToContactPtfRoles(ContactPtfRole obj) {
        addToManyTarget("contactPtfRoles", obj, true);
    }

    public void removeFromContactPtfRoles(ContactPtfRole obj) {
        removeToManyTarget("contactPtfRoles", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ContactPtfRole> getContactPtfRoles() {
        return (List<ContactPtfRole>)readProperty("contactPtfRoles");
    }

    public void addToContactSiteRoles(ContactSiteRole obj) {
        addToManyTarget("contactSiteRoles", obj, true);
    }

    public void removeFromContactSiteRoles(ContactSiteRole obj) {
        removeToManyTarget("contactSiteRoles", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ContactSiteRole> getContactSiteRoles() {
        return (List<ContactSiteRole>)readProperty("contactSiteRoles");
    }

    public void addToCruiseContacts(CruiseContact obj) {
        addToManyTarget("cruiseContacts", obj, true);
    }

    public void removeFromCruiseContacts(CruiseContact obj) {
        removeToManyTarget("cruiseContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CruiseContact> getCruiseContacts() {
        return (List<CruiseContact>)readProperty("cruiseContacts");
    }

    public void addToNetworkContacts(NetworkContact obj) {
        addToManyTarget("networkContacts", obj, true);
    }

    public void removeFromNetworkContacts(NetworkContact obj) {
        removeToManyTarget("networkContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<NetworkContact> getNetworkContacts() {
        return (List<NetworkContact>)readProperty("networkContacts");
    }

    public void addToProgramContacts(ProgramContact obj) {
        addToManyTarget("programContacts", obj, true);
    }

    public void removeFromProgramContacts(ProgramContact obj) {
        removeToManyTarget("programContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ProgramContact> getProgramContacts() {
        return (List<ProgramContact>)readProperty("programContacts");
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

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameAlter":
                return this.nameAlter;
            case "nameShort":
                return this.nameShort;
            case "rank":
                return this.rank;
            case "contactPtfRoles":
                return this.contactPtfRoles;
            case "contactSiteRoles":
                return this.contactSiteRoles;
            case "cruiseContacts":
                return this.cruiseContacts;
            case "networkContacts":
                return this.networkContacts;
            case "programContacts":
                return this.programContacts;
            case "userGroupContacts":
                return this.userGroupContacts;
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
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameAlter":
                this.nameAlter = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "rank":
                this.rank = (Integer)val;
                break;
            case "contactPtfRoles":
                this.contactPtfRoles = val;
                break;
            case "contactSiteRoles":
                this.contactSiteRoles = val;
                break;
            case "cruiseContacts":
                this.cruiseContacts = val;
                break;
            case "networkContacts":
                this.networkContacts = val;
                break;
            case "programContacts":
                this.programContacts = val;
                break;
            case "userGroupContacts":
                this.userGroupContacts = val;
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
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameAlter);
        out.writeObject(this.nameShort);
        out.writeObject(this.rank);
        out.writeObject(this.contactPtfRoles);
        out.writeObject(this.contactSiteRoles);
        out.writeObject(this.cruiseContacts);
        out.writeObject(this.networkContacts);
        out.writeObject(this.programContacts);
        out.writeObject(this.userGroupContacts);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameAlter = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.rank = (Integer)in.readObject();
        this.contactPtfRoles = in.readObject();
        this.contactSiteRoles = in.readObject();
        this.cruiseContacts = in.readObject();
        this.networkContacts = in.readObject();
        this.programContacts = in.readObject();
        this.userGroupContacts = in.readObject();
    }

}
