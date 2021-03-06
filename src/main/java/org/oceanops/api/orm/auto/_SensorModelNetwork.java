package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.SensorModel;

/**
 * Class _SensorModelNetwork was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SensorModelNetwork extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";
    public static final String SENSOR_MODEL_ID_PK_COLUMN = "SENSOR_MODEL_ID";

    public static final NumericProperty<BigDecimal> NETWORK_ID = PropertyFactory.createNumeric("networkId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> SENSOR_MODEL_ID = PropertyFactory.createNumeric("sensorModelId", BigDecimal.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<SensorModel> SENSOR_MODEL = PropertyFactory.createEntity("sensorModel", SensorModel.class);

    protected BigDecimal networkId;
    protected BigDecimal sensorModelId;

    protected Object network;
    protected Object sensorModel;

    public void setNetworkId(BigDecimal networkId) {
        beforePropertyWrite("networkId", this.networkId, networkId);
        this.networkId = networkId;
    }

    public BigDecimal getNetworkId() {
        beforePropertyRead("networkId");
        return this.networkId;
    }

    public void setSensorModelId(BigDecimal sensorModelId) {
        beforePropertyWrite("sensorModelId", this.sensorModelId, sensorModelId);
        this.sensorModelId = sensorModelId;
    }

    public BigDecimal getSensorModelId() {
        beforePropertyRead("sensorModelId");
        return this.sensorModelId;
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setSensorModel(SensorModel sensorModel) {
        setToOneTarget("sensorModel", sensorModel, true);
    }

    public SensorModel getSensorModel() {
        return (SensorModel)readProperty("sensorModel");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "networkId":
                return this.networkId;
            case "sensorModelId":
                return this.sensorModelId;
            case "network":
                return this.network;
            case "sensorModel":
                return this.sensorModel;
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
                this.networkId = (BigDecimal)val;
                break;
            case "sensorModelId":
                this.sensorModelId = (BigDecimal)val;
                break;
            case "network":
                this.network = val;
                break;
            case "sensorModel":
                this.sensorModel = val;
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
        out.writeObject(this.sensorModelId);
        out.writeObject(this.network);
        out.writeObject(this.sensorModel);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.networkId = (BigDecimal)in.readObject();
        this.sensorModelId = (BigDecimal)in.readObject();
        this.network = in.readObject();
        this.sensorModel = in.readObject();
    }

}
