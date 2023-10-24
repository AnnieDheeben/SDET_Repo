package mandatoryHomeWork.DSA;
import org.junit.Test;
/*
 * 143. Reorder List

You are given the head of a singly linked-list. The list can be represented as:

 */

public class week12Day3_1 {
	@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {1,2,3,4});
		ListNode outputList = rotateRight(list1);
		AddLinkedList.printList(outputList);
	}

	public ListNode rotateRight(ListNode list1) {
		ListNode input = list1;
		ListNode mid = midNode(input);
		ListNode midNext = mid.next;
		mid.next = null;
		ListNode reverse = reverseList(midNext);
		ListNode p1 = input;
		ListNode p2 = reverse;
		ListNode merge = mergerList(p1,p2);
		return merge;
	}
	
	public ListNode midNode(ListNode list) {
		
		ListNode slow = list;
		ListNode fast = list;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	
	public ListNode reverseList(ListNode list) {
		ListNode currentNode = list;
		ListNode prev = null;
		ListNode next = null;
		while(currentNode!=null) {
			next = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = next;
		}
		return prev;
		
	}
	
	public ListNode mergerList(ListNode list1, ListNode list2) {
		ListNode mergeList = new ListNode(0);
		ListNode temp = mergeList;
		while(list1!=null && list2!=null) {
				temp.next = list1;
				list1 = list1.next;
				temp = temp.next;
			
				temp.next = list2;
				list2 = list2.next;
				temp = temp.next;
			
		}
			
		while(list1!=null) {
			temp.next = list1;
		}
		while(list2!=null) {
			temp.next = list2;
		}
		
		return mergeList.next;
		
	}
}


