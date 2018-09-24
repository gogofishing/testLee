package testLee;

public class ReverseLinkedList {
	
	public static Node init(int num) {
		Node node = new Node(0, null);
		Node cur = null;
		Node tem = null;
		for(int i = 1; i < num; i++) {
			tem = new Node(i,null);
			if(i == 1) {
				node.nextNode = tem;
			}
			else {
				cur.nextNode = tem;
			}
			cur = tem;
		}
		return node;
	}
	
	public static void out(Node head) {
		Node tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.nextNode;
		}
	}
	
	public static Node reverseNode1(Node head) {
		Node pre = head;
		Node cur = head.nextNode;
		Node next = null;
		head.nextNode = null;
		if(head == null) {
			return head;
		}
		while(cur != null) {
			next = cur.nextNode;
			cur.nextNode = pre;
			pre = cur;
			cur = next;
		}
		head = pre;
		return head; 
	}
	public static Node reverseNode2(Node currentNode) {
		 if(currentNode == null || currentNode.nextNode == null) {
			 return currentNode;
		 }
		 Node nextN = currentNode.nextNode;
		 currentNode.nextNode = null;
		 Node reverseNode = reverseNode2(nextN);
		 nextN.nextNode = currentNode;
		 return reverseNode;
	}

	public static void main(String[] args) {
		Node head = init(10);
		out(head);
		head = reverseNode2(head);
		out(head);
	}
	

}

class Node {
	int value;
	Node nextNode;
	public Node(int value, Node nextNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
	}
}

