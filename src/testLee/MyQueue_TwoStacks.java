package testLee;

import java.util.Stack;

public class MyQueue_TwoStacks {
	

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public void push(int data) {
		stack1.push(data);
	}
	
	public int pop() throws Exception {
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		
		if (stack2.empty()) {
			throw new Exception("stack is empty!");
		}
		return stack2.pop();
	}
	public static void main(String[] args) throws Exception {
		MyQueue_TwoStacks q = new MyQueue_TwoStacks();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}
