package org.jcommops.api;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.entities.Variable;

public class Utils {
	private static ServerRuntime cayenneRuntime;

	private Utils() {

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
	
	public static Date GetIsoDate2(Date date) {
		String string = date.toString();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		Date date2 = null;
		try {
			date2 = format.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date2);
		return date;

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
		Iterator<Variable> var_itr = Arr.iterator();
		while (var_itr.hasNext()) {
			Variable a = var_itr.next();
			strW.write("{variable (id=" + a.getId() + ") :" + a.getNameShort() + "} ");
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
		while (i< strTab.length){
		if (strTab[i].matches("^-?\\d+$")) {
			test = true;
			
		}
		i++;
		}

		return test;

	}
	
	

}
