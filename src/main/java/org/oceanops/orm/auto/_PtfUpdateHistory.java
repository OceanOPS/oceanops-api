package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Contact;
import org.oceanops.orm.Ptf;

/**
 * Class _PtfUpdateHistory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfUpdateHistory extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> FIELD_NAME = PropertyFactory.createString("fieldName", String.class);
    public static final StringProperty<String> NEW_VALUE = PropertyFactory.createString("newValue", String.class);
    public static final StringProperty<String> PREV_VALUE = PropertyFactory.createString("prevValue", String.class);
    public static final StringProperty<String> THEME_VIEW = PropertyFactory.createString("themeView", String.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected String fieldName;
    protected String newValue;
    protected String prevValue;
    protected String themeView;
    protected LocalDateTime updateDate;

    protected Object contact;
    protected Object ptf;

    public void setFieldName(String fieldName) {
        beforePropertyWrite("fieldName", this.fieldName, fieldName);
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        beforePropertyRead("fieldName");
        return this.fieldName;
    }

    public void setNewValue(String newValue) {
        beforePropertyWrite("newValue", this.newValue, newValue);
        this.newValue = newValue;
    }

    public String getNewValue() {
        beforePropertyRead("newValue");
        return this.newValue;
    }

    public void setPrevValue(String prevValue) {
        beforePropertyWrite("prevValue", this.prevValue, prevValue);
        this.prevValue = prevValue;
    }

    public String getPrevValue() {
        beforePropertyRead("prevValue");
        return this.prevValue;
    }

    public void setThemeView(String themeView) {
        beforePropertyWrite("themeView", this.themeView, themeView);
        this.themeView = themeView;
    }

    public String getThemeView() {
        beforePropertyRead("themeView");
        return this.themeView;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        beforePropertyWrite("updateDate", this.updateDate, updateDate);
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateDate() {
        beforePropertyRead("updateDate");
        return this.updateDate;
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

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "fieldName":
                return this.fieldName;
            case "newValue":
                return this.newValue;
            case "prevValue":
                return this.prevValue;
            case "themeView":
                return this.themeView;
            case "updateDate":
                return this.updateDate;
            case "contact":
                return this.contact;
            case "ptf":
                return this.ptf;
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
            case "fieldName":
                this.fieldName = (String)val;
                break;
            case "newValue":
                this.newValue = (String)val;
                break;
            case "prevValue":
                this.prevValue = (String)val;
                break;
            case "themeView":
                this.themeView = (String)val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.fieldName);
        out.writeObject(this.newValue);
        out.writeObject(this.prevValue);
        out.writeObject(this.themeView);
        out.writeObject(this.updateDate);
        out.writeObject(this.contact);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.fieldName = (String)in.readObject();
        this.newValue = (String)in.readObject();
        this.prevValue = (String)in.readObject();
        this.themeView = (String)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.contact = in.readObject();
        this.ptf = in.readObject();
    }

}