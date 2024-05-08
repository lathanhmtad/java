public class ViDu {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		System.out.println(" -a => giá trị: " + (-a));
		System.out.println(" +a => giá trị: " + (+a));
		System.out.println(" !b => giá trị: " + (!b));
		
		System.out.println("-----------");
		System.out.println("a = " + a);
		System.out.println(" ++a => giá trị: " + (++a));
		System.out.println(" a++ => giá trị: " + (a++));
		System.out.println("a = " + a);

		System.out.println("-----------");
		System.out.println("a = " + a);
		System.out.println(" a++ => giá trị: " + (a++));
		System.out.println(" a-- => giá trị: " + (a--));
		System.out.println("a = " + a);
	}
}
