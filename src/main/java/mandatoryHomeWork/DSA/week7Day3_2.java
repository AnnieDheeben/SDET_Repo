package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"

Psuedocode : 
1. Get the inpuit string
2. split it by space
3. Iterate through each word in the given string
	a. do reverse of current string
	b. add it to an array
4. join the string by a space and return it as an output
 */

public class week7Day3_2 {
	
	@Test
	public void test1() {
		String s = "Let's take LeetCode contest";
		String expOutput  = "s'teL ekat edoCteeL tsetnoc";
		String actOut = reverseWords(s);
		Assert.assertEquals(expOutput, actOut);
	}
	
	@Test
	public void test2() {
		String s = "God Ding";
		String expOutput  = "doG gniD";
		String actOut = reverseWords(s);
		Assert.assertEquals(expOutput, actOut);
	}

	private String reverseWords(String s) {
		String[] strArr = s.split(" ");
		String[] newArr = new String[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			newArr[i] = reverseString(strArr[i]);	
		}
		
		String result = String.join(" ", newArr);
		return result;
	}

	private String reverseString(String word) {
		char[] sArr = new char[word.length()];
		int index = 0;
		for(int i=sArr.length-1;i>=0;i--) {
			sArr[index]=word.charAt(i);
			index++;
		}
		return new String(sArr).trim();
	}
}
