package mandatoryHomeWork.DSA;

import org.junit.Test;

public class week11_Day2_1 {
@Test
public void test1() {
	AddLinkedList list1 = new AddLinkedList();
	for(int each : new int[] {1,2,3,4,5}) {
		list1.add(each);
	}
	list1.printList(list1.head);
	ListNode res = list1.middleNode();
	list1.printFromNode(res);	
}
@Test
public void test2() {
	AddLinkedList list1 = new AddLinkedList();
	for(int each : new int[] {1,2,3,4,5,6}) {
		list1.add(each);
	}
	list1.printList(list1.head);
	ListNode res = list1.middleNode_way2();
	list1.printFromNode(res);	
}
}
