package testLee;

import java.util.Date;
import java.util.Scanner;

public class TestQueue<E> {
	public Node<E> head;
	public Node<E> current;
	
	class Node<E> {
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data) {
			this.data = data;
		}
	}
	
	
	public void EnQueue(E e) {
		if (head == null) {
			head = new Node<E>(e);
			head.next = null;
			head.prev = null;
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
	
	public Node<E> DeQueue() {
		if(current == head) {
			Node<E> cNode = head;
			head = null;
			return cNode;
		}
		else {
			Node<E> cNode = head;
			head.next.prev = null;
			head = head.next;
			return cNode;
		}
	}
	
	
	
	public static<E> void main(String[] args) {
		TestQueue<Integer> myQueue = new TestQueue<Integer>();
		myQueue.EnQueue(1);
		myQueue.EnQueue(22);
		myQueue.EnQueue(333);
		System.out.println(myQueue.DeQueue().data);
		System.out.println(myQueue.DeQueue().data);
		System.out.println(myQueue.DeQueue().data);
	}
}
