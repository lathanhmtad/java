package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ZipFile {
	public static void main(String[] args) throws IOException {
		String sourceFile = "test1.txt";
		FileOutputStream fos = new FileOutputStream("compressed.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
	}
}
