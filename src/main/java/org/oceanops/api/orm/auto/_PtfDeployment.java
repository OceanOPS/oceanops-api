package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.DeplMethod;
import org.oceanops.api.orm.DeplType;
import org.oceanops.api.orm.PackageType;
import org.oceanops.api.orm.Ship;

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
    public static final NumericProperty<BigDecimal> CTD = PropertyFactory.createNumeric("ctd", BigDecimal.class);
    public static final StringProperty<String> CTD_REF = PropertyFactory.createString("ctdRef", String.class);
    public static final NumericProperty<BigDecimal> CTDO2 = PropertyFactory.createNumeric("ctdo2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DENSITY = PropertyFactory.createNumeric("density", BigDecimal.class);
    public static final DateProperty<LocalDateTime> DEPL_DATE = PropertyFactory.createDate("deplDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> DEPL_HEIGHT = PropertyFactory.createNumeric("deplHeight", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DEPL_SPEED = PropertyFactory.createNumeric("deplSpeed", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LABEL = PropertyFactory.createNumeric("label", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LAT = PropertyFactory.createNumeric("lat", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LON = PropertyFactory.createNumeric("lon", BigDecimal.class);
    public static final NumericProperty<BigDecimal> MAX_MOORING_DEPTH = PropertyFactory.createNumeric("maxMooringDepth", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NO_SITE = PropertyFactory.createNumeric("noSite", BigDecimal.class);
    public static final StringProperty<String> REF_STATION_ID = PropertyFactory.createString("refStationId", String.class);
    public static final NumericProperty<BigDecimal> SCORE = PropertyFactory.createNumeric("score", BigDecimal.class);
    public static final StringProperty<String> SHIP_NAME = PropertyFactory.createString("shipName", String.class);
    public static final NumericProperty<BigDecimal> WIND_SPEED = PropertyFactory.createNumeric("windSpeed", BigDecimal.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<DeplMethod> DEPL_METHOD = PropertyFactory.createEntity("deplMethod", DeplMethod.class);
    public static final EntityProperty<DeplType> DEPL_TYPE = PropertyFactory.createEntity("deplType", DeplType.class);
    public static final EntityProperty<PackageType> PACK_TYPE = PropertyFactory.createEntity("packType", PackageType.class);
    public static final EntityProperty<Ship> SHIP = PropertyFactory.createEntity("ship", Ship.class);

    protected String cruiseName;
    protected BigDecimal ctd;
    protected String ctdRef;
    protected BigDecimal ctdo2;
    protected BigDecimal density;
    protected LocalDateTime deplDate;
    protected BigDecimal deplHeight;
    protected BigDecimal deplSpeed;
    protected BigDecimal id;
    protected BigDecimal label;
    protected BigDecimal lat;
    protected BigDecimal lon;
    protected BigDecimal maxMooringDepth;
    protected BigDecimal noSite;
    protected String refStationId;
    protected BigDecimal score;
    protected String shipName;
    protected BigDecimal windSpeed;

    protected Object contact;
    protected Object country;
    protected Object cruise;
    protected Object deplMethod;
    protected Object deplType;
    protected Object packType;
    protected Object ship;

    public void setCruiseName(String cruiseName) {
        beforePropertyWrite("cruiseName", this.cruiseName, cruiseName);
        this.cruiseName = cruiseName;
    }

    public String getCruiseName() {
        beforePropertyRead("cruiseName");
        return this.cruiseName;
    }

    public void setCtd(BigDecimal ctd) {
        beforePropertyWrite("ctd", this.ctd, ctd);
        this.ctd = ctd;
    }

    public BigDecimal getCtd() {
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

    public void setCtdo2(BigDecimal ctdo2) {
        beforePropertyWrite("ctdo2", this.ctdo2, ctdo2);
        this.ctdo2 = ctdo2;
    }

    public BigDecimal getCtdo2() {
        beforePropertyRead("ctdo2");
        return this.ctdo2;
    }

    public void setDensity(BigDecimal density) {
        beforePropertyWrite("density", this.density, density);
        this.density = density;
    }

    public BigDecimal getDensity() {
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

    public void setDeplHeight(BigDecimal deplHeight) {
        beforePropertyWrite("deplHeight", this.deplHeight, deplHeight);
        this.deplHeight = deplHeight;
    }

    public BigDecimal getDeplHeight() {
        beforePropertyRead("deplHeight");
        return this.deplHeight;
    }

    public void setDeplSpeed(BigDecimal deplSpeed) {
        beforePropertyWrite("deplSpeed", this.deplSpeed, deplSpeed);
        this.deplSpeed = deplSpeed;
    }

    public BigDecimal getDeplSpeed() {
        beforePropertyRead("deplSpeed");
        return this.deplSpeed;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setLabel(BigDecimal label) {
        beforePropertyWrite("label", this.label, label);
        this.label = label;
    }

    public BigDecimal getLabel() {
        beforePropertyRead("label");
        return this.label;
    }

    public void setLat(BigDecimal lat) {
        beforePropertyWrite("lat", this.lat, lat);
        this.lat = lat;
    }

    public BigDecimal getLat() {
        beforePropertyRead("lat");
        return this.lat;
    }

    public void setLon(BigDecimal lon) {
        beforePropertyWrite("lon", this.lon, lon);
        this.lon = lon;
    }

    public BigDecimal getLon() {
        beforePropertyRead("lon");
        return this.lon;
    }

    public void setMaxMooringDepth(BigDecimal maxMooringDepth) {
        beforePropertyWrite("maxMooringDepth", this.maxMooringDepth, maxMooringDepth);
        this.maxMooringDepth = maxMooringDepth;
    }

    public BigDecimal getMaxMooringDepth() {
        beforePropertyRead("maxMooringDepth");
        return this.maxMooringDepth;
    }

    public void setNoSite(BigDecimal noSite) {
        beforePropertyWrite("noSite", this.noSite, noSite);
        this.noSite = noSite;
    }

    public BigDecimal getNoSite() {
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

    public void setScore(BigDecimal score) {
        beforePropertyWrite("score", this.score, score);
        this.score = score;
    }

    public BigDecimal getScore() {
        beforePropertyRead("score");
        return this.score;
    }

    public void setShipName(String shipName) {
        beforePropertyWrite("shipName", this.shipName, shipName);
        this.shipName = shipName;
    }

    public String getShipName() {
        beforePropertyRead("shipName");
        return this.shipName;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        beforePropertyWrite("windSpeed", this.windSpeed, windSpeed);
        this.windSpeed = windSpeed;
    }

    public BigDecimal getWindSpeed() {
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
            case "shipName":
                return this.shipName;
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
                this.ctd = (BigDecimal)val;
                break;
            case "ctdRef":
                this.ctdRef = (String)val;
                break;
            case "ctdo2":
                this.ctdo2 = (BigDecimal)val;
                break;
            case "density":
                this.density = (BigDecimal)val;
                break;
            case "deplDate":
                this.deplDate = (LocalDateTime)val;
                break;
            case "deplHeight":
                this.deplHeight = (BigDecimal)val;
                break;
            case "deplSpeed":
                this.deplSpeed = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "label":
                this.label = (BigDecimal)val;
                break;
            case "lat":
                this.lat = (BigDecimal)val;
                break;
            case "lon":
                this.lon = (BigDecimal)val;
                break;
            case "maxMooringDepth":
                this.maxMooringDepth = (BigDecimal)val;
                break;
            case "noSite":
                this.noSite = (BigDecimal)val;
                break;
            case "refStationId":
                this.refStationId = (String)val;
                break;
            case "score":
                this.score = (BigDecimal)val;
                break;
            case "shipName":
                this.shipName = (String)val;
                break;
            case "windSpeed":
                this.windSpeed = (BigDecimal)val;
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
        out.writeObject(this.shipName);
        out.writeObject(this.windSpeed);
        out.writeObject(this.contact);
        out.writeObject(this.country);
        out.writeObject(this.cruise);
        out.writeObject(this.deplMethod);
        out.writeObject(this.deplType);
        out.writeObject(this.packType);
        out.writeObject(this.ship);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cruiseName = (String)in.readObject();
        this.ctd = (BigDecimal)in.readObject();
        this.ctdRef = (String)in.readObject();
        this.ctdo2 = (BigDecimal)in.readObject();
        this.density = (BigDecimal)in.readObject();
        this.deplDate = (LocalDateTime)in.readObject();
        this.deplHeight = (BigDecimal)in.readObject();
        this.deplSpeed = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.label = (BigDecimal)in.readObject();
        this.lat = (BigDecimal)in.readObject();
        this.lon = (BigDecimal)in.readObject();
        this.maxMooringDepth = (BigDecimal)in.readObject();
        this.noSite = (BigDecimal)in.readObject();
        this.refStationId = (String)in.readObject();
        this.score = (BigDecimal)in.readObject();
        this.shipName = (String)in.readObject();
        this.windSpeed = (BigDecimal)in.readObject();
        this.contact = in.readObject();
        this.country = in.readObject();
        this.cruise = in.readObject();
        this.deplMethod = in.readObject();
        this.deplType = in.readObject();
        this.packType = in.readObject();
        this.ship = in.readObject();
    }

}
