package code;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	
    	for(int i = 0; i < nums.length; i++)
    	{
    		int carry = target - nums[i];
    		if(map.containsKey(carry))
    			return new int[] {i, map.get(carry)};
    		else
    			map.put(nums[i], i);
    	}
    	return nums;
    }
}