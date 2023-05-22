package org.oceanops.orm;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.json.JSONObject;
import org.oceanops.orm.auto._TimePeriod;

public class TimePeriod extends _TimePeriod {

    private static final long serialVersionUID = 1L;


    public static JSONObject isoDurationToSingleUnitAndQuantity(String isoDuration) {
		JSONObject result = new JSONObject();
		JSONObject unit = new JSONObject();
		try {
			Period period = Period.parse(isoDuration);
			long years = period.get(ChronoUnit.YEARS);
			long months = period.get(ChronoUnit.MONTHS);
			long days = period.get(ChronoUnit.DAYS);
			if (years > 0) {
				result.put("quantity", years);
				unit.put("id", "Y");
				unit.put("text", "Years");
			} else if (months > 0) {
				result.put("quantity", months);
				unit.put("id", "M");
				unit.put("text", "Months");
			} else if (days > 0) {
				result.put("quantity", days);
				unit.put("id", "D");
				unit.put("text", "Days");
			}
		} catch (Exception e) {
			try {
				Duration duration = Duration.parse(isoDuration);
				long hours = duration.toHours();
				long minutes = duration.toMinutes();
				long seconds = duration.toSeconds();
				long milliseconds = duration.toMillis();
				Double fractionalSeconds = null;
				if (seconds == 0 && milliseconds > 0) {
					fractionalSeconds = ((double) milliseconds / (double) 1000);
				}

				if (seconds > 59 && ((seconds % 60) == 0)) {
					if (minutes > 59 && ((minutes % 60) == 0)) {
						result.put("quantity", hours);
						unit.put("id", "H");
						unit.put("text", "Hours");
					} else {
						result.put("quantity", minutes);
						unit.put("id", "Min");
						unit.put("text", "Minutes");
					}
				} else {
					if (fractionalSeconds != null) {
						result.put("quantity", fractionalSeconds);
					} else {
						result.put("quantity", seconds);
					}
					unit.put("id", "S");
					unit.put("text", "Seconds");
				}
			} catch (Exception e1) {

			}
		}
		result.put("unit", unit);
		return result;
	}
}
