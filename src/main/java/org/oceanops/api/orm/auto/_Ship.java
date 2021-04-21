package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.Doc;
import org.oceanops.api.orm.Image;
import org.oceanops.api.orm.PtfDeployment;
import org.oceanops.api.orm.Retrieval;
import org.oceanops.api.orm.ShipHistory;
import org.oceanops.api.orm.ShipStatus;
import org.oceanops.api.orm.ShipType;
import org.oceanops.api.orm.Weblink;

/**
 * Class _Ship was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Ship extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> AUTONOMY = PropertyFactory.createNumeric("autonomy", BigDecimal.class);
    public static final NumericProperty<BigDecimal> BREADTH = PropertyFactory.createNumeric("breadth", BigDecimal.class);
    public static final NumericProperty<BigDecimal> BRIDGE = PropertyFactory.createNumeric("bridge", BigDecimal.class);
    public static final NumericProperty<BigDecimal> BUOY_CAPACITY = PropertyFactory.createNumeric("buoyCapacity", BigDecimal.class);
    public static final StringProperty<String> CALL_SIGN = PropertyFactory.createString("callSign", String.class);
    public static final DateProperty<LocalDateTime> COMMISSIONED_DATE = PropertyFactory.createDate("commissionedDate", LocalDateTime.class);
    public static final StringProperty<String> CONTACT_SEA_EMAIL = PropertyFactory.createString("contactSeaEmail", String.class);
    public static final StringProperty<String> CONTACT_SHORE_EMAIL = PropertyFactory.createString("contactShoreEmail", String.class);
    public static final StringProperty<String> CONTACT_SHORE_NAME = PropertyFactory.createString("contactShoreName", String.class);
    public static final DateProperty<LocalDateTime> DECOMMISSIONED_DATE = PropertyFactory.createDate("decommissionedDate", LocalDateTime.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> DRAUGHT = PropertyFactory.createNumeric("draught", BigDecimal.class);
    public static final DateProperty<LocalDateTime> EXT_UPDATE = PropertyFactory.createDate("extUpdate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> FLOAT_CAPACITY = PropertyFactory.createNumeric("floatCapacity", BigDecimal.class);
    public static final NumericProperty<BigDecimal> FREEBOARD = PropertyFactory.createNumeric("freeboard", BigDecimal.class);
    public static final NumericProperty<BigDecimal> HEIGHT = PropertyFactory.createNumeric("height", BigDecimal.class);
    public static final NumericProperty<BigDecimal> HIDE_METADATA = PropertyFactory.createNumeric("hideMetadata", BigDecimal.class);
    public static final StringProperty<String> HOME_PORT = PropertyFactory.createString("homePort", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> IMO = PropertyFactory.createString("imo", String.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> LENGTH = PropertyFactory.createNumeric("length", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> ORIGINAL_DATASET = PropertyFactory.createString("originalDataset", String.class);
    public static final NumericProperty<BigDecimal> PASSENGER_CAPACITY = PropertyFactory.createNumeric("passengerCapacity", BigDecimal.class);
    public static final StringProperty<String> REF = PropertyFactory.createString("ref", String.class);
    public static final NumericProperty<BigDecimal> REF_PARENT = PropertyFactory.createNumeric("refParent", BigDecimal.class);
    public static final StringProperty<String> REF_TMP = PropertyFactory.createString("refTmp", String.class);
    public static final StringProperty<String> SHIPPING_AGENCY = PropertyFactory.createString("shippingAgency", String.class);
    public static final NumericProperty<BigDecimal> SPEED = PropertyFactory.createNumeric("speed", BigDecimal.class);
    public static final NumericProperty<BigDecimal> TRACKING_SYSTEM_ID = PropertyFactory.createNumeric("trackingSystemId", BigDecimal.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> VALIDATED = PropertyFactory.createNumeric("validated", BigDecimal.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final ListProperty<Cruise> CRUISES = PropertyFactory.createList("cruises", Cruise.class);
    public static final ListProperty<Doc> DOCS = PropertyFactory.createList("docs", Doc.class);
    public static final ListProperty<Image> IMAGES = PropertyFactory.createList("images", Image.class);
    public static final ListProperty<PtfDeployment> PTF_DEPLOYMENTS = PropertyFactory.createList("ptfDeployments", PtfDeployment.class);
    public static final ListProperty<Retrieval> RETRIEVALS = PropertyFactory.createList("retrievals", Retrieval.class);
    public static final ListProperty<ShipHistory> SHIP_HISTORIES = PropertyFactory.createList("shipHistories", ShipHistory.class);
    public static final EntityProperty<ShipStatus> SHIP_STATUS = PropertyFactory.createEntity("shipStatus", ShipStatus.class);
    public static final EntityProperty<ShipType> SHIP_TYPE = PropertyFactory.createEntity("shipType", ShipType.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected BigDecimal autonomy;
    protected BigDecimal breadth;
    protected BigDecimal bridge;
    protected BigDecimal buoyCapacity;
    protected String callSign;
    protected LocalDateTime commissionedDate;
    protected String contactSeaEmail;
    protected String contactShoreEmail;
    protected String contactShoreName;
    protected LocalDateTime decommissionedDate;
    protected String description;
    protected BigDecimal draught;
    protected LocalDateTime extUpdate;
    protected BigDecimal floatCapacity;
    protected BigDecimal freeboard;
    protected BigDecimal height;
    protected BigDecimal hideMetadata;
    protected String homePort;
    protected BigDecimal id;
    protected String imo;
    protected LocalDateTime insertDate;
    protected BigDecimal length;
    protected String name;
    protected String originalDataset;
    protected BigDecimal passengerCapacity;
    protected String ref;
    protected BigDecimal refParent;
    protected String refTmp;
    protected String shippingAgency;
    protected BigDecimal speed;
    protected BigDecimal trackingSystemId;
    protected LocalDateTime updateDate;
    protected BigDecimal validated;

    protected Object country;
    protected Object cruises;
    protected Object docs;
    protected Object images;
    protected Object ptfDeployments;
    protected Object retrievals;
    protected Object shipHistories;
    protected Object shipStatus;
    protected Object shipType;
    protected Object weblink;

    public void setAutonomy(BigDecimal autonomy) {
        beforePropertyWrite("autonomy", this.autonomy, autonomy);
        this.autonomy = autonomy;
    }

    public BigDecimal getAutonomy() {
        beforePropertyRead("autonomy");
        return this.autonomy;
    }

    public void setBreadth(BigDecimal breadth) {
        beforePropertyWrite("breadth", this.breadth, breadth);
        this.breadth = breadth;
    }

    public BigDecimal getBreadth() {
        beforePropertyRead("breadth");
        return this.breadth;
    }

    public void setBridge(BigDecimal bridge) {
        beforePropertyWrite("bridge", this.bridge, bridge);
        this.bridge = bridge;
    }

    public BigDecimal getBridge() {
        beforePropertyRead("bridge");
        return this.bridge;
    }

    public void setBuoyCapacity(BigDecimal buoyCapacity) {
        beforePropertyWrite("buoyCapacity", this.buoyCapacity, buoyCapacity);
        this.buoyCapacity = buoyCapacity;
    }

    public BigDecimal getBuoyCapacity() {
        beforePropertyRead("buoyCapacity");
        return this.buoyCapacity;
    }

    public void setCallSign(String callSign) {
        beforePropertyWrite("callSign", this.callSign, callSign);
        this.callSign = callSign;
    }

    public String getCallSign() {
        beforePropertyRead("callSign");
        return this.callSign;
    }

    public void setCommissionedDate(LocalDateTime commissionedDate) {
        beforePropertyWrite("commissionedDate", this.commissionedDate, commissionedDate);
        this.commissionedDate = commissionedDate;
    }

    public LocalDateTime getCommissionedDate() {
        beforePropertyRead("commissionedDate");
        return this.commissionedDate;
    }

    public void setContactSeaEmail(String contactSeaEmail) {
        beforePropertyWrite("contactSeaEmail", this.contactSeaEmail, contactSeaEmail);
        this.contactSeaEmail = contactSeaEmail;
    }

    public String getContactSeaEmail() {
        beforePropertyRead("contactSeaEmail");
        return this.contactSeaEmail;
    }

    public void setContactShoreEmail(String contactShoreEmail) {
        beforePropertyWrite("contactShoreEmail", this.contactShoreEmail, contactShoreEmail);
        this.contactShoreEmail = contactShoreEmail;
    }

    public String getContactShoreEmail() {
        beforePropertyRead("contactShoreEmail");
        return this.contactShoreEmail;
    }

    public void setContactShoreName(String contactShoreName) {
        beforePropertyWrite("contactShoreName", this.contactShoreName, contactShoreName);
        this.contactShoreName = contactShoreName;
    }

    public String getContactShoreName() {
        beforePropertyRead("contactShoreName");
        return this.contactShoreName;
    }

    public void setDecommissionedDate(LocalDateTime decommissionedDate) {
        beforePropertyWrite("decommissionedDate", this.decommissionedDate, decommissionedDate);
        this.decommissionedDate = decommissionedDate;
    }

    public LocalDateTime getDecommissionedDate() {
        beforePropertyRead("decommissionedDate");
        return this.decommissionedDate;
    }

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setDraught(BigDecimal draught) {
        beforePropertyWrite("draught", this.draught, draught);
        this.draught = draught;
    }

    public BigDecimal getDraught() {
        beforePropertyRead("draught");
        return this.draught;
    }

    public void setExtUpdate(LocalDateTime extUpdate) {
        beforePropertyWrite("extUpdate", this.extUpdate, extUpdate);
        this.extUpdate = extUpdate;
    }

    public LocalDateTime getExtUpdate() {
        beforePropertyRead("extUpdate");
        return this.extUpdate;
    }

    public void setFloatCapacity(BigDecimal floatCapacity) {
        beforePropertyWrite("floatCapacity", this.floatCapacity, floatCapacity);
        this.floatCapacity = floatCapacity;
    }

    public BigDecimal getFloatCapacity() {
        beforePropertyRead("floatCapacity");
        return this.floatCapacity;
    }

    public void setFreeboard(BigDecimal freeboard) {
        beforePropertyWrite("freeboard", this.freeboard, freeboard);
        this.freeboard = freeboard;
    }

    public BigDecimal getFreeboard() {
        beforePropertyRead("freeboard");
        return this.freeboard;
    }

    public void setHeight(BigDecimal height) {
        beforePropertyWrite("height", this.height, height);
        this.height = height;
    }

    public BigDecimal getHeight() {
        beforePropertyRead("height");
        return this.height;
    }

    public void setHideMetadata(BigDecimal hideMetadata) {
        beforePropertyWrite("hideMetadata", this.hideMetadata, hideMetadata);
        this.hideMetadata = hideMetadata;
    }

    public BigDecimal getHideMetadata() {
        beforePropertyRead("hideMetadata");
        return this.hideMetadata;
    }

    public void setHomePort(String homePort) {
        beforePropertyWrite("homePort", this.homePort, homePort);
        this.homePort = homePort;
    }

    public String getHomePort() {
        beforePropertyRead("homePort");
        return this.homePort;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setImo(String imo) {
        beforePropertyWrite("imo", this.imo, imo);
        this.imo = imo;
    }

    public String getImo() {
        beforePropertyRead("imo");
        return this.imo;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        beforePropertyWrite("insertDate", this.insertDate, insertDate);
        this.insertDate = insertDate;
    }

    public LocalDateTime getInsertDate() {
        beforePropertyRead("insertDate");
        return this.insertDate;
    }

    public void setLength(BigDecimal length) {
        beforePropertyWrite("length", this.length, length);
        this.length = length;
    }

    public BigDecimal getLength() {
        beforePropertyRead("length");
        return this.length;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setOriginalDataset(String originalDataset) {
        beforePropertyWrite("originalDataset", this.originalDataset, originalDataset);
        this.originalDataset = originalDataset;
    }

    public String getOriginalDataset() {
        beforePropertyRead("originalDataset");
        return this.originalDataset;
    }

    public void setPassengerCapacity(BigDecimal passengerCapacity) {
        beforePropertyWrite("passengerCapacity", this.passengerCapacity, passengerCapacity);
        this.passengerCapacity = passengerCapacity;
    }

    public BigDecimal getPassengerCapacity() {
        beforePropertyRead("passengerCapacity");
        return this.passengerCapacity;
    }

    public void setRef(String ref) {
        beforePropertyWrite("ref", this.ref, ref);
        this.ref = ref;
    }

    public String getRef() {
        beforePropertyRead("ref");
        return this.ref;
    }

    public void setRefParent(BigDecimal refParent) {
        beforePropertyWrite("refParent", this.refParent, refParent);
        this.refParent = refParent;
    }

    public BigDecimal getRefParent() {
        beforePropertyRead("refParent");
        return this.refParent;
    }

    public void setRefTmp(String refTmp) {
        beforePropertyWrite("refTmp", this.refTmp, refTmp);
        this.refTmp = refTmp;
    }

    public String getRefTmp() {
        beforePropertyRead("refTmp");
        return this.refTmp;
    }

    public void setShippingAgency(String shippingAgency) {
        beforePropertyWrite("shippingAgency", this.shippingAgency, shippingAgency);
        this.shippingAgency = shippingAgency;
    }

    public String getShippingAgency() {
        beforePropertyRead("shippingAgency");
        return this.shippingAgency;
    }

    public void setSpeed(BigDecimal speed) {
        beforePropertyWrite("speed", this.speed, speed);
        this.speed = speed;
    }

    public BigDecimal getSpeed() {
        beforePropertyRead("speed");
        return this.speed;
    }

    public void setTrackingSystemId(BigDecimal trackingSystemId) {
        beforePropertyWrite("trackingSystemId", this.trackingSystemId, trackingSystemId);
        this.trackingSystemId = trackingSystemId;
    }

    public BigDecimal getTrackingSystemId() {
        beforePropertyRead("trackingSystemId");
        return this.trackingSystemId;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        beforePropertyWrite("updateDate", this.updateDate, updateDate);
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateDate() {
        beforePropertyRead("updateDate");
        return this.updateDate;
    }

    public void setValidated(BigDecimal validated) {
        beforePropertyWrite("validated", this.validated, validated);
        this.validated = validated;
    }

    public BigDecimal getValidated() {
        beforePropertyRead("validated");
        return this.validated;
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }

    public void addToCruises(Cruise obj) {
        addToManyTarget("cruises", obj, true);
    }

    public void removeFromCruises(Cruise obj) {
        removeToManyTarget("cruises", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Cruise> getCruises() {
        return (List<Cruise>)readProperty("cruises");
    }

    public void addToDocs(Doc obj) {
        addToManyTarget("docs", obj, true);
    }

    public void removeFromDocs(Doc obj) {
        removeToManyTarget("docs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Doc> getDocs() {
        return (List<Doc>)readProperty("docs");
    }

    public void addToImages(Image obj) {
        addToManyTarget("images", obj, true);
    }

    public void removeFromImages(Image obj) {
        removeToManyTarget("images", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Image> getImages() {
        return (List<Image>)readProperty("images");
    }

    public void addToPtfDeployments(PtfDeployment obj) {
        addToManyTarget("ptfDeployments", obj, true);
    }

    public void removeFromPtfDeployments(PtfDeployment obj) {
        removeToManyTarget("ptfDeployments", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeployments() {
        return (List<PtfDeployment>)readProperty("ptfDeployments");
    }

    public void addToRetrievals(Retrieval obj) {
        addToManyTarget("retrievals", obj, true);
    }

    public void removeFromRetrievals(Retrieval obj) {
        removeToManyTarget("retrievals", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Retrieval> getRetrievals() {
        return (List<Retrieval>)readProperty("retrievals");
    }

    public void addToShipHistories(ShipHistory obj) {
        addToManyTarget("shipHistories", obj, true);
    }

    public void removeFromShipHistories(ShipHistory obj) {
        removeToManyTarget("shipHistories", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ShipHistory> getShipHistories() {
        return (List<ShipHistory>)readProperty("shipHistories");
    }

    public void setShipStatus(ShipStatus shipStatus) {
        setToOneTarget("shipStatus", shipStatus, true);
    }

    public ShipStatus getShipStatus() {
        return (ShipStatus)readProperty("shipStatus");
    }

    public void setShipType(ShipType shipType) {
        setToOneTarget("shipType", shipType, true);
    }

    public ShipType getShipType() {
        return (ShipType)readProperty("shipType");
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
            case "autonomy":
                return this.autonomy;
            case "breadth":
                return this.breadth;
            case "bridge":
                return this.bridge;
            case "buoyCapacity":
                return this.buoyCapacity;
            case "callSign":
                return this.callSign;
            case "commissionedDate":
                return this.commissionedDate;
            case "contactSeaEmail":
                return this.contactSeaEmail;
            case "contactShoreEmail":
                return this.contactShoreEmail;
            case "contactShoreName":
                return this.contactShoreName;
            case "decommissionedDate":
                return this.decommissionedDate;
            case "description":
                return this.description;
            case "draught":
                return this.draught;
            case "extUpdate":
                return this.extUpdate;
            case "floatCapacity":
                return this.floatCapacity;
            case "freeboard":
                return this.freeboard;
            case "height":
                return this.height;
            case "hideMetadata":
                return this.hideMetadata;
            case "homePort":
                return this.homePort;
            case "id":
                return this.id;
            case "imo":
                return this.imo;
            case "insertDate":
                return this.insertDate;
            case "length":
                return this.length;
            case "name":
                return this.name;
            case "originalDataset":
                return this.originalDataset;
            case "passengerCapacity":
                return this.passengerCapacity;
            case "ref":
                return this.ref;
            case "refParent":
                return this.refParent;
            case "refTmp":
                return this.refTmp;
            case "shippingAgency":
                return this.shippingAgency;
            case "speed":
                return this.speed;
            case "trackingSystemId":
                return this.trackingSystemId;
            case "updateDate":
                return this.updateDate;
            case "validated":
                return this.validated;
            case "country":
                return this.country;
            case "cruises":
                return this.cruises;
            case "docs":
                return this.docs;
            case "images":
                return this.images;
            case "ptfDeployments":
                return this.ptfDeployments;
            case "retrievals":
                return this.retrievals;
            case "shipHistories":
                return this.shipHistories;
            case "shipStatus":
                return this.shipStatus;
            case "shipType":
                return this.shipType;
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
            case "autonomy":
                this.autonomy = (BigDecimal)val;
                break;
            case "breadth":
                this.breadth = (BigDecimal)val;
                break;
            case "bridge":
                this.bridge = (BigDecimal)val;
                break;
            case "buoyCapacity":
                this.buoyCapacity = (BigDecimal)val;
                break;
            case "callSign":
                this.callSign = (String)val;
                break;
            case "commissionedDate":
                this.commissionedDate = (LocalDateTime)val;
                break;
            case "contactSeaEmail":
                this.contactSeaEmail = (String)val;
                break;
            case "contactShoreEmail":
                this.contactShoreEmail = (String)val;
                break;
            case "contactShoreName":
                this.contactShoreName = (String)val;
                break;
            case "decommissionedDate":
                this.decommissionedDate = (LocalDateTime)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "draught":
                this.draught = (BigDecimal)val;
                break;
            case "extUpdate":
                this.extUpdate = (LocalDateTime)val;
                break;
            case "floatCapacity":
                this.floatCapacity = (BigDecimal)val;
                break;
            case "freeboard":
                this.freeboard = (BigDecimal)val;
                break;
            case "height":
                this.height = (BigDecimal)val;
                break;
            case "hideMetadata":
                this.hideMetadata = (BigDecimal)val;
                break;
            case "homePort":
                this.homePort = (String)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "imo":
                this.imo = (String)val;
                break;
            case "insertDate":
                this.insertDate = (LocalDateTime)val;
                break;
            case "length":
                this.length = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "originalDataset":
                this.originalDataset = (String)val;
                break;
            case "passengerCapacity":
                this.passengerCapacity = (BigDecimal)val;
                break;
            case "ref":
                this.ref = (String)val;
                break;
            case "refParent":
                this.refParent = (BigDecimal)val;
                break;
            case "refTmp":
                this.refTmp = (String)val;
                break;
            case "shippingAgency":
                this.shippingAgency = (String)val;
                break;
            case "speed":
                this.speed = (BigDecimal)val;
                break;
            case "trackingSystemId":
                this.trackingSystemId = (BigDecimal)val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "validated":
                this.validated = (BigDecimal)val;
                break;
            case "country":
                this.country = val;
                break;
            case "cruises":
                this.cruises = val;
                break;
            case "docs":
                this.docs = val;
                break;
            case "images":
                this.images = val;
                break;
            case "ptfDeployments":
                this.ptfDeployments = val;
                break;
            case "retrievals":
                this.retrievals = val;
                break;
            case "shipHistories":
                this.shipHistories = val;
                break;
            case "shipStatus":
                this.shipStatus = val;
                break;
            case "shipType":
                this.shipType = val;
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
        out.writeObject(this.autonomy);
        out.writeObject(this.breadth);
        out.writeObject(this.bridge);
        out.writeObject(this.buoyCapacity);
        out.writeObject(this.callSign);
        out.writeObject(this.commissionedDate);
        out.writeObject(this.contactSeaEmail);
        out.writeObject(this.contactShoreEmail);
        out.writeObject(this.contactShoreName);
        out.writeObject(this.decommissionedDate);
        out.writeObject(this.description);
        out.writeObject(this.draught);
        out.writeObject(this.extUpdate);
        out.writeObject(this.floatCapacity);
        out.writeObject(this.freeboard);
        out.writeObject(this.height);
        out.writeObject(this.hideMetadata);
        out.writeObject(this.homePort);
        out.writeObject(this.id);
        out.writeObject(this.imo);
        out.writeObject(this.insertDate);
        out.writeObject(this.length);
        out.writeObject(this.name);
        out.writeObject(this.originalDataset);
        out.writeObject(this.passengerCapacity);
        out.writeObject(this.ref);
        out.writeObject(this.refParent);
        out.writeObject(this.refTmp);
        out.writeObject(this.shippingAgency);
        out.writeObject(this.speed);
        out.writeObject(this.trackingSystemId);
        out.writeObject(this.updateDate);
        out.writeObject(this.validated);
        out.writeObject(this.country);
        out.writeObject(this.cruises);
        out.writeObject(this.docs);
        out.writeObject(this.images);
        out.writeObject(this.ptfDeployments);
        out.writeObject(this.retrievals);
        out.writeObject(this.shipHistories);
        out.writeObject(this.shipStatus);
        out.writeObject(this.shipType);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.autonomy = (BigDecimal)in.readObject();
        this.breadth = (BigDecimal)in.readObject();
        this.bridge = (BigDecimal)in.readObject();
        this.buoyCapacity = (BigDecimal)in.readObject();
        this.callSign = (String)in.readObject();
        this.commissionedDate = (LocalDateTime)in.readObject();
        this.contactSeaEmail = (String)in.readObject();
        this.contactShoreEmail = (String)in.readObject();
        this.contactShoreName = (String)in.readObject();
        this.decommissionedDate = (LocalDateTime)in.readObject();
        this.description = (String)in.readObject();
        this.draught = (BigDecimal)in.readObject();
        this.extUpdate = (LocalDateTime)in.readObject();
        this.floatCapacity = (BigDecimal)in.readObject();
        this.freeboard = (BigDecimal)in.readObject();
        this.height = (BigDecimal)in.readObject();
        this.hideMetadata = (BigDecimal)in.readObject();
        this.homePort = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.imo = (String)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.length = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.originalDataset = (String)in.readObject();
        this.passengerCapacity = (BigDecimal)in.readObject();
        this.ref = (String)in.readObject();
        this.refParent = (BigDecimal)in.readObject();
        this.refTmp = (String)in.readObject();
        this.shippingAgency = (String)in.readObject();
        this.speed = (BigDecimal)in.readObject();
        this.trackingSystemId = (BigDecimal)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.validated = (BigDecimal)in.readObject();
        this.country = in.readObject();
        this.cruises = in.readObject();
        this.docs = in.readObject();
        this.images = in.readObject();
        this.ptfDeployments = in.readObject();
        this.retrievals = in.readObject();
        this.shipHistories = in.readObject();
        this.shipStatus = in.readObject();
        this.shipType = in.readObject();
        this.weblink = in.readObject();
    }

}
