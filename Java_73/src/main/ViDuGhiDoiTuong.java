package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\Java\\Java_73\\data.txt");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			Student st = new Student("001", "TITV", 2000, (float)9.4);
			
			oos.writeObject(st);
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
