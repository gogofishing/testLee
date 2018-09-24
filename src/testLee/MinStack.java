package testLee;
import testLee.BubbleSort;
import java.util.Stack;

public class MinStack {
	class A extends BubbleSort {
		int b = a + 1;
	}
	
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int data) {
		stack.push(data);
		if (minStack.size() == 0 || data < minStack.peek()) {
			minStack.push(data);
		}
		else {
			minStack.add(minStack.peek());
		}
	}
	
	public int pop() throws Exception {
		if (stack.size() == 0) {
			throw new Exception("stack is null");
		}
		int data = stack.pop();
		minStack.pop();
		return data;
	}
	
	public int min() throws Exception {
		if(minStack.size() == 0) {
			throw new Exception("stack is null");
		}
		return minStack.peek();
	}
	
	public static void main(String[] args) throws Exception {
		MinStack stack = new MinStack();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.min());
		System.out.println("pop top : " + stack.pop() + "\n Min is : " + stack.min());
		System.out.println("pop top : " + stack.pop() + "\n Min is : " + stack.min());
		System.out.println("pop top : " + stack.pop() + "\n Min is : " + stack.min());
		System.out.println("pop top : " + stack.pop() + "\n Min is : " + stack.min());

		
	}
}
