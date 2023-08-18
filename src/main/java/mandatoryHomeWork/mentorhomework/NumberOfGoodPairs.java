package mandatoryHomeWork.mentorhomework;
/*
 * Number of good pairs : 

1. Get the input array as nums
2. Initialize the integer variable as count asn assign it to 0
3.Iterate using two for loops with i and j ('i' with starting index as 0 till the end of the array, j with starting index as i+1 till the end of the array)
4. Apply the below logic
	a. If the array length is 0, return the count as 0
	b. For each iteration,
		check if nums[i] is equal to nums[j]
		if the above step is true, increase the counter by 1
5. return the count
 */

import org.junit.Test;
import org.testng.Assert;

public class NumberOfGoodPairs {
	
	@Test
	public void test1() {
		int[] nums = {1,2,3,1,1,3};
		int expCount = 4;
		int actCount = findGoodPair(nums);
		Assert.assertEquals(actCount, expCount);
	}
	
	@Test
	public void test2() {
		int[] nums = {1,1,1,1};
		int expCount = 6;
		int actCount = findGoodPair(nums);
		Assert.assertEquals(actCount, expCount);
	}
	
	@Test
	public void test3() {
		int[] nums = {1,2,3};
		int expCount = 0;
		int actCount = findGoodPair(nums);
		Assert.assertEquals(actCount, expCount);
	}

	@Test
	public void test4() {
		int[] nums = {};
		int expCount = 0;
		int actCount = findGoodPair(nums);
		Assert.assertEquals(actCount, expCount);
	}
	
	public int findGoodPair(int[] nums) {
		int count = 0;
		if(nums.length<1) return (count=0);
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
				}
			}
		}
		return count;
	}

}
