package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


Psuedocode : 
1. Get the input String
2. convert the String into String Array by splitting it by space
3. Create one new array to store the sorted sentence
3. get the index of the string to be placed in new Array by getting the last index Value of current string
4. get the actual string value to be place in the above index by getting 0 to length-1 value of the current string
5. place the string value in the above found out index postion of the new Array
6. repeat the above steps till the end of the given string
7. convert the array into String
 */

public class week6Day5 {
	
	@Test																																		
	public void test1() {
		String s = "is2 sentence4 This1 a3";
		String expOutput = "This is a sentence";
		String actOutput = sortSentence(s);
		Assert.assertEquals(expOutput, actOutput);
		
	}
	
	@Test																																		
	public void test2() {
		String s = "Myself2 Me1 I4 and3";
		String expOutput = "Me Myself and I";
		String actOutput = sortSentence(s);
		Assert.assertEquals(expOutput, actOutput);
		
	}

	private String sortSentence(String s) {
		
		String[] s1 = s.split(" ");
		String output = "" ;
		int newArrIndex = 0;
		String[] newArr = new String[s1.length]; //0[N]
		for(int i=0;i<s1.length;i++) {
			int index = s1[i].length()-1;
			String s2 = s1[i].substring(index);
			newArrIndex = Integer.parseInt(s2);
			newArr[newArrIndex-1] = s1[i].substring(0, index);
			}
		output = String.join(" ", newArr);
		return output;
	}
	
	//Time complexity - 0[N]

}
