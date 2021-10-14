package org.oceanops.api.orm.auto;

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
import org.oceanops.api.orm.DataProcessingMethod;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.SensorExposure;
import org.oceanops.api.orm.SensorLocation;
import org.oceanops.api.orm.SensorModel;
import org.oceanops.api.orm.SensorStatus;
import org.oceanops.api.orm.TimePeriod;
import org.oceanops.api.orm.Variable;
import org.oceanops.api.orm.Weblink;

/**
 * Class _PtfVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfVariable extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> ACCURACY = PropertyFactory.createString("accuracy", String.class);
    public static final StringProperty<String> AVERAGING_METHOD = PropertyFactory.createString("averagingMethod", String.class);
    public static final NumericProperty<Double> AVERAGING_PERIOD = PropertyFactory.createNumeric("averagingPeriod", Double.class);
    public static final DateProperty<LocalDateTime> CALIB_DATE = PropertyFactory.createDate("calibDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> CALIB_DATE_NEXT = PropertyFactory.createDate("calibDateNext", LocalDateTime.class);
    public static final StringProperty<String> COMMENTS = PropertyFactory.createString("comments", String.class);
    public static final StringProperty<String> CONTROL_SCHEDULE = PropertyFactory.createString("controlSchedule", String.class);
    public static final NumericProperty<Double> DISTANCE_X = PropertyFactory.createNumeric("distanceX", Double.class);
    public static final NumericProperty<Double> DISTANCE_Y = PropertyFactory.createNumeric("distanceY", Double.class);
    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> FIRST_MEASURED = PropertyFactory.createDate("firstMeasured", LocalDateTime.class);
    public static final NumericProperty<Double> HEIGHT = PropertyFactory.createNumeric("height", Double.class);
    public static final NumericProperty<Double> HEIGHT_SECONDARY_REF_LEVEL = PropertyFactory.createNumeric("heightSecondaryRefLevel", Double.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> LAST_MEASURED = PropertyFactory.createDate("lastMeasured", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> MANUF_DATE = PropertyFactory.createDate("manufDate", LocalDateTime.class);
    public static final NumericProperty<Integer> NB_OBS = PropertyFactory.createNumeric("nbObs", Integer.class);
    public static final StringProperty<String> OWNERSHIP = PropertyFactory.createString("ownership", String.class);
    public static final NumericProperty<Integer> PACKAGE_N = PropertyFactory.createNumeric("packageN", Integer.class);
    public static final StringProperty<String> PRECISION = PropertyFactory.createString("precision", String.class);
    public static final StringProperty<String> RANGE = PropertyFactory.createString("range", String.class);
    public static final StringProperty<String> RESOLUTION = PropertyFactory.createString("resolution", String.class);
    public static final StringProperty<String> SAMPLING_RATE = PropertyFactory.createString("samplingRate", String.class);
    public static final StringProperty<String> SAMPLING_RATE_TOTAL = PropertyFactory.createString("samplingRateTotal", String.class);
    public static final StringProperty<String> SERIAL_NO = PropertyFactory.createString("serialNo", String.class);
    public static final StringProperty<String> SIDE_INDICATOR = PropertyFactory.createString("sideIndicator", String.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final NumericProperty<Double> TIME_OFFSET = PropertyFactory.createNumeric("timeOffset", Double.class);
    public static final NumericProperty<Integer> VARIABLE_ID = PropertyFactory.createNumeric("variableId", Integer.class);
    public static final EntityProperty<DataProcessingMethod> DATA_PROCESSING_METHOD = PropertyFactory.createEntity("dataProcessingMethod", DataProcessingMethod.class);
    public static final EntityProperty<Weblink> MANUF_WEBLINK = PropertyFactory.createEntity("manufWeblink", Weblink.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final EntityProperty<SensorExposure> SENSOR_EXPOSURE = PropertyFactory.createEntity("sensorExposure", SensorExposure.class);
    public static final EntityProperty<SensorLocation> SENSOR_LOCATION = PropertyFactory.createEntity("sensorLocation", SensorLocation.class);
    public static final EntityProperty<SensorModel> SENSOR_MODEL = PropertyFactory.createEntity("sensorModel", SensorModel.class);
    public static final EntityProperty<SensorStatus> SENSOR_STATUS = PropertyFactory.createEntity("sensorStatus", SensorStatus.class);
    public static final EntityProperty<TimePeriod> SERVICE_SCHEDULE = PropertyFactory.createEntity("serviceSchedule", TimePeriod.class);
    public static final EntityProperty<Variable> VARIABLE = PropertyFactory.createEntity("variable", Variable.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected String accuracy;
    protected String averagingMethod;
    protected Double averagingPeriod;
    protected LocalDateTime calibDate;
    protected LocalDateTime calibDateNext;
    protected String comments;
    protected String controlSchedule;
    protected Double distanceX;
    protected Double distanceY;
    protected LocalDateTime endDate;
    protected LocalDateTime firstMeasured;
    protected Double height;
    protected Double heightSecondaryRefLevel;
    protected Integer id;
    protected LocalDateTime lastMeasured;
    protected LocalDateTime manufDate;
    protected Integer nbObs;
    protected String ownership;
    protected Integer packageN;
    protected String precision;
    protected String range;
    protected String resolution;
    protected String samplingRate;
    protected String samplingRateTotal;
    protected String serialNo;
    protected String sideIndicator;
    protected LocalDateTime startDate;
    protected Double timeOffset;
    protected Integer variableId;

    protected Object dataProcessingMethod;
    protected Object manufWeblink;
    protected Object program;
    protected Object ptf;
    protected Object sensorExposure;
    protected Object sensorLocation;
    protected Object sensorModel;
    protected Object sensorStatus;
    protected Object serviceSchedule;
    protected Object variable;
    protected Object weblink;

    public void setAccuracy(String accuracy) {
        beforePropertyWrite("accuracy", this.accuracy, accuracy);
        this.accuracy = accuracy;
    }

    public String getAccuracy() {
        beforePropertyRead("accuracy");
        return this.accuracy;
    }

    public void setAveragingMethod(String averagingMethod) {
        beforePropertyWrite("averagingMethod", this.averagingMethod, averagingMethod);
        this.averagingMethod = averagingMethod;
    }

    public String getAveragingMethod() {
        beforePropertyRead("averagingMethod");
        return this.averagingMethod;
    }

    public void setAveragingPeriod(Double averagingPeriod) {
        beforePropertyWrite("averagingPeriod", this.averagingPeriod, averagingPeriod);
        this.averagingPeriod = averagingPeriod;
    }

    public Double getAveragingPeriod() {
        beforePropertyRead("averagingPeriod");
        return this.averagingPeriod;
    }

    public void setCalibDate(LocalDateTime calibDate) {
        beforePropertyWrite("calibDate", this.calibDate, calibDate);
        this.calibDate = calibDate;
    }

    public LocalDateTime getCalibDate() {
        beforePropertyRead("calibDate");
        return this.calibDate;
    }

    public void setCalibDateNext(LocalDateTime calibDateNext) {
        beforePropertyWrite("calibDateNext", this.calibDateNext, calibDateNext);
        this.calibDateNext = calibDateNext;
    }

    public LocalDateTime getCalibDateNext() {
        beforePropertyRead("calibDateNext");
        return this.calibDateNext;
    }

    public void setComments(String comments) {
        beforePropertyWrite("comments", this.comments, comments);
        this.comments = comments;
    }

    public String getComments() {
        beforePropertyRead("comments");
        return this.comments;
    }

    public void setControlSchedule(String controlSchedule) {
        beforePropertyWrite("controlSchedule", this.controlSchedule, controlSchedule);
        this.controlSchedule = controlSchedule;
    }

    public String getControlSchedule() {
        beforePropertyRead("controlSchedule");
        return this.controlSchedule;
    }

    public void setDistanceX(Double distanceX) {
        beforePropertyWrite("distanceX", this.distanceX, distanceX);
        this.distanceX = distanceX;
    }

    public Double getDistanceX() {
        beforePropertyRead("distanceX");
        return this.distanceX;
    }

    public void setDistanceY(Double distanceY) {
        beforePropertyWrite("distanceY", this.distanceY, distanceY);
        this.distanceY = distanceY;
    }

    public Double getDistanceY() {
        beforePropertyRead("distanceY");
        return this.distanceY;
    }

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setFirstMeasured(LocalDateTime firstMeasured) {
        beforePropertyWrite("firstMeasured", this.firstMeasured, firstMeasured);
        this.firstMeasured = firstMeasured;
    }

    public LocalDateTime getFirstMeasured() {
        beforePropertyRead("firstMeasured");
        return this.firstMeasured;
    }

    public void setHeight(Double height) {
        beforePropertyWrite("height", this.height, height);
        this.height = height;
    }

    public Double getHeight() {
        beforePropertyRead("height");
        return this.height;
    }

    public void setHeightSecondaryRefLevel(Double heightSecondaryRefLevel) {
        beforePropertyWrite("heightSecondaryRefLevel", this.heightSecondaryRefLevel, heightSecondaryRefLevel);
        this.heightSecondaryRefLevel = heightSecondaryRefLevel;
    }

    public Double getHeightSecondaryRefLevel() {
        beforePropertyRead("heightSecondaryRefLevel");
        return this.heightSecondaryRefLevel;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setLastMeasured(LocalDateTime lastMeasured) {
        beforePropertyWrite("lastMeasured", this.lastMeasured, lastMeasured);
        this.lastMeasured = lastMeasured;
    }

    public LocalDateTime getLastMeasured() {
        beforePropertyRead("lastMeasured");
        return this.lastMeasured;
    }

    public void setManufDate(LocalDateTime manufDate) {
        beforePropertyWrite("manufDate", this.manufDate, manufDate);
        this.manufDate = manufDate;
    }

    public LocalDateTime getManufDate() {
        beforePropertyRead("manufDate");
        return this.manufDate;
    }

    public void setNbObs(Integer nbObs) {
        beforePropertyWrite("nbObs", this.nbObs, nbObs);
        this.nbObs = nbObs;
    }

    public Integer getNbObs() {
        beforePropertyRead("nbObs");
        return this.nbObs;
    }

    public void setOwnership(String ownership) {
        beforePropertyWrite("ownership", this.ownership, ownership);
        this.ownership = ownership;
    }

    public String getOwnership() {
        beforePropertyRead("ownership");
        return this.ownership;
    }

    public void setPackageN(Integer packageN) {
        beforePropertyWrite("packageN", this.packageN, packageN);
        this.packageN = packageN;
    }

    public Integer getPackageN() {
        beforePropertyRead("packageN");
        return this.packageN;
    }

    public void setPrecision(String precision) {
        beforePropertyWrite("precision", this.precision, precision);
        this.precision = precision;
    }

    public String getPrecision() {
        beforePropertyRead("precision");
        return this.precision;
    }

    public void setRange(String range) {
        beforePropertyWrite("range", this.range, range);
        this.range = range;
    }

    public String getRange() {
        beforePropertyRead("range");
        return this.range;
    }

    public void setResolution(String resolution) {
        beforePropertyWrite("resolution", this.resolution, resolution);
        this.resolution = resolution;
    }

    public String getResolution() {
        beforePropertyRead("resolution");
        return this.resolution;
    }

    public void setSamplingRate(String samplingRate) {
        beforePropertyWrite("samplingRate", this.samplingRate, samplingRate);
        this.samplingRate = samplingRate;
    }

    public String getSamplingRate() {
        beforePropertyRead("samplingRate");
        return this.samplingRate;
    }

    public void setSamplingRateTotal(String samplingRateTotal) {
        beforePropertyWrite("samplingRateTotal", this.samplingRateTotal, samplingRateTotal);
        this.samplingRateTotal = samplingRateTotal;
    }

    public String getSamplingRateTotal() {
        beforePropertyRead("samplingRateTotal");
        return this.samplingRateTotal;
    }

    public void setSerialNo(String serialNo) {
        beforePropertyWrite("serialNo", this.serialNo, serialNo);
        this.serialNo = serialNo;
    }

    public String getSerialNo() {
        beforePropertyRead("serialNo");
        return this.serialNo;
    }

    public void setSideIndicator(String sideIndicator) {
        beforePropertyWrite("sideIndicator", this.sideIndicator, sideIndicator);
        this.sideIndicator = sideIndicator;
    }

    public String getSideIndicator() {
        beforePropertyRead("sideIndicator");
        return this.sideIndicator;
    }

    public void setStartDate(LocalDateTime startDate) {
        beforePropertyWrite("startDate", this.startDate, startDate);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        beforePropertyRead("startDate");
        return this.startDate;
    }

    public void setTimeOffset(Double timeOffset) {
        beforePropertyWrite("timeOffset", this.timeOffset, timeOffset);
        this.timeOffset = timeOffset;
    }

    public Double getTimeOffset() {
        beforePropertyRead("timeOffset");
        return this.timeOffset;
    }

    public void setVariableId(Integer variableId) {
        beforePropertyWrite("variableId", this.variableId, variableId);
        this.variableId = variableId;
    }

    public Integer getVariableId() {
        beforePropertyRead("variableId");
        return this.variableId;
    }

    public void setDataProcessingMethod(DataProcessingMethod dataProcessingMethod) {
        setToOneTarget("dataProcessingMethod", dataProcessingMethod, true);
    }

    public DataProcessingMethod getDataProcessingMethod() {
        return (DataProcessingMethod)readProperty("dataProcessingMethod");
    }

    public void setManufWeblink(Weblink manufWeblink) {
        setToOneTarget("manufWeblink", manufWeblink, true);
    }

    public Weblink getManufWeblink() {
        return (Weblink)readProperty("manufWeblink");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    public void setSensorExposure(SensorExposure sensorExposure) {
        setToOneTarget("sensorExposure", sensorExposure, true);
    }

    public SensorExposure getSensorExposure() {
        return (SensorExposure)readProperty("sensorExposure");
    }

    public void setSensorLocation(SensorLocation sensorLocation) {
        setToOneTarget("sensorLocation", sensorLocation, true);
    }

    public SensorLocation getSensorLocation() {
        return (SensorLocation)readProperty("sensorLocation");
    }

    public void setSensorModel(SensorModel sensorModel) {
        setToOneTarget("sensorModel", sensorModel, true);
    }

    public SensorModel getSensorModel() {
        return (SensorModel)readProperty("sensorModel");
    }

    public void setSensorStatus(SensorStatus sensorStatus) {
        setToOneTarget("sensorStatus", sensorStatus, true);
    }

    public SensorStatus getSensorStatus() {
        return (SensorStatus)readProperty("sensorStatus");
    }

    public void setServiceSchedule(TimePeriod serviceSchedule) {
        setToOneTarget("serviceSchedule", serviceSchedule, true);
    }

    public TimePeriod getServiceSchedule() {
        return (TimePeriod)readProperty("serviceSchedule");
    }

    public void setVariable(Variable variable) {
        setToOneTarget("variable", variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty("variable");
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
            case "accuracy":
                return this.accuracy;
            case "averagingMethod":
                return this.averagingMethod;
            case "averagingPeriod":
                return this.averagingPeriod;
            case "calibDate":
                return this.calibDate;
            case "calibDateNext":
                return this.calibDateNext;
            case "comments":
                return this.comments;
            case "controlSchedule":
                return this.controlSchedule;
            case "distanceX":
                return this.distanceX;
            case "distanceY":
                return this.distanceY;
            case "endDate":
                return this.endDate;
            case "firstMeasured":
                return this.firstMeasured;
            case "height":
                return this.height;
            case "heightSecondaryRefLevel":
                return this.heightSecondaryRefLevel;
            case "id":
                return this.id;
            case "lastMeasured":
                return this.lastMeasured;
            case "manufDate":
                return this.manufDate;
            case "nbObs":
                return this.nbObs;
            case "ownership":
                return this.ownership;
            case "packageN":
                return this.packageN;
            case "precision":
                return this.precision;
            case "range":
                return this.range;
            case "resolution":
                return this.resolution;
            case "samplingRate":
                return this.samplingRate;
            case "samplingRateTotal":
                return this.samplingRateTotal;
            case "serialNo":
                return this.serialNo;
            case "sideIndicator":
                return this.sideIndicator;
            case "startDate":
                return this.startDate;
            case "timeOffset":
                return this.timeOffset;
            case "variableId":
                return this.variableId;
            case "dataProcessingMethod":
                return this.dataProcessingMethod;
            case "manufWeblink":
                return this.manufWeblink;
            case "program":
                return this.program;
            case "ptf":
                return this.ptf;
            case "sensorExposure":
                return this.sensorExposure;
            case "sensorLocation":
                return this.sensorLocation;
            case "sensorModel":
                return this.sensorModel;
            case "sensorStatus":
                return this.sensorStatus;
            case "serviceSchedule":
                return this.serviceSchedule;
            case "variable":
                return this.variable;
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
            case "accuracy":
                this.accuracy = (String)val;
                break;
            case "averagingMethod":
                this.averagingMethod = (String)val;
                break;
            case "averagingPeriod":
                this.averagingPeriod = (Double)val;
                break;
            case "calibDate":
                this.calibDate = (LocalDateTime)val;
                break;
            case "calibDateNext":
                this.calibDateNext = (LocalDateTime)val;
                break;
            case "comments":
                this.comments = (String)val;
                break;
            case "controlSchedule":
                this.controlSchedule = (String)val;
                break;
            case "distanceX":
                this.distanceX = (Double)val;
                break;
            case "distanceY":
                this.distanceY = (Double)val;
                break;
            case "endDate":
                this.endDate = (LocalDateTime)val;
                break;
            case "firstMeasured":
                this.firstMeasured = (LocalDateTime)val;
                break;
            case "height":
                this.height = (Double)val;
                break;
            case "heightSecondaryRefLevel":
                this.heightSecondaryRefLevel = (Double)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "lastMeasured":
                this.lastMeasured = (LocalDateTime)val;
                break;
            case "manufDate":
                this.manufDate = (LocalDateTime)val;
                break;
            case "nbObs":
                this.nbObs = (Integer)val;
                break;
            case "ownership":
                this.ownership = (String)val;
                break;
            case "packageN":
                this.packageN = (Integer)val;
                break;
            case "precision":
                this.precision = (String)val;
                break;
            case "range":
                this.range = (String)val;
                break;
            case "resolution":
                this.resolution = (String)val;
                break;
            case "samplingRate":
                this.samplingRate = (String)val;
                break;
            case "samplingRateTotal":
                this.samplingRateTotal = (String)val;
                break;
            case "serialNo":
                this.serialNo = (String)val;
                break;
            case "sideIndicator":
                this.sideIndicator = (String)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "timeOffset":
                this.timeOffset = (Double)val;
                break;
            case "variableId":
                this.variableId = (Integer)val;
                break;
            case "dataProcessingMethod":
                this.dataProcessingMethod = val;
                break;
            case "manufWeblink":
                this.manufWeblink = val;
                break;
            case "program":
                this.program = val;
                break;
            case "ptf":
                this.ptf = val;
                break;
            case "sensorExposure":
                this.sensorExposure = val;
                break;
            case "sensorLocation":
                this.sensorLocation = val;
                break;
            case "sensorModel":
                this.sensorModel = val;
                break;
            case "sensorStatus":
                this.sensorStatus = val;
                break;
            case "serviceSchedule":
                this.serviceSchedule = val;
                break;
            case "variable":
                this.variable = val;
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
        out.writeObject(this.accuracy);
        out.writeObject(this.averagingMethod);
        out.writeObject(this.averagingPeriod);
        out.writeObject(this.calibDate);
        out.writeObject(this.calibDateNext);
        out.writeObject(this.comments);
        out.writeObject(this.controlSchedule);
        out.writeObject(this.distanceX);
        out.writeObject(this.distanceY);
        out.writeObject(this.endDate);
        out.writeObject(this.firstMeasured);
        out.writeObject(this.height);
        out.writeObject(this.heightSecondaryRefLevel);
        out.writeObject(this.id);
        out.writeObject(this.lastMeasured);
        out.writeObject(this.manufDate);
        out.writeObject(this.nbObs);
        out.writeObject(this.ownership);
        out.writeObject(this.packageN);
        out.writeObject(this.precision);
        out.writeObject(this.range);
        out.writeObject(this.resolution);
        out.writeObject(this.samplingRate);
        out.writeObject(this.samplingRateTotal);
        out.writeObject(this.serialNo);
        out.writeObject(this.sideIndicator);
        out.writeObject(this.startDate);
        out.writeObject(this.timeOffset);
        out.writeObject(this.variableId);
        out.writeObject(this.dataProcessingMethod);
        out.writeObject(this.manufWeblink);
        out.writeObject(this.program);
        out.writeObject(this.ptf);
        out.writeObject(this.sensorExposure);
        out.writeObject(this.sensorLocation);
        out.writeObject(this.sensorModel);
        out.writeObject(this.sensorStatus);
        out.writeObject(this.serviceSchedule);
        out.writeObject(this.variable);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.accuracy = (String)in.readObject();
        this.averagingMethod = (String)in.readObject();
        this.averagingPeriod = (Double)in.readObject();
        this.calibDate = (LocalDateTime)in.readObject();
        this.calibDateNext = (LocalDateTime)in.readObject();
        this.comments = (String)in.readObject();
        this.controlSchedule = (String)in.readObject();
        this.distanceX = (Double)in.readObject();
        this.distanceY = (Double)in.readObject();
        this.endDate = (LocalDateTime)in.readObject();
        this.firstMeasured = (LocalDateTime)in.readObject();
        this.height = (Double)in.readObject();
        this.heightSecondaryRefLevel = (Double)in.readObject();
        this.id = (Integer)in.readObject();
        this.lastMeasured = (LocalDateTime)in.readObject();
        this.manufDate = (LocalDateTime)in.readObject();
        this.nbObs = (Integer)in.readObject();
        this.ownership = (String)in.readObject();
        this.packageN = (Integer)in.readObject();
        this.precision = (String)in.readObject();
        this.range = (String)in.readObject();
        this.resolution = (String)in.readObject();
        this.samplingRate = (String)in.readObject();
        this.samplingRateTotal = (String)in.readObject();
        this.serialNo = (String)in.readObject();
        this.sideIndicator = (String)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.timeOffset = (Double)in.readObject();
        this.variableId = (Integer)in.readObject();
        this.dataProcessingMethod = in.readObject();
        this.manufWeblink = in.readObject();
        this.program = in.readObject();
        this.ptf = in.readObject();
        this.sensorExposure = in.readObject();
        this.sensorLocation = in.readObject();
        this.sensorModel = in.readObject();
        this.sensorStatus = in.readObject();
        this.serviceSchedule = in.readObject();
        this.variable = in.readObject();
        this.weblink = in.readObject();
    }

}
