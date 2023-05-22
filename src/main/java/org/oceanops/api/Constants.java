package org.oceanops.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class Constants {
    private Constants(){}

    public static final String MIME_TYPE_JSON = "application/json";
    public static final String MIME_TYPE_TEXT_HTML = "text/html";
    public static final String MIME_TYPE_TITLE = "content-type";
    
    public static final String RESOURCES_SERVER_URL_PROPERTY_NAME = "resourcesServerUrl"; 
    public static final String RESOURCES_SERVER_URL_PROPERTY_NAME_DEBUG = "resourcesServerUrlDebug"; 
    public static final String RESOURCES_SERVER_URL_PROPERTY_NAME_TEST = "resourcesServerUrlTest"; 
    public static final String URL_ROOT ="urlRoot";
    public static final String URL_ROOT_TEST ="urlRootTest";
    public static final String URL_PREFIX ="urlPrefix";
    public static final String PROP_DEBUG = "debug";  
    public static final String PROP_TEST = "test";  
    public static final String PROP_DB_CONFIG = "OCEANOPSModel.DBConfigName";  
	public static final String PROP_REQUESTTIMEOUT_DEBUG = "timeout_dev";
	public static final String PROP_REQUESTTIMEOUT_DEFAULT = "timeout_default";
    public static final Double INITIAL_SESSION_TIMEOUT_IN_SECONDS = 20.0; 
    public static final Double SESSION_TIMEOUT_IN_SECONDS = 240.0; 
    public static final String PARAMETER_THEME = "theme";  
    public static final String PARAMETER_PART = "part";
    
    public static final String URL_INSPECT_KEY = "{INSPECT_URL}";
    public static final String URL_INSPECT_BY_ID_KEY = "{INSPECT_BY_ID_URL}";
    public static final String URL_OCEANOPS_BOARD = "//www.ocean-ops.org/board";
    public static final String URL_OCEANOPS_TESTBOARD = "//www.ocean-ops.org/testboard";
    public static final String URL_INSPECT = "//www.ocean-ops.org/board/wa/InspectPtfModule?ref=";
    public static final String FUNCTION_INSPECT = "App.modules.inspectPtf";
    public static final String FUNCTION_INSPECT_BY_ID = "App.modules.inspectPtfById";
    public static final String URL_ID_ALLOCATION_API = "http://app-jcomm.vlandata.cls.fr:8080/idmanager/app/getid?";
    public static final String URL_ID_REQUEST_OCEANOPS_API = "https://www.ocean-ops.org/apiid/1/getid";
    
    public static final String MAIL_HOST ="mail.cls.fr";
    public static final String OCEANOPS_SUPPORT_EMAIL = "support@ocean-ops.org";
    public static final String OCEANOPS_METADATA_EMAIL = "metadata@ocean-ops.org";
    public static final String ARGO_NOTIF_EMAIL = "argo-notif@groups.wmo.int";
    public static final String AIC_EMAIL = "support@ocean-ops.org";
    public static final String OCEANOPS_DEV_EMAIL = "dev@ocean-ops.org";
    public static final String URL_WEBAPP_INSTANCES_STATISTICS = "http://web-jcomm.vlandata.cls.fr:1086/cgi-bin/WebObjects/JavaMonitor.woa/admin/info?type=app&name=OceanOPS-PROD&pw=NDRX2022!";
    public static final String REQUIRE_LOGIN_MSG = "<span class='sml-grey-text'>Requires logging in</span>";
    public static final String UNAUTHORIZED_EDIT_MSG = "Permission to edit was not granted";
    public static final String UNHANDLED_ERROR_MSG = "An unhandled error has occured. Administrators will be notified.";
    public static final String UNHANDLED_METHOD_MSG = "Request method must be either PATCH or GET";
    public static final String WRONG_ID_FORMAT_MSG = "The id of object to edit was not an integer";
    public static final String UNFOUND_OBJECT_MSG = "The object was not found";
    public static final String INVALID_FORMAT_MSG = " field is invalid: incorrect format.";
    public static final String MISSING_FIELD_MSG = " field is missing and mandatory.";
    public static final String NO_ENTITY_FOUND_MSG = " entity is mandatory and was not found for the given id";
    
    // DB ID
    public static final String ATLANTOS_MAP_TYPE_NAME = "jcommops-atlantic";
    public static final int ATLANTIC_OCEAN_BASIN_ID = 1000015;
    public static final int CHAIR_ROLE_ID = 3;
    public static final int PI_ROLE_ID = 5;
    public static final int PM_ROLE_ID = 62;
    public static final int DELAYED_MODE_ROLE_ID = 210;
    public static final int OM_ROLE_ID = 230;
    public static final int DEFAULT_OBS_SAMPLE_SIZE = 10000;
    public static final int IFREMER_GDAC_ID = 4;
    public static final int NRL_MRY_GDAC_ID = 6065;
    public static final int METEO_FRANCE_GDAC_ID = 5825;
    public static final int QC_USER_FEEDBACK_TYPE_ID = 2;
    public static final int ARGOS3_TEL_TYPE_ID = 92;
    public static final int ARGOS_TEL_TYPE_ID = 2;
    public static final int ARGO_DATA_ACCESS_TOPIC_ID = 1000022;
    public static final int PLATFORM_DIAGNOSTIC_PAGES_TOPIC_ID = 257;
    public static final int PTF_STATUS_PROBABLE_ID = 0;
    public static final int PTF_STATUS_CONFIRMED_ID = 1;
    public static final int PTF_STATUS_REGISTERED_ID = 2;
    public static final int PTF_STATUS_INACTIVE_ID = 4;
    public static final int PTF_STATUS_CLOSED_ID = 5;
    public static final int PTF_STATUS_OPERATIONAL_ID = 6;
    public static final int PTF_IMAGE_TYPE_ID = 47;
    public static final int DISCONTINUED_LINE_STATUS_ID = 50;
    public static final int RETRIEVAL_TO_RECOVER_STATUS_ID = 1;
    public static final int RETRIEVAL_RECOVERED_STATUS_ID = 2;
    public static final int APEX_PTF_MODEL_ID = 3;
    public static final int DATA_AQUISITION_CENTRE_DAC_TYPE_ID = 1;

    
    // LiveFeed Topics ID
    public static final int OCEANOPS_LIVEFEED_TOPIC_ID = 34;
    public static final int RELEASE_LIVEFEED_TOPIC_ID = 141;
    public static final int ARGO_LIVEFEED_TOPIC_ID = 35;
    public static final int DBCP_LIVEFEED_TOPIC_ID = 36;
    public static final int SOT_LIVEFEED_TOPIC_ID = 37;
    public static final int OCEANSITES_LIVEFEED_TOPIC_ID = 38;
    public static final int GOSHIP_LIVEFEED_TOPIC_ID = 39;
    public static final int GLOSS_LIVEFEED_TOPIC_ID = 40;
    public static final int CRUISE_LIVEFEED_TOPIC_ID = 241;

    public static final int ARGO_NOTIF_TOPIC_ID = 28;
    public static final int SOT_NOTIF_TOPIC_ID = 29;
    public static final int DBCP_NOTIF_TOPIC_ID = 30;
    public static final int GOSHIP_NOTIF_TOPIC_ID = 31;
    public static final int OCEANSITES_NOTIF_TOPIC_ID = 32;
    public static final int SENSOR_MODEL_REGISTRATION_NOTIF_ID = 541;
    public static final int SENSOR_MODEL_UPDATE_NOTIF_ID = 542;
    public static final int SHIP_REGISTRATION_NOTIF_ID = 521;
    public static final int DELETED_PTF_NOTIF_ID = 561;
    public static final int MISC_NOTIF_TOPIC_ID = 261;
	public static final int AGENCY_UPDATE_NOTIF_ID = 781;

    public static final int GOSHIP_ACTIVE_SURVEY_ID = 3;
    public static final Integer INTERNATIONAL_TOPIC_ID = 152;
	public static final Integer GEN_ARGO_PTF_MODEL_ID = 5003;
	public static final Integer GEN_DBCP_PTF_MODEL_ID = 21;
	public static final Integer GEN_SOT_PTF_MODEL_ID = 6017;
	public static final Integer GEN_OCEANSITES_PTF_MODEL_ID = 1000045;


	public static final Integer DRIFTING_BUOY_PTF_FAMILY_ID = 4;
	public static final Integer MOORED_BUOY_PTF_FAMILY_ID = 3;
	public static final Integer ICE_BUOY_PTF_FAMILY_ID = 22;
	
	public static final Integer OG_AREA_SITE_FAMILY_ID = 3;
	public static final Integer OG_LINE_SITE_FAMILY_ID = 2;
		
	public static final Integer GOSHIP_LINE_FAMILY_ID = 1;
	
	
	public static final Integer DRIFTER_PTF_FAMILY_ID = 4;
	
	public static final Integer OCEANGLIDERS_PTF_MODEL_NOTIF_ID = 321;
	public static final Integer AUTO_CLOSE_PTF_CONFLICT_DATES_ENDING_CAUSE = 18;
	public static final Integer PROGRAM_NOTIF_TOPIC_ID = 361;
	
	
	public static final Integer NETWORK_TYPE_PTF_CLASS_ID = 1;
	public static final Integer MAX_WEB_CONNECTIONS_PER_USER = 10;
	
	public static final Integer IRIDIUM_TELECOM_TYPE_ID = 23;
	public static final Integer GPS_TRACKING_SYSTEM_ID = 2;
	
	
	
    @SuppressWarnings("serial")
    public static final List<String> ROLES_ALLOWED_TO_EDIT_PTF = Collections.unmodifiableList(
                                                                                              new ArrayList<String>() {{
                                                                                                  add("Technical Coordinator");
                                                                                              }});
    public static final String KPI_COLOR_BLUE = "#6495ED";
	public static final String KPI_COLOR_RED = "#FF0000";
	public static final String KPI_COLOR_ORANGE = "#FF7E00";
	public static final String KPI_COLOR_GREEN = "#008000";
	public static final String KPI_COLOR_GREY = "#c3cfe2";
    
	public static final Integer ARGO_GLOBAL_NETWORK_ID = 1000180;
	public static ArrayList<Integer> authorizedCountryCommitmentsUserIds = new ArrayList<Integer>(Arrays.asList(11382,1004262));
	public static List<Integer> qcFeedbackBlacklistTypeIds = Arrays.asList(1,3,5);
	ArrayList<Integer> gliderWeblinkTopicIds = new ArrayList<Integer>(Arrays.asList(1000040,1000041,1000042,1000043));
	ArrayList<String> latestObsOriginTableNames = new ArrayList<String>(Arrays.asList("OBS","OBS_TSUNA_GTS_OSMC","OBS_GLIDERS_GTS_OSMC","OBS_ARGO_GDAC"));
	
	ArrayList<Integer> commitmentsNetworkIds = new ArrayList<Integer>(Arrays.asList(0,1,3,1000420,1000560));
	
	
	
	
    public enum Action {
		CREATE, EDIT, DELETE
	}
    
    public static final HashMap<String, String> cruiseColumnMap = new HashMap<String, String>(){{
    	put("ref", "Reference");
		put("name", "Name");
		put("status", "Status");
		put("type", "Type");
		put("class", "Class");
		put("shipName", "Ship");
		put("frequency", "Frequency");
		put("costMonth", "Cost month");
		put("costUnit", "Cost unit");
		put("shipstop", "Ship stop");
		put("flexible", "Flexible");
		put("embarkCapacity", "Embark capacity");
		put("storageCapacity", "Storage capacity");
		put("agency", "Agency");
		put("lineNames", "Lines");
		put("mobDate", "Mobilisation date");
		put("departureDate", "Departure date");
		put("operationDate", "Operation date");
		put("arrivalDate", "Arrival date");
		put("demobDate", "Demobilisation date");
		put("leadprogram", "Program");
		put("contact", "Contact");
		put("otherProgs", "Other programs");
		put("perfIndex", "Lines performance indexes");
		put("iioe2Id", "IIOE-2 ID");
		put("surveyName", "Survey");
    }};
    
    public static final HashMap<String, String> ptfColumnMap = new HashMap<String, String>(){{
		put("ref", "REF");
		put("name", "NAME");
		put("programName", "PROGRAM");
		put("country", "COUNTRY");
		put("age", "AGE");
		put("dataStatus", "DATA STATUS");
		put("status", "STATUS");
		put("model", "MODEL");
		put("type", "TYPE");
		put("family", "FAMILY");
		put("telNum", "TELECOM NUMBER");
		put("imei", "IMEI");
		put("telType", "TELECOM TYPE");
		put("telecomStartDate", "TELECOM START DATE");
		put("telecomEndDate", "TELECOM END DATE");
		put("masterProg", "MASTER NETWORK");
		put("networks", "NETWORKS");
		put("wmoId", "WMO");
		put("serialNo", "SERIAL NUMBER");
		put("internalId", "ID");
		put("cruiseRef", "CRUISE REFERENCE");
		put("cruiseName", "CRUISE NAME");
		put("lineFamily", "LINE FAMILY");
		put("deplCountryName", "DEPLOYMENT COUNTRY");
		put("eNotifDate", "E NOTIFICATION DATE");
		put("sensors", "SENSOR MODELS");
		put("sensorSerials", "SENSOR SERIALS");
		put("sensorHeights", "SENSOR HEIGHTS");
		put("sensorTypes", "SENSOR TYPES");
		put("sensorvariables", "SENSOR VARIABLES");
		put("sensorDataWeblinks", "SENSOR DATA WEBLINKS");
		put("sensorPrograms", "SENSOR PROGRAMS");
		put("score", "SCORE");
		put("deplType", "DEPLOYMENT TYPE");
		put("batteryName", "BATTERY");
		put("blacklisted", "BLACKLISTED");
		put("site", "SITE NAME");
		put("lastLocLat", "LAST LOCATION LAT");
		put("lastLocLon", "LAST LOCATION LON");
		put("lastLocDate", "LAST LOCATION DATE");
		put("deplLat", "DEPLOYMENT LAT");
		put("deplLon", "DEPLOYMENT LON");
		put("deplDate", "DEPLOYMENT DATE");
		put("deplTime", "DEPLOYMENT TIME");
		put("deplShip", "DEPLOYMENT SHIP");
		put("shipType", "SHIP TYPE");
		put("shipIMO", "SHIP IMO");
		put("shipCallSign", "SHIP CALL SIGN");
		put("shipICES", "SHIP ICES");
		put("shipCountry", "SHIP COUNTRY OF REGISTRATION");
		put("shipHideMetadata", "SHIP HIDE METADATA");
		put("shipType", "SHIP VESSEL TYPE");
		put("shipLength", "SHIP VESSEL LENGTH");
		put("shipBreadth", "SHIP BREADTH");
		put("shipFreeboard", "SHIP FREEBOARD");
		put("shipDraft", "SHIP DRAFT");
		put("shipCargoHeight", "SHIP CARGO HEIGHT");
		put("shipDistanceBridge", "SHIP DISTANCE BRIDGE BOW");
		put("shipMaxSpeed", "SHIP MAX SPEED");
		put("shippingCompany", "SHIPPING COMPANY");
		put("shipContactShoreName", "SHIP CONTACT SHORE NAME");
		put("shipContactShoreEmail", "SHIP CONTACT SHORE EMAIL");
		put("shipContactSeaEmail", "SHIP CONTACT SEA EMAIL");
		put("shipComment", "SHIP COMMENT");
		put("cycleTime", "CYCLE TIME");
		put("surfaceTime", "SURFACE TIME");
		put("driftPress", "DRIFT PRESSURE");
		put("profilePress", "PROFILE PRESSSURE");
		put("cruiseId", "CRUISE");
		put("cruiseLine", "LINE");
		put("lineType", "LINE TYPE");
		put("lineFamily", "LINE FAMILY");
		put("lineStatus", "LINE STATUS");
		put("fwCtrlBoard", "CONTROL BOARD");
		put("fwSoftVersion", "SOFTWARE VERSION");
		put("fwFormatRef", "SOFTWARE FORMAT");
		put("fwSoftwareName", "SOFTWARE NAME");
		put("fwSerialRef", "BOARD SERIAL");
		put("trackingSystemName", "TRACKING SYSTEM");
		put("drogue", "DROGUE");
		put("lastObsCycleNb", "LASTEST CYCLE NUMBER");
		put("iceDetect", "ICE DETECTION");
		put("dataPath", "DATA PATH");
		put("description", "DESCRIPTION");
		put("endDate", "END DATE");
		put("observingNetworks", "OBSERVING NETWORKS");
		put("retrievalStartDate", "RETRIEVAL START DATE");
		put("retrievalEndDate", "RETRIEVAL END DATE");
		put("retrievalShipName", "RETRIEVAL SHIP");
		put("retrievalCruise", "RETRIEVAL CRUISE");
		put("retrievalStatus", "RETRIEVAL STATUS");
		put("retrievalLat", "RETRIEVAL LATITUDE");
		put("retrievalLon", "RETRIEVAL LONGITUDE");
		put("manufacturer", "MANUFACTURER");
		put("maxMooringDepth", "WATER DEPTH");
		put("categories", "CATEGORY");
		put("wigosId", "WIGOS ID");
		put("hwBatchRef", "VERSION NUM MAIN DEVICE");
		put("classCategory", "CLASS CATEGORY");
		put("scheduleOfObservation", "SCHEDULE OF OBSERVATION");
		put("area", "AREA OF OPERATION");
		put("targetInspectionInterval", "TARGET INSPECTION INTERVAL");
		put("observingHeight", "OBSERVING HEIGHT");
		put("hwBatchRef", "VERSION NUMBER MAIN DEVICE");
		put("ancillaryModel", "MODEL ANCILLARY DEVICE");
		put("ancillarySerial", "SERIAL NUM ANCILLARY DEVICE");
		put("ancillaryVersion", "VERSION NUM ANCILLARY DEVICE");
		put("services", "MAINTENANCE ACTIVITY");
		put("telService", "TELECOM SERVICE");
		put("telFormat", "SHIP2SHORE DATAFORMAT");
		put("telLatency", "LATENCY");
		put("description", "STATION COMMENT");
		put("parameterMakeModel", "PARAMETER:MAKE_MODEL");
		put("sensorStartDate", "SENSOR START DATES");
		put("sensorStopDate", "SENSOR STOP DATES");
		put("sensorExposure", "SENSOR EXPOSURE");
		put("sensorLocation", "SENSOR LOCATION");
		put("sensorSideIndicator", "SENSOR SIDE INDICATOR");
		put("sensorUnit", "SENSOR UNIT");
		put("sensorHeightDeck", "SENSOR HEIGHT DECK");
		put("sensorDistanceBow", "SENSOR DISTANCE BOW");
		put("sensorDistanceCenter", "SENSOR DISTANCE CENTER");
		put("sensorCalibDate", "SENSOR CALIBRATION DATE");
		put("sensorNextCalibDate", "SENSOR NEXT CALIB DUE DATE");
		put("sensorOperatingStatus", "SENSOR OPERATING STATUS");
		put("sensorRange", "SENSOR RANGE");
		put("sensorPrecision", "SENSOR PRECISION");
		put("sensorResolution", "SENSOR RESOLUTION");
		put("sensorAccuracy", "SENSOR ACCURACY");
		put("sensorUncertainty", "SENSOR UNCERTAINTY");
		put("sensorSamplingPeriods", "SENSOR SAMPLING PERIODS");
		put("sensorTotalSamplingPeriods", "SENSOR TOTAL SAMPLING PERIODS");
		put("sensorDataProcessingMethods", "SENSOR DATA PROC METHODS");
		put("sensorServiceSchedules", "SENSOR SERVICE SCHEDULES");
		put("sensorComment", "SENSOR COMMENT");
		put("SOTserialNumber", "SERIAL NUM MAIN DEVICE");
		put("SOTmodel", "MODEL MAIN DEVICE");
		put("SOTdeplDate", "START DATE");
		put("SOTretrievalStartDate", "END DATE");
		put("SOTshipType", "SHIP VESSEL TYPE");
		put("SOTdeplShip", "SHIP NAME");
    }};
    
    public static final HashMap<String, String> cruisePathsMap = new HashMap<String, String>(){{
    	put("startdate", "Start date");
		put("enddate", "End date");
		put("endDuration", "Voyage duration");
		put("mobDuration", "Mobilisation duration");
		put("demobDuration", "Demobilisation duration");
		put("opDuration", "Operation (days from start)");
		put("ship,text", "Ship");
		put("type,text", "Type");
		put("countries", "Countries");
		put("recurrenceExceptions", "Recurrence exceptions");
		put("otherprograms", "Other programs");
		put("leadprogram,text", "Lead program");
		put("sensormodels", "Sensor models");
		put("departurePort,text", "Departure port");
		put("arrivalPort,text", "Arrival port");
		put("name", "Name");
		put("ref", "Expocode");
		put("iioe2id", "IIOE-2 ID");
		put("mfpid", "MFP ID");
		put("csrid", "CSR ID");
		put("projectname", "Project name");
		put("status,text", "Status");
		put("recurrenceInterval", "Recurrence frequency interval");
		put("recurrenceFrequency,text", "Recurrence frequency unit");
		put("cruiseclass,text", "Class");
		put("parentcruise,text", "Parent cruise");
		put("routeFlexible", "Route is flexible");
		put("routePending", "Route is pending");
		put("routePrivate", "Route is private");
		put("datesPending", "Dates are pending");
		put("shipStop", "Ship stops for deployment");
		put("description", "Description");
		put("performanceComment", "Performance comment");
		put("embarkCapacity", "Embark capacity");
		put("storageCapacity", "Storage capacity");
		put("costUnit", "Cost unit");
		put("costMonth", "Cost month");
		put("routeWkt", "Route WKT");
    }};
    
    public static final HashMap<String, String> viewNamesByThemeName = new HashMap<String, String>(){{
    	put("SOT", "V_SOT_METADATA");
    }};
    
    public static final HashMap<String, String> viewRefColumnNamesByThemeName = new HashMap<String, String>(){{
    	put("SOT", "SOT-ID");
    }};
}
