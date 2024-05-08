package code;

import java.util.HashMap;

public class Solution {
	public int lengthOfLongestSubstring(String s)
	{
		if(s.equals(""))
			return 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int n = s.length();
		
		int max = 1;
		int j = 0;
		for(int i = 0; i < n; i++)
		{
			if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= j)
				j = map.get(s.charAt(i)) + 1;
			map.put(s.charAt(i), i);		
			max = Math.max(max, i - j + 1);
		}
		return max;
	}
}
