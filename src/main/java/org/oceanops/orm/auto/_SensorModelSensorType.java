package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.SensorModel;
import org.oceanops.orm.SensorType;
import org.oceanops.orm.Unit;

/**
 * Class _SensorModelSensorType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SensorModelSensorType extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String SENSOR_MODEL_ID_PK_COLUMN = "SENSOR_MODEL_ID";
    public static final String SENSOR_TYPE_ID_PK_COLUMN = "SENSOR_TYPE_ID";

    public static final StringProperty<String> ACCURACY = PropertyFactory.createString("accuracy", String.class);
    public static final StringProperty<String> PRECISION = PropertyFactory.createString("precision", String.class);
    public static final StringProperty<String> RANGE = PropertyFactory.createString("range", String.class);
    public static final NumericProperty<BigDecimal> RANGE_MAX = PropertyFactory.createNumeric("rangeMax", BigDecimal.class);
    public static final NumericProperty<BigDecimal> RANGE_MIN = PropertyFactory.createNumeric("rangeMin", BigDecimal.class);
    public static final NumericProperty<Integer> RESOLUTION = PropertyFactory.createNumeric("resolution", Integer.class);
    public static final EntityProperty<SensorModel> SENSOR_MODEL = PropertyFactory.createEntity("sensorModel", SensorModel.class);
    public static final EntityProperty<SensorType> SENSOR_TYPE = PropertyFactory.createEntity("sensorType", SensorType.class);
    public static final EntityProperty<Unit> UNIT = PropertyFactory.createEntity("unit", Unit.class);

    protected String accuracy;
    protected String precision;
    protected String range;
    protected BigDecimal rangeMax;
    protected BigDecimal rangeMin;
    protected Integer resolution;

    protected Object sensorModel;
    protected Object sensorType;
    protected Object unit;

    public void setAccuracy(String accuracy) {
        beforePropertyWrite("accuracy", this.accuracy, accuracy);
        this.accuracy = accuracy;
    }

    public String getAccuracy() {
        beforePropertyRead("accuracy");
        return this.accuracy;
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

    public void setRangeMax(BigDecimal rangeMax) {
        beforePropertyWrite("rangeMax", this.rangeMax, rangeMax);
        this.rangeMax = rangeMax;
    }

    public BigDecimal getRangeMax() {
        beforePropertyRead("rangeMax");
        return this.rangeMax;
    }

    public void setRangeMin(BigDecimal rangeMin) {
        beforePropertyWrite("rangeMin", this.rangeMin, rangeMin);
        this.rangeMin = rangeMin;
    }

    public BigDecimal getRangeMin() {
        beforePropertyRead("rangeMin");
        return this.rangeMin;
    }

    public void setResolution(Integer resolution) {
        beforePropertyWrite("resolution", this.resolution, resolution);
        this.resolution = resolution;
    }

    public Integer getResolution() {
        beforePropertyRead("resolution");
        return this.resolution;
    }

    public void setSensorModel(SensorModel sensorModel) {
        setToOneTarget("sensorModel", sensorModel, true);
    }

    public SensorModel getSensorModel() {
        return (SensorModel)readProperty("sensorModel");
    }

    public void setSensorType(SensorType sensorType) {
        setToOneTarget("sensorType", sensorType, true);
    }

    public SensorType getSensorType() {
        return (SensorType)readProperty("sensorType");
    }

    public void setUnit(Unit unit) {
        setToOneTarget("unit", unit, true);
    }

    public Unit getUnit() {
        return (Unit)readProperty("unit");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "accuracy":
                return this.accuracy;
            case "precision":
                return this.precision;
            case "range":
                return this.range;
            case "rangeMax":
                return this.rangeMax;
            case "rangeMin":
                return this.rangeMin;
            case "resolution":
                return this.resolution;
            case "sensorModel":
                return this.sensorModel;
            case "sensorType":
                return this.sensorType;
            case "unit":
                return this.unit;
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
            case "precision":
                this.precision = (String)val;
                break;
            case "range":
                this.range = (String)val;
                break;
            case "rangeMax":
                this.rangeMax = (BigDecimal)val;
                break;
            case "rangeMin":
                this.rangeMin = (BigDecimal)val;
                break;
            case "resolution":
                this.resolution = (Integer)val;
                break;
            case "sensorModel":
                this.sensorModel = val;
                break;
            case "sensorType":
                this.sensorType = val;
                break;
            case "unit":
                this.unit = val;
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
        out.writeObject(this.precision);
        out.writeObject(this.range);
        out.writeObject(this.rangeMax);
        out.writeObject(this.rangeMin);
        out.writeObject(this.resolution);
        out.writeObject(this.sensorModel);
        out.writeObject(this.sensorType);
        out.writeObject(this.unit);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.accuracy = (String)in.readObject();
        this.precision = (String)in.readObject();
        this.range = (String)in.readObject();
        this.rangeMax = (BigDecimal)in.readObject();
        this.rangeMin = (BigDecimal)in.readObject();
        this.resolution = (Integer)in.readObject();
        this.sensorModel = in.readObject();
        this.sensorType = in.readObject();
        this.unit = in.readObject();
    }

}
