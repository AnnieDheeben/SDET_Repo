package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode :
 * 1. Get the input array, k value and threshold
 * 2. calculate the sum of index 0 to k value and check whether it reaches the threshold condition or not
 * 3. If yes, increment the counter by 1
 * 4. start a while and iterate till the end of the array
 * 5. calculate the current sum by reducing the value at starting index and adding the one index value from previos window
 * 6. check whether it reaches the threshold condition
 * 7. if yes, increment the counter by 1
 * 8. return the final counter value
 */

public class subArraysThreshold {
	@Test
	public void test1() {
		int[] arr= {2,2,2,2,5,5,5,8};
		int k=3;
		int threshold=4;
		int output = 3;
		int actOutput = numOfSubarrays(arr,k,threshold);
		Assert.assertEquals(output, actOutput);
	}

	private int numOfSubarrays(int[] arr, int k, int threshold) {
		int count = 0;
		int pointer = 0;
		int cSum=0;
		while(pointer<k) {
			cSum = cSum+arr[pointer];
			pointer++;
		}
		if((cSum/k)>=threshold) count++;
		while(pointer<arr.length) {
			cSum = cSum+(arr[pointer] - arr[pointer-k]);
			if((cSum/k)>=threshold) count++;
			pointer++;
		}
		return count;
	}

}
