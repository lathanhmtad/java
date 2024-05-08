package java_63;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueue {
	public static void main(String[] args) {	
		Queue<String> danhSachSV = new PriorityBlockingQueue<String>();
	
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyễn Văn B");
		danhSachSV.offer("Nguyên An A");
		danhSachSV.offer("TITV 2");
		danhSachSV.offer("Duy Nguyen");
		danhSachSV.offer("ABC");
		
		
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
