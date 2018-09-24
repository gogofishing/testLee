package testLee;

public class TestStack<E> {
	public Node<E> head;
	public Node<E> current;
	
	class Node<E> {
		E data;
		Node<E> prev;
		Node<E> next;
		public Node(E data) {
			this.data = data;
		}
	}
	
	public void push(E e) {
		if (head == null) {
			head = new Node<E>(e);
			head.prev = null;
			head.next = null;
			current = head;
		}
		else {
			Node<E> newNode = new Node<E>(e);
			newNode.prev = current;
			newNode.next = null;
			current.next = newNode;
			current = newNode;
		}
	}
	
	public Node<E> pop() {
		if (current == null) {
			return null;
		}
		else if (current == head) { // == compare the address in the memory, 
									// for the primitive variables, == compare the value of each variables
									// in some classes, such as String, Integer, Date, override the equals to compare the value
			Node<E> node = current;
			current = null;
			return node;
		}
		else {
			Node<E> node = current;
			current = node.prev;
			current.next = null;
			return node;
		}
	}
	
	public static void main(String[] args) {
		TestStack<Integer> myStack = new TestStack<Integer>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		System.out.println(myStack.pop().data);
		System.out.println(myStack.pop().data);
		System.out.println(myStack.pop().data);
	}
	
}

