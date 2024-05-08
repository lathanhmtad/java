package Test;

import Code.Infor;

public class Test {
	private Infor infor;
	
	public void method() {
//		this.infor.a => Khong truy cap dc
//		this.infor.c  => Khong truy cap duoc
		this.infor.d = 4;
	}
}