package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*/
 * Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.

 

Example 1:

Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:

Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.

Pseudocode : 
1. Get the input array, initialize sum =0 and count =0
2. Iterate through the array and check if each number modulo 6 is 0 (satisfies the condition even integer divisible by 3)
 	a. if Yes, add the ith value of an array with sum (sum + arr[i])
	b. continue the above step till we reaches nth value
3. Apply the logic to sum all the numbers in a array and divide it by its count 
4. return the above output
5. if the step 2 does not return any value, return 0 at the end
 */

public class divisblebyThreeAvg {
	
	@Test
	public void test1() {
		int[] nums = {1,3,6,10,12,15};
		int output = 9;
		int actOutput = findAverageValue(nums);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		int[] nums = {1,2,4,7,10};
		int output = 0;
		int actOutput = findAverageValue(nums);
		Assert.assertEquals(output, actOutput);
	}
	
	public int findAverageValue(int[] nums) {
		int sum =0, count=0, res = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] % 6 == 0) {
				sum = sum + nums[i];
				count++;
			}
			
			if(count>0) {
				res = sum/count;				
				}
			}
		return res;
		}
		
	}
