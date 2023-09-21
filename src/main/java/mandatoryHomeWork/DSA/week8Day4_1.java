package mandatoryHomeWork.DSA;
/*
 * Psuedocode :
 * 1. Get the input array
 * 2. convert the int array into a string array
 * 3. declare two pointers left and right
 * 4. assign left to index 0 of the string array and right to the last index of the string array
 * 5. concatenate the left index and right index value of the string array and add it to the output variable 
 * 6. increment left , decrement right
 * 7. continue the above steps till left < right
 * 8. when left and right are equal, add the left index value to the output
 * 
 * Time complexity - O[N]
 * Space complexity - O[N]
 * 
 */

import org.junit.Test;

import junit.framework.Assert;

public class week8Day4_1 {
	@Test
	public void test1() {
		int[] nums = {7,52,2,4};
		long output = 596;
		long actOutput = findTheArrayConcVal(nums);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		int[] nums = {5,14,13,8,12};
		long output = 673;
		long actOutput = findTheArrayConcVal(nums);
		Assert.assertEquals(output, actOutput);
	}

	private long findTheArrayConcVal(int[] nums) {
		
		int left = 0;
		int right = nums.length-1;
		long output = 0;
		String concatenate ="";
		String[] str = new String[nums.length];

		
		for(int i=0;i<nums.length;i++) { //o[N]
			str[i] = Integer.toString(nums[i]);
		}
		
		while(left<right) {
			String a = str[left];
			String b = str[right];
			concatenate = concatenate + a + b;
			output = output + Integer.parseInt(concatenate);
			left++;
			right--;
			concatenate = "";
		}
		if(left==right) {
			//concatenate = concatenate + nums[left];
			output = output + nums[left];
		}
		return output;
	}

}
