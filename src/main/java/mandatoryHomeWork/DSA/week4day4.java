package mandatoryHomeWork.DSA;
/*
 * 
 * Summary Ranges
 * 
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

Psuedocode :
1. Get the input sorted array
2. Declare an ArrayList of type String to store the output
2. Iterate through the array with starting index 0 till the end of the array
3. Declare an integer variable called 'a' and assign the 0th index value of the array to it
4. Do an entry check using while loop whether the current index + 1 is less than the array length or not
5. If the above step returns true,
	a. Find the difference b/w [i+1]th index and ith index value
	b. If the above difference is 1
	c. Increment the i value by 1
	d. else break the while loop
6. Declare an integer variable called 'b' and assign the current ith index value to it
7. check if a is equal to b or not
	a. if a & b are equal, add a to the list
	b. if a & b are different, add range value to the list in the below format
		a -> b
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class week4day4 {
	
	@Test
	public void test1() {
		int[] nums = {0,1,2,4,5,7};
		List<String> outputList = new ArrayList<>(Arrays.asList("0->2","4->5","7"));
		List<String> actOutputList = findRanges(nums);
		Assert.assertEquals(actOutputList, outputList);
		
	}

	public List<String> findRanges(int[] nums) {
		
		List<String> findRangeList = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int a = nums[i];
			while(i+1 < nums.length) {
			int diff = nums[i+1] - nums[i];
			if(diff==1) {
				i++;
				}
			else break;
			}
			
			int b = nums[i];
			
			if(a!=b) {
				findRangeList.add(a + "->" + b);
			}
			
			else {
				findRangeList.add(Integer.toString(a));
			}	
		}
		
		System.out.println(findRangeList);
		return findRangeList;
	}
}
	