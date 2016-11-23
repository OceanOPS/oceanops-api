package tests;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.Utils;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.orm.Ptf;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestBrouillon {

	public static void main(String[] args)  {
    
    	
PlatformAccessor m= new PlatformAccessor();
    	Platform ptfm = m.getPtfbyID(1002922);
System.out.println(Utils.CatchException(ptfm.getTelecom().getId())+ " yes");
	
		
		
		

	}

}
