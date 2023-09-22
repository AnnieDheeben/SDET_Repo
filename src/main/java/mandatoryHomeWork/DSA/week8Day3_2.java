package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*1763. Longest Nice Substring
A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.

Psuedocode : 
1. Get the input string
2. set two variables as right and left and assign both to 0
3. declare an integer array with size 3 to maintain the occurrence of each characters
4. Start a while loop that iterates through the string from left to right using the right pointer
	a. Get the character at the current right index and increment the corresponding character count in the integer array
	b. check if the integer array holds minimum 1 count of a,b and c
	c. if it is true, add result as result + (total length of the string - current right value)
	d. Move the left boundary (l) of the substring to the right, decrementing the count of the character that was at l.
	e. increment the right value
	f. continue the above steps(a to e) till the right reaches the end of the string
5. return the total count of a valid substring stored in the result variable

Time Complexity : O[N]
Space complexity : O[1]
	
	


 * 
 */

public class week8Day3_2 {
	
	@Test
	public void test1() {
		String s = "abcabc";
		int output = 10;
		int expOutput = noSubStrings(s);
		Assert.assertEquals(output, expOutput);
	}
	
	
	public int noSubStrings(String s) {
		int[] count = {0,0,0};
		int res = 0;
		int l= 0;
		int right = 0;
		int n = s.length();
		while(right<n) {
			char c = s.charAt(right);
			count[c-'a']++;
			while(count[0]>0 && count[1]>0 && count[2]>0) {
				res+=n-right;
				count[s.charAt(l++)-'a']--;
			}
			right++;
		}
		return res;
		
	}

}
