import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		// KHAI BÁO BIẾN
		int a, b;
		
		// NHẬP DỮ LIỆU
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a = ");
		a = sc.nextInt();
		
		System.out.println("Nhập vào b = ");
		b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("sum = " + sum);
		
		int subtraction = a - b;
		System.out.println("Hiệu = " + subtraction);
		
		
		float division = (float)a / b;
		System.out.println("Chia = " + division);
		
		int multiplication = a * b;
		System.out.println("Nhân = " + multiplication);
		
		int surplus = a % b;
		System.out.println("Chia lấy dư = " + surplus);
	}
}
