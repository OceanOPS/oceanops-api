package tests;

import java.util.List;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.ObjectId;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.orm.Ptf;

public class TestGetAllPtfRef {

	public static void main(String[] args) {
    	//Starting ServerRuntime
		
    	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
    	SelectQuery query = new SelectQuery(Ptf.class);
    	List<Ptf> platforms = context.performQuery(query);
    	platforms.forEach(a->{ System.out.println("Ptf: "+a.getRef());}); 
    	// last time tested 10/12/2016 WORKS!
    	runtime.shutdown();
 

	}

}
