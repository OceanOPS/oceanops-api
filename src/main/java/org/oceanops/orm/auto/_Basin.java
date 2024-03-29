package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.BasinType;
import org.oceanops.orm.CountryCommitment;

/**
 * Class _Basin was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Basin extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_LONG = PropertyFactory.createString("nameLong", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final StringProperty<String> OCEAN = PropertyFactory.createString("ocean", String.class);
    public static final NumericProperty<Integer> RANK = PropertyFactory.createNumeric("rank", Integer.class);
    public static final StringProperty<String> SUBOCEAN = PropertyFactory.createString("subocean", String.class);
    public static final StringProperty<String> WKT = PropertyFactory.createString("wkt", String.class);
    public static final EntityProperty<BasinType> BASIN_TYPE = PropertyFactory.createEntity("basinType", BasinType.class);
    public static final ListProperty<CountryCommitment> COUNTRY_COMMITMENTS = PropertyFactory.createList("countryCommitments", CountryCommitment.class);

    protected Integer id;
    protected String name;
    protected String nameLong;
    protected String nameShort;
    protected String ocean;
    protected Integer rank;
    protected String subocean;
    protected String wkt;

    protected Object basinType;
    protected Object countryCommitments;

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

    public void setOcean(String ocean) {
        beforePropertyWrite("ocean", this.ocean, ocean);
        this.ocean = ocean;
    }

    public String getOcean() {
        beforePropertyRead("ocean");
        return this.ocean;
    }

    public void setRank(Integer rank) {
        beforePropertyWrite("rank", this.rank, rank);
        this.rank = rank;
    }

    public Integer getRank() {
        beforePropertyRead("rank");
        return this.rank;
    }

    public void setSubocean(String subocean) {
        beforePropertyWrite("subocean", this.subocean, subocean);
        this.subocean = subocean;
    }

    public String getSubocean() {
        beforePropertyRead("subocean");
        return this.subocean;
    }

    public void setWkt(String wkt) {
        beforePropertyWrite("wkt", this.wkt, wkt);
        this.wkt = wkt;
    }

    public String getWkt() {
        beforePropertyRead("wkt");
        return this.wkt;
    }

    public void setBasinType(BasinType basinType) {
        setToOneTarget("basinType", basinType, true);
    }

    public BasinType getBasinType() {
        return (BasinType)readProperty("basinType");
    }

    public void addToCountryCommitments(CountryCommitment obj) {
        addToManyTarget("countryCommitments", obj, true);
    }

    public void removeFromCountryCommitments(CountryCommitment obj) {
        removeToManyTarget("countryCommitments", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CountryCommitment> getCountryCommitments() {
        return (List<CountryCommitment>)readProperty("countryCommitments");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameLong":
                return this.nameLong;
            case "nameShort":
                return this.nameShort;
            case "ocean":
                return this.ocean;
            case "rank":
                return this.rank;
            case "subocean":
                return this.subocean;
            case "wkt":
                return this.wkt;
            case "basinType":
                return this.basinType;
            case "countryCommitments":
                return this.countryCommitments;
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
            case "ocean":
                this.ocean = (String)val;
                break;
            case "rank":
                this.rank = (Integer)val;
                break;
            case "subocean":
                this.subocean = (String)val;
                break;
            case "wkt":
                this.wkt = (String)val;
                break;
            case "basinType":
                this.basinType = val;
                break;
            case "countryCommitments":
                this.countryCommitments = val;
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
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameLong);
        out.writeObject(this.nameShort);
        out.writeObject(this.ocean);
        out.writeObject(this.rank);
        out.writeObject(this.subocean);
        out.writeObject(this.wkt);
        out.writeObject(this.basinType);
        out.writeObject(this.countryCommitments);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameLong = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.ocean = (String)in.readObject();
        this.rank = (Integer)in.readObject();
        this.subocean = (String)in.readObject();
        this.wkt = (String)in.readObject();
        this.basinType = in.readObject();
        this.countryCommitments = in.readObject();
    }

}
