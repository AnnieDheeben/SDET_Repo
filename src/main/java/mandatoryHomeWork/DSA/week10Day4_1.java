package mandatoryHomeWork.DSA;
/*
 * 1684. Count the Number of Consistent Strings
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
Psuedocode : 
1. Get the input string and string array
2.store the input string in a set
3. iterate through the string array and for each word,
	a. check if the set contains the character
	b. if yes, increase the count by 1
4. return the final count value
 */

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class week10Day4_1 {
	@Test
	public void test1() {
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		int expCount = 2;
		int actOutput = countConsistentStrings(allowed, words);
		Assert.assertEquals(expCount, actOutput);
	}

	private int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		boolean res = true;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<allowed.length();i++) {
			char ch = allowed.charAt(i);
			set.add(ch);
		}
		for(int i=0;i<words.length;i++) {
			char[] cArr = words[i].toCharArray();
			res=true;
			for(Character c : cArr) {
				if(!set.contains(c)) {
					res = false;
					continue;
				}
			}
			if(res==true) count++;
			
		}
		
		return count;
	}

}
