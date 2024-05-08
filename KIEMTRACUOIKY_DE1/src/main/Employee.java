package main;

import java.util.Objects;

public class Employee {
	private String maNhanVien;
	private String fullName;
	private String ngaySinh;
	private String diachi;
	private String queQuan;
	private String sdt;
	private String email;
	
	public Employee(String maNhanVien, String fullName, String ngaySinh, String diachi, String queQuan, String sdt,
			String email) {
		this.maNhanVien = maNhanVien;
		this.fullName = fullName;
		this.ngaySinh = ngaySinh;
		this.diachi = diachi;
		this.queQuan = queQuan;
		this.sdt = sdt;
		this.email = email;
	}

	public Employee() {}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [maNhanVien=" + maNhanVien + ", fullName=" + fullName + ", ngaySinh=" + ngaySinh + ", diachi="
				+ diachi + ", queQuan=" + queQuan + ", sdt=" + sdt + ", email=" + email + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(maNhanVien, other.maNhanVien);
	}
	
	
	
	
	
	
}
