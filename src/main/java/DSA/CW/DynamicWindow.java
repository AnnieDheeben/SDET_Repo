package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

public class DynamicWindow {
	/*
	 * Psuedocode : 
	 * 1. Get the input array
	 * 2. declare two variables left and right and assign it to 0
	 * 3. Start a while loop and iterate through the array till right<array length and current sum
	 * 	  is greater than the given k value
	 * 4.For each iteration,
	 * 	a. calculate current sum as sum of left index value and right index value 
	 * 	b. check if the current sum is greater than the k value
	 * 	c. if the above step returns true, 
	 * 		a.calculate the window size and add it in a variable called minSize
	 * 		b.reduce the first index value from the current sum , move the left pointer by 1
	 * 	d. if the step b returns false, increment the right pointer alone till reaches the condition currentsum > k
	 * 5. return the final mininum window size
	 * 
	 * 		
	 */

	@Test
	public void test1() {
		int[] arr = {4,2,7,11,7,6};
		int k = 20;
		int minWindowSize = 3;
		int actWindowSize = findMinWindow(arr, k);
		Assert.assertEquals(minWindowSize, actWindowSize);
	}
	@Test
	public void test2() {
		int[] arr = {1,2,3,4,5};
		int k = 10;
		int minWindowSize = 3;
		int actWindowSize = findMinWindow(arr, k);
		Assert.assertEquals(minWindowSize, actWindowSize);
	}

	private int findMinWindow(int[] arr, int k) {
		int start=0, end=0;
		int minWindowSize = -1, currentSum=0;
		while(end<=arr.length) {
			if(currentSum>k) {
				minWindowSize = end-start;
				currentSum = currentSum-arr[start];
				start++;
			}
			else {
				if(end==arr.length) {
					break;
				}
				currentSum = currentSum+arr[end];
				end++;
			}
		}
		return minWindowSize;
	}
}
