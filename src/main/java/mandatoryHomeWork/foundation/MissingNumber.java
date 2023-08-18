package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */

public class MissingNumber {
	@Test
	public void test1() {
		int[] nums = {3,0,1};
		int len = nums.length;
		int output = findMissingNumber(nums,len);
		Assert.assertEquals(2, output);
	}
	
	@Test
	public void test2() {
		int[] nums = {4,2,1,0};
		int len = nums.length;
		int output = findMissingNumber(nums,len);
		Assert.assertEquals(3, output);
	}
public int findMissingNumber(int[] nums, int len) {
		int[] newNums = new int[len+1];
		for(int a : nums) {
			newNums[a]++;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(newNums[i]==0) return i;
		}
		return 0;
	}

}
