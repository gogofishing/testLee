package testLee;

import java.util.ArrayList;

public class MyQueue<E> {
	private ArrayList<E> myQueue = new ArrayList<E>();
	int size = 0;
	
	public void EnQueue(E e) {
		myQueue.add(e);
		size++;
	}
	
	public E DeQueue() {
		if (size > 0) {
			E e = myQueue.get(0);
			myQueue.remove(0);
			size--;
			return e;
		}
		else {
			throw new RuntimeException("Error!");
		}
	}

}
