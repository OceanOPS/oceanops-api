package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfStatus;
import serviceentities.Platform;

public class TestGetPtfStatusID {

	public static void main(String[] args) {
	
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
			Ptf platform = Cayenne.objectForPK(context, Ptf.class, 501356); 	//Get the platform
			System.out.println("platform status ID= "+platform.getToPtfStatus().getRank());
			System.out.println("platform status ID= "+platform.getToPtfStatus());
			
//			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, platform.getToPtfStatus()); 	//Get the platform Status
			
    	
    		runtime.shutdown();

	

	}

}
