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
import org.oceanops.api.orm.AgencyDacType;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.Doc;
import org.oceanops.api.orm.Line;
import org.oceanops.api.orm.Meeting;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.PtfModel;
import org.oceanops.api.orm.PtfVariable;
import org.oceanops.api.orm.QcFeedback;
import org.oceanops.api.orm.SensorModel;
import org.oceanops.api.orm.Ship;
import org.oceanops.api.orm.Topic;
import org.oceanops.api.orm.UserGroup;
import org.oceanops.api.orm.WeblinkPtf;

/**
 * Class _Weblink was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Weblink extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final NumericProperty<BigDecimal> RANK = PropertyFactory.createNumeric("rank", BigDecimal.class);
    public static final NumericProperty<BigDecimal> STORY_ID = PropertyFactory.createNumeric("storyId", BigDecimal.class);
    public static final StringProperty<String> URL = PropertyFactory.createString("url", String.class);
    public static final ListProperty<Agency> AGENCIES = PropertyFactory.createList("agencies", Agency.class);
    public static final ListProperty<AgencyDacType> AGENCY_DAC_TYPES = PropertyFactory.createList("agencyDacTypes", AgencyDacType.class);
    public static final ListProperty<Contact> CONTACTS = PropertyFactory.createList("contacts", Contact.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final ListProperty<Cruise> CRUISES = PropertyFactory.createList("cruises", Cruise.class);
    public static final ListProperty<Doc> DOCS = PropertyFactory.createList("docs", Doc.class);
    public static final ListProperty<Line> LINES = PropertyFactory.createList("lines", Line.class);
    public static final ListProperty<Meeting> MEETINGS = PropertyFactory.createList("meetings", Meeting.class);
    public static final EntityProperty<Network> NETWORK = PropertyFactory.createEntity("network", Network.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final ListProperty<PtfModel> PTF_MODELS = PropertyFactory.createList("ptfModels", PtfModel.class);
    public static final ListProperty<PtfVariable> PTF_VARIABLES = PropertyFactory.createList("ptfVariables", PtfVariable.class);
    public static final ListProperty<QcFeedback> QC_FEEDBACKS = PropertyFactory.createList("qcFeedbacks", QcFeedback.class);
    public static final ListProperty<SensorModel> SENSOR_MODELS = PropertyFactory.createList("sensorModels", SensorModel.class);
    public static final ListProperty<Ship> SHIPS = PropertyFactory.createList("ships", Ship.class);
    public static final EntityProperty<Topic> TOPIC = PropertyFactory.createEntity("topic", Topic.class);
    public static final EntityProperty<UserGroup> USER_GROUP = PropertyFactory.createEntity("userGroup", UserGroup.class);
    public static final ListProperty<WeblinkPtf> WEBLINK_PTFS = PropertyFactory.createList("weblinkPtfs", WeblinkPtf.class);

    protected String description;
    protected BigDecimal id;
    protected String name;
    protected BigDecimal rank;
    protected BigDecimal storyId;
    protected String url;

    protected Object agencies;
    protected Object agencyDacTypes;
    protected Object contacts;
    protected Object country;
    protected Object cruises;
    protected Object docs;
    protected Object lines;
    protected Object meetings;
    protected Object network;
    protected Object program;
    protected Object ptf;
    protected Object ptfModels;
    protected Object ptfVariables;
    protected Object qcFeedbacks;
    protected Object sensorModels;
    protected Object ships;
    protected Object topic;
    protected Object userGroup;
    protected Object weblinkPtfs;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

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

    public void setRank(BigDecimal rank) {
        beforePropertyWrite("rank", this.rank, rank);
        this.rank = rank;
    }

    public BigDecimal getRank() {
        beforePropertyRead("rank");
        return this.rank;
    }

    public void setStoryId(BigDecimal storyId) {
        beforePropertyWrite("storyId", this.storyId, storyId);
        this.storyId = storyId;
    }

    public BigDecimal getStoryId() {
        beforePropertyRead("storyId");
        return this.storyId;
    }

    public void setUrl(String url) {
        beforePropertyWrite("url", this.url, url);
        this.url = url;
    }

    public String getUrl() {
        beforePropertyRead("url");
        return this.url;
    }

    public void addToAgencies(Agency obj) {
        addToManyTarget("agencies", obj, true);
    }

    public void removeFromAgencies(Agency obj) {
        removeToManyTarget("agencies", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Agency> getAgencies() {
        return (List<Agency>)readProperty("agencies");
    }

    public void addToAgencyDacTypes(AgencyDacType obj) {
        addToManyTarget("agencyDacTypes", obj, true);
    }

    public void removeFromAgencyDacTypes(AgencyDacType obj) {
        removeToManyTarget("agencyDacTypes", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<AgencyDacType> getAgencyDacTypes() {
        return (List<AgencyDacType>)readProperty("agencyDacTypes");
    }

    public void addToContacts(Contact obj) {
        addToManyTarget("contacts", obj, true);
    }

    public void removeFromContacts(Contact obj) {
        removeToManyTarget("contacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> getContacts() {
        return (List<Contact>)readProperty("contacts");
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

    public void addToLines(Line obj) {
        addToManyTarget("lines", obj, true);
    }

    public void removeFromLines(Line obj) {
        removeToManyTarget("lines", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Line> getLines() {
        return (List<Line>)readProperty("lines");
    }

    public void addToMeetings(Meeting obj) {
        addToManyTarget("meetings", obj, true);
    }

    public void removeFromMeetings(Meeting obj) {
        removeToManyTarget("meetings", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Meeting> getMeetings() {
        return (List<Meeting>)readProperty("meetings");
    }

    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
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

    public void addToPtfVariables(PtfVariable obj) {
        addToManyTarget("ptfVariables", obj, true);
    }

    public void removeFromPtfVariables(PtfVariable obj) {
        removeToManyTarget("ptfVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PtfVariable> getPtfVariables() {
        return (List<PtfVariable>)readProperty("ptfVariables");
    }

    public void addToQcFeedbacks(QcFeedback obj) {
        addToManyTarget("qcFeedbacks", obj, true);
    }

    public void removeFromQcFeedbacks(QcFeedback obj) {
        removeToManyTarget("qcFeedbacks", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbacks() {
        return (List<QcFeedback>)readProperty("qcFeedbacks");
    }

    public void addToSensorModels(SensorModel obj) {
        addToManyTarget("sensorModels", obj, true);
    }

    public void removeFromSensorModels(SensorModel obj) {
        removeToManyTarget("sensorModels", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<SensorModel> getSensorModels() {
        return (List<SensorModel>)readProperty("sensorModels");
    }

    public void addToShips(Ship obj) {
        addToManyTarget("ships", obj, true);
    }

    public void removeFromShips(Ship obj) {
        removeToManyTarget("ships", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ship> getShips() {
        return (List<Ship>)readProperty("ships");
    }

    public void setTopic(Topic topic) {
        setToOneTarget("topic", topic, true);
    }

    public Topic getTopic() {
        return (Topic)readProperty("topic");
    }

    public void setUserGroup(UserGroup userGroup) {
        setToOneTarget("userGroup", userGroup, true);
    }

    public UserGroup getUserGroup() {
        return (UserGroup)readProperty("userGroup");
    }

    public void addToWeblinkPtfs(WeblinkPtf obj) {
        addToManyTarget("weblinkPtfs", obj, true);
    }

    public void removeFromWeblinkPtfs(WeblinkPtf obj) {
        removeToManyTarget("weblinkPtfs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WeblinkPtf> getWeblinkPtfs() {
        return (List<WeblinkPtf>)readProperty("weblinkPtfs");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "rank":
                return this.rank;
            case "storyId":
                return this.storyId;
            case "url":
                return this.url;
            case "agencies":
                return this.agencies;
            case "agencyDacTypes":
                return this.agencyDacTypes;
            case "contacts":
                return this.contacts;
            case "country":
                return this.country;
            case "cruises":
                return this.cruises;
            case "docs":
                return this.docs;
            case "lines":
                return this.lines;
            case "meetings":
                return this.meetings;
            case "network":
                return this.network;
            case "program":
                return this.program;
            case "ptf":
                return this.ptf;
            case "ptfModels":
                return this.ptfModels;
            case "ptfVariables":
                return this.ptfVariables;
            case "qcFeedbacks":
                return this.qcFeedbacks;
            case "sensorModels":
                return this.sensorModels;
            case "ships":
                return this.ships;
            case "topic":
                return this.topic;
            case "userGroup":
                return this.userGroup;
            case "weblinkPtfs":
                return this.weblinkPtfs;
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
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "rank":
                this.rank = (BigDecimal)val;
                break;
            case "storyId":
                this.storyId = (BigDecimal)val;
                break;
            case "url":
                this.url = (String)val;
                break;
            case "agencies":
                this.agencies = val;
                break;
            case "agencyDacTypes":
                this.agencyDacTypes = val;
                break;
            case "contacts":
                this.contacts = val;
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
            case "lines":
                this.lines = val;
                break;
            case "meetings":
                this.meetings = val;
                break;
            case "network":
                this.network = val;
                break;
            case "program":
                this.program = val;
                break;
            case "ptf":
                this.ptf = val;
                break;
            case "ptfModels":
                this.ptfModels = val;
                break;
            case "ptfVariables":
                this.ptfVariables = val;
                break;
            case "qcFeedbacks":
                this.qcFeedbacks = val;
                break;
            case "sensorModels":
                this.sensorModels = val;
                break;
            case "ships":
                this.ships = val;
                break;
            case "topic":
                this.topic = val;
                break;
            case "userGroup":
                this.userGroup = val;
                break;
            case "weblinkPtfs":
                this.weblinkPtfs = val;
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
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.rank);
        out.writeObject(this.storyId);
        out.writeObject(this.url);
        out.writeObject(this.agencies);
        out.writeObject(this.agencyDacTypes);
        out.writeObject(this.contacts);
        out.writeObject(this.country);
        out.writeObject(this.cruises);
        out.writeObject(this.docs);
        out.writeObject(this.lines);
        out.writeObject(this.meetings);
        out.writeObject(this.network);
        out.writeObject(this.program);
        out.writeObject(this.ptf);
        out.writeObject(this.ptfModels);
        out.writeObject(this.ptfVariables);
        out.writeObject(this.qcFeedbacks);
        out.writeObject(this.sensorModels);
        out.writeObject(this.ships);
        out.writeObject(this.topic);
        out.writeObject(this.userGroup);
        out.writeObject(this.weblinkPtfs);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.rank = (BigDecimal)in.readObject();
        this.storyId = (BigDecimal)in.readObject();
        this.url = (String)in.readObject();
        this.agencies = in.readObject();
        this.agencyDacTypes = in.readObject();
        this.contacts = in.readObject();
        this.country = in.readObject();
        this.cruises = in.readObject();
        this.docs = in.readObject();
        this.lines = in.readObject();
        this.meetings = in.readObject();
        this.network = in.readObject();
        this.program = in.readObject();
        this.ptf = in.readObject();
        this.ptfModels = in.readObject();
        this.ptfVariables = in.readObject();
        this.qcFeedbacks = in.readObject();
        this.sensorModels = in.readObject();
        this.ships = in.readObject();
        this.topic = in.readObject();
        this.userGroup = in.readObject();
        this.weblinkPtfs = in.readObject();
    }

}
