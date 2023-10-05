package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input array
 * 2. Initialize an integer variable called sum and assign 0 to it
 * 3. Add the elements to the map
 * 4. Iterate through the array
 * 5. check the occurrence of each element in the map
 * 6.  if the current index value occurrence is 1 in the map, then add it to sum
 */

public class week10Day4_2 {
	@Test
	public void test1() {
		int[] nums = {1,2,3,2};
		int expOutput = 4;
		int actOutput = sumOfUnique(nums);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(Integer i : nums) {
			int currentOccurrence = map.getOrDefault(i, 0);
			map.put(i, currentOccurrence+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if(value==1) {
				sum = sum + key;
			}
		}
		return sum;
	}

}
