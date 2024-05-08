package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(400, 600);
		jf.setTitle("Ví dụ JFrame");
		
		
//		while(true)
//		{
//			System.out.println("Chương trình đang chạy!");
//		}
		
		// Gắn vị trí hiển thị
		jf.setLocation(300, 100);
		
		// Thoát ra khỏi chương trình khi đóng cửa sổ JFram
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
}
