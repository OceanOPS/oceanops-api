package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Config;
import org.oceanops.api.orm.Ptf;

/**
 * Class _PtfConfig was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfConfig extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CYCLE_PK_COLUMN = "CYCLE";
    public static final String PTF_ID_PK_COLUMN = "PTF_ID";

    public static final NumericProperty<BigDecimal> CYCLE = PropertyFactory.createNumeric("cycle", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PTF_ID = PropertyFactory.createNumeric("ptfId", BigDecimal.class);
    public static final EntityProperty<Config> CONFIG = PropertyFactory.createEntity("config", Config.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected BigDecimal cycle;
    protected BigDecimal ptfId;

    protected Object config;
    protected Object ptf;

    public void setCycle(BigDecimal cycle) {
        beforePropertyWrite("cycle", this.cycle, cycle);
        this.cycle = cycle;
    }

    public BigDecimal getCycle() {
        beforePropertyRead("cycle");
        return this.cycle;
    }

    public void setPtfId(BigDecimal ptfId) {
        beforePropertyWrite("ptfId", this.ptfId, ptfId);
        this.ptfId = ptfId;
    }

    public BigDecimal getPtfId() {
        beforePropertyRead("ptfId");
        return this.ptfId;
    }

    public void setConfig(Config config) {
        setToOneTarget("config", config, true);
    }

    public Config getConfig() {
        return (Config)readProperty("config");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cycle":
                return this.cycle;
            case "ptfId":
                return this.ptfId;
            case "config":
                return this.config;
            case "ptf":
                return this.ptf;
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
            case "cycle":
                this.cycle = (BigDecimal)val;
                break;
            case "ptfId":
                this.ptfId = (BigDecimal)val;
                break;
            case "config":
                this.config = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.cycle);
        out.writeObject(this.ptfId);
        out.writeObject(this.config);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cycle = (BigDecimal)in.readObject();
        this.ptfId = (BigDecimal)in.readObject();
        this.config = in.readObject();
        this.ptf = in.readObject();
    }

}
