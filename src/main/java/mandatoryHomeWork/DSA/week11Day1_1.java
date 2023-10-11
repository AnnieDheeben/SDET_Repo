package mandatoryHomeWork.DSA;

import org.junit.Test;

/*
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Psuedocode : 
1. Get the input head and val
2. if the given head is null, return null
3. if the given val is at the first position of the head, move the head to the next position and return head
4. If the given val is at the last position of the head, find the previous node to the last one and make the pointer of that node to null
5. if both the above conditions are not met, then check each node element with the given value,
	a. if it matches, make the previous element pointer points to the next node of the current element
	b. continue the above step till reaches the end of the given Nodes
6. return the output head 
 */

public class week11Day1_1 {

	@Test
	public void test1() {
		AddLinkedList list1 = new AddLinkedList();
		for(int each : new int[] {1,2,6,3,4,5,6}) {
			list1.add(each);
		}
		list1.printList(list1.head);
		int valToRemove = 6;
		list1.removeElements(valToRemove);
		list1.printList(list1.head);
	}
}
