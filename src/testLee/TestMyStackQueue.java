package testLee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestMyStackQueue {
	public static <E> void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyStack<E> myStack = new MyStack<E>();
		MyQueue<E> myQueue = new MyQueue<E>();
		
		for (int i = 0; i < 3; i++) {
			E e = (E) sc.nextLine();
			myStack.push(e);
			myQueue.EnQueue(e);
		}
		
		List<E> list = new ArrayList<E>();
		Iterator lc = list.iterator();
		lc.hasNext();
		lc.next();
		lc.remove();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("stack:" + myStack.pop());

		}

		for (int i = 0; i < 3; i++) {
			System.out.println("queue:" + myQueue.DeQueue());
		}
		
	}

}
