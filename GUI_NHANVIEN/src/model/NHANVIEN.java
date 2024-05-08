package model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class NHANVIEN implements NHANVIEN_INTERFACE {
	private String id;
	private String fullname;
	private Date ngayVaoCoQuan;
	
	
	public NHANVIEN(String id, String fullname, Date ngayVaoCoQuan) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.ngayVaoCoQuan = ngayVaoCoQuan;
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

	public Date getNgayVaoCoQuan() {
		return ngayVaoCoQuan;
	}

	public void setNgayVaoCoQuan(Date ngayVaoCoQuan) {
		this.ngayVaoCoQuan = ngayVaoCoQuan;
	}

	public abstract String toString();
	
	public int seniority() {
		long millis = System.currentTimeMillis();
		Date now = new Date(millis);
		
		long diff = now.getTime() - ngayVaoCoQuan.getTime();
		
		int result = (int)(((int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)) / 365.25);
				
		return result;
		
	}
}
