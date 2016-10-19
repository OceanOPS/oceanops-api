package servicemethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import serviceutil.MethodAgencyToProg;
import serviceutil.MethodesUtiles;

public class PlatformAccessor {
	
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	 ObjectContext context = runtime.getContext();
	
	
	public ArrayList<Platform> getAllPtfs () { //Liste "OFFICIELLE" des Plateformes
		
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
	
	
	
public Platform getPtfbyID (long id) {//Détail d'une Platforme à partir de son ID
		
			Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); //Get the platform
//			Créer  et ajouter les attributs selectionnés de l'object "platform"
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
    		MethodAgencyToProg map= new MethodAgencyToProg();
//			Ajouter des objects imbriqués un par un
    		    		
    		// 1) l'objet imbriqué "PlatformStatus" 	
    		PlatformStatus ptfs = new PlatformStatus();
    		// 2) l'objet imbriqué "PlatformModel" 
    		PlatformModel ptfm = new PlatformModel();
    		// 3) l'objet imbriqué "PlatformFamily" 
    		PlatformFamily ptff = new PlatformFamily();
    		// 4) l'objet imbriqué "PlatformFamily" 
    		PlatformType ptft = new PlatformType();
    		// 5) l'objet imbriqué "PlatformLastLoc" 
    		PlatformLastLoc ptfll = new PlatformLastLoc();
    		// 6) l'objet imbriqué "PlatformDeploy" 
    		PlatformDeploy ptfdpl = new PlatformDeploy();
     		// 7) l'objet imbriqué "Program" 
    		ProgramPtf prgm = new ProgramPtf();
    		// 8) l'objet imbriqué "Agency" 
    		AgencyPrg agency = new AgencyPrg();
    		// 9) l'objet imbriqué "Country"
    		CountryPtf country= new CountryPtf();
    		
    		
    		try {
    			// 1) l'objet imbriqué "PlatformStatus"
    			String stringIDptfs= platform.getToPtfStatus().getObjectId().toString();
        		PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, mu.ConvertIDStringtoLong(stringIDptfs));//Get the platform Status by its PK
    			ptfs.setId(Cayenne.longPKForObject(platformstatus));
    			ptfs.setStatus(platformstatus.getDescription());
    			//Ajouter à platform
    			ptf.setPtfStatus(ptfs);
    			
    			// 2) l'objet imbriqué "PlatformModel" 
    			String stringIDptfm= platform.getToPtfModel().getObjectId().toString();
    			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class, mu.ConvertIDStringtoLong(stringIDptfm));//Get the platform Model by its PK
    			ptfm.setId(Cayenne.longPKForObject(platformmodel));
    			ptfm.setNameShort(platformmodel.getNameShort());
    			ptfm.setName(platformmodel.getName());
    			ptfm.setDescription(platformmodel.getDescription());
    			//Ajouter à platform
    			ptf.setPtfModel(ptfm);
    			
    			// 3) l'objet imbriqué "PlatformType" 
    			PtfModel platformm = Cayenne.objectForPK(context, PtfModel.class, Cayenne.longPKForObject(platformmodel));
    			String stringIDptft= platformm.getToPtfType().getObjectId().toString();
    			PtfType platformtype = Cayenne.objectForPK(context, PtfType.class, mu.ConvertIDStringtoLong(stringIDptft));//Get the platform Type by its PK
    			ptft.setId(Cayenne.longPKForObject(platformtype));
    			ptft.setNameShort(platformtype.getNameShort());
    			ptft.setName(platformtype.getName());
    			ptft.setDescription(platformtype.getDescription());
    			//Ajouter à platform
    			ptf.setPtfType(ptft);
    			
    			// 4) l'objet imbriqué "PlatformFamily"
    			PtfType platformt = Cayenne.objectForPK(context, PtfType.class, Cayenne.longPKForObject(platformtype));
    			String stringIDptff= platformt.getToPtfFamily().getObjectId().toString();
    			PtfFamily platformfamily = Cayenne.objectForPK(context, PtfFamily.class, mu.ConvertIDStringtoLong(stringIDptff));//Get the platform Family by its PK
    			ptff.setId(Cayenne.longPKForObject(platformfamily));
    			ptff.setNameShort(platformfamily.getNameShort());
    			ptff.setName(platformfamily.getName());
    			ptff.setDescription(platformfamily.getDescription());
    			ptf.setPtfFamily(ptff);
    			
    			// 5) l'objet imbriqué "PlatformLastLoc" 
//        		PlatformLastLoc ptfll = new PlatformLastLoc();
        		String stringIDptfll= platform.getToPtfLoc().getObjectId().toString();
        		PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class, mu.ConvertIDStringtoLong(stringIDptfll));//Get the platform Last Location by its PK
        		ptfll.setId(Cayenne.longPKForObject(platformlastloc));
        		ptfll.setLat(platformlastloc.getLat());
        		ptfll.setLon(platformlastloc.getLon());
        		ptfll.setLastLocationDate(platformlastloc.getLocDate());
    			//Ajouter à platform
    			ptf.setLastLocation(ptfll);
        		
        		
        		// 6) l'objet imbriqué "PlatformDeploy" 
//        		PlatformDeploy ptfdpl = new PlatformDeploy();
    			String stringIDptfdpl= platform.getToPtfDeployment().getObjectId().toString();
        		PtfDeployment platformDeploy = Cayenne.objectForPK(context, PtfDeployment.class, mu.ConvertIDStringtoLong(stringIDptfdpl));//Get the platform Deployment by its PK
        		ptfdpl.setId(Cayenne.longPKForObject(platformDeploy));
        		ptfdpl.setDeployementDate(platformDeploy.getDeplDate());
        		ptf.setDeployement(ptfdpl);

        		
        		// 7) l'objet imbriqué "Program" 
//        		Program prgm = new Program();
        		
        	    String stringIDprg= platform.getToProgram().getObjectId().toString();
        	    jcommops.db.orm.rest.Program ptfprogram= Cayenne.objectForPK(context, jcommops.db.orm.rest.Program.class, mu.ConvertIDStringtoLong(stringIDprg));//Get the platform Program by its PK
        	    prgm.setActive(ptfprogram.getActive());
          	    prgm.setDescription(ptfprogram.getDescription());
        	    prgm.setId(Cayenne.longPKForObject(ptfprogram));
        	    prgm.setName(ptfprogram.getName());	
        		// 8) l'objet "sous-imbriqué" "Agency" (to program)
        	    prgm.setAgencies(map.FindProgramAgencies(Cayenne.longPKForObject(ptfprogram)));// for reminder here id is program id
        	    ptf.setProgram(prgm);  
        		
        		// 9) l'objet imbriqué "Country" 
//				CountryPtf country= new CountryPtf();
        	    String stringIDcountry= ptfprogram.getToCountry().getObjectId().toString();
        	    Country ptfcountry= Cayenne.objectForPK(context, Country.class, mu.ConvertIDStringtoLong(stringIDcountry));//Get the platform country by its PK
        	    country.setId(Cayenne.longPKForObject(ptfcountry));
        	    country.setName(ptfcountry.getName());
        	    country.setIsoCode2(ptfcountry.getCode2());
        	    country.setIsoCode3(ptfcountry.getCode3());
        	    ptf.setCountry(country);  
//        	    System.out.println(ptfcountry.getName());
        	    
        		// 10) l'objet imbriqué "Master Programme" 
//				CountryPtf country= new CountryPtf();
        	    MasterProgram masterprg = new MasterProgram();
        	    
        	    
        	    String stringIDmasterprg= ptfprogram.getToMasterProg().getObjectId().toString();
        	    MasterProg ptfmastprg= Cayenne.objectForPK(context, MasterProg.class, mu.ConvertIDStringtoLong(stringIDmasterprg));//Get the platform country by its PK
        	    masterprg.setId(Cayenne.longPKForObject(ptfmastprg));
        	    masterprg.setName(ptfmastprg.getName());
        	    masterprg.setNameShort(ptfmastprg.getNameShort());
        	    ptf.setMasterProgramme(masterprg);  
        	    			
    			}
    		catch (NullPointerException n) {

    			}
    		    	
    		
    		
    		
//    		runtime.shutdown();
    		return ptf;
    		

	}
	

}
