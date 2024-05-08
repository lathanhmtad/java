package java_65;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
//	Map<String, String> data = new TreeMap<String, String>();
	
	Map<String, String> data = new HashMap<String, String>();
	public String themTu(String tuKhoa, String yNghia) {
		return this.data.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa)
	{
		return this.data.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa)
	{
		String yNghia = this.data.get(tuKhoa);
		return yNghia;
	}
	
	public void inTuKhoa()
	{
		Set<String> tapHopTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int laySoLuong()
	{
		return this.data.size();
	}
	
	public void xoaTatCa()
	{
		this.data.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luuChon = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("--------------");
			System.out.println("MENU ");
			System.out.println("Tra từ điển Anh - Việt");
			System.out.println("1. Thêm từ(Từ khóa, Ý nghĩa)");
			System.out.println("2. Xóa từ");
			System.out.println("3. Tìm ý nghĩa của từ khóa => Tra từ");
			System.out.println("4. In ra danh sách từ khóa");
			System.out.println("5. In ra số lượng từ");
			System.out.println("6. Xóa tất cả các từ khóa");
			System.out.println("0. Thoát chương trình");
			luuChon = sc.nextInt(); sc.nextLine();
			if(luuChon == 1)
			{
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			}
			else if(luuChon == 2 || luuChon == 3)
			{
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				if(luuChon == 2)
					tuDien.xoaTu(tuKhoa);
				else
					System.out.println("Ý nghĩa là: " + tuDien.traTu(tuKhoa));
			}
			else if(luuChon == 4)
				tuDien.inTuKhoa();
			else if(luuChon == 5)
				System.out.println("Số lượng từ khóa là: " + tuDien.laySoLuong());
			else if(luuChon == 6)
				tuDien.xoaTatCa();
		} while(luuChon != 0);
	}
}
