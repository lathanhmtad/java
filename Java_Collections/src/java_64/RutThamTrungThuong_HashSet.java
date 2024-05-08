package java_64;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong;
	
	public RutThamTrungThuong_HashSet() {
		super();
		this.thungPhieuDuThuong = new HashSet<String>();
	}
	
	public boolean themPhieu(String giaTri)
	{
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri)
	{
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri)
	{
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong()
	{
		this.thungPhieuDuThuong.clear();
	}
	
	public int laySoLuong()
	{
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutMotPhieu()
	{
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(laySoLuong());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCa()
	{
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	
	public static void main(String[] args) {
		
		int luuChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		do
		{
			System.out.println("--------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa đi mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu");
			System.out.println("0. Thoát khỏi chưa trình");
			luuChon = sc.nextInt();
			sc.nextLine();
			if(luuChon == 1 || luuChon == 2 || luuChon == 3)
			{
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				
				if(luuChon == 1)
					rt.themPhieu(giaTri);
				else if(luuChon == 2)
					rt.xoaPhieu(giaTri);
				else 
					System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
			} 
			else if(luuChon == 4)
				rt.xoaTatCaPhieuDuThuong();
			else if(luuChon == 5)
				System.out.println("Số lượng phiếu là: " + rt.laySoLuong());
			else if(luuChon == 6)
				System.out.println("Mã số trúng thưởng là: " + rt.rutMotPhieu());
			else if(luuChon == 7)
			{
				System.out.println("Các mã phiếu dự thưởng là: " );
				rt.inTatCa();
			}
			
			
		} while(luuChon != 0);
	}


	
}
