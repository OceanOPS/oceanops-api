package org.jcommops.api;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.entities.SensorTypeEntity;
import org.jcommops.api.entities.VariableEntity;

public class Utils {
	private static ServerRuntime cayenneRuntime;
	private static Properties properties;
	private static String projectName, projectVersion, rootUrl, programUrl, inspectPtfUrl, helpEditionDate,
			versionQualifier;
	private static boolean betaVersion;
	public static final String CSV_SEPARATOR = ";";
	public static final DateTimeFormatter ISO_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
	public static final Integer JCOMMOPS_AGENCY_ID = 61;

	private Utils() {
	}

	public static void init() {
		if (Utils.properties == null) {
			properties = new Properties();
			try {
				properties.load(Utils.class.getClassLoader().getResourceAsStream("properties"));
				projectVersion = properties.getProperty("PROJECT_VERSION");
				projectName = properties.getProperty("PROJECT_NAME");
				rootUrl = properties.getProperty("ROOT_URL");
				programUrl = properties.getProperty("PROGRAM_URL");
				inspectPtfUrl = properties.getProperty("INSPECT_PTF_URL");
				helpEditionDate = properties.getProperty("HELP_EDITION_DATE");
				versionQualifier = properties.getProperty("VERSION_QUALIFIER");
				betaVersion = projectVersion.substring(0, 1).equals("0") || projectVersion.endsWith("-SNAPSHOT")
						|| versionQualifier.length() > 0;
				if (versionQualifier.length() == 0 && betaVersion)
					versionQualifier = "preview";
			} catch (IOException e) {
				projectVersion = "X.Y";
				projectName = "ERROR";
			}
		}
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

	public static void initCayenneRuntime() {
		if (Utils.cayenneRuntime == null) {
			Utils.cayenneRuntime = ServerRuntime.builder()
                    .addConfig("cayenne-project.xml")
                    .build();
		}
	}

	public static ServerRuntime getCayenneRuntime() {
		return Utils.cayenneRuntime;
	}

	public static long ConvertIDStringtoLong(String str) {
		// REGEX to extract ID
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(str);
		long ID = 0;
		while (m.find()) {
			ID = Integer.parseInt(m.group());
		}
		return ID;

	}

	public static String GetIsoDate(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_FORMAT.format(localDateTime);
		return dateISO;
	}

	public static String GetYear(LocalDateTime date) {
		return String.valueOf(date.getYear());
	}

	public static String GetVariablesListToString(ArrayList<VariableEntity> Arr) {
		// method used to access ArrayList to produce csv (case one to many)
		StringWriter strW = new StringWriter();
		try {
			Iterator<VariableEntity> var_itr = Arr.iterator();
			while (var_itr.hasNext()) {
				VariableEntity a = var_itr.next();
				strW.write("{" + a.getNameShort() + "}");
			}
		} catch (NullPointerException e) {
			strW.write("");
		}
		String str = strW.toString();
		return str;

	}

	public static String GetSensorTypesListToString(ArrayList<SensorTypeEntity> Arr) {
		// method used to access ArrayList to produce csv (case one to many)
		StringWriter strW = new StringWriter();
		try {
			Iterator<SensorTypeEntity> senstype_itr = Arr.iterator();
			while (senstype_itr.hasNext()) {
				SensorTypeEntity a = senstype_itr.next();
				strW.write("{" + a.getNameShort() + "}");
			}
		} catch (NullPointerException e) {
			strW.write("");
		}
		String str = strW.toString();
		return str;

	}

	public static String StrValueForSql(String str) {
		String SqlValueString = str.trim().replace(",", "','");
		return SqlValueString;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional
												// '-' and decimal.
	}

	public static boolean isInt(String str) {
		return str.matches("-?\\d+"); // match a number with optional '-'.
	}

	public static boolean CheckIntValueForSql(String str) {
		String[] strTab = str.trim().split(",");
		boolean test = false;
		int i = 0;
		while (i < strTab.length) {
			if (strTab[i].matches("^-?\\d+$")) {
				test = true;

			}
			i++;
		}

		return test;

	}

	public static String checkStringNull(String str) {
		return str == null ? "" : str;
	}

	public static String CheckInt(Integer l) {
		String str = " ";

		if (l == null) {

		} else {
			try {
				str = l.toString();
			} catch (NullPointerException e) {

			}
		}
		return str;
	}

	public static String Checklong(Long l) {
		String str = " ";

		if (l == null) {

		} else {
			try {
				str = l.toString();
			} catch (NullPointerException e) {

			}
		}
		return str;
	}

	public static String CheckBigDcm(BigDecimal l) {
		String str = " ";

		if (l == null) {

		} else {
			try {
				str = l.toString();
			} catch (NullPointerException e) {

			}
		}
		return str;
	}

	public static String CatchException(Object o) {
		String str = "";
		if (o instanceof NullPointerException) {
			str = "catched";
		}

		return str;

	}

	public static String basicSanitize(String value) {
		String tempValue = null;
		if (value != null) {
			tempValue = value.toUpperCase();
			if ((tempValue.contains("INSERT ") || tempValue.contains("DELETE ") || tempValue.contains("UPDATE ")
					|| tempValue.contains("DROP ") || tempValue.contains("DEFINE ") || tempValue.contains("ALTER ")
					|| tempValue.contains(";") || tempValue.contains("COMMIT"))) {
				tempValue = null;
			}
		}
		return tempValue;
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

	public static Date parseDate(String s) {
		return DatatypeConverter.parseDate(s).getTime();
	}

	public static String printDate(Date dt) {
		GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		c.setTime(dt);
		return DatatypeConverter.printDate(c);
	}
	
	public static XMLGregorianCalendar getDateAsXmlGregCal(LocalDateTime localDateTime){
		GregorianCalendar c = GregorianCalendar.from(localDateTime.atZone(ZoneId.systemDefault()));
		try {
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return date;
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}
}
