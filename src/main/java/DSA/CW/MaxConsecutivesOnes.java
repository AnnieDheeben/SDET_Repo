package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input array
 * 2. declare two variable start and end
 * 3. Assign start to 0 and end to 0
 * 4. star a while loop and iterate through the array till end value is less than array length
 * 5.Check the current start value is 1 or 0
 * 6.if it is 1, increase end till 1
 * 7. If number is 0, calculate the window size (end-start) and reset the right and left index as current index
 * 
 */
public class MaxConsecutivesOnes {

	@Test
	public void test1() {
		int[] nums = {1,1,0,1,1,1};
		int expectedOutput = 3;
		int actOutput = findMaxConsecutiveOnes(nums);
		Assert.assertEquals(expectedOutput, actOutput);
	}

	private int findMaxConsecutiveOnes(int[] nums) {
		
		int maxSize = 0, currSize=0;
		int count=0;
		int start = 0, end =0;
		while(end<=nums.length) {
			if(nums[start]==1) {
				while(nums[end]==1) {
				end++;
				}
			}
			if(nums[end]==0) {
				currSize = end-start;
				maxSize = Math.max(currSize, maxSize);
				start++;
				start = end;
			}
		}
		
		return maxSize;
	}
}
