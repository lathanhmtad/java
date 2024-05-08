package main;

public abstract class SACH implements ISACH {
	private String maSach;
	private String nxb;
	private String ngayNhap;
	private double donGia;
	private int soLuong;
	
	
	
	public SACH() {
		super();
	}

	public SACH(String maSach, String nxb, String ngayNhap, double donGia, int soLuong) {
		super();
		this.maSach = maSach;
		this.nxb = nxb;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public abstract double tinhTienGiam();

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "SACH [maSach=" + maSach + ", nxb=" + nxb + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}
	
	
	
	
	
}
