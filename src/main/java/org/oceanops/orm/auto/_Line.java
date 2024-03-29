package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.BaseProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.value.Wkt;
import org.oceanops.orm.CruiseLine;
import org.oceanops.orm.LineDecadalStatus;
import org.oceanops.orm.LineFamily;
import org.oceanops.orm.LineProgram;
import org.oceanops.orm.LineSurvey;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.WebFrequentation;
import org.oceanops.orm.Weblink;

/**
 * Class _Line was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Line extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> FROM_TO = PropertyFactory.createString("fromTo", String.class);
    public static final BaseProperty<Wkt> GEOM = PropertyFactory.createBase("geom", Wkt.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final ListProperty<CruiseLine> CRUISE_LINES = PropertyFactory.createList("cruiseLines", CruiseLine.class);
    public static final EntityProperty<LineDecadalStatus> LINE_DECADAL_STATUS = PropertyFactory.createEntity("lineDecadalStatus", LineDecadalStatus.class);
    public static final EntityProperty<LineFamily> LINE_FAMILY = PropertyFactory.createEntity("lineFamily", LineFamily.class);
    public static final ListProperty<LineProgram> LINE_PROGRAMS = PropertyFactory.createList("linePrograms", LineProgram.class);
    public static final ListProperty<LineSurvey> LINE_SURVEYS = PropertyFactory.createList("lineSurveys", LineSurvey.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);
    public static final ListProperty<WebFrequentation> WEB_FREQUENTATIONS = PropertyFactory.createList("webFrequentations", WebFrequentation.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected String fromTo;
    protected Wkt geom;
    protected Integer id;
    protected String name;

    protected Object cruiseLines;
    protected Object lineDecadalStatus;
    protected Object lineFamily;
    protected Object linePrograms;
    protected Object lineSurveys;
    protected Object ptfs;
    protected Object webFrequentations;
    protected Object weblink;

    public void setFromTo(String fromTo) {
        beforePropertyWrite("fromTo", this.fromTo, fromTo);
        this.fromTo = fromTo;
    }

    public String getFromTo() {
        beforePropertyRead("fromTo");
        return this.fromTo;
    }

    public void setGeom(Wkt geom) {
        beforePropertyWrite("geom", this.geom, geom);
        this.geom = geom;
    }

    public Wkt getGeom() {
        beforePropertyRead("geom");
        return this.geom;
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

    public void addToCruiseLines(CruiseLine obj) {
        addToManyTarget("cruiseLines", obj, true);
    }

    public void removeFromCruiseLines(CruiseLine obj) {
        removeToManyTarget("cruiseLines", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CruiseLine> getCruiseLines() {
        return (List<CruiseLine>)readProperty("cruiseLines");
    }

    public void setLineDecadalStatus(LineDecadalStatus lineDecadalStatus) {
        setToOneTarget("lineDecadalStatus", lineDecadalStatus, true);
    }

    public LineDecadalStatus getLineDecadalStatus() {
        return (LineDecadalStatus)readProperty("lineDecadalStatus");
    }

    public void setLineFamily(LineFamily lineFamily) {
        setToOneTarget("lineFamily", lineFamily, true);
    }

    public LineFamily getLineFamily() {
        return (LineFamily)readProperty("lineFamily");
    }

    public void addToLinePrograms(LineProgram obj) {
        addToManyTarget("linePrograms", obj, true);
    }

    public void removeFromLinePrograms(LineProgram obj) {
        removeToManyTarget("linePrograms", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<LineProgram> getLinePrograms() {
        return (List<LineProgram>)readProperty("linePrograms");
    }

    public void addToLineSurveys(LineSurvey obj) {
        addToManyTarget("lineSurveys", obj, true);
    }

    public void removeFromLineSurveys(LineSurvey obj) {
        removeToManyTarget("lineSurveys", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<LineSurvey> getLineSurveys() {
        return (List<LineSurvey>)readProperty("lineSurveys");
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

    public void addToWebFrequentations(WebFrequentation obj) {
        addToManyTarget("webFrequentations", obj, true);
    }

    public void removeFromWebFrequentations(WebFrequentation obj) {
        removeToManyTarget("webFrequentations", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WebFrequentation> getWebFrequentations() {
        return (List<WebFrequentation>)readProperty("webFrequentations");
    }

    public void setWeblink(Weblink weblink) {
        setToOneTarget("weblink", weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty("weblink");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "fromTo":
                return this.fromTo;
            case "geom":
                return this.geom;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "cruiseLines":
                return this.cruiseLines;
            case "lineDecadalStatus":
                return this.lineDecadalStatus;
            case "lineFamily":
                return this.lineFamily;
            case "linePrograms":
                return this.linePrograms;
            case "lineSurveys":
                return this.lineSurveys;
            case "ptfs":
                return this.ptfs;
            case "webFrequentations":
                return this.webFrequentations;
            case "weblink":
                return this.weblink;
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
            case "fromTo":
                this.fromTo = (String)val;
                break;
            case "geom":
                this.geom = (Wkt)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "cruiseLines":
                this.cruiseLines = val;
                break;
            case "lineDecadalStatus":
                this.lineDecadalStatus = val;
                break;
            case "lineFamily":
                this.lineFamily = val;
                break;
            case "linePrograms":
                this.linePrograms = val;
                break;
            case "lineSurveys":
                this.lineSurveys = val;
                break;
            case "ptfs":
                this.ptfs = val;
                break;
            case "webFrequentations":
                this.webFrequentations = val;
                break;
            case "weblink":
                this.weblink = val;
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
        out.writeObject(this.fromTo);
        out.writeObject(this.geom);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.cruiseLines);
        out.writeObject(this.lineDecadalStatus);
        out.writeObject(this.lineFamily);
        out.writeObject(this.linePrograms);
        out.writeObject(this.lineSurveys);
        out.writeObject(this.ptfs);
        out.writeObject(this.webFrequentations);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.fromTo = (String)in.readObject();
        this.geom = (Wkt)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.cruiseLines = in.readObject();
        this.lineDecadalStatus = in.readObject();
        this.lineFamily = in.readObject();
        this.linePrograms = in.readObject();
        this.lineSurveys = in.readObject();
        this.ptfs = in.readObject();
        this.webFrequentations = in.readObject();
        this.weblink = in.readObject();
    }

}
