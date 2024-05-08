package main;


public class Experience extends Employee {
	private int soNamKinhNghiem;
	private String kyNangChuyenMon;
	private String noiLamViecGanDay;
	
	public Experience(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email, int soNamKinhNghiem, String kyNangChuyenMon, String noiLamViecGanDay) {
		super(maNhanVien, fullName, ngaySinh, diachi, queQuan, sdt, email);
		this.soNamKinhNghiem = soNamKinhNghiem;
		this.kyNangChuyenMon = kyNangChuyenMon;
		this.noiLamViecGanDay = noiLamViecGanDay;
	}

	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public String getKyNangChuyenMon() {
		return kyNangChuyenMon;
	}

	public void setKyNangChuyenMon(String kyNangChuyenMon) {
		this.kyNangChuyenMon = kyNangChuyenMon;
	}

	public String getNoiLamViecGanDay() {
		return noiLamViecGanDay;
	}

	public void setNoiLamViecGanDay(String noiLamViecGanDay) {
		this.noiLamViecGanDay = noiLamViecGanDay;
	}

	@Override
	public String toString() {
		return "Experience [soNamKinhNghiem=" + soNamKinhNghiem + ", kyNangChuyenMon=" + kyNangChuyenMon
				+ ", noiLamViecGanDay=" + noiLamViecGanDay + "]";
	}
	
	
	
	
}
