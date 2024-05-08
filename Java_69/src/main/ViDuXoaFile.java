package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx)
	{
		if(fx.isFile()) {
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			// Xóa nếu là tập tin
			fx.delete();
		}
		else if(fx.isDirectory())
		{
			// Lấy các file con 
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				// Xóa các file con
				xoaFile(f);
			}
			// Xóa bản thân thư mục sau khi đã xóa các file con
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			fx.delete();
		}
	}
	
	
	public static void main(String[] args) {
		// Sử dụng class File xóa tập tin hoặc thư mục
		
		File f0 = new File("D:\\Java\\Java_69\\f0");
		File f0_1 = new File("D:\\Java\\Java_69\\f0_1");
		File f_vidu = new File("D:\\Java\\Java_69\\Vidu.txt");
		
		
//		f0.deleteOnExit(); // Xóa không được vì có chứa thư mục và tập tin
//		f0_1.deleteOnExit(); // Xóa được vì nó là một thử mục rỗng
//		f_vidu.deleteOnExit(); // Xóa được vì là tập tin
//		System.out.println(f0_1.delete());
//	
//		ViDuXoaFile.xoaFile(f0);

		// Sử dụng class Files xóa tập tin và thư mục
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p0_Vidu = f_vidu.toPath();
		try {
//			Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p0_Vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
