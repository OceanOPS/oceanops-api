package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Obs;
import org.oceanops.api.orm.ObsArgoGdac;
import org.oceanops.api.orm.ObsArgoGdacDs;
import org.oceanops.api.orm.ObsArgoGdacVariable;
import org.oceanops.api.orm.ObsGlidersGdacDs;
import org.oceanops.api.orm.ObsGlidersGtsOsmc;
import org.oceanops.api.orm.ObsObsDataStatus;
import org.oceanops.api.orm.ObsTsunaGtsOsmc;

/**
 * Class _ObsDataStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsDataStatus extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final ListProperty<ObsArgoGdacDs> OBS_ARGO_GDAC_DSS = PropertyFactory.createList("obsArgoGdacDss", ObsArgoGdacDs.class);
    public static final ListProperty<ObsArgoGdacVariable> OBS_ARGO_GDAC_VARIABLES = PropertyFactory.createList("obsArgoGdacVariables", ObsArgoGdacVariable.class);
    public static final ListProperty<ObsArgoGdac> OBS_ARGO_GDACS = PropertyFactory.createList("obsArgoGdacs", ObsArgoGdac.class);
    public static final ListProperty<ObsArgoGdac> OBS_ARGO_GDACS1 = PropertyFactory.createList("obsArgoGdacs1", ObsArgoGdac.class);
    public static final ListProperty<ObsGlidersGdacDs> OBS_GLIDERS_GDAC_DSS = PropertyFactory.createList("obsGlidersGdacDss", ObsGlidersGdacDs.class);
    public static final ListProperty<ObsGlidersGtsOsmc> OBS_GLIDERS_GTS_OSMCS = PropertyFactory.createList("obsGlidersGtsOsmcs", ObsGlidersGtsOsmc.class);
    public static final ListProperty<ObsObsDataStatus> OBS_OBS_DATA_STATUSES = PropertyFactory.createList("obsObsDataStatuses", ObsObsDataStatus.class);
    public static final ListProperty<ObsTsunaGtsOsmc> OBS_TSUNA_GTS_OSMCS = PropertyFactory.createList("obsTsunaGtsOsmcs", ObsTsunaGtsOsmc.class);
    public static final ListProperty<Obs> OBSS = PropertyFactory.createList("obss", Obs.class);

    protected BigDecimal id;
    protected String name;

    protected Object obsArgoGdacDss;
    protected Object obsArgoGdacVariables;
    protected Object obsArgoGdacs;
    protected Object obsArgoGdacs1;
    protected Object obsGlidersGdacDss;
    protected Object obsGlidersGtsOsmcs;
    protected Object obsObsDataStatuses;
    protected Object obsTsunaGtsOsmcs;
    protected Object obss;

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void addToObsArgoGdacDss(ObsArgoGdacDs obj) {
        addToManyTarget("obsArgoGdacDss", obj, true);
    }

    public void removeFromObsArgoGdacDss(ObsArgoGdacDs obj) {
        removeToManyTarget("obsArgoGdacDss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdacDs> getObsArgoGdacDss() {
        return (List<ObsArgoGdacDs>)readProperty("obsArgoGdacDss");
    }

    public void addToObsArgoGdacVariables(ObsArgoGdacVariable obj) {
        addToManyTarget("obsArgoGdacVariables", obj, true);
    }

    public void removeFromObsArgoGdacVariables(ObsArgoGdacVariable obj) {
        removeToManyTarget("obsArgoGdacVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdacVariable> getObsArgoGdacVariables() {
        return (List<ObsArgoGdacVariable>)readProperty("obsArgoGdacVariables");
    }

    public void addToObsArgoGdacs(ObsArgoGdac obj) {
        addToManyTarget("obsArgoGdacs", obj, true);
    }

    public void removeFromObsArgoGdacs(ObsArgoGdac obj) {
        removeToManyTarget("obsArgoGdacs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdac> getObsArgoGdacs() {
        return (List<ObsArgoGdac>)readProperty("obsArgoGdacs");
    }

    public void addToObsArgoGdacs1(ObsArgoGdac obj) {
        addToManyTarget("obsArgoGdacs1", obj, true);
    }

    public void removeFromObsArgoGdacs1(ObsArgoGdac obj) {
        removeToManyTarget("obsArgoGdacs1", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdac> getObsArgoGdacs1() {
        return (List<ObsArgoGdac>)readProperty("obsArgoGdacs1");
    }

    public void addToObsGlidersGdacDss(ObsGlidersGdacDs obj) {
        addToManyTarget("obsGlidersGdacDss", obj, true);
    }

    public void removeFromObsGlidersGdacDss(ObsGlidersGdacDs obj) {
        removeToManyTarget("obsGlidersGdacDss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGdacDs> getObsGlidersGdacDss() {
        return (List<ObsGlidersGdacDs>)readProperty("obsGlidersGdacDss");
    }

    public void addToObsGlidersGtsOsmcs(ObsGlidersGtsOsmc obj) {
        addToManyTarget("obsGlidersGtsOsmcs", obj, true);
    }

    public void removeFromObsGlidersGtsOsmcs(ObsGlidersGtsOsmc obj) {
        removeToManyTarget("obsGlidersGtsOsmcs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGtsOsmc> getObsGlidersGtsOsmcs() {
        return (List<ObsGlidersGtsOsmc>)readProperty("obsGlidersGtsOsmcs");
    }

    public void addToObsObsDataStatuses(ObsObsDataStatus obj) {
        addToManyTarget("obsObsDataStatuses", obj, true);
    }

    public void removeFromObsObsDataStatuses(ObsObsDataStatus obj) {
        removeToManyTarget("obsObsDataStatuses", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsObsDataStatus> getObsObsDataStatuses() {
        return (List<ObsObsDataStatus>)readProperty("obsObsDataStatuses");
    }

    public void addToObsTsunaGtsOsmcs(ObsTsunaGtsOsmc obj) {
        addToManyTarget("obsTsunaGtsOsmcs", obj, true);
    }

    public void removeFromObsTsunaGtsOsmcs(ObsTsunaGtsOsmc obj) {
        removeToManyTarget("obsTsunaGtsOsmcs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsTsunaGtsOsmc> getObsTsunaGtsOsmcs() {
        return (List<ObsTsunaGtsOsmc>)readProperty("obsTsunaGtsOsmcs");
    }

    public void addToObss(Obs obj) {
        addToManyTarget("obss", obj, true);
    }

    public void removeFromObss(Obs obj) {
        removeToManyTarget("obss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Obs> getObss() {
        return (List<Obs>)readProperty("obss");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "obsArgoGdacDss":
                return this.obsArgoGdacDss;
            case "obsArgoGdacVariables":
                return this.obsArgoGdacVariables;
            case "obsArgoGdacs":
                return this.obsArgoGdacs;
            case "obsArgoGdacs1":
                return this.obsArgoGdacs1;
            case "obsGlidersGdacDss":
                return this.obsGlidersGdacDss;
            case "obsGlidersGtsOsmcs":
                return this.obsGlidersGtsOsmcs;
            case "obsObsDataStatuses":
                return this.obsObsDataStatuses;
            case "obsTsunaGtsOsmcs":
                return this.obsTsunaGtsOsmcs;
            case "obss":
                return this.obss;
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
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "obsArgoGdacDss":
                this.obsArgoGdacDss = val;
                break;
            case "obsArgoGdacVariables":
                this.obsArgoGdacVariables = val;
                break;
            case "obsArgoGdacs":
                this.obsArgoGdacs = val;
                break;
            case "obsArgoGdacs1":
                this.obsArgoGdacs1 = val;
                break;
            case "obsGlidersGdacDss":
                this.obsGlidersGdacDss = val;
                break;
            case "obsGlidersGtsOsmcs":
                this.obsGlidersGtsOsmcs = val;
                break;
            case "obsObsDataStatuses":
                this.obsObsDataStatuses = val;
                break;
            case "obsTsunaGtsOsmcs":
                this.obsTsunaGtsOsmcs = val;
                break;
            case "obss":
                this.obss = val;
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
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.obsArgoGdacDss);
        out.writeObject(this.obsArgoGdacVariables);
        out.writeObject(this.obsArgoGdacs);
        out.writeObject(this.obsArgoGdacs1);
        out.writeObject(this.obsGlidersGdacDss);
        out.writeObject(this.obsGlidersGtsOsmcs);
        out.writeObject(this.obsObsDataStatuses);
        out.writeObject(this.obsTsunaGtsOsmcs);
        out.writeObject(this.obss);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.id = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.obsArgoGdacDss = in.readObject();
        this.obsArgoGdacVariables = in.readObject();
        this.obsArgoGdacs = in.readObject();
        this.obsArgoGdacs1 = in.readObject();
        this.obsGlidersGdacDss = in.readObject();
        this.obsGlidersGtsOsmcs = in.readObject();
        this.obsObsDataStatuses = in.readObject();
        this.obsTsunaGtsOsmcs = in.readObject();
        this.obss = in.readObject();
    }

}
