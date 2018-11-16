package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WebMetric was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebMetric extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> METHOD = Property.create("method", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<WebMetricNetwork>> WEB_METRIC_NETWORKS = Property.create("webMetricNetworks", List.class);

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setMethod(String method) {
        writeProperty("method", method);
    }
    public String getMethod() {
        return (String)readProperty("method");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToWebMetricNetworks(WebMetricNetwork obj) {
        addToManyTarget("webMetricNetworks", obj, true);
    }
    public void removeFromWebMetricNetworks(WebMetricNetwork obj) {
        removeToManyTarget("webMetricNetworks", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<WebMetricNetwork> getWebMetricNetworks() {
        return (List<WebMetricNetwork>)readProperty("webMetricNetworks");
    }


}
