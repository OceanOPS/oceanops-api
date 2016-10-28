package tests;

import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.map.SQLResult;
import org.apache.cayenne.query.EJBQLQuery;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.orm.AgencyPtf;
import org.jcommops.api.orm.Ptf;


public class TestSelectQuery {

	public static void main(String[] args) {
	
		
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	int id=488912;
		
//    	SelectQuery query = new SelectQuery(AgencyPtf.class);
     
    			
//	    EJBQLQuery query_agency_id = new EJBQLQuery("select   AGENCY_ID from Agency_PTF where PTF_ID=488912");
	    
/** SQLTemplate select = new SQLTemplate(AgencyPtf.class, "select * from Agency_PTF where PTF_ID=488912"); 
	    List<AgencyPtf> result= context.performQuery(select);
	    System.out.println(result.get(0).getObjectId().toString());
	    System.out.println(result.get(0).getToAgency());
	    **/
	    
	    
    	SQLTemplate query = new SQLTemplate(AgencyPtf.class, "select DISTINCT AGENCY_ID from Agency_PTF where PTF_ID=488912");
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("P");
	    query.setResult(resultDescriptor);

	    // List of BigDecimals
	    List<Integer> ID = context.performQuery(query); 
	    System.out.println(ID.get(0));
	    
		runtime.shutdown();

	}


}
