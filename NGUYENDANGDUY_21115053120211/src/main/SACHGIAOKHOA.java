package main;

public class SACHGIAOKHOA extends SACH {
	private String tinhTrang;
	
	

	public SACHGIAOKHOA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SACHGIAOKHOA(String maSach, String nxb, String ngayNhap, double donGia, int soLuong, String tinhTrang) {
		// TODO Auto-generated constructor stub
		super(maSach, nxb, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub

		return getSoLuong() * getDonGia() - tinhTienGiam();
	}

	@Override
	public double tinhTienGiam() {
		// TODO Auto-generated method stub
		if(tinhTrang.equalsIgnoreCase("Mới"))
			return getSoLuong() * getDonGia() * 0.1;
		else if(tinhTrang.equalsIgnoreCase("Cũ"))
			return getSoLuong() * getDonGia() * 0.5;
		return 0;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public String toString() {
		return "SACHGIAOKHOA [maSach=" + getMaSach() + ", nxb=" + getNxb() + ", ngayNhap=" + getNgayNhap() + ", donGia=" + getDonGia()
				+ ", soLuong=" + getSoLuong() + ", tinhTrang=" + tinhTrang + "]";
	}
	
}
