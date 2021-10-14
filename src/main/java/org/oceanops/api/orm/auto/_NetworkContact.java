package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.Role;

/**
 * Class _NetworkContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkContact extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";
    public static final String ROLE_ID_PK_COLUMN = "ROLE_ID";

    public static final NumericProperty<Integer> CONTACT_ID = PropertyFactory.createNumeric("contactId", Integer.class);
    public static final NumericProperty<Integer> NETWORK_ID = PropertyFactory.createNumeric("networkId", Integer.class);
    public static final NumericProperty<Integer> ROLE_ID = PropertyFactory.createNumeric("roleId", Integer.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<Role> ROLE = PropertyFactory.createEntity("role", Role.class);

    protected Integer contactId;
    protected Integer networkId;
    protected Integer roleId;

    protected Object contact;
    protected Object network;
    protected Object role;

    public void setContactId(Integer contactId) {
        beforePropertyWrite("contactId", this.contactId, contactId);
        this.contactId = contactId;
    }

    public Integer getContactId() {
        beforePropertyRead("contactId");
        return this.contactId;
    }

    public void setNetworkId(Integer networkId) {
        beforePropertyWrite("networkId", this.networkId, networkId);
        this.networkId = networkId;
    }

    public Integer getNetworkId() {
        beforePropertyRead("networkId");
        return this.networkId;
    }

    public void setRoleId(Integer roleId) {
        beforePropertyWrite("roleId", this.roleId, roleId);
        this.roleId = roleId;
    }

    public Integer getRoleId() {
        beforePropertyRead("roleId");
        return this.roleId;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setRole(Role role) {
        setToOneTarget("role", role, true);
    }

    public Role getRole() {
        return (Role)readProperty("role");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "contactId":
                return this.contactId;
            case "networkId":
                return this.networkId;
            case "roleId":
                return this.roleId;
            case "contact":
                return this.contact;
            case "network":
                return this.network;
            case "role":
                return this.role;
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
            case "contactId":
                this.contactId = (Integer)val;
                break;
            case "networkId":
                this.networkId = (Integer)val;
                break;
            case "roleId":
                this.roleId = (Integer)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "network":
                this.network = val;
                break;
            case "role":
                this.role = val;
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
        out.writeObject(this.contactId);
        out.writeObject(this.networkId);
        out.writeObject(this.roleId);
        out.writeObject(this.contact);
        out.writeObject(this.network);
        out.writeObject(this.role);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.contactId = (Integer)in.readObject();
        this.networkId = (Integer)in.readObject();
        this.roleId = (Integer)in.readObject();
        this.contact = in.readObject();
        this.network = in.readObject();
        this.role = in.readObject();
    }

}
