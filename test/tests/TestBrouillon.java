package tests;

import java.io.StringWriter;
import java.util.Date;

import org.jcommops.api.Utils;

public class TestBrouillon {

	public static void main(String[] args) {
		/**
		 * String sampleString = " a,d"; String[] strTab =
		 * sampleString.trim().split(","); String strTab2 =
		 * sampleString.trim().replace(",", "','"); StringWriter wString = new
		 * StringWriter(); for (String tableString : strTab) {
		 * wString.write("'"+tableString+"'"+",");
		 * 
		 * } String finalString=wString.toString();
		 * System.out.println(finalString); System.out.println( "new traing=
		 * "+strTab2);
		 * 
		 **/
		
		
		String str = "1,2,3,5";
		String[] strTab = str.trim().split(",");
		String test = "STRING";
		int i = 0;
		while (i < strTab.length) {
			System.out.println(strTab[i]);
			if (strTab[i].matches("^-?\\d+$")) {
				
				test = "INT";
				i++;
				System.out.println("i= "+ i);
			}
			
		}
		
		System.out.println("str is " + test);

	}

}
