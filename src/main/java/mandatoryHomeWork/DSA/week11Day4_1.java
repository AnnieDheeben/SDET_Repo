package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 1290. Convert Binary Number in a Linked List to Integer
Psuedocode : 
1.Initialize an empty StringBuilder sb
2.Set temp to the head of the linked list
3.Traverse the linked list and build a binary string
    a.start a while loop and traverse till temp is not null:
    b.Append temp.val to sb
    c.Move temp to the next node
4.Convert the StringBuilder sb to a string str
5.Convert str to a decimal integer decimal using base 2
6.Return decimal
*/


public class week11Day4_1 {
	@Test
	public void test1() {
		ListNode list1 = new AddLinkedList().add(new int[] {1,0,1});
		int expOutput = 5;
		int actOutput = getDecimalValue(list1);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int getDecimalValue(ListNode list1) {
		ListNode temp = list1;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb = sb.append(temp.val);
            temp = temp.next;
        }
        String str = sb.toString();
        int decimal = Integer.parseInt(str,2);
        return decimal;
	}

}
