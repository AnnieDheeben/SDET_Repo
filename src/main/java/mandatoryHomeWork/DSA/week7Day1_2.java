package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.

Psuedocode : 
1. Get the height array
2. find the length of the given array
3. Create an array and copy the elements from input array to the new array
4. sort the given input array
5. compare both the array and return the indices do not match

Time complexity - O[n*log(n)]
 */

public class week7Day1_2 {

	@Test
	public void test1() {
		int[] heights = {1,1,4,2,1,3};
		int expOutput = 3;
		int actOutput = findWrongIndices(heights);
		Assert.assertEquals(expOutput, actOutput);
	}

	@Test
	public void test2() {
		int[] heights = {5,1,2,3,4};
		int expOutput = 5;
		int actOutput = findWrongIndices(heights);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test3() {
		int[] heights = {1,2,3,4,5};
		int expOutput = 0;
		int actOutput = findWrongIndices(heights);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	private int findWrongIndices(int[] heights) {
	
		int n = heights.length;
		int[] actHeights =new int[n]; //O[N]
		for(int i=0;i<n;i++) {
			actHeights[i] = heights[i];
		}
		int count = 0;
		Arrays.sort(heights); //O[n*log(n)]
		int i=0;
		while(i<n) {
			if(heights[i]!=actHeights[i]) count++;
			i++;
		}
		
		return count;
	}

}
