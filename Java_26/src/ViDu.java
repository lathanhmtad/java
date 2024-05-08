import java.util.Iterator;

public class ViDu {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j > 5) {
					return;
				}
				System.out.println("j = " + j);
			}
			System.out.println("Chay");
		}
		
		
//		int out = 0;
//		int in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for(in = 0; in < 20; in++) {
//				if(in > 10) break outer;
//			}
//			System.out.println("Bên trong vòng lặp out: out = " + out);
//		}
//		System.out.println("Bên ngoài vòng lặp");
		
		
//		int max = 100;
//		for(int i = 0; i <= max; i++) {
//			if(i < 50)
//				continue;
//			System.out.println(i);
//		}
		
		
//		outer: for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {
//				if(j > 5) 
//					continue outer;
//				System.out.println(i + "*" + j + "=" + i * j);
//			}
//			System.out.println("------");
//		}
		
		
	}				
}
