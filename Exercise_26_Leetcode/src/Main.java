public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		int newLength = solution.removeDuplicates(nums);
		
		for(int i = 0; i < newLength; i++)
		{
			System.out.println(nums[i]);
		}
	}
}
