import java.util.Stack;

public class Solution
{
	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		
		int n = s.length();
		
		for(int i = 0; i < n; i++)
		{
			if( s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' )
				stack.push(s.charAt(i));
			else
			{
				char openChar = stack.isEmpty() ? '\0' : stack.pop();
				if(
					openChar == '(' && s.charAt(i) == ')' ||
					openChar == '{' && s.charAt(i) == '}' ||
					openChar == '[' && s.charAt(i) == ']'
				) {
					// nothing
				}
				else
					return false;
			}
		
		}
		return stack.isEmpty();
	}
}