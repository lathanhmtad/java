import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		
//		MayTinhBoTuiInterface mt = new MayTinhCasioFX500();
		
		
		MayTinhCasioFX500 mtfx500 = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
		
		
		System.out.println("5 + 3 = " + mtfx500.cong(5, 3));
		System.out.println("4 * 5 = " + mtfx500.nhan(4, 5));
		System.out.println("4 / 0 = " + mvn500.chia(4, 0));
		
		System.out.println("Test câu b" );
		double[] arr = new double[] {5,1,3,4,1,2,5,100,3};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
		
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.sapXepTang(arr);
		System.out.println(Arrays.toString(arr));
		
		sxchon.sapXepGiam(arr2);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("Test câu c");
		PhamMemMayTinh pmmt = new PhamMemMayTinh();
		
		System.out.println("3 + 5" + pmmt.cong(3, 5));
		double[] arr3 = new double[] {100,3000,34,12,9999};
		pmmt.sapXepGiam(arr3);
		System.out.println(Arrays.toString(arr3));
		
	}
}
