package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.orm.Parameter;
import org.oceanops.orm.Ptf;

/**
 * Class _ParameterPtf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ParameterPtf extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> FIRST_MEASURED = PropertyFactory.createDate("firstMeasured", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> LAST_MEASURED = PropertyFactory.createDate("lastMeasured", LocalDateTime.class);
    public static final NumericProperty<Integer> NB_OBS = PropertyFactory.createNumeric("nbObs", Integer.class);
    public static final EntityProperty<Parameter> PARAMETER = PropertyFactory.createEntity("parameter", Parameter.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected LocalDateTime firstMeasured;
    protected LocalDateTime lastMeasured;
    protected Integer nbObs;

    protected Object parameter;
    protected Object ptf;

    public void setFirstMeasured(LocalDateTime firstMeasured) {
        beforePropertyWrite("firstMeasured", this.firstMeasured, firstMeasured);
        this.firstMeasured = firstMeasured;
    }

    public LocalDateTime getFirstMeasured() {
        beforePropertyRead("firstMeasured");
        return this.firstMeasured;
    }

    public void setLastMeasured(LocalDateTime lastMeasured) {
        beforePropertyWrite("lastMeasured", this.lastMeasured, lastMeasured);
        this.lastMeasured = lastMeasured;
    }

    public LocalDateTime getLastMeasured() {
        beforePropertyRead("lastMeasured");
        return this.lastMeasured;
    }

    public void setNbObs(int nbObs) {
        beforePropertyWrite("nbObs", this.nbObs, nbObs);
        this.nbObs = nbObs;
    }

    public int getNbObs() {
        beforePropertyRead("nbObs");
        if(this.nbObs == null) {
            return 0;
        }
        return this.nbObs;
    }

    public void setParameter(Parameter parameter) {
        setToOneTarget("parameter", parameter, true);
    }

    public Parameter getParameter() {
        return (Parameter)readProperty("parameter");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "firstMeasured":
                return this.firstMeasured;
            case "lastMeasured":
                return this.lastMeasured;
            case "nbObs":
                return this.nbObs;
            case "parameter":
                return this.parameter;
            case "ptf":
                return this.ptf;
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
            case "firstMeasured":
                this.firstMeasured = (LocalDateTime)val;
                break;
            case "lastMeasured":
                this.lastMeasured = (LocalDateTime)val;
                break;
            case "nbObs":
                this.nbObs = (Integer)val;
                break;
            case "parameter":
                this.parameter = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.firstMeasured);
        out.writeObject(this.lastMeasured);
        out.writeObject(this.nbObs);
        out.writeObject(this.parameter);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.firstMeasured = (LocalDateTime)in.readObject();
        this.lastMeasured = (LocalDateTime)in.readObject();
        this.nbObs = (Integer)in.readObject();
        this.parameter = in.readObject();
        this.ptf = in.readObject();
    }

}
