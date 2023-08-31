package mandatoryHomeWork.mentorhomework;
/*
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

Psuedocode : 
1. Get the input words String array
2. Declare a string variable called palindrome
3. Iterate through each word of the given String array
3. if the reverse string value of the word matches with the original word, 
	a. assign that word to palindrome variable
	b. break the loop
4. return the palindrome value

Time complexity  - O[N * M]
 */

import org.junit.Test;

import junit.framework.Assert;

public class FirstPalindromicString {

	@Test
	public void test1() {
		String[] words = {"abc","car","ada","racecar","cool"};
		String expOutput = "ada";
		String actOutput = firstPalindrome(words);
		Assert.assertEquals(expOutput, actOutput);
		
	}

	private String firstPalindrome(String[] words) {
		
		boolean isPalindrome = false;;
		 String palindrome = "";
		 for(int i=0;i<words.length-1;i++) { //O[N]
			 StringBuilder sb = new StringBuilder(words[i]);
			 sb = sb.reverse();//O[M]
			 if(sb.toString().equals(words[i])) {
				 isPalindrome = true;
				 palindrome = palindrome + words[i];
				 break;
			 }
		 }
		return palindrome;
	}
}
