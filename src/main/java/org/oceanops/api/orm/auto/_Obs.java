package org.oceanops.api.orm.auto;

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
import org.oceanops.api.orm.GtsCccc;
import org.oceanops.api.orm.GtsCode;
import org.oceanops.api.orm.GtsHeader;
import org.oceanops.api.orm.GtsInstrumentType;
import org.oceanops.api.orm.GtsRecorderType;
import org.oceanops.api.orm.ObsDataStatus;
import org.oceanops.api.orm.ObsObsDataStatus;
import org.oceanops.api.orm.ObsVariable;
import org.oceanops.api.orm.Ptf;

/**
 * Class _Obs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Obs extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Double> DELAY = PropertyFactory.createNumeric("delay", Double.class);
    public static final NumericProperty<Double> DEPTH = PropertyFactory.createNumeric("depth", Double.class);
    public static final DateProperty<LocalDateTime> DISTRIBUTION_DATE = PropertyFactory.createDate("distributionDate", LocalDateTime.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final NumericProperty<Double> LAT = PropertyFactory.createNumeric("lat", Double.class);
    public static final DateProperty<LocalDateTime> LATEST_DISTRIBUTION_DATE = PropertyFactory.createDate("latestDistributionDate", LocalDateTime.class);
    public static final NumericProperty<Double> LON = PropertyFactory.createNumeric("lon", Double.class);
    public static final DateProperty<LocalDateTime> OBS_DATE = PropertyFactory.createDate("obsDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final StringProperty<String> WMO = PropertyFactory.createString("wmo", String.class);
    public static final EntityProperty<GtsCccc> GTS_CCCC = PropertyFactory.createEntity("gtsCccc", GtsCccc.class);
    public static final EntityProperty<GtsCode> GTS_CODE = PropertyFactory.createEntity("gtsCode", GtsCode.class);
    public static final EntityProperty<GtsHeader> GTS_HEADER = PropertyFactory.createEntity("gtsHeader", GtsHeader.class);
    public static final EntityProperty<GtsInstrumentType> GTS_INSTRUMENT_TYPE = PropertyFactory.createEntity("gtsInstrumentType", GtsInstrumentType.class);
    public static final EntityProperty<GtsRecorderType> GTS_RECORDER_TYPE = PropertyFactory.createEntity("gtsRecorderType", GtsRecorderType.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS = PropertyFactory.createEntity("obsDataStatus", ObsDataStatus.class);
    public static final ListProperty<ObsObsDataStatus> OBS_OBS_DATA_STATUSES = PropertyFactory.createList("obsObsDataStatuses", ObsObsDataStatus.class);
    public static final ListProperty<ObsVariable> OBS_VARIABLES = PropertyFactory.createList("obsVariables", ObsVariable.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected Double delay;
    protected Double depth;
    protected LocalDateTime distributionDate;
    protected Integer id;
    protected LocalDateTime insertDate;
    protected Double lat;
    protected LocalDateTime latestDistributionDate;
    protected Double lon;
    protected LocalDateTime obsDate;
    protected LocalDateTime updateDate;
    protected String wmo;

    protected Object gtsCccc;
    protected Object gtsCode;
    protected Object gtsHeader;
    protected Object gtsInstrumentType;
    protected Object gtsRecorderType;
    protected Object obsDataStatus;
    protected Object obsObsDataStatuses;
    protected Object obsVariables;
    protected Object ptf;

    public void setDelay(Double delay) {
        beforePropertyWrite("delay", this.delay, delay);
        this.delay = delay;
    }

    public Double getDelay() {
        beforePropertyRead("delay");
        return this.delay;
    }

    public void setDepth(Double depth) {
        beforePropertyWrite("depth", this.depth, depth);
        this.depth = depth;
    }

    public Double getDepth() {
        beforePropertyRead("depth");
        return this.depth;
    }

    public void setDistributionDate(LocalDateTime distributionDate) {
        beforePropertyWrite("distributionDate", this.distributionDate, distributionDate);
        this.distributionDate = distributionDate;
    }

    public LocalDateTime getDistributionDate() {
        beforePropertyRead("distributionDate");
        return this.distributionDate;
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

    public void setLat(Double lat) {
        beforePropertyWrite("lat", this.lat, lat);
        this.lat = lat;
    }

    public Double getLat() {
        beforePropertyRead("lat");
        return this.lat;
    }

    public void setLatestDistributionDate(LocalDateTime latestDistributionDate) {
        beforePropertyWrite("latestDistributionDate", this.latestDistributionDate, latestDistributionDate);
        this.latestDistributionDate = latestDistributionDate;
    }

    public LocalDateTime getLatestDistributionDate() {
        beforePropertyRead("latestDistributionDate");
        return this.latestDistributionDate;
    }

    public void setLon(Double lon) {
        beforePropertyWrite("lon", this.lon, lon);
        this.lon = lon;
    }

    public Double getLon() {
        beforePropertyRead("lon");
        return this.lon;
    }

    public void setObsDate(LocalDateTime obsDate) {
        beforePropertyWrite("obsDate", this.obsDate, obsDate);
        this.obsDate = obsDate;
    }

    public LocalDateTime getObsDate() {
        beforePropertyRead("obsDate");
        return this.obsDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        beforePropertyWrite("updateDate", this.updateDate, updateDate);
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateDate() {
        beforePropertyRead("updateDate");
        return this.updateDate;
    }

    public void setWmo(String wmo) {
        beforePropertyWrite("wmo", this.wmo, wmo);
        this.wmo = wmo;
    }

    public String getWmo() {
        beforePropertyRead("wmo");
        return this.wmo;
    }

    public void setGtsCccc(GtsCccc gtsCccc) {
        setToOneTarget("gtsCccc", gtsCccc, true);
    }

    public GtsCccc getGtsCccc() {
        return (GtsCccc)readProperty("gtsCccc");
    }

    public void setGtsCode(GtsCode gtsCode) {
        setToOneTarget("gtsCode", gtsCode, true);
    }

    public GtsCode getGtsCode() {
        return (GtsCode)readProperty("gtsCode");
    }

    public void setGtsHeader(GtsHeader gtsHeader) {
        setToOneTarget("gtsHeader", gtsHeader, true);
    }

    public GtsHeader getGtsHeader() {
        return (GtsHeader)readProperty("gtsHeader");
    }

    public void setGtsInstrumentType(GtsInstrumentType gtsInstrumentType) {
        setToOneTarget("gtsInstrumentType", gtsInstrumentType, true);
    }

    public GtsInstrumentType getGtsInstrumentType() {
        return (GtsInstrumentType)readProperty("gtsInstrumentType");
    }

    public void setGtsRecorderType(GtsRecorderType gtsRecorderType) {
        setToOneTarget("gtsRecorderType", gtsRecorderType, true);
    }

    public GtsRecorderType getGtsRecorderType() {
        return (GtsRecorderType)readProperty("gtsRecorderType");
    }

    public void setObsDataStatus(ObsDataStatus obsDataStatus) {
        setToOneTarget("obsDataStatus", obsDataStatus, true);
    }

    public ObsDataStatus getObsDataStatus() {
        return (ObsDataStatus)readProperty("obsDataStatus");
    }

    public void addToObsObsDataStatuses(ObsObsDataStatus obj) {
        addToManyTarget("obsObsDataStatuses", obj, true);
    }

    public void removeFromObsObsDataStatuses(ObsObsDataStatus obj) {
        removeToManyTarget("obsObsDataStatuses", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsObsDataStatus> getObsObsDataStatuses() {
        return (List<ObsObsDataStatus>)readProperty("obsObsDataStatuses");
    }

    public void addToObsVariables(ObsVariable obj) {
        addToManyTarget("obsVariables", obj, true);
    }

    public void removeFromObsVariables(ObsVariable obj) {
        removeToManyTarget("obsVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsVariable> getObsVariables() {
        return (List<ObsVariable>)readProperty("obsVariables");
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
            case "delay":
                return this.delay;
            case "depth":
                return this.depth;
            case "distributionDate":
                return this.distributionDate;
            case "id":
                return this.id;
            case "insertDate":
                return this.insertDate;
            case "lat":
                return this.lat;
            case "latestDistributionDate":
                return this.latestDistributionDate;
            case "lon":
                return this.lon;
            case "obsDate":
                return this.obsDate;
            case "updateDate":
                return this.updateDate;
            case "wmo":
                return this.wmo;
            case "gtsCccc":
                return this.gtsCccc;
            case "gtsCode":
                return this.gtsCode;
            case "gtsHeader":
                return this.gtsHeader;
            case "gtsInstrumentType":
                return this.gtsInstrumentType;
            case "gtsRecorderType":
                return this.gtsRecorderType;
            case "obsDataStatus":
                return this.obsDataStatus;
            case "obsObsDataStatuses":
                return this.obsObsDataStatuses;
            case "obsVariables":
                return this.obsVariables;
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
            case "delay":
                this.delay = (Double)val;
                break;
            case "depth":
                this.depth = (Double)val;
                break;
            case "distributionDate":
                this.distributionDate = (LocalDateTime)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "insertDate":
                this.insertDate = (LocalDateTime)val;
                break;
            case "lat":
                this.lat = (Double)val;
                break;
            case "latestDistributionDate":
                this.latestDistributionDate = (LocalDateTime)val;
                break;
            case "lon":
                this.lon = (Double)val;
                break;
            case "obsDate":
                this.obsDate = (LocalDateTime)val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "wmo":
                this.wmo = (String)val;
                break;
            case "gtsCccc":
                this.gtsCccc = val;
                break;
            case "gtsCode":
                this.gtsCode = val;
                break;
            case "gtsHeader":
                this.gtsHeader = val;
                break;
            case "gtsInstrumentType":
                this.gtsInstrumentType = val;
                break;
            case "gtsRecorderType":
                this.gtsRecorderType = val;
                break;
            case "obsDataStatus":
                this.obsDataStatus = val;
                break;
            case "obsObsDataStatuses":
                this.obsObsDataStatuses = val;
                break;
            case "obsVariables":
                this.obsVariables = val;
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
        out.writeObject(this.delay);
        out.writeObject(this.depth);
        out.writeObject(this.distributionDate);
        out.writeObject(this.id);
        out.writeObject(this.insertDate);
        out.writeObject(this.lat);
        out.writeObject(this.latestDistributionDate);
        out.writeObject(this.lon);
        out.writeObject(this.obsDate);
        out.writeObject(this.updateDate);
        out.writeObject(this.wmo);
        out.writeObject(this.gtsCccc);
        out.writeObject(this.gtsCode);
        out.writeObject(this.gtsHeader);
        out.writeObject(this.gtsInstrumentType);
        out.writeObject(this.gtsRecorderType);
        out.writeObject(this.obsDataStatus);
        out.writeObject(this.obsObsDataStatuses);
        out.writeObject(this.obsVariables);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.delay = (Double)in.readObject();
        this.depth = (Double)in.readObject();
        this.distributionDate = (LocalDateTime)in.readObject();
        this.id = (Integer)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.lat = (Double)in.readObject();
        this.latestDistributionDate = (LocalDateTime)in.readObject();
        this.lon = (Double)in.readObject();
        this.obsDate = (LocalDateTime)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.wmo = (String)in.readObject();
        this.gtsCccc = in.readObject();
        this.gtsCode = in.readObject();
        this.gtsHeader = in.readObject();
        this.gtsInstrumentType = in.readObject();
        this.gtsRecorderType = in.readObject();
        this.obsDataStatus = in.readObject();
        this.obsObsDataStatuses = in.readObject();
        this.obsVariables = in.readObject();
        this.ptf = in.readObject();
    }

}
