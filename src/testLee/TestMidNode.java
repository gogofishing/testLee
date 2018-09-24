package testLee;

import testLee.MyNode;

public class TestMidNode {
	
	MyNode head = null;
	MyNode current = null;
	
	public void add(int data) {
		MyNode newNode = new MyNode(data);
		if(head == null) {
			head = newNode;
			head.nextNode = null;
			current = head;
		}
		else {
			current.nextNode = newNode;
			current = newNode;
		}
	}
	
	public static void main(String[] args) {
		TestMidNode node = new TestMidNode();
		node.add(1);
		node.add(2);
		node.add(3);
		node.add(4);
		node.add(5);
		int positon = 0;
		MyNode mid = node.head;
		if(node.head.nextNode != null) {
			node.head = node.head.nextNode;
			positon++;
			if(positon / 2 == 0) {
				mid = mid.nextNode;
			}
		}
		if (positon % 2 == 1) {
			mid = mid.nextNode;
		}
		System.out.println(mid.data);
	}

}
