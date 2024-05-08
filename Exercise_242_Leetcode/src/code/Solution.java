package code;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t)
	{
		String[] c1 = s.split("");
		String[] c2 = t.split("");
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
}
