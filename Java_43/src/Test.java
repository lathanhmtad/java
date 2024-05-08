
public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("min(122.11, 6.0) = " + mm.timMin(122.11, 6.0));
		System.out.println("min(5, 6) = " + mm.timMin(5, 6));
		System.out.println("tingTong(5, 6.2) = " + mm.tinhTong(5, 6.2));
		double arr[] = new double[] {1, 2, 3, 4, 5};
		System.out.println("tinhTong(arr) = " + mm.tinhTong(arr));
	}
}
