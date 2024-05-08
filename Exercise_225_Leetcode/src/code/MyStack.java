package code;


import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
	Deque<Integer> doubleEndedQueue = new ArrayDeque<Integer>();
	
	public MyStack() {
        
    }
    
    public void push(int x) {
    	doubleEndedQueue.offer(x);
    }
    
    public int pop() {
    	return doubleEndedQueue.pollLast();
    }
    
    public int top() {
        return doubleEndedQueue.peekLast();
    }
    
    public boolean empty() {
        return doubleEndedQueue.isEmpty();
    }	
}
