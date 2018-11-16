package org.jcommops.api.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _UpdateTimestamp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UpdateTimestamp extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String NAME_PK_COLUMN = "NAME";

    public static final Property<Integer> COMPLETED = Property.create("completed", Integer.class);
    public static final Property<LocalDateTime> LAST_UPDATE = Property.create("lastUpdate", LocalDateTime.class);
    public static final Property<String> NAME = Property.create("name", String.class);

    public void setCompleted(int completed) {
        writeProperty("completed", completed);
    }
    public int getCompleted() {
        Object value = readProperty("completed");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        writeProperty("lastUpdate", lastUpdate);
    }
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime)readProperty("lastUpdate");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

}
