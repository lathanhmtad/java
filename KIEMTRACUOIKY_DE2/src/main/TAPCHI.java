package main;

public class TAPCHI extends ANPHAM {
	private double thue;
	
	
	

	public TAPCHI() {
		super();
	}
	
	


	public TAPCHI(String maAnPham, String nxb, String ngayNhap, double donGia, int soluong, double thue) {
		// TODO Auto-generated constructor stub
		super(maAnPham, nxb, ngayNhap, donGia, soluong);
		this.thue = thue;
	}




	public double getThue() {
		return thue;
	}


	public void setThue(double thue) {
		this.thue = thue;
	}


	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub
		return getSoluong() * getDonGia() + thue - tinhTienGiam();
	}

	@Override
	public double tinhTienGiam() {
		// TODO Auto-generated method stub
		return getSoluong() * getDonGia() * 0.05;
	}
	
	@Override
	public String toString() {
		return "TAPCHI [maAnPham=" + getMaAnPham() + ", ngayNhap=" + getNgayNhap() + ", nxb=" + getNxb() + ", donGia=" + getDonGia()
				+ ", soluong=" + getSoluong() + ", thuế=" + thue + "%" + "]";
	}

}
