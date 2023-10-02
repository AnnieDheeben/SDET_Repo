package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Test data set : 
 * 1. input ={1,5,2,3,7,1}
 * k = 3
 * 2. input = {0,0,1,1,0,0}
 * k = 4
 * 3. input = {-1,0}
 * k=1
 * 
 * Psuedocode : 
 * 1. Get the input array and K
 * 2. set one pointer at 0th index and another pointer at k
 * 3. get sum of all the element within the range and store it in a variable called max sum
 * 4. for each iteration, check whether the existing max sum is lesser then current sum or not. if yes, store the current sum as max sum
 * 5. return the max sum value
 */

public class highetSum_2Pointers {
	@Test
	public void test1() {
		int[] input = {1,5,2,3,7,1};
		int k = 3;
		int expectedSum = 12;
		int actMaxSum = twoPointers(input,k);
		Assert.assertEquals(expectedSum, actMaxSum);
	}

	@Test
	public void test2() {
		int[] input = {0,0,1,1,0,0};
		int k = 4;
		int expectedSum = 2;
		int actMaxSum = slidingWindow(input,k);
		Assert.assertEquals(expectedSum, actMaxSum);
	}
	
	@Test
	public void test3() {
		int[] input = {-1,0};
		int k = 1;
		int expectedSum = 0;
		int actMaxSum = slidingWindow(input,k);
		Assert.assertEquals(expectedSum, actMaxSum);
	}
	private int findMaxSum(int[] input, int k) {
		
		int stPos = 0;
		int endPos = k;
		int maxSum = Integer.MIN_VALUE;
		int currentSum=0;
		
		for(int i=stPos;i<endPos;i++) {
			currentSum = 0;
			if((stPos<endPos) && (endPos<input.length)) {
				currentSum = currentSum + input[i];
				if(currentSum > maxSum) maxSum = currentSum;		
			}
		}
		return currentSum;
	}
	
	private int slidingWindow(int[] nums, int k){
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }
        return Math.max(currentSum, max);
    }
	
	private int twoPointers(int[] nums, int k) {
		
		int currentSum=0;
		int maxSum = Integer.MIN_VALUE;
		int start= 0;
		int end = 0;
		while(end<k) {
			currentSum = currentSum + nums[end++];
		}
		
		while(end<nums.length) {
			maxSum = Math.max(currentSum, maxSum);
			currentSum += nums[end++] - nums[start++];
		}
		return maxSum;
	}

}
