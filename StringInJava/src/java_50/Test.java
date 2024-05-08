package java_50;

public class Test {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
				
		// Hàm equals => so sánh 2 chuỗi có giống nhau
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
		// Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau không phân biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		
		// Nếu các bạn so sánh tài khoản và mật khẩu của người dùng khi đăng nhập bạn sẽ dùng
		// equals hoặc equalsIgnoreCase ?
		
		// Hàm compareTo => so sánh > < = 
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
		// Hàm compareToIgnoreCase => Tương tự hàm compareTo, không phân biệt
		// hoa thường
		
		// Hàm regionMatches
		String r1 = "TITV.vn";
		String r2 = "TV.v";		
		boolean check = r1.regionMatches(2, r2, 0, r2.length());
		System.out.println(check);
		
		// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("037"));
		
		// Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
		String tenFile = "i love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		if(tenFile2.endsWith(".JPG"))
			System.out.println("File 1 la file hinh anh");
		else if(tenFile2.endsWith(".PDF"))
			System.out.println("File 2 la file PDF!");
		
		
	}
}
