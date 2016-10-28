package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.orm.Ptf;

public class TestGetptfModelID {

	public static void main(String[] args) {
	
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
			Ptf platform = Cayenne.objectForPK(context, Ptf.class, 501356); 	//Get the platform
			System.out.println("platform status ID= "+platform.getToPtfModel().getObjectId());
//			System.out.println("platform status ID= "+platform.getToPtfModel());
			
			//REGEX to extract ID
			Pattern p = Pattern.compile("-?\\d+");
			Matcher m = p.matcher(platform.getToPtfModel().getObjectId().toString());
			while (m.find()) {
			  System.out.println(m.group());
			}
			
  			
    	
    		runtime.shutdown();

	

	}

}