package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Site was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Site extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<byte[]> SHAPE = Property.create("shape", byte[].class);
    public static final Property<String> WKT = Property.create("wkt", String.class);
    public static final Property<List<NetworkSite>> NETWORK_SITES = Property.create("networkSites", List.class);
    public static final Property<List<Ptf>> PTFS = Property.create("ptfs", List.class);
    public static final Property<List<SitePtf>> SITE_PTFS = Property.create("sitePtfs", List.class);

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

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

    public void setNameShort(String nameShort) {
        writeProperty("nameShort", nameShort);
    }
    public String getNameShort() {
        return (String)readProperty("nameShort");
    }

    public void setShape(byte[] shape) {
        writeProperty("shape", shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty("shape");
    }

    public void setWkt(String wkt) {
        writeProperty("wkt", wkt);
    }
    public String getWkt() {
        return (String)readProperty("wkt");
    }

    public void addToNetworkSites(NetworkSite obj) {
        addToManyTarget("networkSites", obj, true);
    }
    public void removeFromNetworkSites(NetworkSite obj) {
        removeToManyTarget("networkSites", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NetworkSite> getNetworkSites() {
        return (List<NetworkSite>)readProperty("networkSites");
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


    public void addToSitePtfs(SitePtf obj) {
        addToManyTarget("sitePtfs", obj, true);
    }
    public void removeFromSitePtfs(SitePtf obj) {
        removeToManyTarget("sitePtfs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SitePtf> getSitePtfs() {
        return (List<SitePtf>)readProperty("sitePtfs");
    }


}
