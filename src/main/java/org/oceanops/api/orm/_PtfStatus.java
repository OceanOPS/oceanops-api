package org.oceanops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PtfStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfStatus extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<Integer> RANK = Property.create("rank", Integer.class);
    public static final Property<String> WIGOS_CODE = Property.create("wigosCode", String.class);
    public static final Property<List<Ptf>> PTFS = Property.create("ptfs", List.class);

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

    public void setRank(int rank) {
        writeProperty("rank", rank);
    }
    public int getRank() {
        Object value = readProperty("rank");
        return (value != null) ? (Integer) value : 0;
    }

    public void setWigosCode(String wigosCode) {
        writeProperty("wigosCode", wigosCode);
    }
    public String getWigosCode() {
        return (String)readProperty("wigosCode");
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


}