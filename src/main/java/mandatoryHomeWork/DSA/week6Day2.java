package mandatoryHomeWork.DSA;
/*
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

Psuedocode : 
1. Get the input string and the k value
2. Spilt the given string by space and store it in a String array
4. Iterate through the string array with the starting index 0 and ending index as k
5. store the value of each iteration in a new output string array
6. convert the output string array into string by joining it with a space
7. return the final string
 */

import org.junit.Test;

import junit.framework.Assert;

public class week6Day2 {
	
	@Test
	public void test1() {
		String s = "Hello how are you Contestant";
		int k = 4;
		String expOutput = "Hello how are you";
		String actOutput = truncateSentence(s,k);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String truncateSentence(String s,int k) {
	
		String[] s1 = s.split(" "); //O[N]
		String[] newArr = new String[k];
		for(int i=0;i<k;i++) { //O[K]
			newArr[i]=s1[i];		
		}
		String s2 = String.join(" ", newArr);
		return s2;
	}

	//Time complexity - O[N]
}
