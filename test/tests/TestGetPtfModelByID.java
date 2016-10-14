package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;


import jcommops.db.orm.rest.PtfModel;

public class TestGetPtfModelByID {

	public static void main(String[] args) {
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	

//    	platforms.forEach(a->{ System.out.println("Ptf: "+a.getObjectId());});  // This produce a map <key, value>
    	PtfModel platformModel = Cayenne.objectForPK(context, PtfModel.class, 1203);
    	System.out.println("PtfREF: "+platformModel.getDescription()); 
    
//    	System.out.println("Ptf: "+platform.getToPtfModel().getName()); 
    	// last time tested 10/12/2016 WORKS!
    	runtime.shutdown();

	}

	}


