package tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.map.SQLResult;
import org.apache.cayenne.query.SQLTemplate;

import jcommops.db.orm.rest.Agency;
import jcommops.db.orm.rest.Country;
import jcommops.db.orm.rest.Program;
import jcommops.db.orm.rest.PtfVariable;
import serviceentities.CountryPtf;
import serviceentities.Variable;
import serviceutil.MethodesUtiles;

public abstract class TestVariableAcess {
	
	public static void main(String[] args) {
    	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	CountryPtf country= new CountryPtf();
    	MethodesUtiles mu =new MethodesUtiles();
    	
    	Program platformDeploy = Cayenne.objectForPK(context, Program.class, 49);//Get the platform Deployment by its PK
    	 System.out.println(platformDeploy.getToCountry());
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
}
