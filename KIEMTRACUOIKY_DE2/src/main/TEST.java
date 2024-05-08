package main;

public class TEST {
	public static void main(String[] args) {
		DANHSACHANPHAM list = new DANHSACHANPHAM();
		
		ANPHAM ap1 = new SACH("001", "Kim đồng", "14/10/2003", 150000, 10, "MỚI");
		ANPHAM ap2 = new SACH("002", "Duy Nguyễn", "12/2/2022", 245000, 32, "Cũ");
		ANPHAM ap3 = new TAPCHI("003", "Đạt còi", "18/12/2022", 554000, 45, 10);
		ANPHAM ap4 = new TAPCHI("004", "Huy Béo", "1/12/2021", 624000, 15, 20);
		
		list.themMoiAnPham(ap1);
		list.themMoiAnPham(ap2);
		list.themMoiAnPham(ap3); // 23 683 500.1
		list.themMoiAnPham(ap4);
		
		list.inDS();
		
		System.out.println("Tổng tiền sách: " + list.tongTienSach());
		System.out.println("Tổng tiền tạp chí: " + list.tongTienTapChi());
		
		System.out.println("Tìm kiếm mã ấn phẩm 003: " + list.search("003"));
		
		list.update("003");
		
		System.out.println("--DS SAU KHI CẬP NHẬP--");
		list.inDS();
		System.out.println("Tổng tiền sách: " + list.tongTienSach());
		System.out.println("Tổng tiền tạp chí: " + list.tongTienTapChi());
	}
}
