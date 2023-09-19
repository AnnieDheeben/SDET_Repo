package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Psuedocode : 
1. Get the input array
2. assign two pointers, one at the index 0 and one at the last index
3. if the left pointer value is even, increment left by 1
4. if the right pointer value is odd, decrement right by 1
5. for all the other conditions, swap both the values and increment left by 1 and decrement right by 1

Time complexity - O[N]
Space complexity - O[1]
 */

public class week8Day1_1 {
	
	@Test
	public void test1() {
		int[] nums = {3,1,2,4};
		int[] output = {4,2,1,3};
		int[] actOutput = sortArray(nums);
		Assert.assertEquals(output, actOutput);
	}
	@Test
	public void test2() {
		int[] nums = {0,1,2};
		int[] output = {0,2,1};
		int[] actOutput = sortArray(nums);
		Assert.assertEquals(output, actOutput);
	}

	private int[] sortArray(int[] nums) {
		
		int leftPointer = 0;
		int rightPointer = nums.length-1;
		if (nums.length==1) return nums;
		while(leftPointer < rightPointer) {
			if(nums[leftPointer]%2==0) leftPointer++;
			else if(nums[rightPointer]%2!=0) rightPointer--;
			else {
				swap(leftPointer,rightPointer,nums);
				leftPointer++;
				rightPointer--;
			}			
		}
		return nums;
	}

	private void swap(int leftPointer, int rightPointer, int[] nums) {
		
		int temp = nums[leftPointer];
		nums[leftPointer] = nums[rightPointer];
		nums[rightPointer] = temp;
	}
	

}
