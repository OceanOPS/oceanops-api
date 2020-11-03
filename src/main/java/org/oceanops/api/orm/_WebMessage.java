package org.oceanops.api.orm;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WebMessage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebMessage extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<BigDecimal> ENABLED = Property.create("enabled", BigDecimal.class);
    public static final Property<BigDecimal> ID = Property.create("id", BigDecimal.class);
    public static final Property<String> TEXT = Property.create("text", String.class);

    public void setEnabled(BigDecimal enabled) {
        writeProperty("enabled", enabled);
    }
    public BigDecimal getEnabled() {
        return (BigDecimal)readProperty("enabled");
    }

    public void setId(BigDecimal id) {
        writeProperty("id", id);
    }
    public BigDecimal getId() {
        return (BigDecimal)readProperty("id");
    }

    public void setText(String text) {
        writeProperty("text", text);
    }
    public String getText() {
        return (String)readProperty("text");
    }

}