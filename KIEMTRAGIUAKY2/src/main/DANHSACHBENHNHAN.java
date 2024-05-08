	package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class DANHSACHBENHNHAN {
	private ArrayList<BENHNHAN> list;

	public DANHSACHBENHNHAN() {
		super();
		list = new ArrayList<BENHNHAN>();
	}
	
	public void themBenhNhan(BENHNHAN bn)
	{
		list.add(bn);
	}
	
	public void xoaBenhNhan(String id)
	{
		BENHNHAN bn = new BENHNHAN();
		bn.setId(id);
		list.remove(bn);
	}
	
	public BENHNHAN timKiemBenhNhan(String id)
	{
		BENHNHAN bn = new BENHNHAN();
		bn.setId(id);
		int index = list.indexOf(bn);
		
		return index == -1 ? null : list.get(index);
	}
	
	public String tongTienBNBHYT()
	{
		double res = 0;
		for (BENHNHAN benhnhan : list) {
			if(benhnhan instanceof BENHNHANBAOHIEMYTE)
			{
				res += ((BENHNHANBAOHIEMYTE) benhnhan).tinhHoaDonVienPhi();
			}
		}
		return formatPrice(res);
	}
	
	
	public String tongTienBNBHXH()
	{
		double res = 0;
		for (BENHNHAN benhnhan : list) {
			if(benhnhan instanceof BENHNHANBAOHIEMXAHOI)
			{
				res += ((BENHNHANBAOHIEMXAHOI) benhnhan).tinhHoaDonVienPhi();
			}
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
	
	public void readFile(String path)
	{
		File file = new File(path);
		
		try {
			if(!file.exists())
			{
				System.out.println("File không tồn tại hoặc đường dẫn sai!");
				return;
			}
			
			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			
			String line = null;
			while((line = br.readLine()) != null)
			{
				String delim = ", ";
				String[] data = line.split(delim);
				
				String type = data[0];
				String maBN = data[1];
				String name = data[2];
				String dob = data[3];
				boolean phong = Boolean.valueOf(data[4]);
				String msBH = data[5];
				
				// type == 1 => BNBHYT
				if(type.equals("1"))
				{
					BENHNHAN bnBHYT = new BENHNHANBAOHIEMYTE(maBN, name, dob, phong, msBH);
					list.add(bnBHYT);
				}
				else // BNBHXH
				{
					BENHNHAN bnBHXH = new BENHNHANBAOHIEMXAHOI(maBN, name, dob, phong, msBH);
					list.add(bnBHXH);
				}
			}
			
			System.out.println("Đã đọc thành công dữ liệu từ file!");
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeFile(String path)
	{
		File file = new File(path);
		
		try {
			if(!file.exists())
			{
				System.out.println("File không tồn tại hoặc đường dẫn sai tôi sẽ tạo file mới cho bạn với đường dẫn: " + path);
				boolean isSuccess = file.createNewFile();
				if(!isSuccess)
				{
					System.out.println("Không thể tạo file này!");
					return;
				}
			}
			
			PrintWriter pw = new PrintWriter(file);
			
			
			for (BENHNHAN benhnhan : list) {
				if(benhnhan instanceof BENHNHANBAOHIEMYTE)
					pw.println("1, " + benhnhan.getId() + ", " + benhnhan.getName() + ", " + benhnhan.getNgayNhapVien() + ", " + benhnhan.isPhongTheoYeuCau() + ", " + ((BENHNHANBAOHIEMYTE) benhnhan).getMaBHYT());
				else
					pw.println("2, " + benhnhan.getId() + ", " + benhnhan.getName() + ", " + benhnhan.getNgayNhapVien() + ", " + benhnhan.isPhongTheoYeuCau() + ", " + ((BENHNHANBAOHIEMXAHOI) benhnhan).getMaBHXH());
			}
			
			
			pw.flush();
			pw.close();
			
			System.out.println("Đã ghi thành công dữ liệu xuống file");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public void inDSBenhNhan()
	{
		if(list.isEmpty())
			System.out.println("Danh sách rỗng!");
		else
		{
			ArrayList<BENHNHAN> listBNBHYT = new ArrayList<BENHNHAN>();
			ArrayList<BENHNHAN> listBNBHXH = new ArrayList<BENHNHAN>();
			for (BENHNHAN benhnhan : list) {
				if(benhnhan instanceof BENHNHANBAOHIEMYTE)
					listBNBHYT.add(benhnhan);
				else
					listBNBHXH.add(benhnhan);
			}
			
			System.out.println("---Danh sách bệnh nhân BHYT ---");
			for (BENHNHAN benhnhan : listBNBHYT) {
				System.out.println(((BENHNHANBAOHIEMYTE) benhnhan).toString());				
			}
			
			System.out.println("---Danh sách bệnh nhân BHXH ---");
			for (BENHNHAN benhnhan : listBNBHXH) {
				System.out.println(((BENHNHANBAOHIEMXAHOI) benhnhan).toString());	
			}
		}
	}
}
