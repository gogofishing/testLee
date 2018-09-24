package testLee;

public class MidNode {
	
	public Node head;
	public Node current;

	class Node {
		int data;
		Node nextNode;
		public Node(int data) {
			this.data = data;
		}
		public Node nextNode() {
			// TODO Auto-generated method stub
			return nextNode;
		}
	}
	
	public void add(int data) {
		if (head == null) {
			Node newNode = new Node(data);
			head = newNode;
			current = head;
			head.nextNode = null;
		}
		else {
			Node newNode = new Node(data);
			current.nextNode = newNode;
			current = newNode;
		}
	}
	
	public static void main(String[] args) {
		MidNode myMid = new MidNode();
		myMid.add(1);
		myMid.add(2);
		myMid.add(3);
		myMid.add(4);
		myMid.add(5);
		int position = 0;
		MidNode.Node midNode = myMid.head;
		System.out.println(myMid.head.data);
		System.out.println(myMid.head.nextNode);
		boolean f = (myMid.head.nextNode != null);
		System.out.println(f);
		if (myMid.head.nextNode != null) {
			myMid.head = myMid.head.nextNode;
			position++;
			if(position / 2 == 0) {
				midNode = midNode.nextNode;
			}
		}
		if(position % 2 == 1) {
			midNode = midNode.nextNode;
		}
//		
//		System.out.println(midNode.data);
//		if (myMid.head.nextNode() != null) {
//			myMid.head = myMid.head.nextNode;
//			position++;
//			if(position / 2 == 0) {
//				midNode = midNode.nextNode;
//			}
//		}
//		if(position % 2 == 1) {
//			midNode = midNode.nextNode;
//		}
//		
		System.out.println(midNode.data);
	}

}



