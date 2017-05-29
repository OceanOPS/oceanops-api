package org.jcommops.api.orm;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _WebMessage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebMessage extends CayenneDataObject {

    public static final String ENABLED_PROPERTY = "enabled";
    public static final String TEXT_PROPERTY = "text";

    public static final String ID_PK_COLUMN = "ID";

    public void setEnabled(BigDecimal enabled) {
        writeProperty(ENABLED_PROPERTY, enabled);
    }
    public BigDecimal getEnabled() {
        return (BigDecimal)readProperty(ENABLED_PROPERTY);
    }

    public void setText(String text) {
        writeProperty(TEXT_PROPERTY, text);
    }
    public String getText() {
        return (String)readProperty(TEXT_PROPERTY);
    }

}