package org.oceanops.api;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.dba.JdbcAdapter;

public class Utils {
	private static ServerRuntime cayenneRuntime;
	private static ObjectContext cayenneContext;
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

	public static void initCayenneRuntime() throws NamingException{
		if (Utils.cayenneRuntime == null) {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/OceanOPSDB");
			
			Utils.cayenneRuntime = ServerRuntime.builder()
                    .addConfig("cayenne-OceanOPS-API.xml")
					.dataSource(dataSource)
                    .build();
			
			JdbcAdapter adapter = (JdbcAdapter)Utils.cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter();
			OraclePkGeneratorCustom pkgen = new OraclePkGeneratorCustom(adapter);
			pkgen.setPkCacheSize(1);
			Utils.cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().setPkGenerator(pkgen);
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
	
	public static String GetIsoDateNoTime(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_NO_TIME_FORMAT.format(localDateTime);
		return dateISO;
	}

	public static String GetYear(LocalDateTime date) {
		return String.valueOf(date.getYear());
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

	public static LocalDateTime parseDate(String s) {
		return LocalDateTime.parse(s, ISO_DATE_FORMAT);
	}

	public static String printDate(LocalDateTime dt) {
		GregorianCalendar c = GregorianCalendar.from(dt.atZone(ZoneId.systemDefault()));
		return DatatypeConverter.printDate(c);
	}
	
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

	public static ObjectContext getCayenneContext() {
		if(Utils.cayenneContext == null)
			Utils.cayenneContext = Utils.getCayenneRuntime().newContext();
		return Utils.cayenneContext;
	}
	
	/**
	 * Formats a number to string while adding a tailing 0-padding
	 * @param decimals	total number of decimals
	 * @param number	the original number to format
	 * @return	then umber formatted as a String
	 */
	public static String formatNumber(int decimals, double number) {
	    
	    NumberFormat formatter = NumberFormat.getInstance(Locale.US);
	    formatter.setMinimumFractionDigits(decimals);
	    formatter.setMaximumFractionDigits(decimals);
	    return formatter.format(number);
	}
}
