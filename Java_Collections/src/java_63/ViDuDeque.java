package java_63;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
	public static void main(String[] args) {	
		Deque<String> danhSachSV = new ArrayDeque<String>();
	
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyễn Văn B");
		danhSachSV.offer("Nguyên An A");
		danhSachSV.offer("TITV 2");
		danhSachSV.offer("Duy Nguyen");
		danhSachSV.offer("ABC");
		danhSachSV.offerLast("TITV 4");
		danhSachSV.offerFirst("TITV 0");
		
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
