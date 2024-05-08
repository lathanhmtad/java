package java_49;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		
		// Hàm length() => Lấy độ dài chuỗi
		System.out.println("Độ dài chuỗi vừa nhập: " + s.length());
		
		// Hàm charAt() // Lấy ra 1 kí tự tại vị trí bất kì 0 <= < s.length()
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println("Vị trí " + i + ": " + s.charAt(i));
		}
		
		// Hàm getChars(srcStart, srcEnd, ArrayDataSave, posSrcStartSaveArray
		char[] arrayChar = new char[s.length()];
		s.getChars(2, 5, arrayChar, 0);
		for(int i = 0; i < arrayChar.length; i++)
		{
			System.out.println("Gía trị của mảng char tại " + i + " là: " + arrayChar[i]);	
		}
		
		// Hàm getByte()
		byte[] arrayByte = s.getBytes();
		for(byte b : arrayByte)
		{
			System.out.println(b);
		}
	}
}
