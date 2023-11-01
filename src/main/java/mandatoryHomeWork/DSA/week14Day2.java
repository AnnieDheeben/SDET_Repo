package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * 283. Move Zeroes
Psuedocode : 
1. Get  the input number
2. assign two pointers start and end at the 0th index
3. iterate through the for loop and for each iteration,
	a. check if the current index value is equal to 0 or not
	b. if it is not equal to 0, swap start and end index
	c. Increment the start index pointer and end index pointer
	d. if the current index is equal to 0, increment the end Index pointer alone
4. return the final output array

Time complexity : O[N]
Space complexity - O[1]
 */
public class week14Day2 {
@Test
public void test1() {
	int[] nums = {0,1,0,3,12};
	int[] expOutput = {1,3,12,0,0};
	int[] actOutput = moveZeroes(nums);
	Assert.assertEquals(actOutput, expOutput);
}

private int[] moveZeroes(int[] nums) {
	
	int stIndex = 0;
	int endIndex = 0;
	for(int i = endIndex;i<nums.length;i++) {
		if(nums[endIndex]!=0) {
			swap(stIndex,endIndex,nums);
			stIndex++;
		}
		endIndex++;
	}
	return nums;
}

private void swap(int stIndex, int endIndex, int[] nums) {
	int temp = nums[stIndex];
	nums[stIndex] = nums[endIndex];
	nums[endIndex] = temp;
}
}
