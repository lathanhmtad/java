package main;


public class VayTheChapOTo extends KhoanVay {
	private String bienSoXe;
	private String loaiXe;
	private String chuNhan;
	private String soHopDongBaoHiemXe;
	private double giaTriXe;
	private String cavet;
	

	public VayTheChapOTo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VayTheChapOTo(String id, String fullname, String cccd, String dob, String address, String sdt,
			double giaTriKhoanVay, String kyHanVay, String laiSuat, String mucDichVay, String phiPhat, String bienSoXe,
			String loaiXe, String chuNhan, String soHopDongBaoHiemXe, double giaTriXe, String cavet) {
		super(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay, laiSuat, mucDichVay, phiPhat);
		this.bienSoXe = bienSoXe;
		this.loaiXe = loaiXe;
		this.chuNhan = chuNhan;
		this.soHopDongBaoHiemXe = soHopDongBaoHiemXe;
		this.giaTriXe = giaTriXe;
		this.cavet = cavet;
	}

	public String getBienSoXe() {
		return bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public String getChuNhan() {
		return chuNhan;
	}

	public void setChuNhan(String chuNhan) {
		this.chuNhan = chuNhan;
	}

	public String getSoHopDongBaoHiemXe() {
		return soHopDongBaoHiemXe;
	}

	public void setSoHopDongBaoHiemXe(String soHopDongBaoHiemXe) {
		this.soHopDongBaoHiemXe = soHopDongBaoHiemXe;
	}

	public double getGiaTriXe() {
		return giaTriXe;
	}

	public void setGiaTriXe(double giaTriXe) {
		this.giaTriXe = giaTriXe;
	}

	public String getCaVetXe() {
		return cavet;
	}

	public void setCaVetXe(String cavet) {
		this.cavet = cavet;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Biển số xe: " + bienSoXe);
		System.out.println("Loại xe: " + loaiXe);
		System.out.println("Chủ sở hữu: " + chuNhan);
		System.out.println("Số hiệu hợp đồng bảo hiểm xe: " + soHopDongBaoHiemXe);
		System.out.println("Gía trị thẩm định xe: " + super.formatPrice(giaTriXe));
		System.out.println("Cà vẹt xe: " + cavet);
		
	}
	
}
