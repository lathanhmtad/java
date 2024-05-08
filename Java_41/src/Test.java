
public class Test {
	public static void main(String[] args) {
		NguoiBaLan nbl = new NguoiBaLan("Tomek", 2002);
		NguoiVietNam nvn = new NguoiVietNam("Tung TITV", 2003);
		NguoiMy nm = new NguoiMy("Michal", 2004);
		
		nbl.xinChao();
		nvn.xinChao();
		nm.xinChao();
		
		nbl.ngu();
		nvn.ngu();
		nm.ngu();
		
	}
}
