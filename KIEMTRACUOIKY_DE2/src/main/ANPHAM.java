package main;


public abstract class ANPHAM implements IANPHAM {
	private String maAnPham;
	private String ngayNhap;
	private String nxb;
	private double donGia;
	private int soluong;
	
	public ANPHAM() {
		super();
	}

	public ANPHAM(String maAnPham, String nxb, String ngayNhap, double donGia, int soluong) {
		super();
		this.maAnPham = maAnPham;
		this.nxb = nxb;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soluong = soluong;
	}

	public String getMaAnPham() {
		return maAnPham;
	}

	public void setMaAnPham(String maAnPham) {
		this.maAnPham = maAnPham;
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

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public abstract double tinhTienGiam();

	@Override
	public String toString() {
		return "ANPHAM [maAnPham=" + maAnPham + ", ngayNhap=" + ngayNhap + ", nxb=" + nxb + ", donGia=" + donGia
				+ ", soluong=" + soluong + "]";
	}

	
}
