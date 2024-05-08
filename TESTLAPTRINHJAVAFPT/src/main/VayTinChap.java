package main;


public class VayTinChap extends KhoanVay {
	private String soHoKhau;
	private String company;
	private String workspace;
	
	public VayTinChap() {
		super();
	}
	
	public VayTinChap(String id, String fullname, String cccd, String dob, String address, String sdt,
			double giaTriKhoanVay, String kyHanVay, String laiSuat, String mucDichVay, String phiPhat, String soHoKhau,
			String company, String workspace) {
		super(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay, laiSuat, mucDichVay, phiPhat);
		this.soHoKhau = soHoKhau;
		this.company = company;
		this.workspace = workspace;
	}

	public String getSoHoKhau() {
		return soHoKhau;
	}

	public void setSoHoKhau(String soHoKhau) {
		this.soHoKhau = soHoKhau;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	
	
	public void printData() {
		super.printData();
		System.out.println("Sổ hộ khẩu: " + soHoKhau);
		System.out.println("Công ty: " + company);
		System.out.println("Nơi làm việc: " + workspace);
	}
	
	
	
}
