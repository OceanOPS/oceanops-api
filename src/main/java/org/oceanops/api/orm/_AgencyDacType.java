package org.oceanops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AgencyDacType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AgencyDacType extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String AGENCY_ID_PK_COLUMN = "AGENCY_ID";
    public static final String DAC_TYPE_ID_PK_COLUMN = "DAC_TYPE_ID";
    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";

    public static final Property<Integer> AGENCY_ID = Property.create("agencyId", Integer.class);
    public static final Property<Integer> DAC_TYPE_ID = Property.create("dacTypeId", Integer.class);
    public static final Property<String> DATA_PATH = Property.create("dataPath", String.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<Integer> OLD_DAC_ID = Property.create("oldDacId", Integer.class);
    public static final Property<String> OP_MAIL = Property.create("opMail", String.class);
    public static final Property<Agency> AGENCY = Property.create("agency", Agency.class);
    public static final Property<DacType> DAC_TYPE = Property.create("dacType", DacType.class);
    public static final Property<Network> NETWORK = Property.create("network", Network.class);
    public static final Property<Weblink> WEBLINK = Property.create("weblink", Weblink.class);

    public void setAgencyId(int agencyId) {
        writeProperty("agencyId", agencyId);
    }
    public int getAgencyId() {
        Object value = readProperty("agencyId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDacTypeId(int dacTypeId) {
        writeProperty("dacTypeId", dacTypeId);
    }
    public int getDacTypeId() {
        Object value = readProperty("dacTypeId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDataPath(String dataPath) {
        writeProperty("dataPath", dataPath);
    }
    public String getDataPath() {
        return (String)readProperty("dataPath");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
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

    public void setOldDacId(int oldDacId) {
        writeProperty("oldDacId", oldDacId);
    }
    public int getOldDacId() {
        Object value = readProperty("oldDacId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setOpMail(String opMail) {
        writeProperty("opMail", opMail);
    }
    public String getOpMail() {
        return (String)readProperty("opMail");
    }

    public void setAgency(Agency agency) {
        setToOneTarget("agency", agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty("agency");
    }


    public void setDacType(DacType dacType) {
        setToOneTarget("dacType", dacType, true);
    }

    public DacType getDacType() {
        return (DacType)readProperty("dacType");
    }


    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget("weblink", weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty("weblink");
    }


}