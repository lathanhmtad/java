package Code;

public class ViDu {
	private Infor infor;
	
	public void method() {
//		this.infor.a => Khong truy xuat duoc
		this.infor.b = 2; // => Truy cap duoc
		this.infor.c = 3; // Truy cap duoc
		this.infor.d = 4;
	}
}
