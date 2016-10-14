package jcommops.db.orm.rest.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Cruise;

/**
 * Class _Availability was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Availability extends CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String CRUISE_ARRAY_PROPERTY = "cruiseArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void addToCruiseArray(Cruise obj) {
        addToManyTarget(CRUISE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseArray(Cruise obj) {
        removeToManyTarget(CRUISE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cruise> getCruiseArray() {
        return (List<Cruise>)readProperty(CRUISE_ARRAY_PROPERTY);
    }


}
