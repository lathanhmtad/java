package test;

import code.MyStack;

public class Test {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push(1);
		myStack.push(2);
		System.out.println(myStack.top());
		myStack.pop();
		System.out.println(myStack.empty());
	}
}
