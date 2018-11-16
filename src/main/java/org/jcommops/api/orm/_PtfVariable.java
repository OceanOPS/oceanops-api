package org.jcommops.api.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PtfVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfVariable extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String PTF_ID_PK_COLUMN = "PTF_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public static final Property<LocalDateTime> FIRST_MEASURED = Property.create("firstMeasured", LocalDateTime.class);
    public static final Property<LocalDateTime> LAST_MEASURED = Property.create("lastMeasured", LocalDateTime.class);
    public static final Property<Integer> NB_OBS = Property.create("nbObs", Integer.class);
    public static final Property<Integer> PTF_ID = Property.create("ptfId", Integer.class);
    public static final Property<Integer> VARIABLE_ID = Property.create("variableId", Integer.class);
    public static final Property<Ptf> PTF = Property.create("ptf", Ptf.class);
    public static final Property<Variable> VARIABLE = Property.create("variable", Variable.class);

    public void setFirstMeasured(LocalDateTime firstMeasured) {
        writeProperty("firstMeasured", firstMeasured);
    }
    public LocalDateTime getFirstMeasured() {
        return (LocalDateTime)readProperty("firstMeasured");
    }

    public void setLastMeasured(LocalDateTime lastMeasured) {
        writeProperty("lastMeasured", lastMeasured);
    }
    public LocalDateTime getLastMeasured() {
        return (LocalDateTime)readProperty("lastMeasured");
    }

    public void setNbObs(int nbObs) {
        writeProperty("nbObs", nbObs);
    }
    public int getNbObs() {
        Object value = readProperty("nbObs");
        return (value != null) ? (Integer) value : 0;
    }

    public void setPtfId(int ptfId) {
        writeProperty("ptfId", ptfId);
    }
    public int getPtfId() {
        Object value = readProperty("ptfId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setVariableId(int variableId) {
        writeProperty("variableId", variableId);
    }
    public int getVariableId() {
        Object value = readProperty("variableId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }


    public void setVariable(Variable variable) {
        setToOneTarget("variable", variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty("variable");
    }


}
