package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.ObsArgoGdac;
import org.oceanops.api.orm.ObsDataStatus;
import org.oceanops.api.orm.Variable;

/**
 * Class _ObsArgoGdacVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsArgoGdacVariable extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String OBS_ID_PK_COLUMN = "OBS_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public static final NumericProperty<Double> ADJUSTMENT_DEVIATION = PropertyFactory.createNumeric("adjustmentDeviation", Double.class);
    public static final NumericProperty<Double> ADJUSTMENT_MEAN = PropertyFactory.createNumeric("adjustmentMean", Double.class);
    public static final NumericProperty<Integer> LEVELS_NB = PropertyFactory.createNumeric("levelsNb", Integer.class);
    public static final NumericProperty<Integer> OBS_ID = PropertyFactory.createNumeric("obsId", Integer.class);
    public static final StringProperty<String> QC = PropertyFactory.createString("qc", String.class);
    public static final NumericProperty<Integer> VARIABLE_ID = PropertyFactory.createNumeric("variableId", Integer.class);
    public static final EntityProperty<ObsArgoGdac> OBS = PropertyFactory.createEntity("obs", ObsArgoGdac.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS = PropertyFactory.createEntity("obsDataStatus", ObsDataStatus.class);
    public static final EntityProperty<Variable> VARIABLE = PropertyFactory.createEntity("variable", Variable.class);

    protected Double adjustmentDeviation;
    protected Double adjustmentMean;
    protected Integer levelsNb;
    protected Integer obsId;
    protected String qc;
    protected Integer variableId;

    protected Object obs;
    protected Object obsDataStatus;
    protected Object variable;

    public void setAdjustmentDeviation(Double adjustmentDeviation) {
        beforePropertyWrite("adjustmentDeviation", this.adjustmentDeviation, adjustmentDeviation);
        this.adjustmentDeviation = adjustmentDeviation;
    }

    public Double getAdjustmentDeviation() {
        beforePropertyRead("adjustmentDeviation");
        return this.adjustmentDeviation;
    }

    public void setAdjustmentMean(Double adjustmentMean) {
        beforePropertyWrite("adjustmentMean", this.adjustmentMean, adjustmentMean);
        this.adjustmentMean = adjustmentMean;
    }

    public Double getAdjustmentMean() {
        beforePropertyRead("adjustmentMean");
        return this.adjustmentMean;
    }

    public void setLevelsNb(Integer levelsNb) {
        beforePropertyWrite("levelsNb", this.levelsNb, levelsNb);
        this.levelsNb = levelsNb;
    }

    public Integer getLevelsNb() {
        beforePropertyRead("levelsNb");
        return this.levelsNb;
    }

    public void setObsId(Integer obsId) {
        beforePropertyWrite("obsId", this.obsId, obsId);
        this.obsId = obsId;
    }

    public Integer getObsId() {
        beforePropertyRead("obsId");
        return this.obsId;
    }

    public void setQc(String qc) {
        beforePropertyWrite("qc", this.qc, qc);
        this.qc = qc;
    }

    public String getQc() {
        beforePropertyRead("qc");
        return this.qc;
    }

    public void setVariableId(Integer variableId) {
        beforePropertyWrite("variableId", this.variableId, variableId);
        this.variableId = variableId;
    }

    public Integer getVariableId() {
        beforePropertyRead("variableId");
        return this.variableId;
    }

    public void setObs(ObsArgoGdac obs) {
        setToOneTarget("obs", obs, true);
    }

    public ObsArgoGdac getObs() {
        return (ObsArgoGdac)readProperty("obs");
    }

    public void setObsDataStatus(ObsDataStatus obsDataStatus) {
        setToOneTarget("obsDataStatus", obsDataStatus, true);
    }

    public ObsDataStatus getObsDataStatus() {
        return (ObsDataStatus)readProperty("obsDataStatus");
    }

    public void setVariable(Variable variable) {
        setToOneTarget("variable", variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty("variable");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "adjustmentDeviation":
                return this.adjustmentDeviation;
            case "adjustmentMean":
                return this.adjustmentMean;
            case "levelsNb":
                return this.levelsNb;
            case "obsId":
                return this.obsId;
            case "qc":
                return this.qc;
            case "variableId":
                return this.variableId;
            case "obs":
                return this.obs;
            case "obsDataStatus":
                return this.obsDataStatus;
            case "variable":
                return this.variable;
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
            case "adjustmentDeviation":
                this.adjustmentDeviation = (Double)val;
                break;
            case "adjustmentMean":
                this.adjustmentMean = (Double)val;
                break;
            case "levelsNb":
                this.levelsNb = (Integer)val;
                break;
            case "obsId":
                this.obsId = (Integer)val;
                break;
            case "qc":
                this.qc = (String)val;
                break;
            case "variableId":
                this.variableId = (Integer)val;
                break;
            case "obs":
                this.obs = val;
                break;
            case "obsDataStatus":
                this.obsDataStatus = val;
                break;
            case "variable":
                this.variable = val;
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
        out.writeObject(this.adjustmentDeviation);
        out.writeObject(this.adjustmentMean);
        out.writeObject(this.levelsNb);
        out.writeObject(this.obsId);
        out.writeObject(this.qc);
        out.writeObject(this.variableId);
        out.writeObject(this.obs);
        out.writeObject(this.obsDataStatus);
        out.writeObject(this.variable);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.adjustmentDeviation = (Double)in.readObject();
        this.adjustmentMean = (Double)in.readObject();
        this.levelsNb = (Integer)in.readObject();
        this.obsId = (Integer)in.readObject();
        this.qc = (String)in.readObject();
        this.variableId = (Integer)in.readObject();
        this.obs = in.readObject();
        this.obsDataStatus = in.readObject();
        this.variable = in.readObject();
    }

}
