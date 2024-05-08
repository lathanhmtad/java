package java_62;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> stackChuoi = new Stack<Character>();
		
		// stackChuoi.push("gia tri") // => đưa giá trị vào stack
		// stackChuoi.pop() => lấy giá trị ra, xóa kh�?i stack
		// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa kh�?i stack
		// stackChuoi.clear() => xóa tất cả phần tử trong stack
		// stackChuoi.contains("giatri") => xác định giá trị có tồn tại
		// stackChuoi.size()
		
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++)
		{
			stackChuoi.push(s.charAt(i));
		}
		
		System.out.print("Chuỗi đảo ngược: ");
		for(int i = 0; i < s.length(); i++)
		{
			System.out.print(stackChuoi.pop());
		}
		
		System.out.println();
		// Ví dụ chuyển từ hệ thập phân sang hệ nhị phân
		System.out.println("Nhập 1 số nguyên dương từ bàn phím: ");
		int x = sc.nextInt();
		
		Stack<Integer> stackNhiPhan = new Stack<Integer>();
		while(x > 0)
		{
			int soDu = x % 2;
			stackNhiPhan.push(soDu);
			x /= 2;
		}
		
		System.out.println("Số nhị phân là: ");
		while(!stackNhiPhan.isEmpty())
		{
			System.out.print(stackNhiPhan.pop());
		}
	}
}
