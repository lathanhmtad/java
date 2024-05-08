package main;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target = 2;
		
		Solution solution = new Solution();
		System.out.println(solution.searchInsert(arr, target));
	}
}
