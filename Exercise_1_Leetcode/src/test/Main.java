package test;

import java.util.Arrays;

import code.Solution;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] arr = new int[] {2,7,11,15};
		
		System.out.println(Arrays.toString(solution.twoSum(arr, 9)));
	}
}
