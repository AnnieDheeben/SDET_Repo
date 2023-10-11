package mandatoryHomeWork.DSA;

import org.junit.Test;
/*
 * 83. Remove Duplicates from Sorted List
 * Psuedocode : 
 * 	1.Initialize a pointer current to the head of the linked list.
   	2.Loop while current is not null and current.next is not null.
	3.Inside the loop, check if the value of the current node (current.val) is equal to the value of the next node (current.next.val).
	4.If the values are equal, skip the next node by updating current.next to point to the node after the next node (current.next = current.next.next).
	5.If the values are not equal, move the current pointer to the next node (current = current.next).
	6.Continue this process until you have checked all nodes for duplicates.
	7.Finally, return the head of the modified linked list.
 */

public class week11Day3_1 {
	@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {1,1,2,2,3});
		ListNode deleteDuplicates = deleteDuplicates(list1);
		AddLinkedList.printList(deleteDuplicates);
	}

	private ListNode deleteDuplicates(ListNode list1) {
		ListNode current = list1;
		while(current!=null && current.next!=null) {
			if(current.next.val==current.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		return list1;
	}
}
