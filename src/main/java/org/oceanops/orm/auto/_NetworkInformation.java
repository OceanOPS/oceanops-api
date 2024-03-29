package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/**
 * Class _NetworkInformation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkInformation extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DATA = PropertyFactory.createString("data", String.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final StringProperty<String> OBJECTIVES = PropertyFactory.createString("objectives", String.class);
    public static final StringProperty<String> OLD_SITE_HOMEPAGE = PropertyFactory.createString("oldSiteHomepage", String.class);
    public static final StringProperty<String> ORIGINS = PropertyFactory.createString("origins", String.class);
    public static final StringProperty<String> OVERVIEW = PropertyFactory.createString("overview", String.class);
    public static final StringProperty<String> PEOPLE = PropertyFactory.createString("people", String.class);
    public static final StringProperty<String> TECH = PropertyFactory.createString("tech", String.class);

    protected String data;
    protected String description;
    protected Integer id;
    protected String name;
    protected String nameShort;
    protected String objectives;
    protected String oldSiteHomepage;
    protected String origins;
    protected String overview;
    protected String people;
    protected String tech;


    public void setData(String data) {
        beforePropertyWrite("data", this.data, data);
        this.data = data;
    }

    public String getData() {
        beforePropertyRead("data");
        return this.data;
    }

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

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setObjectives(String objectives) {
        beforePropertyWrite("objectives", this.objectives, objectives);
        this.objectives = objectives;
    }

    public String getObjectives() {
        beforePropertyRead("objectives");
        return this.objectives;
    }

    public void setOldSiteHomepage(String oldSiteHomepage) {
        beforePropertyWrite("oldSiteHomepage", this.oldSiteHomepage, oldSiteHomepage);
        this.oldSiteHomepage = oldSiteHomepage;
    }

    public String getOldSiteHomepage() {
        beforePropertyRead("oldSiteHomepage");
        return this.oldSiteHomepage;
    }

    public void setOrigins(String origins) {
        beforePropertyWrite("origins", this.origins, origins);
        this.origins = origins;
    }

    public String getOrigins() {
        beforePropertyRead("origins");
        return this.origins;
    }

    public void setOverview(String overview) {
        beforePropertyWrite("overview", this.overview, overview);
        this.overview = overview;
    }

    public String getOverview() {
        beforePropertyRead("overview");
        return this.overview;
    }

    public void setPeople(String people) {
        beforePropertyWrite("people", this.people, people);
        this.people = people;
    }

    public String getPeople() {
        beforePropertyRead("people");
        return this.people;
    }

    public void setTech(String tech) {
        beforePropertyWrite("tech", this.tech, tech);
        this.tech = tech;
    }

    public String getTech() {
        beforePropertyRead("tech");
        return this.tech;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "data":
                return this.data;
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "objectives":
                return this.objectives;
            case "oldSiteHomepage":
                return this.oldSiteHomepage;
            case "origins":
                return this.origins;
            case "overview":
                return this.overview;
            case "people":
                return this.people;
            case "tech":
                return this.tech;
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
            case "data":
                this.data = (String)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "objectives":
                this.objectives = (String)val;
                break;
            case "oldSiteHomepage":
                this.oldSiteHomepage = (String)val;
                break;
            case "origins":
                this.origins = (String)val;
                break;
            case "overview":
                this.overview = (String)val;
                break;
            case "people":
                this.people = (String)val;
                break;
            case "tech":
                this.tech = (String)val;
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
        out.writeObject(this.data);
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.objectives);
        out.writeObject(this.oldSiteHomepage);
        out.writeObject(this.origins);
        out.writeObject(this.overview);
        out.writeObject(this.people);
        out.writeObject(this.tech);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.data = (String)in.readObject();
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.objectives = (String)in.readObject();
        this.oldSiteHomepage = (String)in.readObject();
        this.origins = (String)in.readObject();
        this.overview = (String)in.readObject();
        this.people = (String)in.readObject();
        this.tech = (String)in.readObject();
    }

}
