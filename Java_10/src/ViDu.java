public class ViDu {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// ÉP KIỂU NGẦM ĐỊNH
		float c = a;
		float d = b;
		System.out.println("--------");
		System.out.println("c = " + a);
		System.out.println("d = " + b);
		
		// ÉP KIỂU TƯỜNG MINH
		float e = 3.5f;
		float f = 9.5f;
		System.out.println("--------");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int g = (int)e;
		int h = (int)f;
		System.out.println("--------");
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		// ÉP KIỂU GIỮA BIẾN NGUYÊN THỦY VÀ ĐỐI TƯỢNG
		int x = new Integer(32);
		System.out.println("x = " + x);
		
	}
}
