package testLee;

/**
 * This is the self define ArrayList using array
 * @author WANG
 *
 */
public class MyArrayList<E> {
	Object[] data = null;
	int current;
	int capacity;
	
	public MyArrayList() {
		this(10);
	}
	
	public MyArrayList(int initialSize) {
		if (initialSize < 0) {
			throw new RuntimeException("Error, wrong size of array:" + initialSize);
		}
		else {
			this.data = new Object[initialSize];
			this.current = 0;
			capacity = initialSize;
		}
	}
	
	public boolean add(E e) {
		ensureCapacity(current);
		this.data[current] = e;
		current++;
		return true;
	}

	private void ensureCapacity(int cur) {
		// TODO Auto-generated method stub
		if (cur == capacity) {
			this.capacity = this.capacity * 3;
			Object[] newdata = new Object[capacity];
			for(int i = 0; i < cur; i++) {
				newdata[i] = this.data[i];
			}
			this.data = newdata;
		}
	}
	
	public E get(int index) {
		validateIndex(index);
		return (E) this.data[index];
	}

	private void validateIndex(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > current) {
			throw new RuntimeException("Error, wrong index of array:" + index);
		}
	}
	
	public int size() {
		return this.current;
	}
	
	public boolean set(int index, E e) {
		validateIndex(index);
		this.data[index] = e;
		return true;
	}
	
	public boolean insert(int index, E e) {
		validateIndex(index);
		Object[] tem = new Object[capacity];
		for (int i = 0; i < index; i++) {
			if(i < index) {
				tem[i] = this.data[i];
			}
			else if (i == index) {
				tem[i] = e;
			}
			else if (i > index) {
				tem[i] = this.data[i - 1];
			}
		}
		this.data = tem;
		return true;
	}
	
	public boolean delete(int index) {
		validateIndex(index);
		Object[] tem = new Object[capacity];
		for (int i = 0; i < index; i++) {
			if(i < index) {
				tem[i] = this.data[i];
			}
			else if (i == index) {
				tem[i] = this.data[i + 1];
			}
			else if (i > index) {
				tem[i] = this.data[i + 1];
			}
		}
		this.data = tem;
		return true;
	}
}
