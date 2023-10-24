package mandatoryHomeWork.DSA;
/*
 * 169. Majority Element
Psuedocode : 
1. Get the input array as nums
2. declare two integer variables majority and votes
3. assign majority value as nums[0] and votes as 1
4. Iterate through the nums array starting from first index
5. for each iteration,
	a. check if the majority element matches the current index element, If yes, increment the votes by 1
	b. if the above condition fails, decrement the vote by 1
	c. if the vote becomes 0, assign the current index element as majority element
6. return the final majority element
 */

import org.junit.Test;

import junit.framework.Assert;

public class week13Day2_1 {
	@Test
	public void test1() {
		int[] nums = {2,2,1,1,1,2,2};
		int expOutput = 2;
		int actOutput = majorityElement(nums);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int majorityElement(int[] nums) {
		int majority = nums[0], votes = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(majority==nums[i]) {
				votes++;
			}
			else if(votes==0) {
				majority = nums[i];
				votes++;
			}
			else{
				votes--;
			}
		}
		return majority;
	}

}
