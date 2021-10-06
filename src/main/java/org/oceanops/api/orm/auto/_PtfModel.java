package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.ApiWmoIdType;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.GtsInstrumentType;
import org.oceanops.api.orm.Image;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.PtfHullType;
import org.oceanops.api.orm.PtfType;
import org.oceanops.api.orm.TelecomFormat;
import org.oceanops.api.orm.Weblink;

/**
 * Class _PtfModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfModel extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> AIR_DEPL_CERTIF = PropertyFactory.createNumeric("airDeplCertif", BigDecimal.class);
    public static final NumericProperty<BigDecimal> API_WMO_ID_TYPE_ID = PropertyFactory.createNumeric("apiWmoIdTypeId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> COMMERCIAL = PropertyFactory.createNumeric("commercial", BigDecimal.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> DIAMETER = PropertyFactory.createNumeric("diameter", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DROGUE = PropertyFactory.createNumeric("drogue", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DROGUE_DEPTH = PropertyFactory.createNumeric("drogueDepth", BigDecimal.class);
    public static final StringProperty<String> DROGUE_TYPE = PropertyFactory.createString("drogueType", String.class);
    public static final NumericProperty<BigDecimal> HEIGHT = PropertyFactory.createNumeric("height", BigDecimal.class);
    public static final NumericProperty<BigDecimal> HEIGHT_ABOVE = PropertyFactory.createNumeric("heightAbove", BigDecimal.class);
    public static final NumericProperty<BigDecimal> HULL_DEPTH = PropertyFactory.createNumeric("hullDepth", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> KEY = PropertyFactory.createString("key", String.class);
    public static final NumericProperty<BigDecimal> LENGTH = PropertyFactory.createNumeric("length", BigDecimal.class);
    public static final StringProperty<String> LIFE_TIME = PropertyFactory.createString("lifeTime", String.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final NumericProperty<BigDecimal> TOTAL_HEIGHT = PropertyFactory.createNumeric("totalHeight", BigDecimal.class);
    public static final NumericProperty<BigDecimal> WEIGHT = PropertyFactory.createNumeric("weight", BigDecimal.class);
    public static final NumericProperty<BigDecimal> WIDTH = PropertyFactory.createNumeric("width", BigDecimal.class);
    public static final EntityProperty<Agency> AGENCY = PropertyFactory.createEntity("agency", Agency.class);
    public static final EntityProperty<ApiWmoIdType> API_WMO_ID_TYPE = PropertyFactory.createEntity("apiWmoIdType", ApiWmoIdType.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<GtsInstrumentType> GTS_INSTRUMENT_TYPE = PropertyFactory.createEntity("gtsInstrumentType", GtsInstrumentType.class);
    public static final EntityProperty<PtfHullType> HULL_TYPE = PropertyFactory.createEntity("hullType", PtfHullType.class);
    public static final EntityProperty<Image> IMAGE = PropertyFactory.createEntity("image", Image.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<PtfType> PTF_TYPE = PropertyFactory.createEntity("ptfType", PtfType.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);
    public static final ListProperty<TelecomFormat> TELECOM_FORMATS = PropertyFactory.createList("telecomFormats", TelecomFormat.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected BigDecimal airDeplCertif;
    protected BigDecimal apiWmoIdTypeId;
    protected BigDecimal commercial;
    protected String description;
    protected BigDecimal diameter;
    protected BigDecimal drogue;
    protected BigDecimal drogueDepth;
    protected String drogueType;
    protected BigDecimal height;
    protected BigDecimal heightAbove;
    protected BigDecimal hullDepth;
    protected BigDecimal id;
    protected String key;
    protected BigDecimal length;
    protected String lifeTime;
    protected String name;
    protected String nameShort;
    protected BigDecimal totalHeight;
    protected BigDecimal weight;
    protected BigDecimal width;

    protected Object agency;
    protected Object apiWmoIdType;
    protected Object contact;
    protected Object gtsInstrumentType;
    protected Object hullType;
    protected Object image;
    protected Object network;
    protected Object ptfType;
    protected Object ptfs;
    protected Object telecomFormats;
    protected Object weblink;

    public void setAirDeplCertif(BigDecimal airDeplCertif) {
        beforePropertyWrite("airDeplCertif", this.airDeplCertif, airDeplCertif);
        this.airDeplCertif = airDeplCertif;
    }

    public BigDecimal getAirDeplCertif() {
        beforePropertyRead("airDeplCertif");
        return this.airDeplCertif;
    }

    public void setApiWmoIdTypeId(BigDecimal apiWmoIdTypeId) {
        beforePropertyWrite("apiWmoIdTypeId", this.apiWmoIdTypeId, apiWmoIdTypeId);
        this.apiWmoIdTypeId = apiWmoIdTypeId;
    }

    public BigDecimal getApiWmoIdTypeId() {
        beforePropertyRead("apiWmoIdTypeId");
        return this.apiWmoIdTypeId;
    }

    public void setCommercial(BigDecimal commercial) {
        beforePropertyWrite("commercial", this.commercial, commercial);
        this.commercial = commercial;
    }

    public BigDecimal getCommercial() {
        beforePropertyRead("commercial");
        return this.commercial;
    }

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setDiameter(BigDecimal diameter) {
        beforePropertyWrite("diameter", this.diameter, diameter);
        this.diameter = diameter;
    }

    public BigDecimal getDiameter() {
        beforePropertyRead("diameter");
        return this.diameter;
    }

    public void setDrogue(BigDecimal drogue) {
        beforePropertyWrite("drogue", this.drogue, drogue);
        this.drogue = drogue;
    }

    public BigDecimal getDrogue() {
        beforePropertyRead("drogue");
        return this.drogue;
    }

    public void setDrogueDepth(BigDecimal drogueDepth) {
        beforePropertyWrite("drogueDepth", this.drogueDepth, drogueDepth);
        this.drogueDepth = drogueDepth;
    }

    public BigDecimal getDrogueDepth() {
        beforePropertyRead("drogueDepth");
        return this.drogueDepth;
    }

    public void setDrogueType(String drogueType) {
        beforePropertyWrite("drogueType", this.drogueType, drogueType);
        this.drogueType = drogueType;
    }

    public String getDrogueType() {
        beforePropertyRead("drogueType");
        return this.drogueType;
    }

    public void setHeight(BigDecimal height) {
        beforePropertyWrite("height", this.height, height);
        this.height = height;
    }

    public BigDecimal getHeight() {
        beforePropertyRead("height");
        return this.height;
    }

    public void setHeightAbove(BigDecimal heightAbove) {
        beforePropertyWrite("heightAbove", this.heightAbove, heightAbove);
        this.heightAbove = heightAbove;
    }

    public BigDecimal getHeightAbove() {
        beforePropertyRead("heightAbove");
        return this.heightAbove;
    }

    public void setHullDepth(BigDecimal hullDepth) {
        beforePropertyWrite("hullDepth", this.hullDepth, hullDepth);
        this.hullDepth = hullDepth;
    }

    public BigDecimal getHullDepth() {
        beforePropertyRead("hullDepth");
        return this.hullDepth;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setKey(String key) {
        beforePropertyWrite("key", this.key, key);
        this.key = key;
    }

    public String getKey() {
        beforePropertyRead("key");
        return this.key;
    }

    public void setLength(BigDecimal length) {
        beforePropertyWrite("length", this.length, length);
        this.length = length;
    }

    public BigDecimal getLength() {
        beforePropertyRead("length");
        return this.length;
    }

    public void setLifeTime(String lifeTime) {
        beforePropertyWrite("lifeTime", this.lifeTime, lifeTime);
        this.lifeTime = lifeTime;
    }

    public String getLifeTime() {
        beforePropertyRead("lifeTime");
        return this.lifeTime;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setTotalHeight(BigDecimal totalHeight) {
        beforePropertyWrite("totalHeight", this.totalHeight, totalHeight);
        this.totalHeight = totalHeight;
    }

    public BigDecimal getTotalHeight() {
        beforePropertyRead("totalHeight");
        return this.totalHeight;
    }

    public void setWeight(BigDecimal weight) {
        beforePropertyWrite("weight", this.weight, weight);
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        beforePropertyRead("weight");
        return this.weight;
    }

    public void setWidth(BigDecimal width) {
        beforePropertyWrite("width", this.width, width);
        this.width = width;
    }

    public BigDecimal getWidth() {
        beforePropertyRead("width");
        return this.width;
    }

    public void setAgency(Agency agency) {
        setToOneTarget("agency", agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty("agency");
    }

    public void setApiWmoIdType(ApiWmoIdType apiWmoIdType) {
        setToOneTarget("apiWmoIdType", apiWmoIdType, true);
    }

    public ApiWmoIdType getApiWmoIdType() {
        return (ApiWmoIdType)readProperty("apiWmoIdType");
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setGtsInstrumentType(GtsInstrumentType gtsInstrumentType) {
        setToOneTarget("gtsInstrumentType", gtsInstrumentType, true);
    }

    public GtsInstrumentType getGtsInstrumentType() {
        return (GtsInstrumentType)readProperty("gtsInstrumentType");
    }

    public void setHullType(PtfHullType hullType) {
        setToOneTarget("hullType", hullType, true);
    }

    public PtfHullType getHullType() {
        return (PtfHullType)readProperty("hullType");
    }

    public void setImage(Image image) {
        setToOneTarget("image", image, true);
    }

    public Image getImage() {
        return (Image)readProperty("image");
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setPtfType(PtfType ptfType) {
        setToOneTarget("ptfType", ptfType, true);
    }

    public PtfType getPtfType() {
        return (PtfType)readProperty("ptfType");
    }

    public void addToPtfs(Ptf obj) {
        addToManyTarget("ptfs", obj, true);
    }

    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget("ptfs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty("ptfs");
    }

    public void addToTelecomFormats(TelecomFormat obj) {
        addToManyTarget("telecomFormats", obj, true);
    }

    public void removeFromTelecomFormats(TelecomFormat obj) {
        removeToManyTarget("telecomFormats", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<TelecomFormat> getTelecomFormats() {
        return (List<TelecomFormat>)readProperty("telecomFormats");
    }

    public void setWeblink(Weblink weblink) {
        setToOneTarget("weblink", weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty("weblink");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "airDeplCertif":
                return this.airDeplCertif;
            case "apiWmoIdTypeId":
                return this.apiWmoIdTypeId;
            case "commercial":
                return this.commercial;
            case "description":
                return this.description;
            case "diameter":
                return this.diameter;
            case "drogue":
                return this.drogue;
            case "drogueDepth":
                return this.drogueDepth;
            case "drogueType":
                return this.drogueType;
            case "height":
                return this.height;
            case "heightAbove":
                return this.heightAbove;
            case "hullDepth":
                return this.hullDepth;
            case "id":
                return this.id;
            case "key":
                return this.key;
            case "length":
                return this.length;
            case "lifeTime":
                return this.lifeTime;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "totalHeight":
                return this.totalHeight;
            case "weight":
                return this.weight;
            case "width":
                return this.width;
            case "agency":
                return this.agency;
            case "apiWmoIdType":
                return this.apiWmoIdType;
            case "contact":
                return this.contact;
            case "gtsInstrumentType":
                return this.gtsInstrumentType;
            case "hullType":
                return this.hullType;
            case "image":
                return this.image;
            case "network":
                return this.network;
            case "ptfType":
                return this.ptfType;
            case "ptfs":
                return this.ptfs;
            case "telecomFormats":
                return this.telecomFormats;
            case "weblink":
                return this.weblink;
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
            case "airDeplCertif":
                this.airDeplCertif = (BigDecimal)val;
                break;
            case "apiWmoIdTypeId":
                this.apiWmoIdTypeId = (BigDecimal)val;
                break;
            case "commercial":
                this.commercial = (BigDecimal)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "diameter":
                this.diameter = (BigDecimal)val;
                break;
            case "drogue":
                this.drogue = (BigDecimal)val;
                break;
            case "drogueDepth":
                this.drogueDepth = (BigDecimal)val;
                break;
            case "drogueType":
                this.drogueType = (String)val;
                break;
            case "height":
                this.height = (BigDecimal)val;
                break;
            case "heightAbove":
                this.heightAbove = (BigDecimal)val;
                break;
            case "hullDepth":
                this.hullDepth = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "key":
                this.key = (String)val;
                break;
            case "length":
                this.length = (BigDecimal)val;
                break;
            case "lifeTime":
                this.lifeTime = (String)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "totalHeight":
                this.totalHeight = (BigDecimal)val;
                break;
            case "weight":
                this.weight = (BigDecimal)val;
                break;
            case "width":
                this.width = (BigDecimal)val;
                break;
            case "agency":
                this.agency = val;
                break;
            case "apiWmoIdType":
                this.apiWmoIdType = val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "gtsInstrumentType":
                this.gtsInstrumentType = val;
                break;
            case "hullType":
                this.hullType = val;
                break;
            case "image":
                this.image = val;
                break;
            case "network":
                this.network = val;
                break;
            case "ptfType":
                this.ptfType = val;
                break;
            case "ptfs":
                this.ptfs = val;
                break;
            case "telecomFormats":
                this.telecomFormats = val;
                break;
            case "weblink":
                this.weblink = val;
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
        out.writeObject(this.airDeplCertif);
        out.writeObject(this.apiWmoIdTypeId);
        out.writeObject(this.commercial);
        out.writeObject(this.description);
        out.writeObject(this.diameter);
        out.writeObject(this.drogue);
        out.writeObject(this.drogueDepth);
        out.writeObject(this.drogueType);
        out.writeObject(this.height);
        out.writeObject(this.heightAbove);
        out.writeObject(this.hullDepth);
        out.writeObject(this.id);
        out.writeObject(this.key);
        out.writeObject(this.length);
        out.writeObject(this.lifeTime);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.totalHeight);
        out.writeObject(this.weight);
        out.writeObject(this.width);
        out.writeObject(this.agency);
        out.writeObject(this.apiWmoIdType);
        out.writeObject(this.contact);
        out.writeObject(this.gtsInstrumentType);
        out.writeObject(this.hullType);
        out.writeObject(this.image);
        out.writeObject(this.network);
        out.writeObject(this.ptfType);
        out.writeObject(this.ptfs);
        out.writeObject(this.telecomFormats);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.airDeplCertif = (BigDecimal)in.readObject();
        this.apiWmoIdTypeId = (BigDecimal)in.readObject();
        this.commercial = (BigDecimal)in.readObject();
        this.description = (String)in.readObject();
        this.diameter = (BigDecimal)in.readObject();
        this.drogue = (BigDecimal)in.readObject();
        this.drogueDepth = (BigDecimal)in.readObject();
        this.drogueType = (String)in.readObject();
        this.height = (BigDecimal)in.readObject();
        this.heightAbove = (BigDecimal)in.readObject();
        this.hullDepth = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.key = (String)in.readObject();
        this.length = (BigDecimal)in.readObject();
        this.lifeTime = (String)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.totalHeight = (BigDecimal)in.readObject();
        this.weight = (BigDecimal)in.readObject();
        this.width = (BigDecimal)in.readObject();
        this.agency = in.readObject();
        this.apiWmoIdType = in.readObject();
        this.contact = in.readObject();
        this.gtsInstrumentType = in.readObject();
        this.hullType = in.readObject();
        this.image = in.readObject();
        this.network = in.readObject();
        this.ptfType = in.readObject();
        this.ptfs = in.readObject();
        this.telecomFormats = in.readObject();
        this.weblink = in.readObject();
    }

}
