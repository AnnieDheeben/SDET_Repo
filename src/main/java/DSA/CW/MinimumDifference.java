package DSA.CW;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.
 */

/*
 * Psuedocode : 
 * 1. get the input num array and k value
 * 2. sort the given array
 * 3. Iterate through the input array till length-k to find the minimum difference of each of the window
 * 4. return difference
 */

public class MinimumDifference {
	
	@Test
	public void test1() {
		int[] nums = {9,4,1,7};
		int k=2;
		int output = 2;
		int expOutput = findMinDifference(nums,k);
		Assert.assertEquals(output, expOutput);
		
	}

	private int findMinDifference(int[] nums, int k) {
		
		int difference = Integer.MAX_VALUE;
		//int difference = 0;
		Arrays.sort(nums);
		
		for(int i=0;i<=nums.length-k;i++) {
			difference = Math.min(difference, nums[i+k-1]-nums[i]);
		}
		return difference;
	}

}
