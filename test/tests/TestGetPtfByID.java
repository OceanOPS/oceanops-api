package tests;

import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;

import jcommops.db.orm.rest.Ptf;

public class TestGetPtfByID {

	public static void main(String[] args) {
    	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	

//    	platforms.forEach(a->{ System.out.println("Ptf: "+a.getObjectId());});  // This produce a map <key, value>
    	Ptf platform = Cayenne.objectForPK(context, Ptf.class, 501356);
    	System.out.println("PtfID: "+Cayenne.longPKForObject(platform)); 
    	System.out.println("PtfREF: "+platform.getRef()); 
    	System.out.println("Ptf_Model_Name: "+platform.getToPtfModel().getName()); 
    	System.out.println("PtfID: "+Cayenne.longPKForObject(platform.getToPtfModel()));
//    	System.out.println("Ptf: "+platform.getToPtfModel().getName()); 
    	// last time tested 10/12/2016 WORKS!
    	runtime.shutdown();

	}

		

	
}
