package org.oceanops.api;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.BaseContext;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.ashwood.WeightedAshwoodEntitySorter;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.dba.PkGenerator;
import org.apache.cayenne.map.EntitySorter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.oceanops.api.db.OraclePkGeneratorCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class defining utility/helper functions and access to properties
 */
public class Utils {
	private static Logger logger = LoggerFactory.getLogger(Utils.class); 
	private static Properties properties;
	private static String projectName, projectVersion, rootUrl, programUrl, inspectPtfUrl, helpEditionDate,
			versionQualifier, entityPath;
	private static boolean betaVersion;
	public static final String CSV_SEPARATOR = ";";
	public static final DateTimeFormatter ISO_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
	public static final DateTimeFormatter ISO_DATE_NO_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static final Integer OCEANOPS_AGENCY_ID = 61;
	public static final Integer SOT_NETWORK_ID = 1000622;

	private Utils() {
	}

	/**
	 * Initializes the properties used by the API.
	 */
	public static void init() {
		if (Utils.properties == null) {
			properties = new Properties();
			try {
				properties.load(Utils.class.getClassLoader().getResourceAsStream("properties"));
				projectVersion = properties.getProperty("PROJECT_VERSION");
				projectName = properties.getProperty("PROJECT_NAME");
				rootUrl = properties.getProperty("ROOT_URL");
				programUrl = properties.getProperty("PROGRAM_URL");
				entityPath = properties.getProperty("ENTITY_PATH");
				inspectPtfUrl = properties.getProperty("INSPECT_PTF_URL");
				helpEditionDate = properties.getProperty("HELP_EDITION_DATE");
				betaVersion = projectVersion.substring(0, 1).equals("0") || projectVersion.endsWith("-SNAPSHOT")
						|| projectVersion.endsWith("beta") || projectVersion.endsWith("alpha");
				if (betaVersion)
					versionQualifier = "preview";
				if (betaVersion)
					rootUrl = rootUrl.replace(projectVersion, "preview");
			} catch (IOException e) {
				projectVersion = "X.Y";
				projectName = "ERROR";
			}
		}
	}

	public static String getEntityPath() {
		Utils.init();
		return entityPath;
	}

	public static String getProgramUrl() {
		Utils.init();
		return programUrl;
	}

	public static String getInspectPtfUrl() {
		Utils.init();
		return inspectPtfUrl;
	}

	public static String getProjectName() {
		Utils.init();
		return projectName;
	}

	public static String getProjectVersion() {
		Utils.init();
		return projectVersion;
	}

	public static String getRootUrl() {
		Utils.init();
		return rootUrl;
	}

	public static void setRootUrl(String rootUrl) {
		Utils.rootUrl = rootUrl;
	}

	public static String getHelpEditionDate() {

		Utils.init();
		return helpEditionDate;
	}

	public static void setHelpEditionDate(String buildDate) {
		Utils.helpEditionDate = buildDate;
	}

	public static boolean isBetaVersion() {
		Utils.init();
		return betaVersion;
	}

	public static void setBetaVersion(boolean betaVersion) {
		Utils.betaVersion = betaVersion;
	}

	public static String getVersionQualifier() {
		Utils.init();
		return versionQualifier;
	}

	public static void setVersionQualifier(String versionQualifier) {
		Utils.versionQualifier = versionQualifier;
	}

	/**
	 * Get an ISO 8601 string representation of the input date.
	 * @param localDateTime the input date
	 * @return an ISO 8601 representation string
	 */
	public static String GetIsoDate(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_FORMAT.format(localDateTime);
		return dateISO;
	}
	
	/**
	 * Get an ISO 8601 string representation (without the time part) of the input date.
	 * @param localDateTime the input date
	 * @return an ISO 8601 representation string (without the time part)
	 */
	public static String GetIsoDateNoTime(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_NO_TIME_FORMAT.format(localDateTime);
		return dateISO;
	}

	/**
	 * Parses an ISO 8601 string representation and return the corresponding {@link LocalDateTime}.
	 * @param s ISO 8601 string representation
	 * @return the corresponding {@link LocalDateTime} object
	 */
	public static LocalDateTime parseDate(String s) {
		return LocalDateTime.parse(s, ISO_DATE_FORMAT);
	}
	
	/**
	 * Convert a {@link LocalDateTime} to a {@link XMLGregorianCalendar}.
	 * @param localDateTime input date
	 * @return output {@link XMLGregorianCalendar} object
	 */
	public static XMLGregorianCalendar getDateAsXmlGregCal(LocalDateTime localDateTime){
		try {
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDateTime.getYear(),
					localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(),
					localDateTime.getSecond(), 0, 0);
			return date;
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	/**
	 * Get the thread Cayenne context
	 * @return a {@link ObjectContext} object
	 */
	public static ObjectContext getCayenneContext() {
		return BaseContext.getThreadObjectContext();
	}

	/**
	 * Generate and return a Cayenne Server Runtime
	 * @return a {@link ServerRuntime} object
	 */
	public static ServerRuntime getCayenneServerRuntime(String pathToCayenneConfFile){
		OraclePkGeneratorCustom pkgen = new OraclePkGeneratorCustom();
		pkgen.setPkCacheSize(1);

        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-OceanOPS-API.xml")
				.addModule(b -> b
					.bind(PkGenerator.class).toInstance(pkgen)
				)
				.addModule(b -> b
					.bind(EntitySorter.class).to(WeightedAshwoodEntitySorter.class))
                .build();
		// Controlling that modules are applied
		PkGenerator pk = cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().getPkGenerator();
		if(!(pk instanceof OraclePkGeneratorCustom)){
			logger.warn("PkGenerator is not an instance of OraclePkGeneratorCustom");
			logger.debug(pk.toString());
			logger.debug(cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().toString());
		}

		return cayenneRuntime;
	}

	/*
	 * Tells if a String represents a numeric value
	 * @param s The String instance to test.
	 * @return true if the String represents a numeric value, false if not or String is null.
	 */
	public static boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}


	/**
	 * ORDERS A JSONARRAY OG JSON OBJECTS BY PARAMETERS WITHIN EACH OBJECT; 
	 * FOR EACH PARAMETER, IF NOT FOUND IN OBJECT THEN TRYS GETTING THE TEXT OF AN OBJECT WITH THAT PARAMETER NAME
	 * EXAMPLE: if no STRING for "PROGRAM", then takes value of "text" in PROGRAM object.
	 * @param jsonArr The JSONArray to sort
	 * @param sortBy The ArrayList containing sorting fields
	 * @return A sorted JSONArray
	 */
	public static JSONArray sortJSONArray(JSONArray jsonArr, ArrayList<String> sortBy) {
		List<JSONObject> jsonValues = new ArrayList<JSONObject>();
		JSONArray sortedJsonArray = new JSONArray();

		// ORDERS A JSONARRAY OG JSON OBJECTS BY PARAMETERS WITHIN EACH OBJECT;
		// FOR EACH PARAMETER, IF NOT FOUND IN OBJECT THEN TRYS GETTING THE TEXT OF AN
		// OBJECT WITH THAT PARAMETER NAME
		// EXAMPLE: if no STRING for "PROGRAM", then takes value of "text" in PROGRAM
		// object.

		for (int i = 0; i < jsonArr.length(); i++) {
			jsonValues.add(jsonArr.getJSONObject(i));
		}
		Collections.sort(jsonValues, new Comparator<JSONObject>() {

			private int compareRecursive(JSONObject a, JSONObject b, int sortByDepth){
				String valA = new String();
				String valB = new String();
				if(sortByDepth == sortBy.size())
					return 0;
				try {
					valA = (String) a.get(sortBy.get(sortByDepth));
					valB = (String) b.get(sortBy.get(sortByDepth));
				} catch (ClassCastException e) {
					try {
						valA = ((JSONObject) a.get(sortBy.get(sortByDepth))).getString("text");
						valB = ((JSONObject) b.get(sortBy.get(sortByDepth))).getString("text");
					} catch (JSONException e1) {
						return 0;
					}
				} catch (JSONException e1) {
					return 0;
				}
				Integer res = null;
				if (Utils.isNumeric(valA) && Utils.isNumeric(valB)) {
					res = Double.valueOf(valA).compareTo(Double.valueOf(valB));
				}
				else{
					res = valA.compareTo(valB);
				}
				if(res != 0)
					return res;
				else
					return compareRecursive(a, b, sortByDepth + 1);
			}

			@Override
			public int compare(JSONObject a, JSONObject b) {
				return compareRecursive(a, b, 0);
			}
		});

		return sortedJsonArray.putAll(jsonValues);
	}
}
