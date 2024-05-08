import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// PTBC CÓ DẠNG: ax + b = 0
		/*
		 * Nếu a = 0
		 * 		Nếu b = 0 => PT VSN
		 * 		Nếu b != 0 => PT VN
		 * Nếu a != 0
		 * 		x = -b / a
		 */
		float a, b, x;
		System.out.println("Nhập a: = ");
		a = sc.nextFloat();
		
		System.out.println("Nhập b: = ");
		b = sc.nextFloat();
			
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			x = -b / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
	}
}
