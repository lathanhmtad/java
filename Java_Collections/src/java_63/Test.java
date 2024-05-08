package java_63;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {	
		Queue<String> danhSachSV = new LinkedList<String>();
	
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyên Văn A");
		danhSachSV.offer("Nguyễn Văn B");
		danhSachSV.offer("TITV 2");
		danhSachSV.add("DUY NGUYEN");
		
		
		
		while(true)
		{
			String ten = danhSachSV.poll(); 
			if(ten == null)
				break;
			// peek => lấy ra nhưng không xóa
			System.out.println(ten);
		}
	}
}