package servicemethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.relation.Role;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;

import jcommops.db.orm.rest.Country;
import jcommops.db.orm.rest.MasterProg;
import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfDeployment;
import jcommops.db.orm.rest.PtfFamily;
import jcommops.db.orm.rest.PtfLoc;
import jcommops.db.orm.rest.PtfModel;
import jcommops.db.orm.rest.PtfStatus;
import jcommops.db.orm.rest.PtfType;
import serviceentities.AgencyPrg;
import serviceentities.ContactPrg;
import serviceentities.CountryPtf;
import serviceentities.MasterProgram;
import serviceentities.Platform;
import serviceentities.PlatformDeploy;
import serviceentities.PlatformFamily;
import serviceentities.PlatformLastLoc;
import serviceentities.PlatformModel;
import serviceentities.PlatformStatus;
import serviceentities.PlatformType;
import serviceentities.ProgramPtf;
import serviceentities.RoleContact;
import serviceentities.Variable;
import serviceutil.MethodesUtiles;
import serviceutil.MethodsAssociativeTables;

public class PlatformAccessor {
	
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	 ObjectContext context = runtime.getContext();
	
	
	public ArrayList<Platform> getAllPtfs () { //"PRINCIPAL" List of Platforms
		
		SelectQuery query = new SelectQuery(Ptf.class);
    	List<Ptf> platforms = context.performQuery(query);
    	
    	ArrayList<Platform> ptfs_list= new ArrayList<Platform>();
    	
    	Iterator<Ptf> ptf_itr = platforms.iterator();
    	
    	while (ptf_itr.hasNext())
    	   {
    		Ptf a= ptf_itr.next();
    		Platform ptf= new Platform();
    		ptf.setId(Cayenne.longPKForObject(a));
    		ptf.setJcommpsRef(a.getRef());
    		ptfs_list.add(ptf);
    	   }
//		runtime.shutdown();
		return ptfs_list;	

	}
	
	
	
public Platform getPtfbyID (long id) {//Platform's details by ID
		
			Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); //Get the platform
//			Crate and select the attributs and or object to  "platform"
    		Platform ptf= new Platform();
    		try {
    			ptf.setId(id);
        		ptf.setJcommpsRef(platform.getRef());
    			}
    		catch (NullPointerException n) {
    			ptf.setId(id);
    			ptf.setJcommpsRef(id+" IS NOT A VALID JCOMMOPS REFERENCED PLATFORM ID !");
    			}
//			Methodes
    		MethodesUtiles mu =new MethodesUtiles();
    		MethodsAssociativeTables MAT= new MethodsAssociativeTables();
//			Ajouter des objects imbriqués un par un
    		    		
    		// 1) embedded object"PlatformStatus" 	
    		PlatformStatus ptfs = new PlatformStatus();
    		// 2) embedded object"PlatformModel" 
    		PlatformModel ptfm = new PlatformModel();
    		// 3) embedded object"PlatformFamily" 
    		PlatformFamily ptff = new PlatformFamily();
    		// 4) embedded object"PlatformFamily" 
    		PlatformType ptft = new PlatformType();
    		// 5) embedded object"PlatformLastLoc" 
    		PlatformLastLoc ptfll = new PlatformLastLoc();
    		// 6) embedded object"PlatformDeploy" 
    		PlatformDeploy ptfdpl = new PlatformDeploy();
     		// 7) embedded object"Program" 
    		ProgramPtf prgm = new ProgramPtf();
    		// 7.1) embedded object"Agency" 
    		AgencyPrg agency = new AgencyPrg();
    		// 8) embedded object"Country"
    		CountryPtf country= new CountryPtf();
    		// 9) embedded object"Master Programme" 
    	    MasterProgram masterprg = new MasterProgram();
    	    //10) embedded object"Contact"
    		//10.1) embedded object"Role"
    	    //10.2) embedded object"Role"
    
    		
    		
    		try {
    			ptf.getEndingDate();
    			// 1) embedded object"PlatformStatus"
    			String stringIDptfs= platform.getToPtfStatus().getObjectId().toString();
        		PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, mu.ConvertIDStringtoLong(stringIDptfs));//Get the platform Status by its PK
    			ptfs.setId(Cayenne.longPKForObject(platformstatus));
    			ptfs.setStatus(platformstatus.getDescription());
    			//Ajouter à platform
    			ptf.setPtfStatus(ptfs);
    			
    			// 2) embedded object"PlatformModel" 
    			String stringIDptfm= platform.getToPtfModel().getObjectId().toString();
    			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class, mu.ConvertIDStringtoLong(stringIDptfm));//Get the platform Model by its PK
    			ptfm.setId(Cayenne.longPKForObject(platformmodel));
    			ptfm.setNameShort(platformmodel.getNameShort());
    			ptfm.setName(platformmodel.getName());
    			ptfm.setDescription(platformmodel.getDescription());
    			//Ajouter à platform
    			ptf.setPtfModel(ptfm);
    			
    			// 3) embedded object"PlatformType" 
    			PtfModel platformm = Cayenne.objectForPK(context, PtfModel.class, Cayenne.longPKForObject(platformmodel));
    			String stringIDptft= platformm.getToPtfType().getObjectId().toString();
    			PtfType platformtype = Cayenne.objectForPK(context, PtfType.class, mu.ConvertIDStringtoLong(stringIDptft));//Get the platform Type by its PK
    			ptft.setId(Cayenne.longPKForObject(platformtype));
    			ptft.setNameShort(platformtype.getNameShort());
    			ptft.setName(platformtype.getName());
    			ptft.setDescription(platformtype.getDescription());
    			//Ajouter à platform
    			ptf.setPtfType(ptft);
    			
    			// 4) embedded object"PlatformFamily"
    			PtfType platformt = Cayenne.objectForPK(context, PtfType.class, Cayenne.longPKForObject(platformtype));
    			String stringIDptff= platformt.getToPtfFamily().getObjectId().toString();
    			PtfFamily platformfamily = Cayenne.objectForPK(context, PtfFamily.class, mu.ConvertIDStringtoLong(stringIDptff));//Get the platform Family by its PK
    			ptff.setId(Cayenne.longPKForObject(platformfamily));
    			ptff.setNameShort(platformfamily.getNameShort());
    			ptff.setName(platformfamily.getName());
    			ptff.setDescription(platformfamily.getDescription());
    			ptf.setPtfFamily(ptff);
    			
    			// 5) embedded object"PlatformLastLoc" 
//        		PlatformLastLoc ptfll = new PlatformLastLoc();
        		String stringIDptfll= platform.getToPtfLoc().getObjectId().toString();
        		PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class, mu.ConvertIDStringtoLong(stringIDptfll));//Get the platform Last Location by its PK
        		ptfll.setId(Cayenne.longPKForObject(platformlastloc));
        		ptfll.setLat(platformlastloc.getLat());
        		ptfll.setLon(platformlastloc.getLon());
        		ptfll.setLastLocationDate(platformlastloc.getLocDate());
    			//Ajouter à platform
    			ptf.setLastLocation(ptfll);
        		
        		
        		// 6) embedded object"PlatformDeploy" 
//        		PlatformDeploy ptfdpl = new PlatformDeploy();
    			String stringIDptfdpl= platform.getToPtfDeployment().getObjectId().toString();
        		PtfDeployment platformDeploy = Cayenne.objectForPK(context, PtfDeployment.class, mu.ConvertIDStringtoLong(stringIDptfdpl));//Get the platform Deployment by its PK
        		ptfdpl.setId(Cayenne.longPKForObject(platformDeploy));
        		ptfdpl.setDeployementDate(platformDeploy.getDeplDate());
        		ptf.setDeployement(ptfdpl);

        		
        		// 7) embedded object"Program" 
//        		Program prgm = new Program();
        		
        	    String stringIDprg= platform.getToProgram().getObjectId().toString();
        	    jcommops.db.orm.rest.Program ptfprogram= Cayenne.objectForPK(context, jcommops.db.orm.rest.Program.class, mu.ConvertIDStringtoLong(stringIDprg));//Get the platform Program by its PK
        	    prgm.setActive(ptfprogram.getActive());
          	    prgm.setDescription(ptfprogram.getDescription());
        	    prgm.setId(Cayenne.longPKForObject(ptfprogram));
        	    prgm.setName(ptfprogram.getName());	
        		// 7.1) l'objet "sous-imbriqué" "Agency" (to program)
        	    prgm.setAgencies(MAT.FindProgramAgencies(Cayenne.longPKForObject(ptfprogram)));// 
        	    ptf.setProgram(prgm);  
        		
        		// 8) embedded object"Country" 
//				CountryPtf country= new CountryPtf();
        	    String stringIDcountry= ptfprogram.getToCountry().getObjectId().toString();
        	    Country ptfcountry= Cayenne.objectForPK(context, Country.class, mu.ConvertIDStringtoLong(stringIDcountry));//Get the platform country by its PK
        	    country.setId(Cayenne.longPKForObject(ptfcountry));
        	    country.setName(ptfcountry.getName());
        	    country.setIsoCode2(ptfcountry.getCode2());
        	    country.setIsoCode3(ptfcountry.getCode3());
        	    ptf.setCountry(country);  
//        	    System.out.println(ptfcountry.getName());
        	    
        		// 9) embedded object"Master Programme" 
//				CountryPtf country= new CountryPtf();
        	    String stringIDmasterprg= ptfprogram.getToMasterProg().getObjectId().toString();
        	    MasterProg ptfmastprg= Cayenne.objectForPK(context, MasterProg.class, mu.ConvertIDStringtoLong(stringIDmasterprg));//Get the platform country by its PK
        	    masterprg.setId(Cayenne.longPKForObject(ptfmastprg));
        	    masterprg.setName(ptfmastprg.getName());
        	    masterprg.setNameShort(ptfmastprg.getNameShort());
        	    ptf.setMasterProgramme(masterprg);  
        	    
        	    
        	    //10) embedded object"Contacts"
        	    ArrayList <ContactPrg> contacts= new  ArrayList <ContactPrg>();
        		//10.1) embedded object"Role"
        	    //10.2) embedded object"Agency"
        	    contacts= MAT.FindProgramContacts(Cayenne.longPKForObject(ptfprogram));//
        	    ptf.setContacts(contacts);  
        	    
        	    
        	    //11) embedded object"Variables"
        	    ArrayList <Variable> variables= new  ArrayList <Variable>();
        	    variables=MAT.FindPtfVariables(id); //for reminder here id is ptf id
        	    ptf.setVariables(variables);  
        	    			
    			}
    		catch (NullPointerException n) {

    			}
    		    	
    		
    		
    		
//    		runtime.shutdown();
    		return ptf;
    		

	}
	

}
