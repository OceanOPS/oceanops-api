package servicemethods;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.Persistent;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SelectQuery;

import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfFamily;
import jcommops.db.orm.rest.PtfLoc;
import jcommops.db.orm.rest.PtfModel;
import jcommops.db.orm.rest.PtfStatus;
import jcommops.db.orm.rest.PtfType;
import serviceentities.Platform;
import serviceentities.PlatformFamily;
import serviceentities.PlatformLastLoc;
import serviceentities.PlatformModel;
import serviceentities.PlatformStatus;
import serviceentities.PlatformType;
import serviceutil.MethodesUtiles;

public class PlatformAccessor {
	
	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	//Getting Object Context
	ObjectContext context = runtime.getContext();
	
	
	public ArrayList<Platform> getAllPtfs () { //Liste "OFFICIELLE" des Platformes
		
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

//			Ajouter des objects imbriqués un par un
    		MethodesUtiles mu =new MethodesUtiles();
    		
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
    		PlatformLastLoc ptfdpl = new PlatformLastLoc();
    		
    		try {
    			// 1) l'objet imbriqué "PlatformStatus"
    			String stringIDptfs= platform.getToPtfStatus().getObjectId().toString();
        		PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, mu.ConvertIDStringtoLong(stringIDptfs));//Get the platform Status by its PK
    			ptfs.setId(Cayenne.longPKForObject(platformstatus));
    			ptfs.setStatus(platformstatus.getDescription());
    			//Ajouter à platform
    			ptf.setPtfstatus(ptfs);
    			
    			// 2) l'objet imbriqué "PlatformModel" 
    			String stringIDptfm= platform.getToPtfModel().getObjectId().toString();
    			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class, mu.ConvertIDStringtoLong(stringIDptfm));//Get the platform Status by its PK
    			ptfm.setId(Cayenne.longPKForObject(platformmodel));
    			ptfm.setNameShort(platformmodel.getNameShort());
    			ptfm.setName(platformmodel.getName());
    			ptfm.setDescription(platformmodel.getDescription());
    			//Ajouter à platform
    			ptf.setPtfmodel(ptfm);
    			
    			// 3) l'objet imbriqué "PlatformType" 
    			PtfModel platformm = Cayenne.objectForPK(context, PtfModel.class, ptfm.getId());
    			String stringIDptft= platformm.getToPtfType().getObjectId().toString();
    			PtfType platformtype = Cayenne.objectForPK(context, PtfType.class, mu.ConvertIDStringtoLong(stringIDptft));//Get the platform Status by its PK
    			ptft.setId(Cayenne.longPKForObject(platformtype));
    			ptft.setNameShort(platformtype.getNameShort());
    			ptft.setName(platformtype.getName());
    			ptft.setDescription(platformtype.getDescription());
    			//Ajouter à platform
    			ptf.setPtftype(ptft);
    			
    			// 4) l'objet imbriqué "PlatformFamily"
    			PtfType platformt = Cayenne.objectForPK(context, PtfType.class, ptft.getId());
    			String stringIDptff= platformt.getToPtfFamily().getObjectId().toString();
    			PtfFamily platformfamily = Cayenne.objectForPK(context, PtfFamily.class, mu.ConvertIDStringtoLong(stringIDptff));//Get the platform Status by its PK
    			ptff.setId(Cayenne.longPKForObject(platformfamily));
    			ptff.setNameShort(platformfamily.getNameShort());
    			ptff.setName(platformfamily.getName());
    			ptff.setDescription(platformfamily.getDescription());
    			ptf.setPtffamily(ptff);
    			
    			// 5) l'objet imbriqué "PlatformLastLoc" 
//        		PlatformLastLoc ptfll = new PlatformLastLoc();
        		String stringIDptfll= platform.getToPtfLoc().getObjectId().toString();
        		PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class, mu.ConvertIDStringtoLong(stringIDptfll));//Get the platform Status by its PK
        		ptfll.setID(Cayenne.longPKForObject(platformlastloc));
        		ptfll.setLat(platformlastloc.getLat());
        		ptfll.setLon(platformlastloc.getLon());
        		ptfll.setDateOfLastLocation(platformlastloc.getLocDate());
    			//Ajouter à platform
    			ptf.setPtfll(ptfll);
        		
        		
        		// 6) l'objet imbriqué "PlatformDeploy" 
//        		PlatformLastLoc ptfdpl = new PlatformLastLoc();
    			
    			
    			}
    		catch (NullPointerException n) {

    			}
    		    	
    		
    		
    		
//    		runtime.shutdown();
    		return ptf;
    		

	}
	

}
