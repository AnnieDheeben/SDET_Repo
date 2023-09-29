package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 541. Reverse String II
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"

Pseudocode : 
1. Get the input string and integer k value
2. declare two variables start and end and assigned both to 0
3. start a for loop and iterate till the end of the string
4. for each iteration, 
	a. set start as the current index position and end as the minimum of (start+k-1) and s'length
	b. get the substring within the start and end range and do reverse
	c. Increment the index by 2*K to move to the next substring
5. return the final output string
Time complexity - O[N]
Space complexity - O[1]
	

 */

public class week9Day5 {
	
	@Test
	public void test1() {
		
		String s = "abcdefg";
		int k=2;
		String expOutput = "bacdfeg";
		String actOutput = findReverseString(s,k);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String findReverseString(String s, int k) {
		int start = 0;
		int end = 0;
		char[] cArr = s.toCharArray();
		for(int i=0;i<s.length();i+=2*k) { //O[N]
			start = i;
			end = Math.min(i+k-1, s.length()-1);
			while(start < end) {
				
				char temp = cArr[start];
				cArr[start]=cArr[end];
				cArr[end]=temp;
				
				start++;
				end--;
			}
			
		}
		return new String(cArr);
	}

}
