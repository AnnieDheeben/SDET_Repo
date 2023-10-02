package DSA.CW;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.testng.Assert;

/*
 * Psuedocode : 
 * 1. Get the input array and the target value
 * 2. assign two pointer start and end
 * 3. start a while loop and travel till the end of the array
 * 4. for each iteration, check whether the sum of left and right reaches the target
 * 5. if the above statement returns true, return the indices
 * 6. if the above statement is false, move the right pointer to the next element
 */
public class TwoSum {
	@Test
	public void test1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] ouput = {0,1};
		int[] expOutput = findTwoSum(nums, target);
		Assert.assertEquals(ouput, expOutput);
	}

	@Test
	public void test2() {
		int[] nums = {3,2,4};
		int target = 6;
		int[] ouput = {1,2};
		int[] expOutput = findTwoSum(nums, target);
		Assert.assertEquals(ouput, expOutput);
	}
	private int[] findTwoSum(int[] nums, int target) {
		
		int currentSum = 0;
		int[] output = new int[2];
		for(int i=0;i<nums.length;i++) {
			currentSum = 0;
			for(int j=i+1;j<nums.length;j++) {
				currentSum = nums[i]+nums[j];
				if(currentSum==target) {
					output[0] = i;
					output[1] = j;
					break;
					
				}
			}
		}
		return output;
	}
}
