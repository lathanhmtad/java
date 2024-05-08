package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/mac/eclipse-workspace/Java_73/file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(is);
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}