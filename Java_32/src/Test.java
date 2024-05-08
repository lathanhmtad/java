
public class Test {
	public static void main(String[] args) {	
		MyDate md = new MyDate(31, 1, 2021);
		
		md.setDay(35);
		System.out.println("Day = " + md.getDay());
		
		md.setDay(30);
		System.out.println("Day = " + md.getDay());
		
		md.setMonth(4);
		System.out.println("Month = " + md.getMonth());
		
		md.setYear(59);
		System.out.println("Year = " + md.getYear());
	}
}
