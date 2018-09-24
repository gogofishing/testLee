package testLee;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack_TwoQueues {

	Queue<Integer> queue1 = new ArrayDeque<>();
	Queue<Integer> queue2 = new ArrayDeque<>();
	
	public void push(int data) {
		queue1.add(data);
	}
	
	public int pop() throws Exception {
		int data;
		if (queue1.size() == 0) {
			throw new Exception("stack is empty!");
		}
		while (queue1.size() != 0) {
			if (queue1.size() == 1) {
				data = queue1.poll();
				while (queue2.size() != 0) {
					queue1.add(queue2.poll());
				}
				return data;
			}
			queue2.add(queue1.poll());
		}
		throw new Exception("stack is empty!");
	}
	 
	public static void main(String[] args) throws Exception {
		MyStack_TwoQueues stack = new MyStack_TwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
}
