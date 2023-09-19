package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * ou are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.

 

Example 1:

Input: s = "egcfe"
Output: "efcfe"
Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.

Example 2:

Input: s = "abcd"
Output: "abba"
Explanation: The minimum number of operations to make "abcd" a palindrome is 2, and the lexicographically smallest palindrome string we can get by modifying two characters is "abba".
Example 3:

Input: s = "seven"
Output: "neven"
Explanation: The minimum number of operations to make "seven" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "neven"


Psuedocode : 
1. Get the input string
2. set two pointer left and right
3. Assign left pointer to the index 0 and right pointer to the index string length -1
4. if elements in the left pointer and right pointer are same, increment the left pointer
5. if elements in the left pointer and right pointer are different,
	a. check for the smaller element between two and do replace bigger element with the smaller one
	b. increment the left pointer and decrement the right pointer
	c. continue the above steps till left pointer is less than the right pointer
6. return the output string

Time complexity - O[N]
Space complexity - O[N]
 */

public class week8Day2_2 {
	
	@Test
	public void test1() {
		String s = "seven";
		String output = "neven";
		String actOutput = makeSmallestPalindrome(s);
		Assert.assertEquals(output, actOutput);
	}

	private String makeSmallestPalindrome(String s) {
		
		int left = 0;
		String res = "";
		int right = s.length()-1;
		
		char[] arrChar = s.toCharArray(); //o[N]
			while(left < right) {
			if(arrChar[left] ==arrChar[right]) {
				left++;
				right--;
			}
			else if(arrChar[left] < arrChar[right]) {
				arrChar[right] = arrChar[left];
				left++;
				right--;
			}
			else {
				arrChar[left] = arrChar[right];
				left++;
				right--;
			}			
		}
		
		
		return new String(arrChar);
	}

}
