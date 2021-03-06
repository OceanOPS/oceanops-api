package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;

/**
 * Class _WebContactPreferences was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebContactPreferences extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";

    public static final NumericProperty<BigDecimal> CONTACT_ID = PropertyFactory.createNumeric("contactId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LITE_GIS = PropertyFactory.createNumeric("liteGis", BigDecimal.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);

    protected BigDecimal contactId;
    protected BigDecimal liteGis;

    protected Object contact;

    public void setContactId(BigDecimal contactId) {
        beforePropertyWrite("contactId", this.contactId, contactId);
        this.contactId = contactId;
    }

    public BigDecimal getContactId() {
        beforePropertyRead("contactId");
        return this.contactId;
    }

    public void setLiteGis(BigDecimal liteGis) {
        beforePropertyWrite("liteGis", this.liteGis, liteGis);
        this.liteGis = liteGis;
    }

    public BigDecimal getLiteGis() {
        beforePropertyRead("liteGis");
        return this.liteGis;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "contactId":
                return this.contactId;
            case "liteGis":
                return this.liteGis;
            case "contact":
                return this.contact;
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
                this.contactId = (BigDecimal)val;
                break;
            case "liteGis":
                this.liteGis = (BigDecimal)val;
                break;
            case "contact":
                this.contact = val;
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
        out.writeObject(this.liteGis);
        out.writeObject(this.contact);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.contactId = (BigDecimal)in.readObject();
        this.liteGis = (BigDecimal)in.readObject();
        this.contact = in.readObject();
    }

}
