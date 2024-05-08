package main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BENHNHANBAOHIEMYTE extends BENHNHAN implements IVIENPHI {
    private String maBHYT;
    

	public BENHNHANBAOHIEMYTE(String id, String name, String ngayNhapVien, boolean phongTheoYeuCau, String maBHYT) {
		super(id, name, ngayNhapVien, phongTheoYeuCau);
		this.maBHYT = maBHYT;
	}

    
	@Override
    public double tinhHoaDonVienPhi() {
		int soNgayNhapVien = tinhSoNgayNhapVien();
        if (isPhongTheoYeuCau()) 
            return (soNgayNhapVien * donGiaPhong * 200000) - ((soNgayNhapVien * donGiaPhong) * 0.7);
        return (soNgayNhapVien * donGiaPhong) - ((soNgayNhapVien * donGiaPhong) * 0.7);
    }


	@Override
	public String toString() {
		return "BNBHYT [id=" + getId() + ", name=" + getName() + ", ngayNhapVien=" + getNgayNhapVien() + ", phongTheoYeuCau="
				+ isPhongTheoYeuCau() + ", maBHYT = " + maBHYT + "]";
	}

}
