package org.oceanops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ObsTsunaGtsOsmcVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsTsunaGtsOsmcVariable extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String OBS_ID_PK_COLUMN = "OBS_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public static final Property<Integer> VARIABLE_ID = Property.create("variableId", Integer.class);
    public static final Property<ObsTsunaGtsOsmc> OBS = Property.create("obs", ObsTsunaGtsOsmc.class);

    public void setVariableId(int variableId) {
        writeProperty("variableId", variableId);
    }
    public int getVariableId() {
        Object value = readProperty("variableId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setObs(ObsTsunaGtsOsmc obs) {
        setToOneTarget("obs", obs, true);
    }

    public ObsTsunaGtsOsmc getObs() {
        return (ObsTsunaGtsOsmc)readProperty("obs");
    }


}