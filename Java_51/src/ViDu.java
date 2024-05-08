
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chao co chu, Xin chao cac ban, Xin chao!";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'o';
		
		// Ham indexOf 
		System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2));
		System.out.println("Vi tri cua s3 trong s1 la: " + s1.indexOf(s3));
		
		// Sử dụng vị trí bắt đầu
		System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2, 2));
		System.out.println("Vi tri cua s3 trong s1 la: " + s1.indexOf(s3));
		 
		// Tim kiem char
		System.out.println("Vi tri cua c1 trong s1 la: " + s1.indexOf(c1, 11));
		
		// Ham lastIndexOf => Tim kiem tu phai sang trai
		System.out.println("Vi tri cua s2 trong s1 (tu phai sang trai) la: " + s1.lastIndexOf(s2));
		
		// tenFile = "Bai tap.excel.lop12.xls';
	}
}
