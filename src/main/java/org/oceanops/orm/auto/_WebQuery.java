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
 * Class _WebQuery was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebQuery extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> DATE_CREATION = PropertyFactory.createDate("dateCreation", LocalDateTime.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Integer> IS_DEFAULT = PropertyFactory.createNumeric("isDefault", Integer.class);
    public static final NumericProperty<Integer> IS_OCEANSITES_DEFAULT = PropertyFactory.createNumeric("isOceansitesDefault", Integer.class);
    public static final StringProperty<String> JSON_FORM_VALUES = PropertyFactory.createString("jsonFormValues", String.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_LONG = PropertyFactory.createString("nameLong", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final StringProperty<String> OBS_SQL_A = PropertyFactory.createString("obsSqlA", String.class);
    public static final StringProperty<String> OBS_SQL_B = PropertyFactory.createString("obsSqlB", String.class);
    public static final NumericProperty<Integer> PREFERENCE = PropertyFactory.createNumeric("preference", Integer.class);
    public static final StringProperty<String> SQL = PropertyFactory.createString("sql", String.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);

    protected LocalDateTime dateCreation;
    protected Integer id;
    protected Integer isDefault;
    protected Integer isOceansitesDefault;
    protected String jsonFormValues;
    protected String name;
    protected String nameLong;
    protected String nameShort;
    protected String obsSqlA;
    protected String obsSqlB;
    protected Integer preference;
    protected String sql;

    protected Object contact;

    public void setDateCreation(LocalDateTime dateCreation) {
        beforePropertyWrite("dateCreation", this.dateCreation, dateCreation);
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateCreation() {
        beforePropertyRead("dateCreation");
        return this.dateCreation;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setIsDefault(Integer isDefault) {
        beforePropertyWrite("isDefault", this.isDefault, isDefault);
        this.isDefault = isDefault;
    }

    public Integer getIsDefault() {
        beforePropertyRead("isDefault");
        return this.isDefault;
    }

    public void setIsOceansitesDefault(Integer isOceansitesDefault) {
        beforePropertyWrite("isOceansitesDefault", this.isOceansitesDefault, isOceansitesDefault);
        this.isOceansitesDefault = isOceansitesDefault;
    }

    public Integer getIsOceansitesDefault() {
        beforePropertyRead("isOceansitesDefault");
        return this.isOceansitesDefault;
    }

    public void setJsonFormValues(String jsonFormValues) {
        beforePropertyWrite("jsonFormValues", this.jsonFormValues, jsonFormValues);
        this.jsonFormValues = jsonFormValues;
    }

    public String getJsonFormValues() {
        beforePropertyRead("jsonFormValues");
        return this.jsonFormValues;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNameLong(String nameLong) {
        beforePropertyWrite("nameLong", this.nameLong, nameLong);
        this.nameLong = nameLong;
    }

    public String getNameLong() {
        beforePropertyRead("nameLong");
        return this.nameLong;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setObsSqlA(String obsSqlA) {
        beforePropertyWrite("obsSqlA", this.obsSqlA, obsSqlA);
        this.obsSqlA = obsSqlA;
    }

    public String getObsSqlA() {
        beforePropertyRead("obsSqlA");
        return this.obsSqlA;
    }

    public void setObsSqlB(String obsSqlB) {
        beforePropertyWrite("obsSqlB", this.obsSqlB, obsSqlB);
        this.obsSqlB = obsSqlB;
    }

    public String getObsSqlB() {
        beforePropertyRead("obsSqlB");
        return this.obsSqlB;
    }

    public void setPreference(Integer preference) {
        beforePropertyWrite("preference", this.preference, preference);
        this.preference = preference;
    }

    public Integer getPreference() {
        beforePropertyRead("preference");
        return this.preference;
    }

    public void setSql(String sql) {
        beforePropertyWrite("sql", this.sql, sql);
        this.sql = sql;
    }

    public String getSql() {
        beforePropertyRead("sql");
        return this.sql;
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
            case "dateCreation":
                return this.dateCreation;
            case "id":
                return this.id;
            case "isDefault":
                return this.isDefault;
            case "isOceansitesDefault":
                return this.isOceansitesDefault;
            case "jsonFormValues":
                return this.jsonFormValues;
            case "name":
                return this.name;
            case "nameLong":
                return this.nameLong;
            case "nameShort":
                return this.nameShort;
            case "obsSqlA":
                return this.obsSqlA;
            case "obsSqlB":
                return this.obsSqlB;
            case "preference":
                return this.preference;
            case "sql":
                return this.sql;
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
            case "dateCreation":
                this.dateCreation = (LocalDateTime)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "isDefault":
                this.isDefault = (Integer)val;
                break;
            case "isOceansitesDefault":
                this.isOceansitesDefault = (Integer)val;
                break;
            case "jsonFormValues":
                this.jsonFormValues = (String)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameLong":
                this.nameLong = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "obsSqlA":
                this.obsSqlA = (String)val;
                break;
            case "obsSqlB":
                this.obsSqlB = (String)val;
                break;
            case "preference":
                this.preference = (Integer)val;
                break;
            case "sql":
                this.sql = (String)val;
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
        out.writeObject(this.dateCreation);
        out.writeObject(this.id);
        out.writeObject(this.isDefault);
        out.writeObject(this.isOceansitesDefault);
        out.writeObject(this.jsonFormValues);
        out.writeObject(this.name);
        out.writeObject(this.nameLong);
        out.writeObject(this.nameShort);
        out.writeObject(this.obsSqlA);
        out.writeObject(this.obsSqlB);
        out.writeObject(this.preference);
        out.writeObject(this.sql);
        out.writeObject(this.contact);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.dateCreation = (LocalDateTime)in.readObject();
        this.id = (Integer)in.readObject();
        this.isDefault = (Integer)in.readObject();
        this.isOceansitesDefault = (Integer)in.readObject();
        this.jsonFormValues = (String)in.readObject();
        this.name = (String)in.readObject();
        this.nameLong = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.obsSqlA = (String)in.readObject();
        this.obsSqlB = (String)in.readObject();
        this.preference = (Integer)in.readObject();
        this.sql = (String)in.readObject();
        this.contact = in.readObject();
    }

}
