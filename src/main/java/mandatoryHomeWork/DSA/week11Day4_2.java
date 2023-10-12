package mandatoryHomeWork.DSA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/*
 * 160. Intersection of Two Linked Lists

Psudocode : 
1. Create an empty HashSet called nodeSetA
2.Traverse the first linked list (listA) and store its nodes in the HashSet
    a.current = listA.head
    b. while current is not null:
        i.Add current to nodeSetA
        ii.current = current.next
3.Traverse the second linked list (listB)
   a. current = listB.head
   b.while current is not null:
        i.if nodeSetA contains current:
            return current
        ii.current = current.next
4. If No intersection node found, return null

 */
public class week11Day4_2 {
	@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {4,1,8,4,5});
		ListNode list2 = new AddLinkedList().add(new int[] {5,6,1,8,4,5});
		ListNode intersect = getIntersectionNode(list1,list2);
		AddLinkedList.printList(intersect);
	}

	private ListNode getIntersectionNode(ListNode list1, ListNode list2) {
		Set<Integer> set = new HashSet<>();
		while(list1!=null) {
			set.add(list1.hashCode());
			list1 = list1.next;
		}
		
		while(list2!=null) {
			int hashCode = list2.hashCode();
			if(set.contains(hashCode)) {
				return list2;
			}
			list2 = list2.next;
		}
		
		return null;
	}

}
