package jcommops.db.orm.rest.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _LoadPtfDbcp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LoadPtfDbcp extends CayenneDataObject {

    public static final String D_DATE_PROPERTY = "dDate";
    public static final String D_LAT_PROPERTY = "dLat";
    public static final String D_LON_PROPERTY = "dLon";
    public static final String E_DATE_PROPERTY = "eDate";
    public static final String PROGRAM_PROPERTY = "program";
    public static final String PTF_MODEL_PROPERTY = "ptfModel";
    public static final String TEL_ID_PROPERTY = "telId";
    public static final String TEL_START_DATE_PROPERTY = "telStartDate";
    public static final String TEL_TYPE_PROPERTY = "telType";
    public static final String WMO_PROPERTY = "wmo";


    public void setDDate(Date dDate) {
        writeProperty(D_DATE_PROPERTY, dDate);
    }
    public Date getDDate() {
        return (Date)readProperty(D_DATE_PROPERTY);
    }

    public void setDLat(BigDecimal dLat) {
        writeProperty(D_LAT_PROPERTY, dLat);
    }
    public BigDecimal getDLat() {
        return (BigDecimal)readProperty(D_LAT_PROPERTY);
    }

    public void setDLon(BigDecimal dLon) {
        writeProperty(D_LON_PROPERTY, dLon);
    }
    public BigDecimal getDLon() {
        return (BigDecimal)readProperty(D_LON_PROPERTY);
    }

    public void setEDate(Date eDate) {
        writeProperty(E_DATE_PROPERTY, eDate);
    }
    public Date getEDate() {
        return (Date)readProperty(E_DATE_PROPERTY);
    }

    public void setProgram(String program) {
        writeProperty(PROGRAM_PROPERTY, program);
    }
    public String getProgram() {
        return (String)readProperty(PROGRAM_PROPERTY);
    }

    public void setPtfModel(String ptfModel) {
        writeProperty(PTF_MODEL_PROPERTY, ptfModel);
    }
    public String getPtfModel() {
        return (String)readProperty(PTF_MODEL_PROPERTY);
    }

    public void setTelId(String telId) {
        writeProperty(TEL_ID_PROPERTY, telId);
    }
    public String getTelId() {
        return (String)readProperty(TEL_ID_PROPERTY);
    }

    public void setTelStartDate(Date telStartDate) {
        writeProperty(TEL_START_DATE_PROPERTY, telStartDate);
    }
    public Date getTelStartDate() {
        return (Date)readProperty(TEL_START_DATE_PROPERTY);
    }

    public void setTelType(String telType) {
        writeProperty(TEL_TYPE_PROPERTY, telType);
    }
    public String getTelType() {
        return (String)readProperty(TEL_TYPE_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

}
