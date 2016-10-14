package jcommops.db.orm.rest.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VWmoActive was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VWmoActive extends CayenneDataObject {

    public static final String END_DATE_PROPERTY = "endDate";
    public static final String ID_PROPERTY = "id";
    public static final String MASK_PROPERTY = "mask";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String WMO_PROPERTY = "wmo";


    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setMask(Integer mask) {
        writeProperty(MASK_PROPERTY, mask);
    }
    public Integer getMask() {
        return (Integer)readProperty(MASK_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

}
