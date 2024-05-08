package main;

import java.util.Date;

public class Intern extends Employee {
	private String chuyenNganhDangHoc;
	private String hocKyDangHoc;
	private String tenTruongDangHoc;
	private Date ngayDuKienTotNghiep;
	public Intern(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email, String chuyenNganhDangHoc, String hocKyDangHoc, String tenTruongDangHoc,
			Date ngayDuKienTotNghiep) {
		super(maNhanVien, fullName, ngaySinh, diachi, queQuan, sdt, email);
		this.chuyenNganhDangHoc = chuyenNganhDangHoc;
		this.hocKyDangHoc = hocKyDangHoc;
		this.tenTruongDangHoc = tenTruongDangHoc;
		this.ngayDuKienTotNghiep = ngayDuKienTotNghiep;
	}
	public Intern(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email) {
		super(maNhanVien, fullName, ngaySinh, diachi, queQuan, sdt, email);
	}
	public String getChuyenNganhDangHoc() {
		return chuyenNganhDangHoc;
	}
	public void setChuyenNganhDangHoc(String chuyenNganhDangHoc) {
		this.chuyenNganhDangHoc = chuyenNganhDangHoc;
	}
	public String getHocKyDangHoc() {
		return hocKyDangHoc;
	}
	public void setHocKyDangHoc(String hocKyDangHoc) {
		this.hocKyDangHoc = hocKyDangHoc;
	}
	public String getTenTruongDangHoc() {
		return tenTruongDangHoc;
	}
	public void setTenTruongDangHoc(String tenTruongDangHoc) {
		this.tenTruongDangHoc = tenTruongDangHoc;
	}
	public Date getNgayDuKienTotNghiep() {
		return ngayDuKienTotNghiep;
	}
	public void setNgayDuKienTotNghiep(Date ngayDuKienTotNghiep) {
		this.ngayDuKienTotNghiep = ngayDuKienTotNghiep;
	}
	
	
}
