package main;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class DANHSACH {
	private ArrayList<SACH> list;
	private Scanner sc;

	public DANHSACH() {
		super();
		this.list = new ArrayList<SACH>();
		sc = new Scanner(System.in);
	}
	
	public void themSach(SACH s)
	{
		list.add(s);
	}
	
	public void xoaSach(String id)
	{
		int n = list.size();
		for (int i = 0; i < n; i++) {
			if(list.get(i).getMaSach().equals(id))
			{
				list.remove(i);
				return;
			}
			
		}
		
	}
	
	public void update(String id)
	{
		int n = list.size();
		SACH sachUpdate = null;
		int i;
		for (i = 0; i < n; i++) {
			if(list.get(i).getMaSach().equals(id))
			{
				sachUpdate = list.get(i);
				break;
			}
		}
		
		
		if(sachUpdate != null) // nếu tìm thấy
		{	
			System.out.println("\nNhập thông tin để update sách có mã " + id + ":");
			
			System.out.println("Cập nhập ngày nhập: ");
			sachUpdate.setNgayNhap(sc.nextLine());
			
			System.out.println("Cập nhập nhà xuất bản");
			sachUpdate.setNxb(sc.nextLine());
			
			System.out.println("Cập nhập đơn giá: ");
			sachUpdate.setDonGia(Double.parseDouble(sc.nextLine()));
			
			System.out.println("Cập nhập số lượng: ");
			sachUpdate.setSoLuong(Integer.parseInt(sc.nextLine()));
			
			if(sachUpdate instanceof SACHGIAOKHOA)
			{
				System.out.println("Cập nhập tình trạng: ");
				((SACHGIAOKHOA) sachUpdate).setTinhTrang(sc.nextLine());
			}
			
			if(sachUpdate instanceof SACHTHAMKHAO)
			{
				System.out.println("Cập nhập thuế: ");
				((SACHTHAMKHAO) sachUpdate).setThue(Double.parseDouble(sc.nextLine()));
			}
			
			list.set(i, sachUpdate);

			System.out.println("UPDATE THÔNG TIN THÀNH CÔNG!");
		}
		else
		{
			System.out.println("Không tìm thấy sách có mã " + id + " trong danh sách!");
		}
	}
	
	public SACH timKiem(String id)
	{
		for (SACH sach : list) {
			if(sach.getMaSach().equals(id))
				return sach;
		}
		return null;
	}
	
	public String tongTienSachGiaoKhoa()
	{
		double res = 0;
		for (SACH sach : list) {
			if(sach instanceof SACHGIAOKHOA)
				res += ((SACHGIAOKHOA) sach).tinhThanhTien();
		}
		return formatPrice(res);
	}
	
	public String tongTienSachThamKhao()
	{
		double res = 0;
		for (SACH sach : list) {
			if(sach instanceof SACHTHAMKHAO)
				res += ((SACHTHAMKHAO) sach).tinhThanhTien();
		}
		return formatPrice(res);
	}
	
	private String formatPrice(double input)
	{
		Locale locale = new Locale("vi", "VN");
		Currency currency = Currency.getInstance("VND");
				
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		numberFormat.setCurrency(currency);
		
		return numberFormat.format(input);
	}
	
	
	private SACH nhapSGK() {
		System.out.println("Nhập id: ");
		String id = sc.nextLine();

		System.out.println("Nhập nhà xuất bản: ");
		String nxb = sc.nextLine();

		System.out.println("Nhập ngày nhập(ngày, tháng, năm): ");
		String ngayNhap = sc.nextLine();

		System.out.println("Nhập đơn giá: ");
		double dongia = Double.parseDouble(sc.nextLine());

		System.out.println("Nhập số lượng: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập tình trạng: ");
		String tinhTrang = sc.nextLine();

		SACH sgk = new SACHGIAOKHOA(id, nxb, ngayNhap, dongia, soLuong, tinhTrang);
		return sgk;
	}

	private SACH nhapSTK() {
		System.out.println("Nhập id: ");
		String id = sc.nextLine();

		System.out.println("Nhập nhà xuất bản: ");
		String nxb = sc.nextLine();

		System.out.println("Nhập ngày nhập(ngày, tháng, năm): ");
		String ngayNhap = sc.nextLine();

		System.out.println("Nhập đơn giá: ");
		double dongia = Double.parseDouble(sc.nextLine());

		System.out.println("Nhập số lượng: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập thuế: ");
		double thue = Double.parseDouble(sc.nextLine());

		SACH stk = new SACHTHAMKHAO(id, nxb, ngayNhap, dongia, soLuong, thue);
		return stk;
	}
	
	
	private void inDS()
	{
		for (SACH sach : list) {
			System.out.println(sach.toString());
		}
	}
	
	public void menuCongViec()
	{
		
		int choice;
		do {
			System.out.println("-----MENU CÔNG VIỆC------");
			System.out.println("1. Thêm sách");
			System.out.println("2. In danh sách các sách");
			System.out.println("3. Xóa sách theo mã sách");
			System.out.println("4. Cập nhập thông tin một sách được chỉ định theo mã sách");
			System.out.println("5. Tính tổng tiền sách theo từng loại");
			System.out.println("0. Thoát chương trình");

			System.out.println("Nhập lựu chọn của bạn: ");
			
			choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) // Thêm sách
			{
				System.out.println("1. Thêm sách giáo khoa");
				System.out.println("2. Thêm sách tham khảo");
				int type;
				System.out.println("Nhập loại sách cần thêm: ");
				type = Integer.parseInt(sc.nextLine());
				switch (type) {
				case 1: 
					SACH sgk = nhapSGK();
					list.add(sgk);
					System.out.println("Thêm sách thành công!");
					break;
				case 2: 
					SACH stk = nhapSTK();
					list.add(stk);
					System.out.println("Thêm sách thành công!");
					break;
				}
			}
			else if (choice == 2) // In danh sách các sách
			{
				inDS();
			} else if (choice == 3) // Xóa sách theo mã sách
			{
				String id;
				System.out.println("Nhập mã sách cần xóa: ");
				id = sc.nextLine();
				
				xoaSach(id);
				System.out.println("Xóa sách thành công!");
			}
			else if(choice == 4)
			{
				String id = null;
				System.out.println("Nhập mã sách cần update: ");
				id = sc.nextLine();
				update(id);
			}
			else if(choice == 5)
			{
				System.out.println("Tổng tiền sách giáo khoa: " + tongTienSachGiaoKhoa());
				System.out.println("Tổng tiền sách tham khảo: " + tongTienSachThamKhao());
			}
			
			System.out.println("\nPress Enter key to continue...");
			sc.nextLine();

		} while (choice >= 0 && choice <= 5);
		
		sc.close();
	}
	
}
