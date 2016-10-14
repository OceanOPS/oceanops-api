package jcommops.db.orm.rest.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Agency;
import jcommops.db.orm.rest.Contact;
import jcommops.db.orm.rest.CruiseCountry;
import jcommops.db.orm.rest.GtsCccc;
import jcommops.db.orm.rest.Meeting;
import jcommops.db.orm.rest.NetworkCountry;
import jcommops.db.orm.rest.Program;
import jcommops.db.orm.rest.PtfDeployment;
import jcommops.db.orm.rest.Retrieval;
import jcommops.db.orm.rest.Ship;
import jcommops.db.orm.rest.UserGroupContact;

/**
 * Class _Country was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Country extends CayenneDataObject {

    public static final String ACTIVE_PROPERTY = "active";
    public static final String CODE2_PROPERTY = "code2";
    public static final String CODE3_PROPERTY = "code3";
    public static final String COLOR_PROPERTY = "color";
    public static final String EEZ_PROPERTY = "eez";
    public static final String IOC_MEMBER_PROPERTY = "iocMember";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_LONG_PROPERTY = "nameLong";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String NUMCODE_PROPERTY = "numcode";
    public static final String TO_NOTIFY_PROPERTY = "toNotify";
    public static final String WMO_MEMBER_PROPERTY = "wmoMember";
    public static final String AGENCY_ARRAY_PROPERTY = "agencyArray";
    public static final String CONTACT_ARRAY_PROPERTY = "contactArray";
    public static final String CRUISE_COUNTRY_ARRAY_PROPERTY = "cruiseCountryArray";
    public static final String GTS_CCCC_ARRAY_PROPERTY = "gtsCcccArray";
    public static final String MEETING_ARRAY_PROPERTY = "meetingArray";
    public static final String NETWORK_COUNTRY_ARRAY_PROPERTY = "networkCountryArray";
    public static final String PROGRAM_ARRAY_PROPERTY = "programArray";
    public static final String PTF_DEPLOYMENT_ARRAY_PROPERTY = "ptfDeploymentArray";
    public static final String RETRIEVAL_ARRAY_PROPERTY = "retrievalArray";
    public static final String SHIP_ARRAY_PROPERTY = "shipArray";
    public static final String USER_GROUP_CONTACT_ARRAY_PROPERTY = "userGroupContactArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setActive(Integer active) {
        writeProperty(ACTIVE_PROPERTY, active);
    }
    public Integer getActive() {
        return (Integer)readProperty(ACTIVE_PROPERTY);
    }

    public void setCode2(String code2) {
        writeProperty(CODE2_PROPERTY, code2);
    }
    public String getCode2() {
        return (String)readProperty(CODE2_PROPERTY);
    }

    public void setCode3(String code3) {
        writeProperty(CODE3_PROPERTY, code3);
    }
    public String getCode3() {
        return (String)readProperty(CODE3_PROPERTY);
    }

    public void setColor(String color) {
        writeProperty(COLOR_PROPERTY, color);
    }
    public String getColor() {
        return (String)readProperty(COLOR_PROPERTY);
    }

    public void setEez(Integer eez) {
        writeProperty(EEZ_PROPERTY, eez);
    }
    public Integer getEez() {
        return (Integer)readProperty(EEZ_PROPERTY);
    }

    public void setIocMember(Integer iocMember) {
        writeProperty(IOC_MEMBER_PROPERTY, iocMember);
    }
    public Integer getIocMember() {
        return (Integer)readProperty(IOC_MEMBER_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameLong(String nameLong) {
        writeProperty(NAME_LONG_PROPERTY, nameLong);
    }
    public String getNameLong() {
        return (String)readProperty(NAME_LONG_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void setNumcode(Integer numcode) {
        writeProperty(NUMCODE_PROPERTY, numcode);
    }
    public Integer getNumcode() {
        return (Integer)readProperty(NUMCODE_PROPERTY);
    }

    public void setToNotify(Integer toNotify) {
        writeProperty(TO_NOTIFY_PROPERTY, toNotify);
    }
    public Integer getToNotify() {
        return (Integer)readProperty(TO_NOTIFY_PROPERTY);
    }

    public void setWmoMember(Integer wmoMember) {
        writeProperty(WMO_MEMBER_PROPERTY, wmoMember);
    }
    public Integer getWmoMember() {
        return (Integer)readProperty(WMO_MEMBER_PROPERTY);
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


    public void addToCruiseCountryArray(CruiseCountry obj) {
        addToManyTarget(CRUISE_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseCountryArray(CruiseCountry obj) {
        removeToManyTarget(CRUISE_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseCountry> getCruiseCountryArray() {
        return (List<CruiseCountry>)readProperty(CRUISE_COUNTRY_ARRAY_PROPERTY);
    }


    public void addToGtsCcccArray(GtsCccc obj) {
        addToManyTarget(GTS_CCCC_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromGtsCcccArray(GtsCccc obj) {
        removeToManyTarget(GTS_CCCC_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<GtsCccc> getGtsCcccArray() {
        return (List<GtsCccc>)readProperty(GTS_CCCC_ARRAY_PROPERTY);
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


    public void addToNetworkCountryArray(NetworkCountry obj) {
        addToManyTarget(NETWORK_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromNetworkCountryArray(NetworkCountry obj) {
        removeToManyTarget(NETWORK_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NetworkCountry> getNetworkCountryArray() {
        return (List<NetworkCountry>)readProperty(NETWORK_COUNTRY_ARRAY_PROPERTY);
    }


    public void addToProgramArray(Program obj) {
        addToManyTarget(PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromProgramArray(Program obj) {
        removeToManyTarget(PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Program> getProgramArray() {
        return (List<Program>)readProperty(PROGRAM_ARRAY_PROPERTY);
    }


    public void addToPtfDeploymentArray(PtfDeployment obj) {
        addToManyTarget(PTF_DEPLOYMENT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfDeploymentArray(PtfDeployment obj) {
        removeToManyTarget(PTF_DEPLOYMENT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeploymentArray() {
        return (List<PtfDeployment>)readProperty(PTF_DEPLOYMENT_ARRAY_PROPERTY);
    }


    public void addToRetrievalArray(Retrieval obj) {
        addToManyTarget(RETRIEVAL_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromRetrievalArray(Retrieval obj) {
        removeToManyTarget(RETRIEVAL_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Retrieval> getRetrievalArray() {
        return (List<Retrieval>)readProperty(RETRIEVAL_ARRAY_PROPERTY);
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


    public void addToUserGroupContactArray(UserGroupContact obj) {
        addToManyTarget(USER_GROUP_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromUserGroupContactArray(UserGroupContact obj) {
        removeToManyTarget(USER_GROUP_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupContact> getUserGroupContactArray() {
        return (List<UserGroupContact>)readProperty(USER_GROUP_CONTACT_ARRAY_PROPERTY);
    }


}
