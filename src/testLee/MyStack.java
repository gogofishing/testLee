package testLee;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> {
	private ArrayList<E> arrayList = new ArrayList<E>();
	int size = 0;

	public void push(E e) {
		arrayList.add(e);
		size++;
	}

	public E pop() {
		if (size > 0) {
			E e = arrayList.get(size - 1);
			size--;
			return e;
		}
		else {
			throw new IllegalArgumentException("Error, wrong size!");
		}
	}

}
