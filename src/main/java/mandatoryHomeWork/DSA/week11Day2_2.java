package mandatoryHomeWork.DSA;

import org.junit.Test;
/*
 * 21. Merge Two Sorted Lists
	Psuedocode : 
	1.Initialize a new linked list node mergeList with a value of 0 (this will be used to build the merged list).
	2.Initialize two pointers, current1 and current2, to the heads of the input lists list1 and list2, respectively.
	3.Create a pointer temp to keep track of the last node in the mergeList.
	4.Loop while both current1 and current2 are not null (i.e., there are still nodes in both lists).
	5.Inside the loop:
		a.Compare the values of current1 and current2.
			1.If the value of current1 is less than the value of current2, attach current1 to the merged list by updating temp.next to point to current1. Then, move current1 to its next node.
			2.If the value of current2 is less than or equal to the value of current1, attach current2 to the merged list by updating temp.next to point to current2. Then, move current2 to its next node.
            3.Move the temp pointer to the last node in the merged list.
			4.After the loop, check if there are any remaining elements in current1. If so, attach them to the merged list by setting temp.next to current1.
			5.If there are no remaining elements in current1, attach any remaining elements in current2 to the merged list by setting temp.next to current2.
	6.Return the merged list, skipping the dummy head node (mergeList.next is the actual merged list).
 */

public class week11Day2_2 {
	@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {1,2,4});
		ListNode list2 = new AddLinkedList().add(new int[] {1,3,4});
		ListNode mergeTwoList = mergeTwoLists(list1,list2);
		AddLinkedList.printList(mergeTwoList);
	}

	private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode mergeList = new ListNode(0);
        ListNode temp = mergeList;
        ListNode current1 = list1;
        ListNode current2 = list2;
        while(current1!=null && current2!=null){
            if(current1.val < current2.val){
            temp.next = current1;
            current1=current1.next;
            }
            else{
            temp.next = current2;
            current2=current2.next;
            }
            temp = temp.next;
        }
        if(current1!=null){
            temp.next = current1;
        }
        else{
            temp.next = current2;
        }
        return mergeList.next;

	}

}
