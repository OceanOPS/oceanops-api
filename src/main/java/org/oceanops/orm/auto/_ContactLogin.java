package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Contact;

/**
 * Class _ContactLogin was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ContactLogin extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";

    public static final DateProperty<LocalDateTime> CREATION_DATE = PropertyFactory.createDate("creationDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> END_VALIDITY = PropertyFactory.createDate("endValidity", LocalDateTime.class);
    public static final NumericProperty<Integer> IS_VALID = PropertyFactory.createNumeric("isValid", Integer.class);
    public static final DateProperty<LocalDateTime> LAST_USED = PropertyFactory.createDate("lastUsed", LocalDateTime.class);
    public static final StringProperty<String> LOGIN = PropertyFactory.createString("login", String.class);
    public static final StringProperty<String> PASSCODE = PropertyFactory.createString("passcode", String.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);

    protected LocalDateTime creationDate;
    protected LocalDateTime endValidity;
    protected Integer isValid;
    protected LocalDateTime lastUsed;
    protected String login;
    protected String passcode;

    protected Object contact;

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

    public void setIsValid(Integer isValid) {
        beforePropertyWrite("isValid", this.isValid, isValid);
        this.isValid = isValid;
    }

    public Integer getIsValid() {
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

    public void setLogin(String login) {
        beforePropertyWrite("login", this.login, login);
        this.login = login;
    }

    public String getLogin() {
        beforePropertyRead("login");
        return this.login;
    }

    public void setPasscode(String passcode) {
        beforePropertyWrite("passcode", this.passcode, passcode);
        this.passcode = passcode;
    }

    public String getPasscode() {
        beforePropertyRead("passcode");
        return this.passcode;
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
            case "creationDate":
                return this.creationDate;
            case "endValidity":
                return this.endValidity;
            case "isValid":
                return this.isValid;
            case "lastUsed":
                return this.lastUsed;
            case "login":
                return this.login;
            case "passcode":
                return this.passcode;
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
            case "creationDate":
                this.creationDate = (LocalDateTime)val;
                break;
            case "endValidity":
                this.endValidity = (LocalDateTime)val;
                break;
            case "isValid":
                this.isValid = (Integer)val;
                break;
            case "lastUsed":
                this.lastUsed = (LocalDateTime)val;
                break;
            case "login":
                this.login = (String)val;
                break;
            case "passcode":
                this.passcode = (String)val;
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
        out.writeObject(this.creationDate);
        out.writeObject(this.endValidity);
        out.writeObject(this.isValid);
        out.writeObject(this.lastUsed);
        out.writeObject(this.login);
        out.writeObject(this.passcode);
        out.writeObject(this.contact);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.creationDate = (LocalDateTime)in.readObject();
        this.endValidity = (LocalDateTime)in.readObject();
        this.isValid = (Integer)in.readObject();
        this.lastUsed = (LocalDateTime)in.readObject();
        this.login = (String)in.readObject();
        this.passcode = (String)in.readObject();
        this.contact = in.readObject();
    }

}
