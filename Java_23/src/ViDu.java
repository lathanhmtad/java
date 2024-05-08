import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		while(x != 0) {
			System.err.println("Nhâp x = 0 để thoát; Nhập số khác thì mày đéo thoát dc");
			x = sc.nextInt();
		}
	}
}
