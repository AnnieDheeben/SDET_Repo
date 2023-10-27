package DSA.CW;

import org.junit.Test;

import mandatoryHomeWork.DSA.ListNode;

public class DoublyLinkedList_functions {
	
	DoubleListNode head;
	DoubleListNode tail;
	int size = 0;

	public void add(int value) {
			if(head==null) {
				head = tail = new DoubleListNode(value);
			}
			else {
				DoubleListNode newNode = new DoubleListNode(value);
				newNode.prev = tail;
				tail.next = newNode;
				tail = tail.next;		
			}
			size++;
	}
	
	public void removeFirst() {
		DoubleListNode currentNode = head;
		
	}
	
	public doubleListNode()
	
	public DoubleListNode add(int[] value){
        for(int each : value) add(each);
        return head;
    }
	
	public int size(){
        return size;
    }
	
	public static void printList(DoubleListNode head) {
		DoubleListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	}

	@Test
	public void test1() {
		DoublyLinkedList_functions list1 = new DoublyLinkedList_functions();
        for(int each : new int[]{11,43,27,11,90}) list1.add(each);
        list1.printList(list1.head);
	}
}
