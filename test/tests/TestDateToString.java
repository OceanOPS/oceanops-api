package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

import jcommops.db.orm.rest.PtfDeployment;

public class TestDateToString {

	public static void main(String[] args) {
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
 
    	
    	PtfDeployment PlatformDeploy = Cayenne.objectForPK(context, PtfDeployment.class, 44318);//Get the platform Deployment by its PK
  
    	 
    	 DateFormat formatISO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); 
    	 String dateISO = formatISO.format(PlatformDeploy.getDeplDate());
    	 System.out.println(dateISO);
 
	 
	    runtime.shutdown();
		
	}

}
