package DSA.CW;

import java.util.LinkedList;

public class AddElementsLinkedList {
	
	public class Node{
		 int data;
		 Node next;
		 Node head;
			Node tail;
		 
		 Node(int key){
			 this.data = key;
			 next = null;
		 }
		 
		public Node add(int data) {
			Node node = new Node(data);
			
			if(head == null) {
	            head = tail = node;
			}
			
			else {
				tail.next = node; 
				tail = node; 
			}
			
			return node;

		}
	}
}
