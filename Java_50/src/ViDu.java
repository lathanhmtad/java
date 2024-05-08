
public class ViDu {
	public static void main(String[] args) {
		String s1 = "TITV.vn";
		String s2 = "titv.vn";
		String s3 = "TITV.vn";
		
		// Hàm equals => so sánh 2 chuỗi giống nhau có phân biệt hoa thường
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
		// Hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau 
								// không phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		 
		// Nếu các bạn so sánh mật khẩu của người dùng khi đăng nhập
		// bạn sẽ dùng equals hoặc equalsIgnoreCase ?
		
		
		// Hàm compareTo => so sánh > < = 
		String sv1 = "Nguyen Van A";
		String sv2 = "nguyen van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

		// Hàm compareToIgnoreCase => Tương tự hàm compareTo, không phân biệt
								 // hoa thường
		System.out.println("compareToIgnoreCase");
		System.out.println("sv1 compareToIgnoreCase sv2: " + sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase sv3: " + sv1.compareToIgnoreCase(sv3));
		System.out.println("sv1 compareToIgnoreCase sv4: " + sv1.compareToIgnoreCase(sv4));
		
		// Hàm regionMatches => so sánh một đoạn 
		String r1 = "TITV.vn";
		String r2 = "tV.v";
		boolean check = r1.regionMatches(false, 2, r2, 0, 4);
		System.out.println("Check: " + check);
		
		// 0937 456 789
		// 0937 455 765
		
		// Hàm startWidth => Hàm kiểm tra chuỗi bắt đầu bằng ...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
		// Hàm endWidth => Hàm kiểm tra chuỗi kết thúc bằng ... 
		String tenFile = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		
		if(tenFile.endsWith("JPG")) {
			System.out.println("FILE 1 la hinh anh");
		} 
		else if(tenFile.endsWith("PDF")) {
			System.out.println("File 1 la file pdf!");
		}
		
		if(tenFile2.endsWith("JPG")) {
			System.out.println("FILE 2 la hinh anh");
		} 
		else if(tenFile2.endsWith("PDF")) {
			System.out.println("File 2 la file PDF!");
		}
		
	}
}
