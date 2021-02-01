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
 * Class _WebMessage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebMessage extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> ENABLED = PropertyFactory.createNumeric("enabled", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> TEXT = PropertyFactory.createString("text", String.class);

    protected BigDecimal enabled;
    protected BigDecimal id;
    protected String text;


    public void setEnabled(BigDecimal enabled) {
        beforePropertyWrite("enabled", this.enabled, enabled);
        this.enabled = enabled;
    }

    public BigDecimal getEnabled() {
        beforePropertyRead("enabled");
        return this.enabled;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setText(String text) {
        beforePropertyWrite("text", this.text, text);
        this.text = text;
    }

    public String getText() {
        beforePropertyRead("text");
        return this.text;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "enabled":
                return this.enabled;
            case "id":
                return this.id;
            case "text":
                return this.text;
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
            case "enabled":
                this.enabled = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "text":
                this.text = (String)val;
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
        out.writeObject(this.enabled);
        out.writeObject(this.id);
        out.writeObject(this.text);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.enabled = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.text = (String)in.readObject();
    }

}
