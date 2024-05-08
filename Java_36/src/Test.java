
public class Test {
	public static void main(String[] args) {	
		Ngay ngay1 = new Ngay(15, 5, 2022);
		Ngay ngay2 = new Ngay(12, 1, 2025);
		Ngay ngay3 = new Ngay(28, 9, 2023);
				
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "Trung Quoc");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Ba Lan");
		
		BoPhim boPhim1 = new BoPhim("Bo Gia", 2022, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2020, hangSanXuat2, 100000, ngay2);
		BoPhim boPhim3 = new BoPhim("Kham Pha Ba Lan", 2050, hangSanXuat3, 115000, ngay3);
		
		System.out.println("SS gia 1 re hon 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("SS gia 3 re hon 1: " + boPhim3.kiemTraGiaVeReHon(boPhim1));
		
		System.out.println("Ten hang san xuat bo phim 3: " + boPhim3.layTenHangSanXuat());
		
		System.out.println("Bo phim 2 giam 10%: " + boPhim2.giaSauKhuyenMai(10));
	}
}
