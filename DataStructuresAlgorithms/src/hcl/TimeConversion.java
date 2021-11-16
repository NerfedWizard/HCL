package hcl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	private static String timeConvert(String time) {
		String outTime = "";
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputTime = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = df.parse(time);
			outTime = outputTime.format(date);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return outTime;

	}

	public static void main(String[] args) {
//		Calendar calendar = Calendar.getInstance();
		String time = "11:13:00PM";

		System.out.println(timeConvert(time));
	}
}
