package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.Utils;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfHardware;
import org.jcommops.api.orm.PtfIdentifiers;

public class TestTelecom {
	
	public static void main(String[] args) {
		
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
			Ptf platform = Cayenne.objectForPK(context, Ptf.class, 22); 	//Get the platform
		
			String stringIDptfHard = platform.getToPtfHardware().getObjectId().toString();
			PtfHardware hardw = Cayenne.objectForPK(context, PtfHardware.class,	Utils.ConvertIDStringtoLong(stringIDptfHard));
			System.out.println(hardw.getSerialRef());
			String stringIDptfs = platform.getToPtfStatus().getObjectId().toString();
			System.out.println(stringIDptfs);
		 String IDptfTelc = platform.getToTelecom1().getObjectId().toString();
			System.out.println(IDptfTelc);
			

		/**
		 * 	String stringIDptfTelc = platform.getToTelecom().getObjectId().toString();
		org.jcommops.api.orm.Telecom telecom = Cayenne.objectForPK(context, org.jcommops.api.orm.Telecom.class,
				
				Utils.ConvertIDStringtoLong(stringIDptfTelc));// Get the platform telecom by its PK
				long id= Cayenne.longPKForObject(telecom);
		String name= telecom.getToTelecomType().getName();
		System.out.println("id= "+ id +" type= " +name);**/
				
		runtime.shutdown();
	}

}
