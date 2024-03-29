package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.PtfVariable;

/**
 * Class _TimePeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TimePeriod extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> FREQUENCY = PropertyFactory.createNumeric("frequency", Integer.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> ISO = PropertyFactory.createString("iso", String.class);
    public static final StringProperty<String> REF = PropertyFactory.createString("ref", String.class);
    public static final ListProperty<PtfVariable> PTF_VARIABLES = PropertyFactory.createList("ptfVariables", PtfVariable.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);

    protected String description;
    protected Integer frequency;
    protected Integer id;
    protected String iso;
    protected String ref;

    protected Object ptfVariables;
    protected Object ptfs;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setFrequency(Integer frequency) {
        beforePropertyWrite("frequency", this.frequency, frequency);
        this.frequency = frequency;
    }

    public Integer getFrequency() {
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

    public void setIso(String iso) {
        beforePropertyWrite("iso", this.iso, iso);
        this.iso = iso;
    }

    public String getIso() {
        beforePropertyRead("iso");
        return this.iso;
    }

    public void setRef(String ref) {
        beforePropertyWrite("ref", this.ref, ref);
        this.ref = ref;
    }

    public String getRef() {
        beforePropertyRead("ref");
        return this.ref;
    }

    public void addToPtfVariables(PtfVariable obj) {
        addToManyTarget("ptfVariables", obj, true);
    }

    public void removeFromPtfVariables(PtfVariable obj) {
        removeToManyTarget("ptfVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PtfVariable> getPtfVariables() {
        return (List<PtfVariable>)readProperty("ptfVariables");
    }

    public void addToPtfs(Ptf obj) {
        addToManyTarget("ptfs", obj, true);
    }

    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget("ptfs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty("ptfs");
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
            case "iso":
                return this.iso;
            case "ref":
                return this.ref;
            case "ptfVariables":
                return this.ptfVariables;
            case "ptfs":
                return this.ptfs;
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
                this.frequency = (Integer)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "iso":
                this.iso = (String)val;
                break;
            case "ref":
                this.ref = (String)val;
                break;
            case "ptfVariables":
                this.ptfVariables = val;
                break;
            case "ptfs":
                this.ptfs = val;
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
        out.writeObject(this.iso);
        out.writeObject(this.ref);
        out.writeObject(this.ptfVariables);
        out.writeObject(this.ptfs);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.frequency = (Integer)in.readObject();
        this.id = (Integer)in.readObject();
        this.iso = (String)in.readObject();
        this.ref = (String)in.readObject();
        this.ptfVariables = in.readObject();
        this.ptfs = in.readObject();
    }

}
