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
import org.oceanops.orm.Country;
import org.oceanops.orm.Ship;

/**
 * Class _ShipHistory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipHistory extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> CALL_SIGN = PropertyFactory.createString("callSign", String.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final StringProperty<String> ICES_CODE = PropertyFactory.createString("icesCode", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final StringProperty<String> MMSI = PropertyFactory.createString("mmsi", String.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final NumericProperty<Integer> OLD_ID = PropertyFactory.createNumeric("oldId", Integer.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final EntityProperty<Ship> SHIP = PropertyFactory.createEntity("ship", Ship.class);

    protected String callSign;
    protected String description;
    protected LocalDateTime endDate;
    protected String icesCode;
    protected Integer id;
    protected LocalDateTime insertDate;
    protected String mmsi;
    protected String name;
    protected Integer oldId;
    protected LocalDateTime startDate;
    protected LocalDateTime updateDate;

    protected Object country;
    protected Object ship;

    public void setCallSign(String callSign) {
        beforePropertyWrite("callSign", this.callSign, callSign);
        this.callSign = callSign;
    }

    public String getCallSign() {
        beforePropertyRead("callSign");
        return this.callSign;
    }

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setIcesCode(String icesCode) {
        beforePropertyWrite("icesCode", this.icesCode, icesCode);
        this.icesCode = icesCode;
    }

    public String getIcesCode() {
        beforePropertyRead("icesCode");
        return this.icesCode;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        beforePropertyWrite("insertDate", this.insertDate, insertDate);
        this.insertDate = insertDate;
    }

    public LocalDateTime getInsertDate() {
        beforePropertyRead("insertDate");
        return this.insertDate;
    }

    public void setMmsi(String mmsi) {
        beforePropertyWrite("mmsi", this.mmsi, mmsi);
        this.mmsi = mmsi;
    }

    public String getMmsi() {
        beforePropertyRead("mmsi");
        return this.mmsi;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setOldId(Integer oldId) {
        beforePropertyWrite("oldId", this.oldId, oldId);
        this.oldId = oldId;
    }

    public Integer getOldId() {
        beforePropertyRead("oldId");
        return this.oldId;
    }

    public void setStartDate(LocalDateTime startDate) {
        beforePropertyWrite("startDate", this.startDate, startDate);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        beforePropertyRead("startDate");
        return this.startDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        beforePropertyWrite("updateDate", this.updateDate, updateDate);
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateDate() {
        beforePropertyRead("updateDate");
        return this.updateDate;
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
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
            case "callSign":
                return this.callSign;
            case "description":
                return this.description;
            case "endDate":
                return this.endDate;
            case "icesCode":
                return this.icesCode;
            case "id":
                return this.id;
            case "insertDate":
                return this.insertDate;
            case "mmsi":
                return this.mmsi;
            case "name":
                return this.name;
            case "oldId":
                return this.oldId;
            case "startDate":
                return this.startDate;
            case "updateDate":
                return this.updateDate;
            case "country":
                return this.country;
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
            case "callSign":
                this.callSign = (String)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "endDate":
                this.endDate = (LocalDateTime)val;
                break;
            case "icesCode":
                this.icesCode = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "insertDate":
                this.insertDate = (LocalDateTime)val;
                break;
            case "mmsi":
                this.mmsi = (String)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "oldId":
                this.oldId = (Integer)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "country":
                this.country = val;
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
        out.writeObject(this.callSign);
        out.writeObject(this.description);
        out.writeObject(this.endDate);
        out.writeObject(this.icesCode);
        out.writeObject(this.id);
        out.writeObject(this.insertDate);
        out.writeObject(this.mmsi);
        out.writeObject(this.name);
        out.writeObject(this.oldId);
        out.writeObject(this.startDate);
        out.writeObject(this.updateDate);
        out.writeObject(this.country);
        out.writeObject(this.ship);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.callSign = (String)in.readObject();
        this.description = (String)in.readObject();
        this.endDate = (LocalDateTime)in.readObject();
        this.icesCode = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.mmsi = (String)in.readObject();
        this.name = (String)in.readObject();
        this.oldId = (Integer)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.country = in.readObject();
        this.ship = in.readObject();
    }

}