package org.oceanops.api;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.BaseContext;
import org.apache.cayenne.ObjectContext;

/**
 * Class defining utility/helper functions and access to properties
 */
public class Utils {
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
}
