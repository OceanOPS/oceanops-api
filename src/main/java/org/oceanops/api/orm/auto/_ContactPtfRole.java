package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.Role;

/**
 * Class _ContactPtfRole was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ContactPtfRole extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> SENSOR_MODEL_ID = PropertyFactory.createNumeric("sensorModelId", Integer.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final EntityProperty<Role> ROLE = PropertyFactory.createEntity("role", Role.class);

    protected Integer sensorModelId;

    protected Object contact;
    protected Object ptf;
    protected Object role;

    public void setSensorModelId(Integer sensorModelId) {
        beforePropertyWrite("sensorModelId", this.sensorModelId, sensorModelId);
        this.sensorModelId = sensorModelId;
    }

    public Integer getSensorModelId() {
        beforePropertyRead("sensorModelId");
        return this.sensorModelId;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
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
            case "sensorModelId":
                return this.sensorModelId;
            case "contact":
                return this.contact;
            case "ptf":
                return this.ptf;
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
            case "sensorModelId":
                this.sensorModelId = (Integer)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.sensorModelId);
        out.writeObject(this.contact);
        out.writeObject(this.ptf);
        out.writeObject(this.role);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.sensorModelId = (Integer)in.readObject();
        this.contact = in.readObject();
        this.ptf = in.readObject();
        this.role = in.readObject();
    }

}
