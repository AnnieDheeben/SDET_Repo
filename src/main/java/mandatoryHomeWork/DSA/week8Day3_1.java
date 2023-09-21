package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
 * Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 

Pseudocode : 
1. Get the input array and the diff value
2. set a left pointer at the index 0 and a right pointer at the index left + 1
3. set one boolean flag and set it to false
4. check the difference between the right pointer value and left pointer value
	a. if it equals the given diff value, 
		 1.set the flag to true and increment the right pointer till it gets the value 2*diff
		 2.once the right pointer reaches the value 2*diff,
		 	a. increment the count by 1
		 	b. reset the flag to false
		 	c. increment the left pointer by 1 and assign right pointer as left pointer+1
	b. if it not equals the given diff value, increment the left pointer by 1 and assign right pointer as left pointer+1
	
	Time complexity - O[N]
	Space complexity - O[1]
 */

public class week8Day3_1 {
	
	@Test
	public void test1() {
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;
		int expOutput = 2;
		int actOutput = arithmeticTriplets(nums, diff);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int arithmeticTriplets(int[] nums, int diff) {
		int left = 0;
		int right = left+1;
		int count = 0;
		boolean onePair = false;
		while(right<nums.length-1) {
			if(nums[right]-nums[left] < diff ) {
				right++;
				}
			if(nums[right]-nums[left] > diff ) {
				left++;
				right = left + 1;
			}
			if(nums[right]-nums[left] == diff ) {
				onePair=true;
			while(onePair) {
				right++;
				if(right==nums.length) break;
				if(nums[right] - nums[left]==2*diff) {
					onePair = false;
					count++;
					left++;
					right = left + 1;
				}
				if(nums[right] - nums[left] > 2*diff) {
					onePair = false;
					left++;
					right = left + 1;
				}
			}
		}
		
	}
		return count;
	}
}
	
