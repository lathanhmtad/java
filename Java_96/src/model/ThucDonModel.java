package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luuChon_MonChinh;
	private String luuChon_MonPhu;
	private double tongTien;
	
	public ThucDonModel() {
		super();
		luuChon_MonChinh = "";
		luuChon_MonPhu = "";
		tongTien = 0;
	}

	public String getLuuChon_MonChinh() {
		return luuChon_MonChinh;
	}

	public void setLuuChon_MonChinh(String luuChon_MonChinh) {
		this.luuChon_MonChinh = luuChon_MonChinh;
	}

	public String getLuuChon_MonPhu() {
		return luuChon_MonPhu;
	}

	public void setLuuChon_MonPhu(String luuChon_MonPhu) {
		this.luuChon_MonPhu = luuChon_MonPhu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public void tinhTongTien() {
		// TODO Auto-generated method stub
		if(luuChon_MonChinh.equals("CƠM"))
			tongTien = 20000;
		else if(luuChon_MonChinh.equals("PHỞ"))
			tongTien = 50000;
		else if(luuChon_MonChinh.equals("BÁNH MỲ"))
			tongTien = 15000;
		
		StringTokenizer stk = new StringTokenizer(luuChon_MonPhu, "; ");
		while(stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			
			if(monPhu.equalsIgnoreCase("TRÀ SỬA"))
				tongTien += 5000;
			else if(monPhu.equalsIgnoreCase("COCACOLA"))
				tongTien += 10000;
			else if(monPhu.equalsIgnoreCase("BÁNH NGỌT"))
				tongTien += 15000;
			else if(monPhu.equalsIgnoreCase("Nem"))
				tongTien += 20000;
		}
	}
	
	
}
