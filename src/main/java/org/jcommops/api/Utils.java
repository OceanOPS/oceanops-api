package org.jcommops.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.cayenne.configuration.server.ServerRuntime;

public class Utils {
	private static ServerRuntime cayenneRuntime;
	
	private Utils(){
		
	}
	
	public static void initCayenneRuntime(){
		if(Utils.cayenneRuntime == null){
			Utils.cayenneRuntime = new ServerRuntime("cayenne-project.xml");
		}
	}
	
	public static ServerRuntime getCayenneRuntime(){
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

}
