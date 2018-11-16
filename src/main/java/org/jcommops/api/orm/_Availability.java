package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Availability was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Availability extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Cruise>> CRUISES = Property.create("cruises", List.class);

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToCruises(Cruise obj) {
        addToManyTarget("cruises", obj, true);
    }
    public void removeFromCruises(Cruise obj) {
        removeToManyTarget("cruises", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cruise> getCruises() {
        return (List<Cruise>)readProperty("cruises");
    }


}
