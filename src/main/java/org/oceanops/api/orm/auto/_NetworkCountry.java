package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Network;

/**
 * Class _NetworkCountry was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkCountry extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String COUNTRY_ID_PK_COLUMN = "COUNTRY_ID";
    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";

    public static final NumericProperty<BigDecimal> COUNTRY_ID = PropertyFactory.createNumeric("countryId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NETWORK_ID = PropertyFactory.createNumeric("networkId", BigDecimal.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);

    protected BigDecimal countryId;
    protected BigDecimal networkId;

    protected Object country;
    protected Object network;

    public void setCountryId(BigDecimal countryId) {
        beforePropertyWrite("countryId", this.countryId, countryId);
        this.countryId = countryId;
    }

    public BigDecimal getCountryId() {
        beforePropertyRead("countryId");
        return this.countryId;
    }

    public void setNetworkId(BigDecimal networkId) {
        beforePropertyWrite("networkId", this.networkId, networkId);
        this.networkId = networkId;
    }

    public BigDecimal getNetworkId() {
        beforePropertyRead("networkId");
        return this.networkId;
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "countryId":
                return this.countryId;
            case "networkId":
                return this.networkId;
            case "country":
                return this.country;
            case "network":
                return this.network;
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
            case "countryId":
                this.countryId = (BigDecimal)val;
                break;
            case "networkId":
                this.networkId = (BigDecimal)val;
                break;
            case "country":
                this.country = val;
                break;
            case "network":
                this.network = val;
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
        out.writeObject(this.countryId);
        out.writeObject(this.networkId);
        out.writeObject(this.country);
        out.writeObject(this.network);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.countryId = (BigDecimal)in.readObject();
        this.networkId = (BigDecimal)in.readObject();
        this.country = in.readObject();
        this.network = in.readObject();
    }

}