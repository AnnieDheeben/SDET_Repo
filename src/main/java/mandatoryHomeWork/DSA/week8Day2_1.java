package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

Psuedocode : 
1. Get the input array, window size and the threshold values
2. set one pointer variable and assign it to 0
3. for each iteration, 
	a. calculate the current sum by adding all the elements of an array starting with current index pointer till k length
    b. check the average value is greater than or equal to threshold or not
    c. if the above condition is true, increment the counter by 1
4. Return the final counter value

Time complexity - O[N]
Space complexity - O[1]

 */
public class week8Day2_1 {
	
	@Test
	public void test1() {
	int[] input = {2,2,2,2,5,5,5,8};
	int k= 3;
	int threshold = 4;
	int expOutput = 3;
	int actOutput = numofSubarrays(input,k,threshold);
	Assert.assertEquals(actOutput, expOutput);
	}

	private int numofSubarrays(int[] input, int k, int threshold) {
		
		int count = 0;
		int pointer = 0;
		int cSum = 0;
		
		while(pointer<k) {
			cSum = cSum+input[pointer++];
			}
		if((cSum/k)>=threshold) count++;
		while(pointer<input.length) { //O[N]
			cSum = cSum + (input[pointer] - input[pointer - k]);
			if((cSum/k)>=threshold) count++;
			pointer++;
		}
		return count;
	}

}
