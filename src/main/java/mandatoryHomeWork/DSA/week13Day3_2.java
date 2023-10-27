package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * 75. Sort Colors
 * Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Psuedocode (Algortihm : Dutch National Flag)
1. Get the input array
2. set three pointer start and mid at index 0 and end at the last index
3. start a while loop and iterate till mid is less than or equal to end
4. for each iteration, check the current index number
	a. if it is 0, swap the mid pointer and start pointer index value and increment the mid pointer and start pointer
	b. if it is 1, increment the mid pointer 
	c. if it is 2, swap the end pointer and mid pointer index value and decrement the end pointer
5. return the sorted array based on colors
Time complexity - O[N]
Space complexity - O[1]

 */
public class week13Day3_2 {
@Test
public void test1() {
	int[] nums = {2,0,2,1,1,0};
	int[] expOutput = {0,0,1,1,2,2};
	int[] actOutput = sortColors(nums);
	Assert.assertEquals(actOutput, expOutput);
}

private int[] sortColors(int[] nums) {
	int start = 0, mid = 0;
	int end = nums.length-1;
	while(mid<=end) {
		switch(nums[mid]) {
		case 0:
			swap(nums,mid, start);
			mid++;
			start++;
			break;
			
		case 1:
			mid++;
			break;
		case 2:
			swap(nums,mid,end);
			end--;
			break;
		}
	}
	return nums;
}

private void swap(int[] nums, int mid, int end) {
	int temp = nums[mid];
	nums[mid] = nums[end];
	nums[end] = temp;
	
}
}
