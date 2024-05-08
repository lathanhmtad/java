import java.util.Scanner;

public class BaiTapTimSoNgayCuaThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, year;		
		System.out.println("Nhập vào tháng: ");
		month = sc.nextInt();
		System.out.println("Nhập vào năm: ");
		year = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			System.out.println("Tháng " + month + " có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng " + month + " có 30 ngày");
			break;
		case 2:
			if(year % 4 == 0) {
				System.out.println("Tháng " + month + " có 29 ngày");
			}
			else {
				System.out.println("Tháng " + month + " có 28 ngày");
			}
			break;
		default:
			System.out.println("Không có tháng " + month);
		}
	}
}
