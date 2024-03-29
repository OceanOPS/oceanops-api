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
import org.oceanops.orm.ObsArgoGdac;
import org.oceanops.orm.Ptf;

/**
 * Class _ObsLatest was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsLatest extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Double> LAT = PropertyFactory.createNumeric("lat", Double.class);
    public static final NumericProperty<Double> LON = PropertyFactory.createNumeric("lon", Double.class);
    public static final DateProperty<LocalDateTime> OBS_DATE = PropertyFactory.createDate("obsDate", LocalDateTime.class);
    public static final NumericProperty<Integer> ORIGIN_ID = PropertyFactory.createNumeric("originId", Integer.class);
    public static final StringProperty<String> ORIGIN_TABLE = PropertyFactory.createString("originTable", String.class);
    public static final EntityProperty<ObsArgoGdac> OBS_ARGO_GDAC = PropertyFactory.createEntity("obsArgoGdac", ObsArgoGdac.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);

    protected Integer id;
    protected Double lat;
    protected Double lon;
    protected LocalDateTime obsDate;
    protected Integer originId;
    protected String originTable;

    protected Object obsArgoGdac;
    protected Object ptfs;

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
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

    public void setObsDate(LocalDateTime obsDate) {
        beforePropertyWrite("obsDate", this.obsDate, obsDate);
        this.obsDate = obsDate;
    }

    public LocalDateTime getObsDate() {
        beforePropertyRead("obsDate");
        return this.obsDate;
    }

    public void setOriginId(Integer originId) {
        beforePropertyWrite("originId", this.originId, originId);
        this.originId = originId;
    }

    public Integer getOriginId() {
        beforePropertyRead("originId");
        return this.originId;
    }

    public void setOriginTable(String originTable) {
        beforePropertyWrite("originTable", this.originTable, originTable);
        this.originTable = originTable;
    }

    public String getOriginTable() {
        beforePropertyRead("originTable");
        return this.originTable;
    }

    public void setObsArgoGdac(ObsArgoGdac obsArgoGdac) {
        setToOneTarget("obsArgoGdac", obsArgoGdac, true);
    }

    public ObsArgoGdac getObsArgoGdac() {
        return (ObsArgoGdac)readProperty("obsArgoGdac");
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

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "lat":
                return this.lat;
            case "lon":
                return this.lon;
            case "obsDate":
                return this.obsDate;
            case "originId":
                return this.originId;
            case "originTable":
                return this.originTable;
            case "obsArgoGdac":
                return this.obsArgoGdac;
            case "ptfs":
                return this.ptfs;
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
            case "lat":
                this.lat = (Double)val;
                break;
            case "lon":
                this.lon = (Double)val;
                break;
            case "obsDate":
                this.obsDate = (LocalDateTime)val;
                break;
            case "originId":
                this.originId = (Integer)val;
                break;
            case "originTable":
                this.originTable = (String)val;
                break;
            case "obsArgoGdac":
                this.obsArgoGdac = val;
                break;
            case "ptfs":
                this.ptfs = val;
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
        out.writeObject(this.lat);
        out.writeObject(this.lon);
        out.writeObject(this.obsDate);
        out.writeObject(this.originId);
        out.writeObject(this.originTable);
        out.writeObject(this.obsArgoGdac);
        out.writeObject(this.ptfs);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.id = (Integer)in.readObject();
        this.lat = (Double)in.readObject();
        this.lon = (Double)in.readObject();
        this.obsDate = (LocalDateTime)in.readObject();
        this.originId = (Integer)in.readObject();
        this.originTable = (String)in.readObject();
        this.obsArgoGdac = in.readObject();
        this.ptfs = in.readObject();
    }

}
