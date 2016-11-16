package org.jcommops.api;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.entities.AgencyPrg;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.entities.Variable;

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
	
	public static String GetVariablesListToString(ArrayList<Variable> Arr) {
		//method used  to access ArrayList to produce csv (case one to many)
		StringWriter strW  = new StringWriter() ;
		 Iterator<Variable> var_itr = Arr.iterator();
				while (var_itr.hasNext()) {
				Variable a = var_itr.next();
								strW.write("{variable (id="+a.getId()+") :"+a.getNameShort()+"} ");				
				}
			String str = strW.toString();
		return str;

	}
	

}
