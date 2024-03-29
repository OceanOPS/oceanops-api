package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.orm.Network;
import org.oceanops.orm.WebMetric;

/**
 * Class _WebMetricNetwork was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebMetricNetwork extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";

    public static final NumericProperty<Integer> NETWORK_ID = PropertyFactory.createNumeric("networkId", Integer.class);
    public static final NumericProperty<Double> TARGET = PropertyFactory.createNumeric("target", Double.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<WebMetric> WEB_METRIC = PropertyFactory.createEntity("webMetric", WebMetric.class);

    protected Integer networkId;
    protected Double target;

    protected Object network;
    protected Object webMetric;

    public void setNetworkId(Integer networkId) {
        beforePropertyWrite("networkId", this.networkId, networkId);
        this.networkId = networkId;
    }

    public Integer getNetworkId() {
        beforePropertyRead("networkId");
        return this.networkId;
    }

    public void setTarget(Double target) {
        beforePropertyWrite("target", this.target, target);
        this.target = target;
    }

    public Double getTarget() {
        beforePropertyRead("target");
        return this.target;
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setWebMetric(WebMetric webMetric) {
        setToOneTarget("webMetric", webMetric, true);
    }

    public WebMetric getWebMetric() {
        return (WebMetric)readProperty("webMetric");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "networkId":
                return this.networkId;
            case "target":
                return this.target;
            case "network":
                return this.network;
            case "webMetric":
                return this.webMetric;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "networkId":
                this.networkId = (Integer)val;
                break;
            case "target":
                this.target = (Double)val;
                break;
            case "network":
                this.network = val;
                break;
            case "webMetric":
                this.webMetric = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.networkId);
        out.writeObject(this.target);
        out.writeObject(this.network);
        out.writeObject(this.webMetric);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.networkId = (Integer)in.readObject();
        this.target = (Double)in.readObject();
        this.network = in.readObject();
        this.webMetric = in.readObject();
    }

}
