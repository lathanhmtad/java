
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(15, 9, 2030);
		Ngay ngay3 = new Ngay(30, 59, 2025);
		
		TacGia tacGia1 = new TacGia("Tung ITV", ngay1);
		TacGia tacGia2 = new TacGia("Tung Le", ngay2);
		TacGia tacGia3 = new TacGia("Peter", ngay3);
		
		Sach sach1 = new Sach("Lap Trinh C", 5000, 2023, tacGia1);
		Sach sach2 = new Sach("Lap Trinh Java", 3000, 2030, tacGia2);
		Sach sach3 = new Sach("Lap Trinh Mang", 15000, 2023, tacGia3);
		
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sanh nam xuat ban sach 1 va 3: " + sach1.kiemTraCungNamXuatBan(sach3));

		System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 20%: " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 50%: " + sach3.giaSauKhiGiam(50));
		
		System.out.println("Nam xuat ban sach 1: " + sach1.getNamXuatBan());
	}
}
