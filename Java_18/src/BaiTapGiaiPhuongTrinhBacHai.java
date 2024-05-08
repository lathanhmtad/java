import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ax2 + bx + c = 0
		 * Nếu a = 0 => PT BẬC 1 => bx + c = 0
		 * Nếu a != 0
		 * 		delta = b^2 - 4 * a * c
		 * 		delta > 0 => Phương trình 2 nghiệm
		 * 		delta == 0 => Phương trình có nghiệm kép
		 * 		delta < 0 => Phương trình vô nghiệm
		 */
		
		double a, b, c, x1, x2, delta, x;
		
		System.out.println("Nhập a: ");
		a = sc.nextDouble();
		
		System.out.println("Nhập b: ");
		b = sc.nextDouble();
		
		System.out.println("Nhập c: ");
		c = sc.nextDouble();
		
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("Phương trình có vô số nghiệm");
				}
				else {
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else {
				x = -c / b;
				System.out.println("Phương trình có nghiệm x = " + x);
			}
		}
		else {
			delta = Math.pow(b, 2) - 4 * a * c; 
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else if(delta == 0) {
				x = -b / 2 * a;
				System.out.println("Phương trình có nghiệm kép x = " + x);
			}
			else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
