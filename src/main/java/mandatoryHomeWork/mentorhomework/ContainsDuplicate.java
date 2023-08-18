package mandatoryHomeWork.mentorhomework;

import org.testng.annotations.Test;

import junit.framework.Assert;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Psuedocode : 
1. Get the input array
2. Iterate through the array to check if any of the element appears twice
3. if yes, increment the counter variable by 1
4. after the loop ends, check if the count is greater then 0.
5. if yes, return true, else return false

 */
public class ContainsDuplicate {
	
	@Test
	public void test1() {
		int[] nums = {1,2,3,1};
		boolean output = true;
		boolean actOutput = findDuplicates(nums);
		Assert.assertEquals(output, actOutput);
		
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3,41};
		boolean output = false;
		boolean actOutput = findDuplicates(nums);
		Assert.assertEquals(output, actOutput);
		
	}
	public boolean findDuplicates(int[] nums) {
		
		int count = 0,temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
				 temp = temp + count;
			}
		}
		if(temp > 0) return true;
		else return false;
	}

}
