package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Hàm láy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		
//		for (int i = 0; i < 1000000; i++) {
//			System.out.print("TEST");
//		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Trước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);
		System.out.println("Thời gian: " + (t2 - t1) + "mls ");
		System.out.println("Thời gian: " + (t2 - t1) / 1000 + "s ");
		
		
		// TimeUnit
		System.out.println("1 năm = " + TimeUnit.DAYS.toSeconds(1 * 365) + "s");
		System.out.println("1h = " + TimeUnit.HOURS.toSeconds(1) + "s");
		System.out.println("3600 giây = " + TimeUnit.SECONDS.toHours(3600) + "h");
		
		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Ngày tháng năm hiện tại: " + d);
		System.out.println("Date formated: " + (d.getDate()) + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
		
		// Calendar
		System.out.println("------Lớp Calendar--------");
		Calendar calendar = Calendar.getInstance();
		System.out.println("Date formated: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.DATE, 14);		
		System.out.println("Date formated: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.YEAR));

		
		// DateFormat
		System.out.println("------Lớp DateFormat--------");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(df.format(d));
		
	}
}
