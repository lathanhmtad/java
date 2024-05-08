import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số a: ");
		a = sc.nextDouble();
		
		System.out.println("Nhập vào số b: ");
		b = sc.nextDouble();
		
		// Hàm trị tuyệt đối
		System.out.println("|a| = " + Math.abs(a));
		
		// Hàm tìm min 
		System.out.println("Min(a, b) = " + Math.min(a, b));
		
		// Hàm tìm max
		System.out.println("Max(a, b) = " + Math.max(a, b));
		
		// Hàm tìm ceil
		System.out.println("Ceil(a) = " + Math.ceil(a));
		
		// Hàm floor
		System.out.println("floor(a) = " + Math.floor(a));
		
		// Hàm căn bậc 2
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
		// Hàm a mũ b
		System.out.println("a ^ b = " + Math.pow(a, b));
	}
}