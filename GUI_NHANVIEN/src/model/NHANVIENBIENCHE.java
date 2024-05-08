package model;

import java.util.Date;

public class NHANVIENBIENCHE extends NHANVIEN {

	private double heSoLuong;
	
	public NHANVIENBIENCHE(String id, String fullname, Date ngayVaoCoQuan) {
		super(id, fullname, ngayVaoCoQuan);
	}

	@Override
	public double phucap() {
		if()
		return 0.1 * luongCB
	}

	@Override
	public double thuclinh() {
		return heSoLuong * luongCB + ;
	}

	@Override
	public String toString() {
		return null;
	}
	
}
