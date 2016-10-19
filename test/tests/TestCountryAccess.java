package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

import jcommops.db.orm.rest.Country;
import jcommops.db.orm.rest.PtfDeployment;
import serviceentities.CountryPtf;
import serviceutil.MethodesUtiles;

public class TestCountryAccess {

	public static void main(String[] args) {
    	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	CountryPtf country= new CountryPtf();
    	MethodesUtiles mu =new MethodesUtiles();
    	
    	PtfDeployment platformDeploy = Cayenne.objectForPK(context, PtfDeployment.class, 1008266);//Get the platform Deployment by its PK
    	
	    String stringIDcountry= platformDeploy.getToCountry().toString();
	    Country ptfcountry= Cayenne.objectForPK(context, Country.class, mu.ConvertIDStringtoLong(stringIDcountry));//Get the platform country by its PK
	    country.setId(Cayenne.longPKForObject(ptfcountry));
	    country.setName(ptfcountry.getName());
	    country.setIsoCode2(ptfcountry.getCode2());
	    country.setIsoCode3(ptfcountry.getCode3());
	   
	    System.out.println(ptfcountry.getName());
	    runtime.shutdown();
	}
}
