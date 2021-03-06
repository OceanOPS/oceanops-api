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
import org.oceanops.api.orm.Site;

/**
 * Class _NetworkSite was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkSite extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";
    public static final String SITE_ID_PK_COLUMN = "SITE_ID";

    public static final NumericProperty<BigDecimal> NETWORK_ID = PropertyFactory.createNumeric("networkId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> SITE_ID = PropertyFactory.createNumeric("siteId", BigDecimal.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<Site> SITE = PropertyFactory.createEntity("site", Site.class);

    protected BigDecimal networkId;
    protected BigDecimal siteId;

    protected Object network;
    protected Object site;

    public void setNetworkId(BigDecimal networkId) {
        beforePropertyWrite("networkId", this.networkId, networkId);
        this.networkId = networkId;
    }

    public BigDecimal getNetworkId() {
        beforePropertyRead("networkId");
        return this.networkId;
    }

    public void setSiteId(BigDecimal siteId) {
        beforePropertyWrite("siteId", this.siteId, siteId);
        this.siteId = siteId;
    }

    public BigDecimal getSiteId() {
        beforePropertyRead("siteId");
        return this.siteId;
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setSite(Site site) {
        setToOneTarget("site", site, true);
    }

    public Site getSite() {
        return (Site)readProperty("site");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "networkId":
                return this.networkId;
            case "siteId":
                return this.siteId;
            case "network":
                return this.network;
            case "site":
                return this.site;
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
            case "siteId":
                this.siteId = (BigDecimal)val;
                break;
            case "network":
                this.network = val;
                break;
            case "site":
                this.site = val;
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
        out.writeObject(this.siteId);
        out.writeObject(this.network);
        out.writeObject(this.site);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.networkId = (BigDecimal)in.readObject();
        this.siteId = (BigDecimal)in.readObject();
        this.network = in.readObject();
        this.site = in.readObject();
    }

}
