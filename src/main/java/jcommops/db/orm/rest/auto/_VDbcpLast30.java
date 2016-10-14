package jcommops.db.orm.rest.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VDbcpLast30 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VDbcpLast30 extends CayenneDataObject {

    public static final String COUNTRY_PROPERTY = "country";
    public static final String COUNTRY_ISO_CODE2_PROPERTY = "countryIsoCode2";
    public static final String LAST_LOC_LAT_PROPERTY = "lastLocLat";
    public static final String LAST_LOC_LON_PROPERTY = "lastLocLon";
    public static final String LOC_DATE_PROPERTY = "locDate";
    public static final String PROGRAM_PROPERTY = "program";
    public static final String PTF_FAMILY_PROPERTY = "ptfFamily";
    public static final String PTF_ID_PROPERTY = "ptfId";
    public static final String PTF_MODEL_PROPERTY = "ptfModel";
    public static final String PTF_REF_PROPERTY = "ptfRef";
    public static final String PTF_TYPE_PROPERTY = "ptfType";
    public static final String TELECOM_ID_PROPERTY = "telecomId";
    public static final String TELECOM_TYPE_PROPERTY = "telecomType";
    public static final String WMO_PROPERTY = "wmo";


    public void setCountry(String country) {
        writeProperty(COUNTRY_PROPERTY, country);
    }
    public String getCountry() {
        return (String)readProperty(COUNTRY_PROPERTY);
    }

    public void setCountryIsoCode2(String countryIsoCode2) {
        writeProperty(COUNTRY_ISO_CODE2_PROPERTY, countryIsoCode2);
    }
    public String getCountryIsoCode2() {
        return (String)readProperty(COUNTRY_ISO_CODE2_PROPERTY);
    }

    public void setLastLocLat(BigDecimal lastLocLat) {
        writeProperty(LAST_LOC_LAT_PROPERTY, lastLocLat);
    }
    public BigDecimal getLastLocLat() {
        return (BigDecimal)readProperty(LAST_LOC_LAT_PROPERTY);
    }

    public void setLastLocLon(BigDecimal lastLocLon) {
        writeProperty(LAST_LOC_LON_PROPERTY, lastLocLon);
    }
    public BigDecimal getLastLocLon() {
        return (BigDecimal)readProperty(LAST_LOC_LON_PROPERTY);
    }

    public void setLocDate(Date locDate) {
        writeProperty(LOC_DATE_PROPERTY, locDate);
    }
    public Date getLocDate() {
        return (Date)readProperty(LOC_DATE_PROPERTY);
    }

    public void setProgram(String program) {
        writeProperty(PROGRAM_PROPERTY, program);
    }
    public String getProgram() {
        return (String)readProperty(PROGRAM_PROPERTY);
    }

    public void setPtfFamily(String ptfFamily) {
        writeProperty(PTF_FAMILY_PROPERTY, ptfFamily);
    }
    public String getPtfFamily() {
        return (String)readProperty(PTF_FAMILY_PROPERTY);
    }

    public void setPtfId(Integer ptfId) {
        writeProperty(PTF_ID_PROPERTY, ptfId);
    }
    public Integer getPtfId() {
        return (Integer)readProperty(PTF_ID_PROPERTY);
    }

    public void setPtfModel(String ptfModel) {
        writeProperty(PTF_MODEL_PROPERTY, ptfModel);
    }
    public String getPtfModel() {
        return (String)readProperty(PTF_MODEL_PROPERTY);
    }

    public void setPtfRef(String ptfRef) {
        writeProperty(PTF_REF_PROPERTY, ptfRef);
    }
    public String getPtfRef() {
        return (String)readProperty(PTF_REF_PROPERTY);
    }

    public void setPtfType(String ptfType) {
        writeProperty(PTF_TYPE_PROPERTY, ptfType);
    }
    public String getPtfType() {
        return (String)readProperty(PTF_TYPE_PROPERTY);
    }

    public void setTelecomId(String telecomId) {
        writeProperty(TELECOM_ID_PROPERTY, telecomId);
    }
    public String getTelecomId() {
        return (String)readProperty(TELECOM_ID_PROPERTY);
    }

    public void setTelecomType(String telecomType) {
        writeProperty(TELECOM_TYPE_PROPERTY, telecomType);
    }
    public String getTelecomType() {
        return (String)readProperty(TELECOM_TYPE_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

}
