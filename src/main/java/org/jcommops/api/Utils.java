package org.jcommops.api;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.entities.SensorType;
import org.jcommops.api.entities.Variable;

public class Utils {
	private static ServerRuntime cayenneRuntime;
	private static Properties properties;
	private static String projectName, projectVersion;

	private Utils() {
	}
	
	public static void init() {
		if(Utils.properties == null){
			properties = new Properties();
			try {
				properties.load(Utils.class.getClassLoader().getResourceAsStream("properties"));
				projectVersion = properties.getProperty("PROJECT_VERSION");
				projectName = properties.getProperty("PROJECT_NAME");
			} catch (IOException e) {
				projectVersion = "X.Y";
				projectName = "ERROR";
			}
		}
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
			Utils.cayenneRuntime = new ServerRuntime("cayenne-project.xml");
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

	public static String GetIsoDate(Date date) {
		String dateISO = null;
		DateFormat formatISO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		dateISO = formatISO.format(date);
		return dateISO;
	}

	public static String GetYear(Date date) {
		String year = null;
		DateFormat formatISO = new SimpleDateFormat("yyyy");
		year = formatISO.format(date);
		return year;
	}

	public static String GetVariablesListToString(ArrayList<Variable> Arr) {
		// method used to access ArrayList to produce csv (case one to many)
		StringWriter strW = new StringWriter();
		try {
			Iterator<Variable> var_itr = Arr.iterator();
			while (var_itr.hasNext()) {
				Variable a = var_itr.next();
				strW.write("{" + a.getNameShort() + "}");
			}
		} catch (NullPointerException e) {
			strW.write("");
		}
		String str = strW.toString();
		return str;

	}

	public static String GetSensorTypesListToString(ArrayList<SensorType> Arr) {
		// method used to access ArrayList to produce csv (case one to many)
		StringWriter strW = new StringWriter();
		try {
			Iterator<SensorType> senstype_itr = Arr.iterator();
			while (senstype_itr.hasNext()) {
				SensorType a = senstype_itr.next();
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

	public static String CheckStringNull(String str_) {
		String str = " ";
		try {
			str = str_;
			if (str_ == null) {
				str = " ";
			}
		} catch (NullPointerException e) {
			str = " ";
		}
		return str;
	}

	public static String CheckInt(Integer l) {
		String str = " ";

		if (l == null) {

		} else {
			try {
				str =  l.toString();
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
	
	
	public static String CatchException(Object o){
		String str="";
		if (o instanceof NullPointerException){
			str="catched";
		}
		
		return str;
		
	}

}
