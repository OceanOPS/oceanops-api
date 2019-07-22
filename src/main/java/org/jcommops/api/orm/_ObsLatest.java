package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ObsLatest was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsLatest extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<BigDecimal> LAT = Property.create("lat", BigDecimal.class);
    public static final Property<BigDecimal> LON = Property.create("lon", BigDecimal.class);
    public static final Property<LocalDateTime> OBS_DATE = Property.create("obsDate", LocalDateTime.class);
    public static final Property<Integer> ORIGIN_ID = Property.create("originId", Integer.class);
    public static final Property<String> ORIGIN_TABLE = Property.create("originTable", String.class);
    public static final Property<byte[]> SHAPE = Property.create("shape", byte[].class);

    public void setLat(BigDecimal lat) {
        writeProperty("lat", lat);
    }
    public BigDecimal getLat() {
        return (BigDecimal)readProperty("lat");
    }

    public void setLon(BigDecimal lon) {
        writeProperty("lon", lon);
    }
    public BigDecimal getLon() {
        return (BigDecimal)readProperty("lon");
    }

    public void setObsDate(LocalDateTime obsDate) {
        writeProperty("obsDate", obsDate);
    }
    public LocalDateTime getObsDate() {
        return (LocalDateTime)readProperty("obsDate");
    }

    public void setOriginId(int originId) {
        writeProperty("originId", originId);
    }
    public int getOriginId() {
        Object value = readProperty("originId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setOriginTable(String originTable) {
        writeProperty("originTable", originTable);
    }
    public String getOriginTable() {
        return (String)readProperty("originTable");
    }

    public void setShape(byte[] shape) {
        writeProperty("shape", shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty("shape");
    }

}
