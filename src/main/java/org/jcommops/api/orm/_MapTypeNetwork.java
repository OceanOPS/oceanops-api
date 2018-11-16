package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _MapTypeNetwork was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MapTypeNetwork extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String MAP_TYPE_ID_PK_COLUMN = "MAP_TYPE_ID";
    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";

    public static final Property<Integer> MAP_TYPE_ID = Property.create("mapTypeId", Integer.class);
    public static final Property<Integer> NETWORK_ID = Property.create("networkId", Integer.class);
    public static final Property<MapType> MAP_TYPE = Property.create("mapType", MapType.class);
    public static final Property<Network> NETWORK = Property.create("network", Network.class);

    public void setMapTypeId(int mapTypeId) {
        writeProperty("mapTypeId", mapTypeId);
    }
    public int getMapTypeId() {
        Object value = readProperty("mapTypeId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setNetworkId(int networkId) {
        writeProperty("networkId", networkId);
    }
    public int getNetworkId() {
        Object value = readProperty("networkId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setMapType(MapType mapType) {
        setToOneTarget("mapType", mapType, true);
    }

    public MapType getMapType() {
        return (MapType)readProperty("mapType");
    }


    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }


}
