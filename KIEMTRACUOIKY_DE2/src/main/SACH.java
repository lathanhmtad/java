package main;

public class SACH extends ANPHAM {
	private String tinhTrang;

	
	public SACH() {
		super();
	}
	
	public SACH(String maAnPham, String nxb, String ngayNhap, double donGia, int soluong, String tinhTrang) {
		// TODO Auto-generated constructor stub
		super(maAnPham, nxb, ngayNhap, donGia, soluong);
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub
		
		return getSoluong() * getDonGia() - tinhTienGiam();
	}

	@Override
	public double tinhTienGiam() {
		// TODO Auto-generated method stub
		if(tinhTrang.equalsIgnoreCase("Mới"))
		{
			return getSoluong() * getDonGia() * 0.1;
		}
		else if(tinhTrang.equalsIgnoreCase("Cũ"))
		{
			return getSoluong() * getDonGia() * 0.5;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "SACH [maAnPham=" + getMaAnPham() + ", ngayNhap=" + getNgayNhap() + ", nxb=" + getNxb() + ", donGia=" + getDonGia()
				+ ", soluong=" + getSoluong() + ", tình trạng=" + tinhTrang + "]";
	}
}
