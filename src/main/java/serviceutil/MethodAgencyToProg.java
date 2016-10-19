package serviceutil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.map.SQLResult;
import org.apache.cayenne.query.SQLTemplate;



import jcommops.db.orm.rest.Agency;
import jcommops.db.orm.rest.AgencyPtf;
import jcommops.db.orm.rest.Ptf;
import serviceentities.AgencyPrg;
import serviceentities.Platform;
import servicemethods.PlatformAccessor;

public class MethodAgencyToProg {
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	 ObjectContext context = runtime.getContext();
	public ArrayList<AgencyPrg> FindProgramAgencies (long id) {


		
		SQLTemplate query = new SQLTemplate(AgencyPtf.class, "select DISTINCT AGENCY_ID from Agency_PTF where PTF_ID="+id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("P");
	    query.setResult(resultDescriptor);
	    List<Integer> agenciesIdList = context.performQuery(query); 

	    ArrayList<AgencyPrg> Agency_list= new ArrayList<AgencyPrg>();
    	
    	Iterator<Integer> ID_itr = agenciesIdList.iterator();
    	
    	while (ID_itr.hasNext())
    	   {
    		int a= ID_itr.next();
    		AgencyPrg agnc= new AgencyPrg();
    		SQLTemplate query_ = new SQLTemplate(Agency.class, "select * from Agency  where ID="+a);
    		List<Agency> result = context.performQuery(query_);// une liste contenant une seul ligne
    		agnc.setId(a);
    		agnc.setDescription(result.get(0).getDescription());
    		agnc.setName(result.get(0).getName());
//    		System.out.println(agnc.getName());
    		agnc.setNameShort(result.get(0).getNameShort());
    		Agency_list.add(agnc);

    	   }
//		runtime.shutdown();
		return Agency_list;		
			
		
		
	}

}
