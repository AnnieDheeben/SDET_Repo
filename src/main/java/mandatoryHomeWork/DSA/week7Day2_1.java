package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Psuedocode : 
1. Get the given input string
2. set an integer variable called 'balanced' with value '0'
3. Initialize one counter variable and set it to 0
4.	Iterate through each letter of the given string
	a. if the current index letter is 'R', decrease the balanced value by 1
	b. if the current index letter is 'L', increase the balanced value by 1
	c. whenever the balanced value reaches 0, add the counter by 1
	d. return the final counter value
	
	Time complexity - 0[N]
 */

public class week7Day2_1 {
	
	@Test
	public void test1() {
		String s = "RLRRLLRLRL";
		int expCount = 4;
		int actCount = findSubStrings(s);
		Assert.assertEquals(expCount, actCount);
	}
	
	@Test
	public void test2() {
		String s = "RLRRRLLRLL";
		int expCount = 2;
		int actCount = findSubStrings(s);
		Assert.assertEquals(expCount, actCount);
	}
	@Test
	public void test3() {
		String s = "LLLLRRRR";
		int expCount = 1;
		int actCount = findSubStrings(s);
		Assert.assertEquals(expCount, actCount);
	}

	private int findSubStrings(String s) {
		int balanced = 0;
		int count = 0;
		for(int i=0;i<s.length();i++) { //O[N]
			if(s.charAt(i)=='R') balanced--;
			if(s.charAt(i)=='L') balanced++;
			if(balanced==0) count++;
		}
		return count;
	}

}
