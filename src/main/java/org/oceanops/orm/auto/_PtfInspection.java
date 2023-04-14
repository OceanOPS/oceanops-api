package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/**
 * Class _PtfInspection was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfInspection extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Double> FREQUENCY = PropertyFactory.createNumeric("frequency", Double.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);

    protected String description;
    protected Double frequency;
    protected Integer id;


    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setFrequency(Double frequency) {
        beforePropertyWrite("frequency", this.frequency, frequency);
        this.frequency = frequency;
    }

    public Double getFrequency() {
        beforePropertyRead("frequency");
        return this.frequency;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "frequency":
                return this.frequency;
            case "id":
                return this.id;
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
            case "description":
                this.description = (String)val;
                break;
            case "frequency":
                this.frequency = (Double)val;
                break;
            case "id":
                this.id = (Integer)val;
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
        out.writeObject(this.description);
        out.writeObject(this.frequency);
        out.writeObject(this.id);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.frequency = (Double)in.readObject();
        this.id = (Integer)in.readObject();
    }

}