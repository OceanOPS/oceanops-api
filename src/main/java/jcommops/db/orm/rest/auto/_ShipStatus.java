package jcommops.db.orm.rest.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Ship;

/**
 * Class _ShipStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipStatus extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_LONG_PROPERTY = "nameLong";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String SHIP_ARRAY_PROPERTY = "shipArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameLong(String nameLong) {
        writeProperty(NAME_LONG_PROPERTY, nameLong);
    }
    public String getNameLong() {
        return (String)readProperty(NAME_LONG_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToShipArray(Ship obj) {
        addToManyTarget(SHIP_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromShipArray(Ship obj) {
        removeToManyTarget(SHIP_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ship> getShipArray() {
        return (List<Ship>)readProperty(SHIP_ARRAY_PROPERTY);
    }


}
