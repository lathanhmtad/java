package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleDate {
	public static Date setDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date result = null;
		try {
			result = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return result;
	}
	
	public static String getDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(date);
	}
}
