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
import org.oceanops.orm.ObsDataStatus;
import org.oceanops.orm.ObsGlidersGtsOsmcVariable;
import org.oceanops.orm.Ptf;

/**
 * Class _ObsGlidersGtsOsmc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsGlidersGtsOsmc extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> DISTRIBUTION_DATE = PropertyFactory.createDate("distributionDate", LocalDateTime.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final NumericProperty<Double> LAT = PropertyFactory.createNumeric("lat", Double.class);
    public static final DateProperty<LocalDateTime> LATEST_DISTRIBUTION_DATE = PropertyFactory.createDate("latestDistributionDate", LocalDateTime.class);
    public static final NumericProperty<Double> LON = PropertyFactory.createNumeric("lon", Double.class);
    public static final DateProperty<LocalDateTime> OBS_DATE = PropertyFactory.createDate("obsDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final StringProperty<String> WMO = PropertyFactory.createString("wmo", String.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS = PropertyFactory.createEntity("obsDataStatus", ObsDataStatus.class);
    public static final ListProperty<ObsGlidersGtsOsmcVariable> OBS_GLIDERS_GTS_OSMC_VARIABLES = PropertyFactory.createList("obsGlidersGtsOsmcVariables", ObsGlidersGtsOsmcVariable.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected LocalDateTime distributionDate;
    protected Integer id;
    protected LocalDateTime insertDate;
    protected Double lat;
    protected LocalDateTime latestDistributionDate;
    protected Double lon;
    protected LocalDateTime obsDate;
    protected LocalDateTime updateDate;
    protected String wmo;

    protected Object obsDataStatus;
    protected Object obsGlidersGtsOsmcVariables;
    protected Object ptf;

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

    public void setObsDataStatus(ObsDataStatus obsDataStatus) {
        setToOneTarget("obsDataStatus", obsDataStatus, true);
    }

    public ObsDataStatus getObsDataStatus() {
        return (ObsDataStatus)readProperty("obsDataStatus");
    }

    public void addToObsGlidersGtsOsmcVariables(ObsGlidersGtsOsmcVariable obj) {
        addToManyTarget("obsGlidersGtsOsmcVariables", obj, true);
    }

    public void removeFromObsGlidersGtsOsmcVariables(ObsGlidersGtsOsmcVariable obj) {
        removeToManyTarget("obsGlidersGtsOsmcVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGtsOsmcVariable> getObsGlidersGtsOsmcVariables() {
        return (List<ObsGlidersGtsOsmcVariable>)readProperty("obsGlidersGtsOsmcVariables");
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
            case "obsDataStatus":
                return this.obsDataStatus;
            case "obsGlidersGtsOsmcVariables":
                return this.obsGlidersGtsOsmcVariables;
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
            case "obsDataStatus":
                this.obsDataStatus = val;
                break;
            case "obsGlidersGtsOsmcVariables":
                this.obsGlidersGtsOsmcVariables = val;
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
        out.writeObject(this.distributionDate);
        out.writeObject(this.id);
        out.writeObject(this.insertDate);
        out.writeObject(this.lat);
        out.writeObject(this.latestDistributionDate);
        out.writeObject(this.lon);
        out.writeObject(this.obsDate);
        out.writeObject(this.updateDate);
        out.writeObject(this.wmo);
        out.writeObject(this.obsDataStatus);
        out.writeObject(this.obsGlidersGtsOsmcVariables);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.distributionDate = (LocalDateTime)in.readObject();
        this.id = (Integer)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.lat = (Double)in.readObject();
        this.latestDistributionDate = (LocalDateTime)in.readObject();
        this.lon = (Double)in.readObject();
        this.obsDate = (LocalDateTime)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.wmo = (String)in.readObject();
        this.obsDataStatus = in.readObject();
        this.obsGlidersGtsOsmcVariables = in.readObject();
        this.ptf = in.readObject();
    }

}