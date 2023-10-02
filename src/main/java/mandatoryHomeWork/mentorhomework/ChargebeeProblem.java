package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * find the greatest sum of numbers based on the k value given:
input : [10,3,33,5,2,32,21,14,17,8,9] & k=3

 * Psuedocode : 
 * 1. Get the input array
 * 2. declare current sum as 0, maxSum as 0 and max as Integer.MIN_VALUE
 * 3. Declare an integer pointer with value 0
 * 3. start a while loop and iterate till k to calculate to find the current sum
 * 4. start another while loop and iterate till length
 * 5. for each iteration, calculate the sum of current window ,if it is greater than the previous current sum, change this as a current sum
 * 6. return the final maximum current sum
 */

public class ChargebeeProblem {
	@Test
	public void test1() {
		int[] input = {10,3,33,5,2,32,21,14,17,8,9};
		int k=3;
		int ouput = 67;
		int actOutput = findMaxSum(input,k);
		Assert.assertEquals(ouput, actOutput);
		
	}

	private int findMaxSum(int[] input, int k) {
		int currentSum = 0;
		int max = Integer.MIN_VALUE;
		int maxSum = 0;
		int pointer = 0;
		
		while(pointer<k) {
			currentSum = currentSum + input[pointer];
			pointer++;
		}
		
		while(pointer<input.length) {
			maxSum = Math.max(maxSum, currentSum);
			currentSum = currentSum + input[pointer]-input[pointer-k];
			pointer++;
		}
		return Math.max(maxSum, currentSum);
	}

}
