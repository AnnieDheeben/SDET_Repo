package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Pseudocode  :
1. Get the input String s and the indices array
2. Create a new character array to place the char as per the given indices
3. Iterate through each character in the string
	a.place the string in the same oder of the given index position
	b. return the output string
	
	Time complexity - O[N]
 */

public class week7Day3_1 {
	@Test
	public void test1() {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String expOutput = "leetcode";
		String actOutput = restoreString(s, indices);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String restoreString(String s, int[] indices) {
		
		char[] sChar = new char[s.length()]; //O[N]
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			sChar[indices[i]] = c;
		}
		
		String result = new String(sChar);
		return result;
	}
	


}
