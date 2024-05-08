
public class XeOto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("Xe ô tô", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 60;
	}
	
}
