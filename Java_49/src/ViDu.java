import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("------------");
		
		// Hàm length() => lấy ra độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();
		
		// Hàm charAt(position) => Lấy ra 1 kí tự tại 1 vị trí
		for(int i = 0; i < doDai; i++) {
			System.out.println("Vi tri " + i + " la: " + s.charAt(i) + " ");
		}
		
		// Hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu,
						// vị trí bắt đầu lưu của mảng)
		char[] arrayChar = new char[100];
		s.getChars(2, 5, arrayChar, 0);
		
		for(int i = 0; i < arrayChar.length; i++) {
			System.out.println("Gia tri cua mang tai: " + i + " la: " + arrayChar[i]);
		}
		
		// Hàm getBytes => có 3 cách lấy ra giá trị của các ký tự thành một mảng	
		byte[] arrayByte = s.getBytes();
		for (byte b : arrayByte) {
			System.out.println(b);
		}
		
		s.getBytes();
	}
}
