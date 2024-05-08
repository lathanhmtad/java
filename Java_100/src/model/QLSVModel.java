package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luuChon;

	public QLSVModel() {
		super();
		dsThiSinh = new ArrayList<ThiSinh>();
		luuChon = "";
	}

	public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
		super();
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}
	
	public void insert(ThiSinh thiSinh)
	{
		dsThiSinh.add(thiSinh);
	}
		
	public void remove(ThiSinh thiSinh)
	{
		dsThiSinh.remove(thiSinh);
	}
	
	public void edit()
	{
		
	}
	
	public void update(ThiSinh thiSinh)
	{
		dsThiSinh.remove(thiSinh);
		dsThiSinh.add(thiSinh);
	}

	public String getLuuChon() {
		return luuChon;
	}

	public void setLuuChon(String luuChon) {
		this.luuChon = luuChon;
	}

	public boolean kiemTraTonTai(ThiSinh ts) {
		// TODO Auto-generated method stub
		for (ThiSinh thiSinh : dsThiSinh) {
			if(thiSinh.getMaThiSinh() == ts.getMaThiSinh())
				return true;
		}
		return false;
	}

	
	
	
}
