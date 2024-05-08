
public class Test {
	public static void main(String[] args) {
		System.out.println("Kiểm tra");
		
		ConNguoi cn = new ConNguoi("TITV", 2021);
		
		cn.an();
		cn.uong();
		cn.ngu();
		
		HocSinh hs = new HocSinh("Duy", 2003, "21T2", "DHSPKT");
		
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();
	}
}
