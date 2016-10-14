package servicemethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.Persistent;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;

import jcommops.db.orm.rest.Ptf;
import serviceentities.Platform;

public class PlatformAccessor {
	
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	ObjectContext context = runtime.getContext();
	
	
	public ArrayList<Platform> getAllPtfs () {
		
		SelectQuery query = new SelectQuery(Ptf.class);
    	List<Ptf> platforms = context.performQuery(query);
    	
    	ArrayList<Platform> ptfs_list= new ArrayList<Platform>();
    	
    	Iterator<Ptf> ptf_itr = platforms.iterator();
    	
    	while (ptf_itr.hasNext())
    	   {
    		Ptf a= ptf_itr.next();
    		Platform ptf= new Platform();
    		ptf.setId(Cayenne.longPKForObject(a));
    		ptfs_list.add(ptf);
    	   }
  
    	 
    	
		return ptfs_list;
		
		
	}
	
public Platform getPtfbyID (long id) {
		
		Ptf platform = Cayenne.objectForPK(context, Ptf.class, id);

    		Platform ptf= new Platform();
    		ptf.setId(Cayenne.longPKForObject(platform));
 	 
    		return ptf;

	}
	

}
