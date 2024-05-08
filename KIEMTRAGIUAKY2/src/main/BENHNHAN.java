package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BENHNHAN
{
	private String id;
	private String name;
	private Date ngayNhapVien;
	private boolean phongTheoYeuCau;
	
	public BENHNHAN(String id, String name, String ngayNhapVien, boolean phongTheoYeuCau) {
		super();
		this.id = id;
		this.name = name;
		this.ngayNhapVien = setNgayNhapVien(ngayNhapVien);
		this.phongTheoYeuCau = phongTheoYeuCau;
	}
	
	public Date setNgayNhapVien(String input)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(input);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return date;
	}
	
	public String getNgayNhapVien()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(ngayNhapVien);	
	}
	
	@Override
	public String toString() {
		return "BENHNHAN [id=" + id + ", name=" + name + ", ngayNhapVien=" + getNgayNhapVien() + ", phongTheoYeuCau="
				+ phongTheoYeuCau + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass().getSuperclass())
			return false;
		BENHNHAN other = (BENHNHAN) obj;
		return Objects.equals(id, other.id);
	}	
	
	// Tính số ngày nhập viện mà ngày ra viện lấy từ ngày hiện tại
	public int tinhSoNgayNhapVien() {
		// Lấy ngày hiện tại
		long millis = System.currentTimeMillis();
		Date ngayHienTai = new Date(millis);
		
		// Lấy ra diff giữa 2 ngày
		long diff = ngayHienTai.getTime() - ngayNhapVien.getTime();
		
		// Trả về khoảng cách ngày giữa 2 date
		return (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// Tính số ngày nhập viện mà ngày ra viện được nhận từ chuỗi input
	public int tinhSoNgayNhapVien(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date ngayRaVien = null;
		try {
			ngayRaVien = sdf.parse(input);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// Lấy ra diff giữa 2 ngày
		long diff = ngayRaVien.getTime() - ngayNhapVien.getTime();
		
		// Trả về khoảng cách ngày giữa 2 date
		return (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

}
