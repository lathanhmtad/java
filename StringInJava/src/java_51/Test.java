package java_51;

public class Test {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		
		// Hàm indexOf
		System.out.println("Vi tri cua s2 trong s1 là: " + s1.indexOf(s2));
		System.out.println("Vi trí của s3 trong s1 là: " + s1.indexOf(s3));
		
		// Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2, 1));
		
		// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s2 là: " + s2.indexOf(c1));
		
		// Hàm lastIndexof => tìm kiếm từ phải sang trái
		System.out.println("Vi tri cua s2 trong s1 là: " + s1.lastIndexOf(s2));
		
		// tenFile = "Baitap.excel.lop12.xls"
		
	}
}
