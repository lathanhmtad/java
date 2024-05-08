package java_52;

public class Test {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		String s3 = s1 + s2;
		// Hàm concat => nối chuỗi
		String s4 = s1.concat(s2);
		
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		
		// Hàm replace => thay thế 
		String s5 = "Tung.vn";
		
		s5 = s5.replaceAll("Tun", "TITV");
		System.out.println(s5);
		
		// toLowerCase => chuyển về viết thường
		// toUpperCase => chuyển về viết hoa
		String s7 = s1.toLowerCase();
		String s8 = s1.toUpperCase();
		
		System.out.println(s7);
		System.out.println(s8);
		
		// trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9 = "    Xin chào các bạn, mình là TITV.VN     ";
		System.out.println(s9);
		System.out.println(s9.trim());
		
		// Hàm toCharArr
		
		// Hàm substring => cắt chuỗi con
		String s10 = "Nguyễn Đăng Duy";
		
		String s11 = s10.substring(0);
		System.out.println(s11);
		
		String s12 = s10.substring(0, 6);
		System.out.println(s12);
	}
}
