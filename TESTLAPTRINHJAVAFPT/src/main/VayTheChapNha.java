package main;

import java.util.Date;

public class VayTheChapNha extends KhoanVay {
	private String chungNhan;
	private Date ngayCapQuyen;
	private String chuSoHuu;
	private double giaTri;

	public VayTheChapNha() {
		super();
	}

	public VayTheChapNha(String id, String fullname, String cccd, String dob, String address, String sdt,
			double giaTriKhoanVay, String kyHanVay, String laiSuat, String mucDichVay, String phiPhat, String chungNhan,
			String ngayCapQuyen, String chuSoHuu, double giaTri) {
		super(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay, laiSuat, mucDichVay, phiPhat);
		this.chungNhan = chungNhan;
		setNgayCapQuyen(ngayCapQuyen);
		this.chuSoHuu = chuSoHuu;
		this.giaTri = giaTri;
	}

	public String getChungNhan() {
		return chungNhan;
	}

	public void setChungNhan(String chungNhan) {
		this.chungNhan = chungNhan;
	}

	public Date getNgayCapQuyen() {
		return ngayCapQuyen;
	}

	public void setNgayCapQuyen(Date ngayCapQuyen) {
		this.ngayCapQuyen = ngayCapQuyen;
	}

	public void setNgayCapQuyen(String ngayCapQuyen) {
		this.ngayCapQuyen = HandleDate.setDate(ngayCapQuyen);
	}

	public String getChuSoHuu() {
		return chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}

	public double getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(double giaTri) {
		this.giaTri = giaTri;
	}

	@Override
	public String toString() {
		return "VayTheChapNha [chungNhan=" + chungNhan + ", ngayCapQuyen=" + ngayCapQuyen + ", chuSoHuu=" + chuSoHuu
				+ ", giaTri=" + giaTri + ", getId()=" + getId() + ", getFullname()=" + getFullname() + ", getCccd()="
				+ getCccd() + ", getDob()=" + getDob() + ", getAddress()=" + getAddress() + ", getSdt()=" + getSdt()
				+ ", getGiaTriKhoanVay()=" + getGiaTriKhoanVay() + ", getKyHanVay()=" + getKyHanVay()
				+ ", getLaiSuat()=" + getLaiSuat() + ", getMucDichVay()=" + getMucDichVay() + ", getPhiPhat()="
				+ getPhiPhat() + "]";
	}

	public void printData() {
		super.printData();
		System.out.println(
				"Mã giấy chứng nhận quyền sử dụng đất: " + (CheckData.validChungNhanSuDungDat(chungNhan) ? chungNhan
						: Color.RED + "Dữ liệu không hợp lệ" + Color.RESET));
		System.out.println("Ngày cấp quyền: " + HandleDate.getDate(ngayCapQuyen));
		System.out.println("Chủ sở hữu: " + chuSoHuu);
		System.out.println("Gía trị thẩm định nhà: " + super.formatPrice(giaTri));

	}
}
