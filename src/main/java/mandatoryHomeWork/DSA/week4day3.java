package mandatoryHomeWork.DSA;
/*
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

 

Example 1:

Input: nums = [1,4,3,2]
Output: 4
Explanation: All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.

Psuedocode :
1. Sort the given array
2. Declare an Integer variable maxSum and assign it to 0
2. Iterate through the given array with staring index as 0, till the end of the array and incrementing index by 2
3. For each iteration , add the current index with the maxSum value and store it as maxSum
4. Return the maxSum value at the end.


Time Complexity : not able to find out exactly.Need to discuss
 */

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class week4day3 {
	
	/*@Test
	public void test1() {
		int[] nums = {1,4,3,2};
		int expoutput = 4;
		int actOutput = arrayPairSum(nums);
		Assert.assertEquals(expoutput, actOutput);
	}*/

	@Test
	public void test2() {
		int[] nums = {6,2,6,5,1,2};
		int expoutput = 9;
		int actOutput = arrayPairSum(nums);
		Assert.assertEquals(expoutput, actOutput);
	}
	
	public int arrayPairSum(int[] nums) {
		int maxSum = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i+=2) {
			maxSum = maxSum + nums[i];
		}
		
		return maxSum;
	}

}
