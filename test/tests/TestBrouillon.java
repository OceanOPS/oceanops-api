package tests;

import java.io.StringWriter;

import org.jcommops.api.Utils;

public class TestBrouillon {

	public static void main(String[] args) {
		   String sampleString = " a,d";
		   String[] strTab = sampleString.trim().split(",");
		   String strTab2 = sampleString.trim().replace(",", "','");
		   StringWriter wString = new StringWriter();
		   for (String tableString : strTab) {
		      wString.write("'"+tableString+"'"+",");
		      
		   }
		   String finalString=wString.toString();
		   System.out.println(finalString);
		   System.out.println( "new traing= "+strTab2);
	
		   
	
		}

}
