
public class Solution {
	public String commonPrefix(String str1, String str2)
	{
		int min = Math.min(str1.length(), str2.length());
		
		for(int i = 0; i < min; i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
				return str1.substring(0, i);
		}
		return str1.substring(0, min);
	}
	
	public String longestCommonPrefix(String[] strs)
	{
		int n = strs.length;
		if(n <= 1)
			return strs[0];
		
		String prefix = commonPrefix(strs[0], strs[1]);
		for(int i = 2; i < n; i++)
		{
			prefix = commonPrefix(prefix, strs[i]);
		}
		return prefix;
	}
}
