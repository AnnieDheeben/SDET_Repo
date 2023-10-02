package DSA.CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

/*
 * Reverse a list without using inbuilt function and space complexity O(1)
 * 
 * Psuedocode : 
 * 1. Get the input list
 * 2. declare one left pointer and right pointer
 * 3. assign left pointer to index 0 and the right pointer to the last index of the list
 * 4. for each iteration, 
 * 		a. swap the values of the current left pointer and right pointer 
 * 		b. increment the left pointer
 * 		c. decrement the right pointer
 * 5. continue the above step till left pointer is lesser than the right pointer
 * 6. return the reversed list
 */
public class ReverseList {
	@Test
	public void test1() {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		
		List<Integer> ReversedList = new ArrayList<>(numList);
	    Collections.reverse(ReversedList);
	    
		List<Integer> outList = getReverseList(numList);
		Assert.assertEquals(outList, numList);		
	}

	private List<Integer> getReverseList(List<Integer> numList) {
		
		int left = 0; 
		int right = numList.size()-1;
		while(left < right) {
			int temp = numList.get(left);
			numList.set(left, numList.get(right));
			numList.set(right, temp);
			left++;
			right--;
			
		}
		
		return numList;
	}

}
