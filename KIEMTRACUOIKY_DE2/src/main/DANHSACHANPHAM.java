package main;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class DANHSACHANPHAM {
	private ArrayList<ANPHAM> list;
	

	public DANHSACHANPHAM() {
		super();
		this.list = new ArrayList<ANPHAM>();
	}
	
	public void themMoiAnPham(ANPHAM newAP)
	{
		list.add(newAP);
	}
	
	public void xoaAnPham(String id)
	{
		int n = list.size();
		for (int i = 0; i < n; i++) {
			if(list.get(i).getMaAnPham().equals(id))
			{
				list.remove(i);
				return;
			}
		}
	}
	
	public void update(String id)
	{
		int n = list.size();
		ANPHAM apUpdate = null;
		int i;
		for (i = 0; i < n; i++) {
			if(list.get(i).getMaAnPham().equals(id))
			{
				apUpdate = list.get(i);
				break;
			}
		}
		
		
		if(apUpdate != null) // nếu tìm thấy
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nNhập thông tin để update ấn phẩm có mã " + id + ":");
			
			System.out.println("Cập nhập ngày nhập: ");
			apUpdate.setNgayNhap(sc.nextLine());
			
			System.out.println("Cập nhập nhà xuất bản");
			apUpdate.setNxb(sc.nextLine());
			
			System.out.println("Cập nhập đơn giá: ");
			apUpdate.setDonGia(Double.parseDouble(sc.nextLine()));
			
			System.out.println("Cập nhập số lượng: ");
			apUpdate.setDonGia(Integer.parseInt(sc.nextLine()));
			
			if(apUpdate instanceof SACH)
			{
				System.out.println("Cập nhập tình trạng: ");
				((SACH) apUpdate).setTinhTrang(sc.nextLine());
			}
			
			if(apUpdate instanceof TAPCHI)
			{
				System.out.println("Cập nhập thuế: ");
				((TAPCHI) apUpdate).setThue(Double.parseDouble(sc.nextLine()));
			}
			
			list.set(i, apUpdate);

			System.out.println("UPDATE THÔNG TIN THÀNH CÔNG!");
			sc.close();
		}
		else
		{
			System.out.println("Không tìm thấy ấn phẩm có mã " + id + " trong danh sách!");
		}
	}
	
	public ANPHAM search(String id)
	{
		int n = list.size();
		ANPHAM res = null;
		for (int i = 0; i < n; i++) {
			if(list.get(i).getMaAnPham().equals(id))
			{
				res = list.get(i);
				return res;
			}
		}
		return null;
	}
	
	private String formatPrice(double input)
	{
		Locale locale = new Locale("vi", "VN");
		Currency currency = Currency.getInstance("VND");
				
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		numberFormat.setCurrency(currency);
		
		return numberFormat.format(input);
	}
	
	
	public String tongTienSach()
	{
		double tongTienSach = 0;
		for (ANPHAM anpham : list) {
			if(anpham instanceof SACH)
			{
				tongTienSach += ((SACH) anpham).tinhThanhTien();
			}
		}
		return formatPrice(tongTienSach);
	}
	
	public String tongTienTapChi()
	{
		double tongTienTapChi = 0;
		for (ANPHAM anpham : list) {
			if(anpham instanceof TAPCHI)
			{
				tongTienTapChi += ((TAPCHI) anpham).tinhThanhTien();
			}
		}
		return formatPrice(tongTienTapChi);
	}
	
	public void inDS()
	{
		for (ANPHAM anpham : list) {
			if(anpham instanceof SACH)
			{
				System.out.println(((SACH) anpham).toString());
			}
			else 
			{
				System.out.println(((TAPCHI) anpham).toString());
			}
		}
	}
}
