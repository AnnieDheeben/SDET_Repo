package mandatoryHomeWork;
/*
 * Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

 

Example 1:

Input:
S = 00001
Output:
4

Psuedocode :
1. Get the string and find the length of the string
2. Iterate the string from last index to find out the last index of 1
3. when the last index of 1 is found out, store the index in a variable and exit the loop
4. return the index
 */

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class findLastIndex {
	@Test
	public void test1() {
		
		String s = "00001";
		int actOutput = findLastIndex(s);
		Assert.assertEquals(actOutput, 4);
		
	}
	
	@Test
	public void test2() {
		
		String s = "00000";
		int actOutput = findLastIndex(s);
		Assert.assertEquals(actOutput, -1);
		
	}

	public int findLastIndex(String s) {
		
		int len = s.length();
		int x=-1;
		for(int i = len-1; i>=0; i--) {
			if(s.charAt(i)=='1') x = i;
		}
		return x;
	}
}
