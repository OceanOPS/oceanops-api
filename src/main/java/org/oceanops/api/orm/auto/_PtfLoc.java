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
import org.oceanops.api.orm.Doc;
import org.oceanops.api.orm.LocSystem;
import org.oceanops.api.orm.Obs;
import org.oceanops.api.orm.Ptf;

/**
 * Class _PtfLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfLoc extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Double> ELEVATION = PropertyFactory.createNumeric("elevation", Double.class);
    public static final NumericProperty<Integer> FLAG = PropertyFactory.createNumeric("flag", Integer.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Double> IMG_LAT = PropertyFactory.createNumeric("imgLat", Double.class);
    public static final NumericProperty<Double> IMG_LON = PropertyFactory.createNumeric("imgLon", Double.class);
    public static final NumericProperty<Double> LAT = PropertyFactory.createNumeric("lat", Double.class);
    public static final DateProperty<LocalDateTime> LOC_DATE = PropertyFactory.createDate("locDate", LocalDateTime.class);
    public static final NumericProperty<Double> LON = PropertyFactory.createNumeric("lon", Double.class);
    public static final NumericProperty<Integer> QUALITY = PropertyFactory.createNumeric("quality", Integer.class);
    public static final ListProperty<Doc> DOCS = PropertyFactory.createList("docs", Doc.class);
    public static final EntityProperty<LocSystem> LOC_SYSTEM = PropertyFactory.createEntity("locSystem", LocSystem.class);
    public static final ListProperty<Obs> OBSS = PropertyFactory.createList("obss", Obs.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);

    protected Double elevation;
    protected Integer flag;
    protected Integer id;
    protected Double imgLat;
    protected Double imgLon;
    protected Double lat;
    protected LocalDateTime locDate;
    protected Double lon;
    protected Integer quality;

    protected Object docs;
    protected Object locSystem;
    protected Object obss;
    protected Object ptf;
    protected Object ptfs;

    public void setElevation(Double elevation) {
        beforePropertyWrite("elevation", this.elevation, elevation);
        this.elevation = elevation;
    }

    public Double getElevation() {
        beforePropertyRead("elevation");
        return this.elevation;
    }

    public void setFlag(Integer flag) {
        beforePropertyWrite("flag", this.flag, flag);
        this.flag = flag;
    }

    public Integer getFlag() {
        beforePropertyRead("flag");
        return this.flag;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setImgLat(Double imgLat) {
        beforePropertyWrite("imgLat", this.imgLat, imgLat);
        this.imgLat = imgLat;
    }

    public Double getImgLat() {
        beforePropertyRead("imgLat");
        return this.imgLat;
    }

    public void setImgLon(Double imgLon) {
        beforePropertyWrite("imgLon", this.imgLon, imgLon);
        this.imgLon = imgLon;
    }

    public Double getImgLon() {
        beforePropertyRead("imgLon");
        return this.imgLon;
    }

    public void setLat(Double lat) {
        beforePropertyWrite("lat", this.lat, lat);
        this.lat = lat;
    }

    public Double getLat() {
        beforePropertyRead("lat");
        return this.lat;
    }

    public void setLocDate(LocalDateTime locDate) {
        beforePropertyWrite("locDate", this.locDate, locDate);
        this.locDate = locDate;
    }

    public LocalDateTime getLocDate() {
        beforePropertyRead("locDate");
        return this.locDate;
    }

    public void setLon(Double lon) {
        beforePropertyWrite("lon", this.lon, lon);
        this.lon = lon;
    }

    public Double getLon() {
        beforePropertyRead("lon");
        return this.lon;
    }

    public void setQuality(Integer quality) {
        beforePropertyWrite("quality", this.quality, quality);
        this.quality = quality;
    }

    public Integer getQuality() {
        beforePropertyRead("quality");
        return this.quality;
    }

    public void addToDocs(Doc obj) {
        addToManyTarget("docs", obj, true);
    }

    public void removeFromDocs(Doc obj) {
        removeToManyTarget("docs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Doc> getDocs() {
        return (List<Doc>)readProperty("docs");
    }

    public void setLocSystem(LocSystem locSystem) {
        setToOneTarget("locSystem", locSystem, true);
    }

    public LocSystem getLocSystem() {
        return (LocSystem)readProperty("locSystem");
    }

    public void addToObss(Obs obj) {
        addToManyTarget("obss", obj, true);
    }

    public void removeFromObss(Obs obj) {
        removeToManyTarget("obss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Obs> getObss() {
        return (List<Obs>)readProperty("obss");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
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
            case "elevation":
                return this.elevation;
            case "flag":
                return this.flag;
            case "id":
                return this.id;
            case "imgLat":
                return this.imgLat;
            case "imgLon":
                return this.imgLon;
            case "lat":
                return this.lat;
            case "locDate":
                return this.locDate;
            case "lon":
                return this.lon;
            case "quality":
                return this.quality;
            case "docs":
                return this.docs;
            case "locSystem":
                return this.locSystem;
            case "obss":
                return this.obss;
            case "ptf":
                return this.ptf;
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
            case "elevation":
                this.elevation = (Double)val;
                break;
            case "flag":
                this.flag = (Integer)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "imgLat":
                this.imgLat = (Double)val;
                break;
            case "imgLon":
                this.imgLon = (Double)val;
                break;
            case "lat":
                this.lat = (Double)val;
                break;
            case "locDate":
                this.locDate = (LocalDateTime)val;
                break;
            case "lon":
                this.lon = (Double)val;
                break;
            case "quality":
                this.quality = (Integer)val;
                break;
            case "docs":
                this.docs = val;
                break;
            case "locSystem":
                this.locSystem = val;
                break;
            case "obss":
                this.obss = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.elevation);
        out.writeObject(this.flag);
        out.writeObject(this.id);
        out.writeObject(this.imgLat);
        out.writeObject(this.imgLon);
        out.writeObject(this.lat);
        out.writeObject(this.locDate);
        out.writeObject(this.lon);
        out.writeObject(this.quality);
        out.writeObject(this.docs);
        out.writeObject(this.locSystem);
        out.writeObject(this.obss);
        out.writeObject(this.ptf);
        out.writeObject(this.ptfs);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.elevation = (Double)in.readObject();
        this.flag = (Integer)in.readObject();
        this.id = (Integer)in.readObject();
        this.imgLat = (Double)in.readObject();
        this.imgLon = (Double)in.readObject();
        this.lat = (Double)in.readObject();
        this.locDate = (LocalDateTime)in.readObject();
        this.lon = (Double)in.readObject();
        this.quality = (Integer)in.readObject();
        this.docs = in.readObject();
        this.locSystem = in.readObject();
        this.obss = in.readObject();
        this.ptf = in.readObject();
        this.ptfs = in.readObject();
    }

}
