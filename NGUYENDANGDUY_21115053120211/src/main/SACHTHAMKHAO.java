package main;

public class SACHTHAMKHAO extends SACH {

	private double thue;
	
	
	
	public SACHTHAMKHAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SACHTHAMKHAO(String maSach, String nxb, String ngayNhap, double donGia, int soLuong, double thue) {
		// TODO Auto-generated constructor stub
		super(maSach, nxb, ngayNhap, donGia, soLuong);
		this.thue = thue;
	}

	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub
		return getSoLuong() * getDonGia() + thue - tinhTienGiam();
	}

	@Override
	public double tinhTienGiam() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	@Override
	public String toString() {
		return "SACHTHAMKHAO [maSach=" + getMaSach() + ", nxb=" + getNxb() + ", ngayNhap=" + getNgayNhap() + ", donGia=" + getDonGia()
				+ ", soLuong=" + getSoLuong() + ", thue=" + thue + "]";
	}
	

}
