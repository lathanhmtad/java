package model;

public class TimKiemModel {
	private String vanBan;
	private String tuKhoa;
	private String ketQua;
	
	public TimKiemModel() {
		this.vanBan = "";
		this.tuKhoa = "";
		this.ketQua = "";
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
	public void timKiem()
	{
		int dem = 0;
		int viTri = 0;
		while(true)
		{
			int i = vanBan.indexOf(tuKhoa, viTri);
			if(i == -1)
				break; // case no search result
			else
			{
				dem++;
				viTri = i + 1;
			}
			
		}
		ketQua = "Kết quả: có " + dem + " " + tuKhoa;
	}
}
