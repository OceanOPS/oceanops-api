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
import jcommops.db.orm.rest.Contact;
import jcommops.db.orm.rest.ProgramContact;
import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfDeployment;
import jcommops.db.orm.rest.PtfVariable;
import jcommops.db.orm.rest.Role;
import serviceentities.AgencyPrg;
import serviceentities.ContactPrg;
import serviceentities.Platform;
import serviceentities.RoleContact;
import serviceentities.Variable;
import servicemethods.PlatformAccessor;

public class MethodsAssociativeTables {
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	 ObjectContext context = runtime.getContext();
	public ArrayList<AgencyPrg> FindProgramAgencies (long prgm_id) {
		SQLTemplate query1 = new SQLTemplate(AgencyPtf.class, "select DISTINCT AGENCY_ID ag_id from Program_Agency where Program_ID="+prgm_id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("ag_id");
	    query1.setResult(resultDescriptor);
	    List<Integer> agenciesIdList = context.performQuery(query1); 

	    ArrayList<AgencyPrg> Agency_list= new ArrayList<AgencyPrg>();
    	
    	Iterator<Integer> ID_itr = agenciesIdList.iterator();
    	
    	while (ID_itr.hasNext())
    	   {
    		int a= ID_itr.next();
    		AgencyPrg agnc= new AgencyPrg();
    		SQLTemplate query_1 = new SQLTemplate(Agency.class, "select * from Agency  where ID="+a);
    		List<Agency> result = context.performQuery(query_1);// une liste contenant une seul ligne
    		agnc.setId(a);
    		agnc.setDescription(result.get(0).getDescription());
    		agnc.setName(result.get(0).getName());
//    		System.out.println(agnc.getName());
    		agnc.setNameShort(result.get(0).getNameShort());
    		Agency_list.add(agnc);

    	   }
//    	runtime.shutdown();
		return Agency_list;	
	}
	
	public ArrayList<ContactPrg> FindProgramContacts (long prgm_id) {
		SQLTemplate query2 = new SQLTemplate(ProgramContact.class, "select DISTINCT CONTACT_ID cnt_id from Program_Contact where Program_ID="+prgm_id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("cnt_id");
	    query2.setResult(resultDescriptor);
	    List<Integer> contactsIdList = context.performQuery(query2); 

	    ArrayList<ContactPrg> Contact_list= new ArrayList<ContactPrg>();
    	
    	Iterator<Integer> ID_itr = contactsIdList.iterator();
    	
    	while (ID_itr.hasNext())
    	   {
    		int a= ID_itr.next();
    		ContactPrg cntct= new ContactPrg();
    		SQLTemplate query_2 = new SQLTemplate(Contact.class, "select * from Contact  where ID="+a);
    		List<Contact> result = context.performQuery(query_2);// une liste contenant une seul ligne
    		cntct.setId(1);
    		cntct.setFirstName(result.get(0).getFirstName());
    		cntct.setLastName(result.get(0).getLastName());
    		cntct.setEmail(result.get(0).getEmail());
//    		try { cntct.setRoles(FindContactRoles(cntct.getId()));} catch (NullPointerException n) { }
//    		try { cntct.setAgencies(FindContactAgencies(cntct.getId()));} catch (NullPointerException n) { }
    		
    	

    		Contact_list.add(cntct);
    	   }
//    	runtime.shutdown();
		return Contact_list;	
	}

	public ArrayList<RoleContact> FindContactRoles (long cntct_id) {
		SQLTemplate query3 = new SQLTemplate(ProgramContact.class, "select DISTINCT Role_ID rl_id from Program_Contact where Contact_ID="+cntct_id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("rl_id");
	    query3.setResult(resultDescriptor);
	    List<Integer> roleIdList = context.performQuery(query3); 

	    ArrayList<RoleContact> Role_list= new ArrayList<RoleContact>();
    	
    	Iterator<Integer> ID_itr = roleIdList.iterator();
    	
    	while (ID_itr.hasNext())
    	   {
    		int a= ID_itr.next();
    		RoleContact rle = new RoleContact();
    		SQLTemplate query_3 = new SQLTemplate(Role.class, "select * from Role  where ID="+a);
    		List<Role> result = context.performQuery(query_3);// une liste contenant une seul ligne
    		rle.setId(a);
    		rle.setName(result.get(0).getName());
    		rle.setNameShort(result.get(0).getNameShort());
    		Role_list.add(rle);
    	   }
//    	runtime.shutdown();
		return Role_list;	
	}
	

	public ArrayList<AgencyPrg> FindContactAgencies(long cntct_id) {
		SQLTemplate query4 = new SQLTemplate(Contact.class, "select DISTINCT AGENCY_ID ag_id2 from contact where ID="+cntct_id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("ag_id2");
	    query4.setResult(resultDescriptor);
	    List<Integer> agenciesIdList = context.performQuery(query4); 

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
    		agnc.setNameShort(result.get(0).getNameShort());
    		Agency_list.add(agnc);

    	   }
//    	runtime.shutdown();
		return Agency_list;	
	}
	
	
	public ArrayList<Variable> FindPtfVariables(long ptf_id) {
		SQLTemplate query5 = new SQLTemplate(PtfVariable.class, "select variable_ID from ptf_variable where  PTF_ID="+ptf_id);
	    SQLResult resultDescriptor = new SQLResult();
	    resultDescriptor.addColumnResult("P");
	    query5.setResult(resultDescriptor);
	    List<Integer> variablesIdList = context.performQuery(query5); 


	    ArrayList<Variable> Variable_list= new ArrayList<Variable>();
    	
    	Iterator<Integer> ID_itr = variablesIdList.iterator();
    	
    	while (ID_itr.hasNext())
    	   {
    		int a= ID_itr.next();
    		Variable var= new Variable();
    		SQLTemplate query_5 = new SQLTemplate(jcommops.db.orm.rest.Variable.class, "select * from variable  where ID="+a);
    		List<jcommops.db.orm.rest.Variable> result = context.performQuery(query_5);// une liste contenant une seul ligne
    		var.setId(a);
    		var.setDescription(result.get(0).getDescription());
    		var.setName(result.get(0).getName());
    		var.setNameShort(result.get(0).getNameShort());
    		Variable_list.add(var);

    	   }
//    	runtime.shutdown();
		return Variable_list;	
	}
	

	


}
