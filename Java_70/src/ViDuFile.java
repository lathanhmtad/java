import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
	public static void copyAll(File f1, File f2)
	{
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f1.isDirectory())
		{
			File[] mangCon = f1.listFiles();
			for(File file : mangCon)
			{
				File file_new = new File(f2.getAbsolutePath() + "\\" + file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	
	public static void main(String[] args) {
		File f0 = new File("D:\\Java\\Java_70\\File_1.txt");
		File f1 = new File("D:\\Java\\Java_70\\File_2.txt");
		File f2 = new File("D:\\Java\\Java_70\\File_2xyz.txt");
		
		
		// 1. Thay đổi tên tập tin hoặc thư mục
		// Sử dụng File để thay đổi tên
//		f0.renameTo(f1);
//		
//		// Sử dụng Files để thay đổi tên
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// 2. Di chuyển file
//		File f_2new = new File("D:\\Java\\Java_70\\f0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File f_0 = new File("D:\\Java\\Java_70\\f0");
		File f_0_copy = new File("D:\\Java\\Java_70\\f0_copy");
		
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ViDuFile.copyAll(f_0, f_0_copy);
	}
}
