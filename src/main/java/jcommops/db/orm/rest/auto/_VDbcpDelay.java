package jcommops.db.orm.rest.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VDbcpDelay was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VDbcpDelay extends CayenneDataObject {

    public static final String AVG_DELAY_PROPERTY = "avgDelay";
    public static final String NB_OBS_PROPERTY = "nbObs";
    public static final String REF_PROPERTY = "ref";


    public void setAvgDelay(Integer avgDelay) {
        writeProperty(AVG_DELAY_PROPERTY, avgDelay);
    }
    public Integer getAvgDelay() {
        return (Integer)readProperty(AVG_DELAY_PROPERTY);
    }

    public void setNbObs(Integer nbObs) {
        writeProperty(NB_OBS_PROPERTY, nbObs);
    }
    public Integer getNbObs() {
        return (Integer)readProperty(NB_OBS_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

}
