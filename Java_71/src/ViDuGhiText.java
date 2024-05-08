import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiText {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("D:\\Java\\Java_71\\File.txt", "UTF-8");
			pw.println("Xin chào, mình là TITV");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print('b');
			pw.print(" là số PI");
			
			pw.println();
			Student st = new Student(199, "Nguyễn Văn A");
			
			pw.println(st);
			
			pw.println();
			pw.flush();
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
