package java_55;
import java.util.Arrays;

public class Test {
	public static void reverse(int[] a)
	{
		int i = 0;
		int j = a.length - 1;
		
		while(i <= j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {4,1,7,9,2,3,10,100,-5,-6};
		int[] b = new int[5];
		
		// Hàm sắp xếp
		System.out.println("Mảng a: " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Mảng a sau khi sắp xếp tăng dần: " + Arrays.toString(a));
		Test.reverse(a);
		System.out.println("Mảng a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
		
		
		// Hàm tìm kiếm binarySearch => dữ liệu phải được sắp xếp
		System.out.println(Arrays.binarySearch(a, -10));
		
		// Hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println("Mảng b sau khi điền giá trị: " + Arrays.toString(b));
		
		
	}
}
