package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Site;

/**
 * Class _SiteStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SiteStatus extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final ListProperty<Site> SITES = PropertyFactory.createList("sites", Site.class);

    protected String description;
    protected BigDecimal id;
    protected String name;
    protected String nameShort;

    protected Object sites;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
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

    public void addToSites(Site obj) {
        addToManyTarget("sites", obj, true);
    }

    public void removeFromSites(Site obj) {
        removeToManyTarget("sites", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Site> getSites() {
        return (List<Site>)readProperty("sites");
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
            case "nameShort":
                return this.nameShort;
            case "sites":
                return this.sites;
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
                this.id = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "sites":
                this.sites = val;
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
        out.writeObject(this.nameShort);
        out.writeObject(this.sites);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.sites = in.readObject();
    }

}
