package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CheckData {

	public static boolean validDob(Date date) {
		// Lấy ngày hiện tại
		long millis = System.currentTimeMillis();
		Date today = new Date(millis);

		// Lấy ra diff giữa 2 ngày
		long diff = today.getTime() - date.getTime();

		// Trả về khoảng cách ngày giữa 2 date
		int space = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

		if (space > 0)
			return true;
		return false;
	}
	
	public static boolean validDob(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Date date = null;
	
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
		// Lấy ngày hiện tại
		long millis = System.currentTimeMillis();
		Date today = new Date(millis);

		// Lấy ra diff giữa 2 ngày
		long diff = today.getTime() - date.getTime();

		// Trả về khoảng cách ngày giữa 2 date
		int space = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

		if (space > 0)
			return true;
		return false;
	}

	public static boolean validPhoneNumber(String sdt) {
		int n = sdt.length();

		if (n == 9 || n == 10) {
			if (sdt.startsWith("0"))
				return true;
		}
		return false;
	}

	public static boolean validChungNhanSuDungDat(String mgcn) {
		int n = mgcn.length();

		if (n == 10) {
			if (mgcn.startsWith("QSD"))
				return true;
		}
		return false;
	}

	public static boolean validKhoanVay(double value) {
		if (value > 0 && value < 2000000000)
			return true;
		return false;
	}

}
