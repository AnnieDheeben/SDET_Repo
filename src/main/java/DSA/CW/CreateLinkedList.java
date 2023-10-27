package DSA.CW;

import java.util.ArrayList;
import java.util.List;

/*
 * List - 1->2->3->4->5->6->7->8
 */
public class CreateLinkedList {
	public static void main(String args[]) {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(6);
		numList.add(7);
		
		createRandomCyclicList(numList);
		System.out.println(createRandomCyclicList);
	}

	private static void createRandomCyclicList(List<Integer> numList) {
		
		ListNode currentNode = numList;
		int size = 1;
		while(currentNode!=null) {
			currentNode = currentNode.next;
			size++;
		}
		
		math.r
		int rangeEnd = size-1;
		int rangeStart = size - rangeEnd + 1;
		
		
		
	}

}
