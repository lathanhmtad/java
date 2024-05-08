import java.util.Scanner;

public class ChuyenDoi {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n > 0");
		n = sc.nextInt();
		
		String nhiPhan = "";
		/*
		 * Chia liên tục cho 2 và lấy phần dư 
		 * Đảo ngược chuỗi => kết quả
		 * 10 : 2 = 5 dư 0
		 * 5 / 2 = 2 dư 1
		 * 2 : 2 = 1 dư 0
		 * 1 / 2 = 0 dư 1
		 */
		int temp = n;
		int soDu;
		while(n != 0) {
			soDu = n % 2;
			nhiPhan = soDu + nhiPhan;
			n /= 2;
		}
		System.out.println("Số " + temp + " ở hệ nhị phân là: " + nhiPhan);
	}
}
