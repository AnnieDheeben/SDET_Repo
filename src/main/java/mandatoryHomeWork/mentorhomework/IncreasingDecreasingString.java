package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a string s. Reorder the string using the following algorithm:

Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after sorting s with this algorithm.
Input: s = "aaaabbbbcccc"
 Pseudocode : 
 1. Get the input String
 2.Take the first char and compare it with the remaining char
 3. if it is the smallest of all the remaining characters, append it to the result and remove the same character from the input string
 4. repeat the above step until appending of all the characters are reached once
 5. check the length of the input String. If it is non-empty, pick the largest character from the string and append it to the result
 6. repeat the step 5 until all the characters in the input string is reached once
 
 
 
 
 
 */
public class IncreasingDecreasingString {

	@Test
	public void test1() {
		String s = "aaaabbbbcccc";
		String expOutput = "abccbaabccba";
		String actOutput = sortString(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String sortString(String s) {
		
		int n = s.length(); //O[N]
		int[] arrChar = new int[26];
		char[] sArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<sArr.length;i++) { //O[1]
			char c = sArr[i];
			arrChar[c - 'a']++;
		}
		while(n>0) {
		for(int i=0;i<26;i++) { //O[1]
			if(arrChar[i]>0) {
				sb.append((char)('a' + i));
				arrChar[i]--;
				n--;
			}
		}
		
		for(int i=25;i>=0;i--) { //O[1]
			if(arrChar[i]>0) {
				sb.append((char)('a' + i));
				arrChar[i]--;
				n--;
			}
		}
		}
		return sb.toString();
	}
}
