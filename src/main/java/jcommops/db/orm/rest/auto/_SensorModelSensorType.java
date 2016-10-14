package jcommops.db.orm.rest.auto;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.SensorModel;
import jcommops.db.orm.rest.SensorType;

/**
 * Class _SensorModelSensorType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SensorModelSensorType extends CayenneDataObject {

    public static final String ACCURACY_PROPERTY = "accuracy";
    public static final String HIGH_PROPERTY = "high";
    public static final String LOW_PROPERTY = "low";
    public static final String UNIT_PROPERTY = "unit";
    public static final String TO_SENSOR_MODEL_PROPERTY = "toSensorModel";
    public static final String TO_SENSOR_TYPE_PROPERTY = "toSensorType";

    public static final String SENSOR_MODEL_ID_PK_COLUMN = "SENSOR_MODEL_ID";
    public static final String SENSOR_TYPE_ID_PK_COLUMN = "SENSOR_TYPE_ID";

    public void setAccuracy(String accuracy) {
        writeProperty(ACCURACY_PROPERTY, accuracy);
    }
    public String getAccuracy() {
        return (String)readProperty(ACCURACY_PROPERTY);
    }

    public void setHigh(Integer high) {
        writeProperty(HIGH_PROPERTY, high);
    }
    public Integer getHigh() {
        return (Integer)readProperty(HIGH_PROPERTY);
    }

    public void setLow(Integer low) {
        writeProperty(LOW_PROPERTY, low);
    }
    public Integer getLow() {
        return (Integer)readProperty(LOW_PROPERTY);
    }

    public void setUnit(String unit) {
        writeProperty(UNIT_PROPERTY, unit);
    }
    public String getUnit() {
        return (String)readProperty(UNIT_PROPERTY);
    }

    public void setToSensorModel(SensorModel toSensorModel) {
        setToOneTarget(TO_SENSOR_MODEL_PROPERTY, toSensorModel, true);
    }

    public SensorModel getToSensorModel() {
        return (SensorModel)readProperty(TO_SENSOR_MODEL_PROPERTY);
    }


    public void setToSensorType(SensorType toSensorType) {
        setToOneTarget(TO_SENSOR_TYPE_PROPERTY, toSensorType, true);
    }

    public SensorType getToSensorType() {
        return (SensorType)readProperty(TO_SENSOR_TYPE_PROPERTY);
    }


}
