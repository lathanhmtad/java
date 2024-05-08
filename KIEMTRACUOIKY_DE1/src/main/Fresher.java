package main;

import java.util.Date;

public class Fresher extends Employee {
	private Date thoiDiemTotNghiep;
	private String xepLoai;
	private String truongTotNghiep;
	
	public Fresher(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email, Date thoiDiemTotNghiep, String xepLoai, String truongTotNghiep) {
		super(maNhanVien, fullName, ngaySinh, diachi, queQuan, sdt, email);
		this.thoiDiemTotNghiep = thoiDiemTotNghiep;
		this.xepLoai = xepLoai;
		this.truongTotNghiep = truongTotNghiep;
	}

	public Fresher(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email) {
		super(maNhanVien, fullName, ngaySinh, diachi, queQuan, sdt, email);
	}

	public Date getThoiDiemTotNghiep() {
		return thoiDiemTotNghiep;
	}

	public void setThoiDiemTotNghiep(Date thoiDiemTotNghiep) {
		this.thoiDiemTotNghiep = thoiDiemTotNghiep;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public String getTruongTotNghiep() {
		return truongTotNghiep;
	}

	public void setTruongTotNghiep(String truongTotNghiep) {
		this.truongTotNghiep = truongTotNghiep;
	}

	@Override
	public String toString() {
		return "Fresher [thoiDiemTotNghiep=" + thoiDiemTotNghiep + ", xepLoai=" + xepLoai + ", truongTotNghiep="
				+ truongTotNghiep + "]";
	}
	
	
}
