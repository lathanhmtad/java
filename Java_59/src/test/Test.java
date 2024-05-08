package test;

public class Test {
	public static void main(String[] args) {
		Schedule tkb_t2 = new Schedule(Day.Monday, "Toán Lý Hóa");
		Schedule tkb_t3 = new Schedule(Day.Tuesday, "Văn Sử Địa"); 
		Schedule tkb_t4 = new Schedule(Day.Wednesday, "Lý Hóa Sinh");
		Schedule tkb_t5 = new Schedule(Day.Thursday, "Tin học - GDCD - Thể dục"); 

		
		System.out.println(tkb_t5.toString());
		
		System.out.println(Month.August.dayNumber());
	}
}
