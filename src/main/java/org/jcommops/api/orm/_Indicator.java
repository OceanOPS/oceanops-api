package org.jcommops.api.orm;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Indicator was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Indicator extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> BASIN_ID = Property.create("basinId", Integer.class);
    public static final Property<Integer> CORE = Property.create("core", Integer.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> EXPLANATION = Property.create("explanation", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<BigDecimal> LEGEND_MAX = Property.create("legendMax", BigDecimal.class);
    public static final Property<BigDecimal> LEGEND_MIN = Property.create("legendMin", BigDecimal.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Integer> PERCENTAGE = Property.create("percentage", Integer.class);
    public static final Property<Integer> RANK = Property.create("rank", Integer.class);
    public static final Property<String> TARGET_TEXT = Property.create("targetText", String.class);
    public static final Property<BigDecimal> TARGET_VALUE = Property.create("targetValue", BigDecimal.class);
    public static final Property<IndicatorCategory> INDICATOR_CATEGORY = Property.create("indicatorCategory", IndicatorCategory.class);
    public static final Property<Network> MASTER_NETWORK = Property.create("masterNetwork", Network.class);
    public static final Property<MasterProg> MASTER_PROG = Property.create("masterProg", MasterProg.class);
    public static final Property<Network> NETWORK = Property.create("network", Network.class);

    public void setBasinId(int basinId) {
        writeProperty("basinId", basinId);
    }
    public int getBasinId() {
        Object value = readProperty("basinId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setCore(int core) {
        writeProperty("core", core);
    }
    public int getCore() {
        Object value = readProperty("core");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setExplanation(String explanation) {
        writeProperty("explanation", explanation);
    }
    public String getExplanation() {
        return (String)readProperty("explanation");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLegendMax(BigDecimal legendMax) {
        writeProperty("legendMax", legendMax);
    }
    public BigDecimal getLegendMax() {
        return (BigDecimal)readProperty("legendMax");
    }

    public void setLegendMin(BigDecimal legendMin) {
        writeProperty("legendMin", legendMin);
    }
    public BigDecimal getLegendMin() {
        return (BigDecimal)readProperty("legendMin");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setPercentage(int percentage) {
        writeProperty("percentage", percentage);
    }
    public int getPercentage() {
        Object value = readProperty("percentage");
        return (value != null) ? (Integer) value : 0;
    }

    public void setRank(int rank) {
        writeProperty("rank", rank);
    }
    public int getRank() {
        Object value = readProperty("rank");
        return (value != null) ? (Integer) value : 0;
    }

    public void setTargetText(String targetText) {
        writeProperty("targetText", targetText);
    }
    public String getTargetText() {
        return (String)readProperty("targetText");
    }

    public void setTargetValue(BigDecimal targetValue) {
        writeProperty("targetValue", targetValue);
    }
    public BigDecimal getTargetValue() {
        return (BigDecimal)readProperty("targetValue");
    }

    public void setIndicatorCategory(IndicatorCategory indicatorCategory) {
        setToOneTarget("indicatorCategory", indicatorCategory, true);
    }

    public IndicatorCategory getIndicatorCategory() {
        return (IndicatorCategory)readProperty("indicatorCategory");
    }


    public void setMasterNetwork(Network masterNetwork) {
        setToOneTarget("masterNetwork", masterNetwork, true);
    }

    public Network getMasterNetwork() {
        return (Network)readProperty("masterNetwork");
    }


    public void setMasterProg(MasterProg masterProg) {
        setToOneTarget("masterProg", masterProg, true);
    }

    public MasterProg getMasterProg() {
        return (MasterProg)readProperty("masterProg");
    }


    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }


}
