package jcommops.db.orm.rest.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Agency;
import jcommops.db.orm.rest.Contact;
import jcommops.db.orm.rest.Cruise;
import jcommops.db.orm.rest.Doc;
import jcommops.db.orm.rest.Line;
import jcommops.db.orm.rest.MasterProg;
import jcommops.db.orm.rest.Meeting;
import jcommops.db.orm.rest.Program;
import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfModel;
import jcommops.db.orm.rest.QcFeedback;
import jcommops.db.orm.rest.SensorModel;
import jcommops.db.orm.rest.Ship;
import jcommops.db.orm.rest.Topic;
import jcommops.db.orm.rest.UserGroup;
import jcommops.db.orm.rest.WeblinkPtf;

/**
 * Class _Weblink was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Weblink extends CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String URL_PROPERTY = "url";
    public static final String AGENCY_ARRAY_PROPERTY = "agencyArray";
    public static final String CONTACT_ARRAY_PROPERTY = "contactArray";
    public static final String CRUISE_ARRAY_PROPERTY = "cruiseArray";
    public static final String DOC_ARRAY_PROPERTY = "docArray";
    public static final String LINE_ARRAY_PROPERTY = "lineArray";
    public static final String MEETING_ARRAY_PROPERTY = "meetingArray";
    public static final String PTF_MODEL_ARRAY_PROPERTY = "ptfModelArray";
    public static final String QC_FEEDBACK_ARRAY_PROPERTY = "qcFeedbackArray";
    public static final String SENSOR_MODEL_ARRAY_PROPERTY = "sensorModelArray";
    public static final String SHIP_ARRAY_PROPERTY = "shipArray";
    public static final String TO_MASTER_PROG_PROPERTY = "toMasterProg";
    public static final String TO_PROGRAM_PROPERTY = "toProgram";
    public static final String TO_PTF_PROPERTY = "toPtf";
    public static final String TO_TOPIC_PROPERTY = "toTopic";
    public static final String TO_USER_GROUP_PROPERTY = "toUserGroup";
    public static final String WEBLINK_PTF_ARRAY_PROPERTY = "weblinkPtfArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setUrl(String url) {
        writeProperty(URL_PROPERTY, url);
    }
    public String getUrl() {
        return (String)readProperty(URL_PROPERTY);
    }

    public void addToAgencyArray(Agency obj) {
        addToManyTarget(AGENCY_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromAgencyArray(Agency obj) {
        removeToManyTarget(AGENCY_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Agency> getAgencyArray() {
        return (List<Agency>)readProperty(AGENCY_ARRAY_PROPERTY);
    }


    public void addToContactArray(Contact obj) {
        addToManyTarget(CONTACT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromContactArray(Contact obj) {
        removeToManyTarget(CONTACT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Contact> getContactArray() {
        return (List<Contact>)readProperty(CONTACT_ARRAY_PROPERTY);
    }


    public void addToCruiseArray(Cruise obj) {
        addToManyTarget(CRUISE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseArray(Cruise obj) {
        removeToManyTarget(CRUISE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cruise> getCruiseArray() {
        return (List<Cruise>)readProperty(CRUISE_ARRAY_PROPERTY);
    }


    public void addToDocArray(Doc obj) {
        addToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromDocArray(Doc obj) {
        removeToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocArray() {
        return (List<Doc>)readProperty(DOC_ARRAY_PROPERTY);
    }


    public void addToLineArray(Line obj) {
        addToManyTarget(LINE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromLineArray(Line obj) {
        removeToManyTarget(LINE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Line> getLineArray() {
        return (List<Line>)readProperty(LINE_ARRAY_PROPERTY);
    }


    public void addToMeetingArray(Meeting obj) {
        addToManyTarget(MEETING_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromMeetingArray(Meeting obj) {
        removeToManyTarget(MEETING_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Meeting> getMeetingArray() {
        return (List<Meeting>)readProperty(MEETING_ARRAY_PROPERTY);
    }


    public void addToPtfModelArray(PtfModel obj) {
        addToManyTarget(PTF_MODEL_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfModelArray(PtfModel obj) {
        removeToManyTarget(PTF_MODEL_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfModel> getPtfModelArray() {
        return (List<PtfModel>)readProperty(PTF_MODEL_ARRAY_PROPERTY);
    }


    public void addToQcFeedbackArray(QcFeedback obj) {
        addToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbackArray(QcFeedback obj) {
        removeToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbackArray() {
        return (List<QcFeedback>)readProperty(QC_FEEDBACK_ARRAY_PROPERTY);
    }


    public void addToSensorModelArray(SensorModel obj) {
        addToManyTarget(SENSOR_MODEL_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromSensorModelArray(SensorModel obj) {
        removeToManyTarget(SENSOR_MODEL_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorModel> getSensorModelArray() {
        return (List<SensorModel>)readProperty(SENSOR_MODEL_ARRAY_PROPERTY);
    }


    public void addToShipArray(Ship obj) {
        addToManyTarget(SHIP_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromShipArray(Ship obj) {
        removeToManyTarget(SHIP_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ship> getShipArray() {
        return (List<Ship>)readProperty(SHIP_ARRAY_PROPERTY);
    }


    public void setToMasterProg(MasterProg toMasterProg) {
        setToOneTarget(TO_MASTER_PROG_PROPERTY, toMasterProg, true);
    }

    public MasterProg getToMasterProg() {
        return (MasterProg)readProperty(TO_MASTER_PROG_PROPERTY);
    }


    public void setToProgram(Program toProgram) {
        setToOneTarget(TO_PROGRAM_PROPERTY, toProgram, true);
    }

    public Program getToProgram() {
        return (Program)readProperty(TO_PROGRAM_PROPERTY);
    }


    public void setToPtf(Ptf toPtf) {
        setToOneTarget(TO_PTF_PROPERTY, toPtf, true);
    }

    public Ptf getToPtf() {
        return (Ptf)readProperty(TO_PTF_PROPERTY);
    }


    public void setToTopic(Topic toTopic) {
        setToOneTarget(TO_TOPIC_PROPERTY, toTopic, true);
    }

    public Topic getToTopic() {
        return (Topic)readProperty(TO_TOPIC_PROPERTY);
    }


    public void setToUserGroup(UserGroup toUserGroup) {
        setToOneTarget(TO_USER_GROUP_PROPERTY, toUserGroup, true);
    }

    public UserGroup getToUserGroup() {
        return (UserGroup)readProperty(TO_USER_GROUP_PROPERTY);
    }


    public void addToWeblinkPtfArray(WeblinkPtf obj) {
        addToManyTarget(WEBLINK_PTF_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromWeblinkPtfArray(WeblinkPtf obj) {
        removeToManyTarget(WEBLINK_PTF_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<WeblinkPtf> getWeblinkPtfArray() {
        return (List<WeblinkPtf>)readProperty(WEBLINK_PTF_ARRAY_PROPERTY);
    }


}
