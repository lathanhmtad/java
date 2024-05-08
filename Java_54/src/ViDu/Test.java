package ViDu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Trần Văn Tĩnh", "Lớp 1", 9);
		SinhVien sv2 = new SinhVien(150, "Nguyễn Đăng Duy", "Lớp 2", 8);
//		SinhVien sv3 = new SinhVien(199, "Nguyễn Văn Minh", "Lớp 2", 7.2);
		
		System.out.println(sv1.compareTo(sv2));
	}
}
