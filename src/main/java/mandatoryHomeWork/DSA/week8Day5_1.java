package mandatoryHomeWork.DSA;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.testng.Assert;

/*
 * 922. Sort Array By Parity II
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 
 
 
 Psuedocode : 
 1. Get the input array
 2. Declare two integer variables odd, even.
 3. Assign even to 0 and odd to 1
 4. start a while loop that iterates through the array from start to end using odd and even index positions
 	a. check if the first index value at 0th position is divisible by 2 or not
 	b. if it divisible by 2, move even index position by two to the right(even+2)
 	c. if it is not divisible by 2,swap the even and odd position value and move odd index position by two to the right
 	d. continue the above step till the odd reaches the end of the array
 5. return the output array
 
 Time complexity : O[N]
 Space complexity : O[1]
 
 */

public class week8Day5_1 {
	@Test
	public void test1() {
		int[] nums = {4,2,5,7};
		int[] output = {4,5,2,7};
		int[] actOutput = sortArrayByParityII(nums);
		assertArrayEquals(output,actOutput);
	}
	
	@Test
	public void test2() {
		int[] nums = {2,3};
		int[] output = {2,3};
		int[] actOutput = sortArrayByParityII(nums);
		assertArrayEquals(output,actOutput);
	}

	private int[] sortArrayByParityII(int[] nums) {
		
		int even = 0, odd = 1;
		while(odd<nums.length && even<nums.length) {
			if(nums[even]%2==0) {
				even=even+2;
			}
			else {
				swap(nums, even, odd);
				odd = odd+2;
			}
		}
		
		return nums;
	}

	private void swap(int[] nums, int even, int odd) {
		int temp = nums[even];
		nums[even] = nums[odd];
		nums[odd] = temp;
		
	}	

}
