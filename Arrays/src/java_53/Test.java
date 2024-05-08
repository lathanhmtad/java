package java_53;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// kiểu primative
		int[] a1 = {1,2,3};
		
		// Copy mảng cách 1 - dùng toán tử gán
		int[] a1Copy = a1;
		a1Copy[0] = 100;		
		System.out.println(Arrays.toString(a1Copy));
		
		// Copy mảng cách 2 - dùng hàm clone
		int[] a2Copy = a1.clone();
		System.out.println(Arrays.toString(a2Copy));
		
		// Copy mảng cách 3 - dùng hàm System.arraycopy
		int[] newA = new int[a1.length];
		System.arraycopy(a1, 0, newA, 0, a1.length - 1);
		System.out.println(Arrays.toString(newA));
		
		
		// kiểu đối tượng
		String[] mang_doi_tuong = {"TITV"};
		
	}
}
