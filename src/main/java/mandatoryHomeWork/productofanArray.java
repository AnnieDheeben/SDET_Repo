package mandatoryHomeWork;

import org.junit.Test;
import org.testng.Assert;

/*
 * There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

 

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */

public class productofanArray {

	@Test
	public void test1() {
		int[] nums = {-1,-2,-3,-4,3,2,1};
		int output = 1;
		int actOutput = findArrayProd(nums);
		Assert.assertEquals(actOutput, output);
	}

	public int findArrayProd(int[] nums) {
		
		int prod = 0, x = 0;
		int numsLen = nums.length;
		for(int i=0;i<numsLen-1;i++) {
				prod = nums[i]*nums[i+1]; // 2 * 3
				nums[i+1]= prod;
			}							
		
		if(prod > 0) return (x = 1);
		if(prod < 0) return (x = -1);
		if(prod == 0) return (x = 0);
		return x;

	}
	
}
