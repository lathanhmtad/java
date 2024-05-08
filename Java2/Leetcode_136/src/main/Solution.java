package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
	public int singleNumber(int[] nums) {
//		HashMap<Integer, Integer> hash = new HashMap<>();
//		
//		for (int i = 0; i < nums.length; i++) {
//			if(!hash.containsKey(nums[i])) {
//				hash.put(nums[i], 1);				
//			}
//			else {
//				hash.put(nums[i], (hash.get(nums[i])));
//			}
//		}
//		
//		int result = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if(hash.get(nums[i]) == 1) {
//				result = nums[i];
//				break;
//			}
//		}
//		
//		return result;
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(!hashSet.contains(nums[i])) {
				hashSet.add(nums[i]);
			}
			else {
				hashSet.remove(nums[i]);
			}
		}
		
//		for (int i = 0; i < nums.length; i++) {
//			if(hashSet.contains(nums[i]))
//				return nums[i];
//			
//		}
		
		Iterator<Integer> it = hashSet.iterator();
				
		return it.next();
		
	}
	
}
