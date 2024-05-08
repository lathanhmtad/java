import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		String name = sc.nextLine();
		
		System.out.println("Nhập mã sinh viên: ");
		long id = sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		float score = sc.nextFloat();
		
		System.out.println("-----");
		
		System.out.println("Họ và tên: " + name);
		System.out.println("Mã sinh viên: " + id);
		System.out.println("Điểm thi: " + score);
	}
}