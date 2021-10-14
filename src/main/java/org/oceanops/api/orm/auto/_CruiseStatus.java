package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Cruise;

/**
 * Class _CruiseStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseStatus extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_LONG = PropertyFactory.createString("nameLong", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final ListProperty<Cruise> CRUISES = PropertyFactory.createList("cruises", Cruise.class);

    protected String description;
    protected Integer id;
    protected String name;
    protected String nameLong;
    protected String nameShort;

    protected Object cruises;

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

    public void addToCruises(Cruise obj) {
        addToManyTarget("cruises", obj, true);
    }

    public void removeFromCruises(Cruise obj) {
        removeToManyTarget("cruises", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Cruise> getCruises() {
        return (List<Cruise>)readProperty("cruises");
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
            case "nameLong":
                return this.nameLong;
            case "nameShort":
                return this.nameShort;
            case "cruises":
                return this.cruises;
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
            case "nameLong":
                this.nameLong = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "cruises":
                this.cruises = val;
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
        out.writeObject(this.nameLong);
        out.writeObject(this.nameShort);
        out.writeObject(this.cruises);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameLong = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.cruises = in.readObject();
    }

}
