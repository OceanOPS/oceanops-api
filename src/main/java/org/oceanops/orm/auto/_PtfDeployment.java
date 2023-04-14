package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Contact;
import org.oceanops.orm.Country;
import org.oceanops.orm.Cruise;
import org.oceanops.orm.DeplMethod;
import org.oceanops.orm.DeplType;
import org.oceanops.orm.PackageType;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.Ship;

/**
 * Class _PtfDeployment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfDeployment extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> CRUISE_NAME = PropertyFactory.createString("cruiseName", String.class);
    public static final NumericProperty<Integer> CTD = PropertyFactory.createNumeric("ctd", Integer.class);
    public static final StringProperty<String> CTD_REF = PropertyFactory.createString("ctdRef", String.class);
    public static final NumericProperty<Integer> CTDO2 = PropertyFactory.createNumeric("ctdo2", Integer.class);
    public static final NumericProperty<Double> DENSITY = PropertyFactory.createNumeric("density", Double.class);
    public static final DateProperty<LocalDateTime> DEPL_DATE = PropertyFactory.createDate("deplDate", LocalDateTime.class);
    public static final NumericProperty<Double> DEPL_HEIGHT = PropertyFactory.createNumeric("deplHeight", Double.class);
    public static final NumericProperty<Double> DEPL_SPEED = PropertyFactory.createNumeric("deplSpeed", Double.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Integer> LABEL = PropertyFactory.createNumeric("label", Integer.class);
    public static final NumericProperty<Double> LAT = PropertyFactory.createNumeric("lat", Double.class);
    public static final NumericProperty<Double> LON = PropertyFactory.createNumeric("lon", Double.class);
    public static final NumericProperty<Double> MAX_MOORING_DEPTH = PropertyFactory.createNumeric("maxMooringDepth", Double.class);
    public static final NumericProperty<Integer> NO_SITE = PropertyFactory.createNumeric("noSite", Integer.class);
    public static final StringProperty<String> REF_STATION_ID = PropertyFactory.createString("refStationId", String.class);
    public static final NumericProperty<Double> SCORE = PropertyFactory.createNumeric("score", Double.class);
    public static final NumericProperty<Integer> SEA_STATE_ID = PropertyFactory.createNumeric("seaStateId", Integer.class);
    public static final StringProperty<String> SHIP_NAME = PropertyFactory.createString("shipName", String.class);
    public static final NumericProperty<Integer> WEATHER_ID = PropertyFactory.createNumeric("weatherId", Integer.class);
    public static final NumericProperty<Double> WIND_SPEED = PropertyFactory.createNumeric("windSpeed", Double.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<DeplMethod> DEPL_METHOD = PropertyFactory.createEntity("deplMethod", DeplMethod.class);
    public static final EntityProperty<DeplType> DEPL_TYPE = PropertyFactory.createEntity("deplType", DeplType.class);
    public static final EntityProperty<PackageType> PACK_TYPE = PropertyFactory.createEntity("packType", PackageType.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);
    public static final EntityProperty<Ship> SHIP = PropertyFactory.createEntity("ship", Ship.class);

    protected String cruiseName;
    protected Integer ctd;
    protected String ctdRef;
    protected Integer ctdo2;
    protected Double density;
    protected LocalDateTime deplDate;
    protected Double deplHeight;
    protected Double deplSpeed;
    protected Integer id;
    protected Integer label;
    protected Double lat;
    protected Double lon;
    protected Double maxMooringDepth;
    protected Integer noSite;
    protected String refStationId;
    protected Double score;
    protected Integer seaStateId;
    protected String shipName;
    protected Integer weatherId;
    protected Double windSpeed;

    protected Object contact;
    protected Object country;
    protected Object cruise;
    protected Object deplMethod;
    protected Object deplType;
    protected Object packType;
    protected Object ptfs;
    protected Object ship;

    public void setCruiseName(String cruiseName) {
        beforePropertyWrite("cruiseName", this.cruiseName, cruiseName);
        this.cruiseName = cruiseName;
    }

    public String getCruiseName() {
        beforePropertyRead("cruiseName");
        return this.cruiseName;
    }

    public void setCtd(Integer ctd) {
        beforePropertyWrite("ctd", this.ctd, ctd);
        this.ctd = ctd;
    }

    public Integer getCtd() {
        beforePropertyRead("ctd");
        return this.ctd;
    }

    public void setCtdRef(String ctdRef) {
        beforePropertyWrite("ctdRef", this.ctdRef, ctdRef);
        this.ctdRef = ctdRef;
    }

    public String getCtdRef() {
        beforePropertyRead("ctdRef");
        return this.ctdRef;
    }

    public void setCtdo2(Integer ctdo2) {
        beforePropertyWrite("ctdo2", this.ctdo2, ctdo2);
        this.ctdo2 = ctdo2;
    }

    public Integer getCtdo2() {
        beforePropertyRead("ctdo2");
        return this.ctdo2;
    }

    public void setDensity(Double density) {
        beforePropertyWrite("density", this.density, density);
        this.density = density;
    }

    public Double getDensity() {
        beforePropertyRead("density");
        return this.density;
    }

    public void setDeplDate(LocalDateTime deplDate) {
        beforePropertyWrite("deplDate", this.deplDate, deplDate);
        this.deplDate = deplDate;
    }

    public LocalDateTime getDeplDate() {
        beforePropertyRead("deplDate");
        return this.deplDate;
    }

    public void setDeplHeight(Double deplHeight) {
        beforePropertyWrite("deplHeight", this.deplHeight, deplHeight);
        this.deplHeight = deplHeight;
    }

    public Double getDeplHeight() {
        beforePropertyRead("deplHeight");
        return this.deplHeight;
    }

    public void setDeplSpeed(Double deplSpeed) {
        beforePropertyWrite("deplSpeed", this.deplSpeed, deplSpeed);
        this.deplSpeed = deplSpeed;
    }

    public Double getDeplSpeed() {
        beforePropertyRead("deplSpeed");
        return this.deplSpeed;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setLabel(Integer label) {
        beforePropertyWrite("label", this.label, label);
        this.label = label;
    }

    public Integer getLabel() {
        beforePropertyRead("label");
        return this.label;
    }

    public void setLat(Double lat) {
        beforePropertyWrite("lat", this.lat, lat);
        this.lat = lat;
    }

    public Double getLat() {
        beforePropertyRead("lat");
        return this.lat;
    }

    public void setLon(Double lon) {
        beforePropertyWrite("lon", this.lon, lon);
        this.lon = lon;
    }

    public Double getLon() {
        beforePropertyRead("lon");
        return this.lon;
    }

    public void setMaxMooringDepth(Double maxMooringDepth) {
        beforePropertyWrite("maxMooringDepth", this.maxMooringDepth, maxMooringDepth);
        this.maxMooringDepth = maxMooringDepth;
    }

    public Double getMaxMooringDepth() {
        beforePropertyRead("maxMooringDepth");
        return this.maxMooringDepth;
    }

    public void setNoSite(Integer noSite) {
        beforePropertyWrite("noSite", this.noSite, noSite);
        this.noSite = noSite;
    }

    public Integer getNoSite() {
        beforePropertyRead("noSite");
        return this.noSite;
    }

    public void setRefStationId(String refStationId) {
        beforePropertyWrite("refStationId", this.refStationId, refStationId);
        this.refStationId = refStationId;
    }

    public String getRefStationId() {
        beforePropertyRead("refStationId");
        return this.refStationId;
    }

    public void setScore(Double score) {
        beforePropertyWrite("score", this.score, score);
        this.score = score;
    }

    public Double getScore() {
        beforePropertyRead("score");
        return this.score;
    }

    public void setSeaStateId(Integer seaStateId) {
        beforePropertyWrite("seaStateId", this.seaStateId, seaStateId);
        this.seaStateId = seaStateId;
    }

    public Integer getSeaStateId() {
        beforePropertyRead("seaStateId");
        return this.seaStateId;
    }

    public void setShipName(String shipName) {
        beforePropertyWrite("shipName", this.shipName, shipName);
        this.shipName = shipName;
    }

    public String getShipName() {
        beforePropertyRead("shipName");
        return this.shipName;
    }

    public void setWeatherId(Integer weatherId) {
        beforePropertyWrite("weatherId", this.weatherId, weatherId);
        this.weatherId = weatherId;
    }

    public Integer getWeatherId() {
        beforePropertyRead("weatherId");
        return this.weatherId;
    }

    public void setWindSpeed(Double windSpeed) {
        beforePropertyWrite("windSpeed", this.windSpeed, windSpeed);
        this.windSpeed = windSpeed;
    }

    public Double getWindSpeed() {
        beforePropertyRead("windSpeed");
        return this.windSpeed;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget("cruise", cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty("cruise");
    }

    public void setDeplMethod(DeplMethod deplMethod) {
        setToOneTarget("deplMethod", deplMethod, true);
    }

    public DeplMethod getDeplMethod() {
        return (DeplMethod)readProperty("deplMethod");
    }

    public void setDeplType(DeplType deplType) {
        setToOneTarget("deplType", deplType, true);
    }

    public DeplType getDeplType() {
        return (DeplType)readProperty("deplType");
    }

    public void setPackType(PackageType packType) {
        setToOneTarget("packType", packType, true);
    }

    public PackageType getPackType() {
        return (PackageType)readProperty("packType");
    }

    public void addToPtfs(Ptf obj) {
        addToManyTarget("ptfs", obj, true);
    }

    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget("ptfs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty("ptfs");
    }

    public void setShip(Ship ship) {
        setToOneTarget("ship", ship, true);
    }

    public Ship getShip() {
        return (Ship)readProperty("ship");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cruiseName":
                return this.cruiseName;
            case "ctd":
                return this.ctd;
            case "ctdRef":
                return this.ctdRef;
            case "ctdo2":
                return this.ctdo2;
            case "density":
                return this.density;
            case "deplDate":
                return this.deplDate;
            case "deplHeight":
                return this.deplHeight;
            case "deplSpeed":
                return this.deplSpeed;
            case "id":
                return this.id;
            case "label":
                return this.label;
            case "lat":
                return this.lat;
            case "lon":
                return this.lon;
            case "maxMooringDepth":
                return this.maxMooringDepth;
            case "noSite":
                return this.noSite;
            case "refStationId":
                return this.refStationId;
            case "score":
                return this.score;
            case "seaStateId":
                return this.seaStateId;
            case "shipName":
                return this.shipName;
            case "weatherId":
                return this.weatherId;
            case "windSpeed":
                return this.windSpeed;
            case "contact":
                return this.contact;
            case "country":
                return this.country;
            case "cruise":
                return this.cruise;
            case "deplMethod":
                return this.deplMethod;
            case "deplType":
                return this.deplType;
            case "packType":
                return this.packType;
            case "ptfs":
                return this.ptfs;
            case "ship":
                return this.ship;
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
            case "cruiseName":
                this.cruiseName = (String)val;
                break;
            case "ctd":
                this.ctd = (Integer)val;
                break;
            case "ctdRef":
                this.ctdRef = (String)val;
                break;
            case "ctdo2":
                this.ctdo2 = (Integer)val;
                break;
            case "density":
                this.density = (Double)val;
                break;
            case "deplDate":
                this.deplDate = (LocalDateTime)val;
                break;
            case "deplHeight":
                this.deplHeight = (Double)val;
                break;
            case "deplSpeed":
                this.deplSpeed = (Double)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "label":
                this.label = (Integer)val;
                break;
            case "lat":
                this.lat = (Double)val;
                break;
            case "lon":
                this.lon = (Double)val;
                break;
            case "maxMooringDepth":
                this.maxMooringDepth = (Double)val;
                break;
            case "noSite":
                this.noSite = (Integer)val;
                break;
            case "refStationId":
                this.refStationId = (String)val;
                break;
            case "score":
                this.score = (Double)val;
                break;
            case "seaStateId":
                this.seaStateId = (Integer)val;
                break;
            case "shipName":
                this.shipName = (String)val;
                break;
            case "weatherId":
                this.weatherId = (Integer)val;
                break;
            case "windSpeed":
                this.windSpeed = (Double)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "country":
                this.country = val;
                break;
            case "cruise":
                this.cruise = val;
                break;
            case "deplMethod":
                this.deplMethod = val;
                break;
            case "deplType":
                this.deplType = val;
                break;
            case "packType":
                this.packType = val;
                break;
            case "ptfs":
                this.ptfs = val;
                break;
            case "ship":
                this.ship = val;
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
        out.writeObject(this.cruiseName);
        out.writeObject(this.ctd);
        out.writeObject(this.ctdRef);
        out.writeObject(this.ctdo2);
        out.writeObject(this.density);
        out.writeObject(this.deplDate);
        out.writeObject(this.deplHeight);
        out.writeObject(this.deplSpeed);
        out.writeObject(this.id);
        out.writeObject(this.label);
        out.writeObject(this.lat);
        out.writeObject(this.lon);
        out.writeObject(this.maxMooringDepth);
        out.writeObject(this.noSite);
        out.writeObject(this.refStationId);
        out.writeObject(this.score);
        out.writeObject(this.seaStateId);
        out.writeObject(this.shipName);
        out.writeObject(this.weatherId);
        out.writeObject(this.windSpeed);
        out.writeObject(this.contact);
        out.writeObject(this.country);
        out.writeObject(this.cruise);
        out.writeObject(this.deplMethod);
        out.writeObject(this.deplType);
        out.writeObject(this.packType);
        out.writeObject(this.ptfs);
        out.writeObject(this.ship);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cruiseName = (String)in.readObject();
        this.ctd = (Integer)in.readObject();
        this.ctdRef = (String)in.readObject();
        this.ctdo2 = (Integer)in.readObject();
        this.density = (Double)in.readObject();
        this.deplDate = (LocalDateTime)in.readObject();
        this.deplHeight = (Double)in.readObject();
        this.deplSpeed = (Double)in.readObject();
        this.id = (Integer)in.readObject();
        this.label = (Integer)in.readObject();
        this.lat = (Double)in.readObject();
        this.lon = (Double)in.readObject();
        this.maxMooringDepth = (Double)in.readObject();
        this.noSite = (Integer)in.readObject();
        this.refStationId = (String)in.readObject();
        this.score = (Double)in.readObject();
        this.seaStateId = (Integer)in.readObject();
        this.shipName = (String)in.readObject();
        this.weatherId = (Integer)in.readObject();
        this.windSpeed = (Double)in.readObject();
        this.contact = in.readObject();
        this.country = in.readObject();
        this.cruise = in.readObject();
        this.deplMethod = in.readObject();
        this.deplType = in.readObject();
        this.packType = in.readObject();
        this.ptfs = in.readObject();
        this.ship = in.readObject();
    }

}