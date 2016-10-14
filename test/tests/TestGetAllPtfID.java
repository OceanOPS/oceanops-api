package tests;

import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;

import jcommops.db.orm.rest.Ptf;



public class TestGetAllPtfID {

	public static void main(String[] args) {
    	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
    	SelectQuery query = new SelectQuery(Ptf.class);
    	List<Ptf> platforms = context.performQuery(query);
//    	platforms.forEach(a->{ System.out.println("Ptf: "+a.getObjectId());});  // This produce a map <key, value>
    	
    	System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    	System.out.println("<platforms>");
    	platforms.forEach(a->{ System.out.println("<platform id="+Cayenne.longPKForObject(a)+">"+"</platform>");});
    	System.out.println("</platforms>");
   	
    	
//    	int n=platforms.size();
//    	System.out.println("Nombre de Ptf= "+n);
    	// last time tested 10/12/2016 WORKS!
    	runtime.shutdown();

	}

}
