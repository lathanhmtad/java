
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(13, 10, 2003);
		Ngay ngay3 = new Ngay(13, 10, 2003);
		Ngay ngay2 = new Ngay(19, 2, 2006);
		
		System.out.println("In this cua ngay1: " + ngay1.equals(ngay3));
//		System.out.println("In this cua ngay2: " + ngay2.inThis());
//		System.out.println("In this cua ngay3: " + ngay3.inThis());
		System.out.println(ngay1.getClass());
		
		Lop lop1 = new Lop("DH01", "khoa cong nghe thong tin");
		Lop lop2 = new Lop("DH02", "khoa hoc may tinh");
		Lop lop3 = new Lop("DH03", "khoa an ninh mang");
		
		SinhVien sv1 = new SinhVien("0001", "Tung Itv", ngay1, 9.2, lop1);
		SinhVien sv2 = new SinhVien("0002", "Peter 1", ngay2, 4.1, lop2);
		SinhVien sv3 = new SinhVien("0003", "Tung Itv", ngay3, 7.5, lop3);
		
		
		System.out.println("Ten Khoa SV1: " + sv1.layTenKhoa());
		System.out.println("Ten Khoa SV2: " + sv2.layTenKhoa());
		System.out.println("Ten Khoa SV3: " + sv3.layTenKhoa());
		
		System.out.println("SV1 Thi dat: " + sv1.kiemTraThiDat());
		System.out.println("SV2 Thi dat: " + sv2.kiemTraThiDat());
		System.out.println("SV3 Thi dat: " + sv3.kiemTraThiDat());
		
		System.out.println("Kiem tra sv1 co cung ngay sinh sv2: " + sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("Kiem tra sv1 co cung ngay sinh sv3: " + sv1.kiemTraCungNgaySinh(sv3));		
		
		
//		System.out.println("In this: " + sv1.inThis());
	}
}
