package mandatoryHomeWork.mentorhomework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Arrays;

import org.testng.Assert;

/*
 * Squares of a sorted array : 
Data set : 
1.[-4,-1,0,3,10]
2.[-7,-3,2,3,11]
3.[]

Psuedocode : 
1. Get the input array
2. Get the length of the array and assign it to an Integer variable len and initialize to 0
3. initialize one integer variable as arrSquare and assign it to 0
3. Iterate through the for loop with starting index as 0 till the end of the array
4. Apply the below logic for each iteration
	arrSquare = 0;
	arrSquare = i*i;
	arr[i] = arrSquare
5. return the squared of a sorted array at the end
 */
public class SortedArraySquares {

	@Test
	public void test1() {
		
		int[] nums = {-4,-1,0,3,10};
		int[] output = {0,1,9,16,100};
		int[] actOutput = findArraySqures(nums);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test2() {
		
		int[] nums = {};
		int[] output = {};
		int[] actOutput = findArraySqures(nums);
		Assert.assertEquals(actOutput, output);
	}

	public int[] findArraySqures(int[] nums) {
	
		int len = nums.length;
		int arrSquares;
		if(len < 1) return nums;
		for(int i=0;i<len;i++) {
			nums[i] = nums[i]*nums[i];		
		}
		Arrays.sort(nums);
		return nums;
	}
}
