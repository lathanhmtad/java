package main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class KhoanVay {
	private String id;
	private String fullname;
	private String cccd;
	private Date dob;
	private String address;
	private String sdt;
	private double giaTriKhoanVay;
	private String kyHanVay;
	private String laiSuat;
	private String mucDichVay;
	private String phiPhat;

	public KhoanVay() {
		super();
	}

	public KhoanVay(String id, String fullname, String cccd, String dob, String address, String sdt,
			double giaTriKhoanVay, String kyHanVay, String laiSuat, String mucDichVay, String phiPhat) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.cccd = cccd;
		setDob(dob);
		this.address = address;
		this.sdt = sdt;
		this.giaTriKhoanVay = giaTriKhoanVay;
		this.kyHanVay = kyHanVay;
		this.laiSuat = laiSuat;
		this.mucDichVay = mucDichVay;
		this.phiPhat = phiPhat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getDob() {
		return HandleDate.getDate(dob);
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDob(String dob) {
		this.dob = HandleDate.setDate(dob);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public double getGiaTriKhoanVay() {
		return giaTriKhoanVay;
	}

	public void setGiaTriKhoanVay(double giaTriKhoanVay) {
		this.giaTriKhoanVay = giaTriKhoanVay;
	}

	public String getKyHanVay() {
		return kyHanVay;
	}

	public void setKyHanVay(String kyHanVay) {
		this.kyHanVay = kyHanVay;
	}

	public String getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(String laiSuat) {
		this.laiSuat = laiSuat;
	}

	public String getMucDichVay() {
		return mucDichVay;
	}

	public void setMucDichVay(String mucDichVay) {
		this.mucDichVay = mucDichVay;
	}

	public String getPhiPhat() {
		return phiPhat;
	}

	public void setPhiPhat(String phiPhat) {
		this.phiPhat = phiPhat;
	}

	public String formatPrice(double input) {
		Locale locale = new Locale("vi", "VN");
		Currency currency = Currency.getInstance("VND");

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		numberFormat.setCurrency(currency);

		return numberFormat.format(input);
	}

	public void printData() {
		System.out.println("\n--Thông tin khoản vay: ");
		System.out.println("Mã khách hàng: " + id);
		System.out.println("Họ và tên: " + fullname);
		System.out.println("Căn cước công dân: " + cccd);
		System.out.println("Ngày sinh: " + (CheckData.validDob(dob) ? getDob()
				: Color.RED + "Ngày sinh không hợp lệ và phải nhỏ hơn ngày hiện tại" + Color.RESET));
		System.out.println("Địa chỉ: " + address);
		System.out.println("Số điện thoại: " + (CheckData.validPhoneNumber(sdt) ? sdt
				: Color.RED + "Dữ liệu số điện thoại không hợp lệ" + Color.RESET));
		System.out
				.println("Gía trị khoản vay: " + (CheckData.validKhoanVay(giaTriKhoanVay) ? formatPrice(giaTriKhoanVay)
						: Color.RED + "Dữ liệu khoản vay không hợp lệ" + Color.RESET));
		System.out.println("Kỳ hạn vay: " + kyHanVay);
		System.out.println("Lãi suất: " + laiSuat);
		System.out.println("Mục đích vay: " + mucDichVay);
		System.out.println("Phí phạt trả trợ trước hạn: " + phiPhat);
	}

}
