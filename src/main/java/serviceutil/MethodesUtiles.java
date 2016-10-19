package serviceutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodesUtiles  {

	public long  ConvertIDStringtoLong (String str) {
	//REGEX to extract ID
	Pattern p = Pattern.compile("-?\\d+");
	Matcher m = p.matcher(str);
	long ID = 0;
	while (m.find()) {
	   ID= Integer.parseInt(m.group());
	}
	return ID;
}
}
