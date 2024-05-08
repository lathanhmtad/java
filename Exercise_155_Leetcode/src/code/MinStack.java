package code;

import java.util.Stack;

public class MinStack {
	Stack<Node> stack = new Stack<Node>();

	public MinStack() {}
	
	public void push(int val)
	{
		Node newNode = new Node(val);
		if(stack.isEmpty())
		{
			newNode.setMin(val);
			stack.push(newNode);
			return;
		}
		Node topNode = stack.peek();
		newNode.setMin(Math.min(topNode.getMin(), val));
		stack.push(newNode);
	}
	
	public void pop()
	{
		if(!stack.isEmpty())
			stack.pop();
	}
	
	public int top()
	{
		Node topNode = stack.peek();
		return !stack.isEmpty() ? topNode.getValue() : -1;
	}
	
	public int getMin()
	{
		Node topNode = stack.peek();
		return !stack.isEmpty() ? topNode.getMin() : -1;
	}
}
