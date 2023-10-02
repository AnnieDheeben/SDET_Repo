package DSA.CW;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
 
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

psuedocode : 
1. Get the inupt array
2. set startIndex as 0 and endIndex as length-1
3. if startIndex value is not equal to endIndex value, swap two values
4. if startIndex value is equal to endIndex value, continue to the next element of endIndex
*/


public class moveZeroElements {
	@Test
	public void test1() {
		int[] nums = {0,1,0,3,12};
		int[] output = {1,3,12,0,0};
		int[] actOutput = moveAllZeros(nums);
		Assert.assertArrayEquals(output, actOutput);
	}

	private int[] moveAllZeros(int[] nums) {
		
		int stIndex = 0;
		int  endIndex = 0;
		for(int i=endIndex;i<nums.length;i++) {
			if(nums[endIndex]!=0) {
				swap(stIndex,endIndex,nums);
				stIndex++;
			}
			endIndex++;
		}
		return nums;
	}

	private static void swap(int stIndex, int endIndex, int[] nums) {
			
			int temp = nums[stIndex];
			nums[stIndex] = nums[endIndex];
			nums[endIndex] = temp;
		System.out.println();			
	}

	private int[] twoPointer(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		while(start<end) {
			if(nums[start]==0) {
				if(nums[end]!=0) {
					swap(start,end, nums);
					end--;
				}
				else {
					end--;
				}
			}
			start++;
		}
		return nums;
	}
	
}
