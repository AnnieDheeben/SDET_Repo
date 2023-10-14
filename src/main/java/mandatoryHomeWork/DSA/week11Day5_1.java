package mandatoryHomeWork.DSA;

import org.junit.Test;

/*
 * 61. Rotate List

 * Psuedocode : 
 * 1. Find the length of the Linked List and track it using the variable called size
 * 2. Point current.next to head of the Linked List
 * 3. move current to size-k
 * 4. point current.next to head and make current.next = null
 * 5. return head
 */
public class week11Day5_1 {
	/*@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {1,2,3,4,5});
		int k = 2;
		ListNode outputList = rotateRight(list1,k);
		AddLinkedList.printList(outputList);
	
	Time complexity - O[N]
	Space complexity - O[1]
	}*/
	
	@Test
	public void test2() {
		ListNode list1 = new AddLinkedList().add(new int[] {0,1,2});
		int k = 4;
		ListNode outputList = rotateRight(list1,k);
		AddLinkedList.printList(outputList);
	}
	private ListNode rotateRight(ListNode list1, int k) {
		ListNode current = list1;
		int size = 1;
		while(current.next!=null) {
			current = current.next;
			size++;
		}
		current.next = list1;
		
		k = k%size;
		k = size - k;
		
		while(k>0) {
			current = current.next;
			k--;
		}
		list1 = current.next;
		current.next = null;
		
		return list1;
	}

}
