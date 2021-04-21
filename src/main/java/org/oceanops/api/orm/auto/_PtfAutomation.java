package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/**
 * Class _PtfAutomation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfAutomation extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> PUB47REF = PropertyFactory.createString("pub47Ref", String.class);
    public static final StringProperty<String> REF = PropertyFactory.createString("ref", String.class);

    protected String description;
    protected BigDecimal id;
    protected String pub47Ref;
    protected String ref;


    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setPub47Ref(String pub47Ref) {
        beforePropertyWrite("pub47Ref", this.pub47Ref, pub47Ref);
        this.pub47Ref = pub47Ref;
    }

    public String getPub47Ref() {
        beforePropertyRead("pub47Ref");
        return this.pub47Ref;
    }

    public void setRef(String ref) {
        beforePropertyWrite("ref", this.ref, ref);
        this.ref = ref;
    }

    public String getRef() {
        beforePropertyRead("ref");
        return this.ref;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "pub47Ref":
                return this.pub47Ref;
            case "ref":
                return this.ref;
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
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "pub47Ref":
                this.pub47Ref = (String)val;
                break;
            case "ref":
                this.ref = (String)val;
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
        out.writeObject(this.id);
        out.writeObject(this.pub47Ref);
        out.writeObject(this.ref);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.pub47Ref = (String)in.readObject();
        this.ref = (String)in.readObject();
    }

}
