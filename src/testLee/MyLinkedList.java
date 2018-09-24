package testLee;
/**
 * This is self define LinkedList
 * @author WANG
 *
 * @param <E>
 */
public class MyLinkedList<E> {

	public class Node<E> {
		private E e;
		Node<E> next;
		Node(){};
		Node(E e) {
			this.e = e;
		}
		
		void addNext(Node<E> node) {
			next = node;
		}
	}
	
	private Node<E> header = null;
	private Node<E> last = null;
	int size = 0;
	
	public MyLinkedList() {
		this.header = new Node<E>();
		this.last = header;
	}
	
	public boolean add(E e) {
		if(size ==0) {
			header.e = e;
		}
		else {
			Node<E> newNode = new Node<E>(e);
			last.addNext(newNode);
			last = newNode;
		}
		size++;
		return true;
	}
	
	public boolean insert(int index, E e) {
		Node<E> newNode = new Node<E>(e);
		Node<E> cNode = getNode(index);
		newNode.next = cNode.next;
		cNode.next = newNode;
		size++;
		return true;
	}

	private MyLinkedList<E>.Node<E> getNode(int index) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			throw new RuntimeException("Errong, wrong index:" + index);
		}
		Node<E> tem = new Node<E>();
		tem = header;
		int count = 0;
		while (count != index) {
			tem = tem.next;
			count++;
		}
		return tem;
	}
	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Error, wrong index£º" + index);
		}
		Node<E> tem = new Node<E>();
		tem = header;
		int count = 0;
		while (count != index) {
			tem = tem.next;
			count++;
		}
		E e = tem.e;
		return e;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean set(int index, E e) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Error, wrong index:" + index);
		}
		Node<E> cNode = getNode(index);
		cNode.e = e;
		return true;
	}
}
