package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.accessors.MethodsAssociativeTables;
import org.jcommops.api.orm.Ptf;

public class TestMethodAgencyPrg {
	public static void main(String[] args) {
		
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
    	MethodsAssociativeTables mp = new MethodsAssociativeTables();
    	
			mp.FindProgramAgencies(488912);
			
//			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, platform.getToPtfStatus()); 	//Get the platform Status
			
    	
    		runtime.shutdown();

	

	}

}