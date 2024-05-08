package main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BENHNHANBAOHIEMXAHOI extends BENHNHAN implements IVIENPHI {
    private String maBHXH;

    public BENHNHANBAOHIEMXAHOI(String id, String name, String ngayNhapVien, boolean phongTheoYeuCau, String maBHXH) {
		super(id, name, ngayNhapVien, phongTheoYeuCau);
		this.maBHXH = maBHXH;
	}
    
    @Override
	public String toString() {
		return "BNBHXH [id=" + getId() + ", name=" + getName() + ", ngayNhapVien=" + getNgayNhapVien() + ", phongTheoYeuCau="
				+ isPhongTheoYeuCau() + ", maBHXH = " + maBHXH + "]";
	}
    
	@Override
	public double tinhHoaDonVienPhi() {
		// TODO Auto-generated method stub
		int soNgayNhapVien = tinhSoNgayNhapVien();
        if (isPhongTheoYeuCau()) 
            return soNgayNhapVien * donGiaPhong * 200000;
        return soNgayNhapVien * donGiaPhong;
	}


}
