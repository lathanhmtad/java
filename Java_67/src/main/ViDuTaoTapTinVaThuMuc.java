package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		// Lưu ý:
		// MS Windows: \ => \\ Ví dụ: C:\\Thu muc 1\\Thu muc 2\\Ten tap tin.xxx
		// Linux, MacOs: / => Ví dụ: /Thu muc 1/Thu muc 2/Ten tap tin.xxx
		
		
		File folder1 = new File("D:\\Java\\Java_67");
		File folder2 = new File("D:\\Java\\Java_677");
		
		System.out.println("Kiểm tra folder1 có tồn tại hay không: " + folder1.exists());
		System.out.println("Kiểm tra folder2 có tồn tại hay không: " + folder2.exists());
		

		// Tạo thư mục
		// Phương thức mkdir() => Tạo 1 thư mục
		File d1 = new File("D:\\Java\\Java_67\\Directory_1");
		d1.mkdir();
		
		// Phương thức mkdirs() => Tạo nhiều thư mục cùng lúc
		File d2 = new File("D:\\Java\\Java_67\\Directory_1\\Directory_2\\Directory_3");
		d2.mkdirs();
		
		
		// Tạo tập tin (có phần mở rộng: .exe .txt .doc .xls ...)
		File file1 = new File("D:\\Java\\Java_67\\Directory_1\\Vidu1.exe");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// Không có quyền tạo tập tin
			// Ổ cứng bị đầy
			// Đường dẫn sai
			// .....
			e.printStackTrace();
		}
	
	}
}
