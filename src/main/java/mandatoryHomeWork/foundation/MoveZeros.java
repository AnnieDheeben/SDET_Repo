package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
	 */
	
	@Test
	public void test1() {
		int nums[] =new int[] {0,1,0,3,12};
		int output[] = moveZeroToEnd(nums);
		System.out.println(Arrays.toString(output));
		
	}
	
	@Test
	public void test2() {
		int nums[] =new int[] {0};
		int output[] = moveZeroToEnd(nums);
		System.out.println(Arrays.toString(output));
		
	}
	private int[] moveZeroToEnd(int[] nums) {
		int temp =0;
		if(nums.length==1 && nums[0]==0) return nums;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==0) {
					temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		return nums;
	}

}
