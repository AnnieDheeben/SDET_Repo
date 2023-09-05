package mandatoryHomeWork.DSA;
/*
 * 2828. Check if a String Is an Acronym of Words

Given an array of strings words and a string s, determine if s is an acronym of words.

The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].

Return true if s is an acronym of words, and false otherwise.

 

Example 1:

Input: words = ["alice","bob","charlie"], s = "abc"
Output: true
Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym. 
Example 2:

Input: words = ["an","apple"], s = "a"
Output: false
Explanation: The first character in the words "an" and "apple" are 'a' and 'a', respectively. 
The acronym formed by concatenating these characters is "aa". 
Hence, s = "a" is not the acronym.
Example 3:

Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
Output: true
Explanation: By concatenating the first character of the words in the array, we get the string "ngguoy". 
Hence, s = "ngguoy" is the acronym.

Psuedocode : 

1. Get the input String array
2. if the array length is 1, return false
3. else iterate through each string
4. get the first character of each string and append it using String builder
5. check whether the characters of the concatenated string length equals the given string
6. if matches, return true else return false

Time complexity : o[N]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class week6Day1 {
	
	@Test
	public void test1() {
		
		String[] words = {"alice","bob","charlie"};
		String s = "abc";
		List<String> listWords = new ArrayList<>(Arrays.asList(words));
		boolean expOutput = true;
		boolean actOutput = isAcronym(listWords,s);
		Assert.assertEquals(expOutput, actOutput);
		
	}

	private boolean isAcronym(List<String> words, String s) {
		
		StringBuilder sb = new StringBuilder();
		if((words.size()==0) && (s.length()==0) ) return false;
		for(int i=0;i<words.size();i++) { //o[N]
			char firstChar = words.get(i).charAt(0);
			sb = sb.append(firstChar);
		}
		
		System.out.println(sb.toString());
		String finalAcronym = sb.toString();
		if(finalAcronym.equals(s)) return true;
		else return false;
	}

}
