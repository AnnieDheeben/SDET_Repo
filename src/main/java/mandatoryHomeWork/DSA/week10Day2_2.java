package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

Psuedocode : 
1. Get the input string
2. Get the occurrence of each character of the given string and store it in an array
3. if any one index of the array holds occurrence as 0, return false , else return true.
Time complexity - O[N]
Space complexity - O[N]
 */

public class week10Day2_2 {
	@Test
	public void test1() {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean expOutput = true;
		boolean actOutput = checkIfPangram(sentence);
		Assert.assertEquals(expOutput, actOutput);
	}
	@Test
	public void test2() {
		String sentence = "leetcode";
		boolean expOutput = false;
		boolean actOutput = checkIfPangram(sentence);
		Assert.assertEquals(expOutput, actOutput);
	}

	private boolean checkIfPangram(String sentence) {
		int[] cArr = new int[26];
		char[] ch = sentence.toCharArray();
		for(Character c : ch) { //O[N]
			cArr[c-'a']++;
		}
		for(int i=0;i<cArr.length;i++) {
			if(cArr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
