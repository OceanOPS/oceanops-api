package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericIdProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Contact;

/**
 * Class _ApiToken was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ApiToken extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final NumericIdProperty<BigDecimal> ID_PK_PROPERTY = PropertyFactory.createNumericId("ID", "ApiToken", BigDecimal.class);
    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> CONTACT_ID = PropertyFactory.createNumeric("contactId", BigDecimal.class);
    public static final DateProperty<LocalDateTime> CREATION_DATE = PropertyFactory.createDate("creationDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> END_VALIDITY = PropertyFactory.createDate("endValidity", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> IS_VALID = PropertyFactory.createNumeric("isValid", BigDecimal.class);
    public static final DateProperty<LocalDateTime> LAST_USED = PropertyFactory.createDate("lastUsed", LocalDateTime.class);
    public static final StringProperty<String> TOKEN = PropertyFactory.createString("token", String.class);
    public static final StringProperty<String> TYPE = PropertyFactory.createString("type", String.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);

    protected BigDecimal contactId;
    protected LocalDateTime creationDate;
    protected LocalDateTime endValidity;
    protected BigDecimal isValid;
    protected LocalDateTime lastUsed;
    protected String token;
    protected String type;

    protected Object contact;

    public void setContactId(BigDecimal contactId) {
        beforePropertyWrite("contactId", this.contactId, contactId);
        this.contactId = contactId;
    }

    public BigDecimal getContactId() {
        beforePropertyRead("contactId");
        return this.contactId;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        beforePropertyWrite("creationDate", this.creationDate, creationDate);
        this.creationDate = creationDate;
    }

    public LocalDateTime getCreationDate() {
        beforePropertyRead("creationDate");
        return this.creationDate;
    }

    public void setEndValidity(LocalDateTime endValidity) {
        beforePropertyWrite("endValidity", this.endValidity, endValidity);
        this.endValidity = endValidity;
    }

    public LocalDateTime getEndValidity() {
        beforePropertyRead("endValidity");
        return this.endValidity;
    }

    public void setIsValid(BigDecimal isValid) {
        beforePropertyWrite("isValid", this.isValid, isValid);
        this.isValid = isValid;
    }

    public BigDecimal getIsValid() {
        beforePropertyRead("isValid");
        return this.isValid;
    }

    public void setLastUsed(LocalDateTime lastUsed) {
        beforePropertyWrite("lastUsed", this.lastUsed, lastUsed);
        this.lastUsed = lastUsed;
    }

    public LocalDateTime getLastUsed() {
        beforePropertyRead("lastUsed");
        return this.lastUsed;
    }

    public void setToken(String token) {
        beforePropertyWrite("token", this.token, token);
        this.token = token;
    }

    public String getToken() {
        beforePropertyRead("token");
        return this.token;
    }

    public void setType(String type) {
        beforePropertyWrite("type", this.type, type);
        this.type = type;
    }

    public String getType() {
        beforePropertyRead("type");
        return this.type;
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
            case "creationDate":
                return this.creationDate;
            case "endValidity":
                return this.endValidity;
            case "isValid":
                return this.isValid;
            case "lastUsed":
                return this.lastUsed;
            case "token":
                return this.token;
            case "type":
                return this.type;
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
            case "creationDate":
                this.creationDate = (LocalDateTime)val;
                break;
            case "endValidity":
                this.endValidity = (LocalDateTime)val;
                break;
            case "isValid":
                this.isValid = (BigDecimal)val;
                break;
            case "lastUsed":
                this.lastUsed = (LocalDateTime)val;
                break;
            case "token":
                this.token = (String)val;
                break;
            case "type":
                this.type = (String)val;
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
        out.writeObject(this.creationDate);
        out.writeObject(this.endValidity);
        out.writeObject(this.isValid);
        out.writeObject(this.lastUsed);
        out.writeObject(this.token);
        out.writeObject(this.type);
        out.writeObject(this.contact);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.contactId = (BigDecimal)in.readObject();
        this.creationDate = (LocalDateTime)in.readObject();
        this.endValidity = (LocalDateTime)in.readObject();
        this.isValid = (BigDecimal)in.readObject();
        this.lastUsed = (LocalDateTime)in.readObject();
        this.token = (String)in.readObject();
        this.type = (String)in.readObject();
        this.contact = in.readObject();
    }

}
