package org.oceanops.api.orm;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GtsInstrumentType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsInstrumentType extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> CODE = Property.create("code", String.class);
    public static final Property<String> DETAILS = Property.create("details", String.class);
    public static final Property<BigDecimal> FALLRATE_A = Property.create("fallrateA", BigDecimal.class);
    public static final Property<BigDecimal> FALLRATE_B = Property.create("fallrateB", BigDecimal.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> TYPE = Property.create("type", String.class);
    public static final Property<List<Obs>> OBSS = Property.create("obss", List.class);
    public static final Property<List<PtfModel>> PTF_MODELS = Property.create("ptfModels", List.class);

    public void setCode(String code) {
        writeProperty("code", code);
    }
    public String getCode() {
        return (String)readProperty("code");
    }

    public void setDetails(String details) {
        writeProperty("details", details);
    }
    public String getDetails() {
        return (String)readProperty("details");
    }

    public void setFallrateA(BigDecimal fallrateA) {
        writeProperty("fallrateA", fallrateA);
    }
    public BigDecimal getFallrateA() {
        return (BigDecimal)readProperty("fallrateA");
    }

    public void setFallrateB(BigDecimal fallrateB) {
        writeProperty("fallrateB", fallrateB);
    }
    public BigDecimal getFallrateB() {
        return (BigDecimal)readProperty("fallrateB");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
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


    public void addToPtfModels(PtfModel obj) {
        addToManyTarget("ptfModels", obj, true);
    }
    public void removeFromPtfModels(PtfModel obj) {
        removeToManyTarget("ptfModels", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfModel> getPtfModels() {
        return (List<PtfModel>)readProperty("ptfModels");
    }


}