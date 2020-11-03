package org.oceanops.api.orm;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PtfSensorModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfSensorModel extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> AVERAGING_METHOD = Property.create("averagingMethod", String.class);
    public static final Property<BigDecimal> AVERAGING_PERIOD = Property.create("averagingPeriod", BigDecimal.class);
    public static final Property<LocalDateTime> CALIB_DATE = Property.create("calibDate", LocalDateTime.class);
    public static final Property<String> COMMENTS = Property.create("comments", String.class);
    public static final Property<String> DISTANCE_BOW = Property.create("distanceBow", String.class);
    public static final Property<String> DISTANCE_CENTER = Property.create("distanceCenter", String.class);
    public static final Property<LocalDateTime> END_DATE = Property.create("endDate", LocalDateTime.class);
    public static final Property<BigDecimal> HEIGHT = Property.create("height", BigDecimal.class);
    public static final Property<String> HEIGHT_DECK = Property.create("heightDeck", String.class);
    public static final Property<String> HEIGHT_WATER = Property.create("heightWater", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<LocalDateTime> INSTALL_DATE = Property.create("installDate", LocalDateTime.class);
    public static final Property<Integer> IS_PRIMARY = Property.create("isPrimary", Integer.class);
    public static final Property<LocalDateTime> MANUF_DATE = Property.create("manufDate", LocalDateTime.class);
    public static final Property<String> OWNERSHIP = Property.create("ownership", String.class);
    public static final Property<Integer> SAMPLING_RATE = Property.create("samplingRate", Integer.class);
    public static final Property<String> SERIAL_NO = Property.create("serialNo", String.class);
    public static final Property<String> SIDE_INDICATOR = Property.create("sideIndicator", String.class);
    public static final Property<BigDecimal> TIME_OFFSET = Property.create("timeOffset", BigDecimal.class);
    public static final Property<Country> FUNDING_COUNTRY = Property.create("fundingCountry", Country.class);
    public static final Property<Program> PROGRAM = Property.create("program", Program.class);
    public static final Property<Ptf> PTF = Property.create("ptf", Ptf.class);
    public static final Property<SensorExposure> SENSOR_EXPOSURE = Property.create("sensorExposure", SensorExposure.class);
    public static final Property<SensorLocation> SENSOR_LOCATION = Property.create("sensorLocation", SensorLocation.class);
    public static final Property<SensorModel> SENSOR_MODEL = Property.create("sensorModel", SensorModel.class);

    public void setAveragingMethod(String averagingMethod) {
        writeProperty("averagingMethod", averagingMethod);
    }
    public String getAveragingMethod() {
        return (String)readProperty("averagingMethod");
    }

    public void setAveragingPeriod(BigDecimal averagingPeriod) {
        writeProperty("averagingPeriod", averagingPeriod);
    }
    public BigDecimal getAveragingPeriod() {
        return (BigDecimal)readProperty("averagingPeriod");
    }

    public void setCalibDate(LocalDateTime calibDate) {
        writeProperty("calibDate", calibDate);
    }
    public LocalDateTime getCalibDate() {
        return (LocalDateTime)readProperty("calibDate");
    }

    public void setComments(String comments) {
        writeProperty("comments", comments);
    }
    public String getComments() {
        return (String)readProperty("comments");
    }

    public void setDistanceBow(String distanceBow) {
        writeProperty("distanceBow", distanceBow);
    }
    public String getDistanceBow() {
        return (String)readProperty("distanceBow");
    }

    public void setDistanceCenter(String distanceCenter) {
        writeProperty("distanceCenter", distanceCenter);
    }
    public String getDistanceCenter() {
        return (String)readProperty("distanceCenter");
    }

    public void setEndDate(LocalDateTime endDate) {
        writeProperty("endDate", endDate);
    }
    public LocalDateTime getEndDate() {
        return (LocalDateTime)readProperty("endDate");
    }

    public void setHeight(BigDecimal height) {
        writeProperty("height", height);
    }
    public BigDecimal getHeight() {
        return (BigDecimal)readProperty("height");
    }

    public void setHeightDeck(String heightDeck) {
        writeProperty("heightDeck", heightDeck);
    }
    public String getHeightDeck() {
        return (String)readProperty("heightDeck");
    }

    public void setHeightWater(String heightWater) {
        writeProperty("heightWater", heightWater);
    }
    public String getHeightWater() {
        return (String)readProperty("heightWater");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setInstallDate(LocalDateTime installDate) {
        writeProperty("installDate", installDate);
    }
    public LocalDateTime getInstallDate() {
        return (LocalDateTime)readProperty("installDate");
    }

    public void setIsPrimary(int isPrimary) {
        writeProperty("isPrimary", isPrimary);
    }
    public int getIsPrimary() {
        Object value = readProperty("isPrimary");
        return (value != null) ? (Integer) value : 0;
    }

    public void setManufDate(LocalDateTime manufDate) {
        writeProperty("manufDate", manufDate);
    }
    public LocalDateTime getManufDate() {
        return (LocalDateTime)readProperty("manufDate");
    }

    public void setOwnership(String ownership) {
        writeProperty("ownership", ownership);
    }
    public String getOwnership() {
        return (String)readProperty("ownership");
    }

    public void setSamplingRate(int samplingRate) {
        writeProperty("samplingRate", samplingRate);
    }
    public int getSamplingRate() {
        Object value = readProperty("samplingRate");
        return (value != null) ? (Integer) value : 0;
    }

    public void setSerialNo(String serialNo) {
        writeProperty("serialNo", serialNo);
    }
    public String getSerialNo() {
        return (String)readProperty("serialNo");
    }

    public void setSideIndicator(String sideIndicator) {
        writeProperty("sideIndicator", sideIndicator);
    }
    public String getSideIndicator() {
        return (String)readProperty("sideIndicator");
    }

    public void setTimeOffset(BigDecimal timeOffset) {
        writeProperty("timeOffset", timeOffset);
    }
    public BigDecimal getTimeOffset() {
        return (BigDecimal)readProperty("timeOffset");
    }

    public void setFundingCountry(Country fundingCountry) {
        setToOneTarget("fundingCountry", fundingCountry, true);
    }

    public Country getFundingCountry() {
        return (Country)readProperty("fundingCountry");
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


}