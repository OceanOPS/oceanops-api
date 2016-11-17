package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.jcommops.api.Utils;
import org.jcommops.api.orm.PtfDeployment;

public class TestDateToString {

	public static void main(String[] args) throws ParseException {

  
    	 
    	 DateFormat formatISO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); 
    	 SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    	 Date date = fmt.parse("2013-05-06");   	 
    	 String dateISO = formatISO.format(date);
    	 
    	 System.out.println(dateISO);
    	 System.out.println("\n Year= "+dateISO.substring(0,4));
 
    	 
    	 System.out.println(Utils.GetIsoDate(date));
    	 System.out.println(Utils.GetYear(date));
	 
	
		
	}

}
