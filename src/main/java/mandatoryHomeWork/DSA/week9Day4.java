package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

/*
 * 438. Find All Anagrams in a String
Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

Psuedocode: 
1. Get the input s and p
2. declare a variable called 'k'(window size) and assign the length of p to it
3. declare an integer array with size 26 and store the occurrence of each character based on their ascii value
4. declare an Integer pointer and assign 0 to it
5. Get the character occurrence of the string p
6. start a while loop and iterate till s' length -k
6. for each iteration, check the character occurrence of current window element and p's character occurrence are same
7. if it same, return the pointer value in the output list
8. return the final output list
 */
public class week9Day4 {

	@Test
	public void test1() {
		String s ="cbaebabacd";
		String p = "abc";
		List<Integer> output = new ArrayList<Integer>();
		output.add(0);
		output.add(6);
		List<Integer>actOutput = findStringAnagram(s,p);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		String s ="aa";
		String p = "bb";
		List<Integer> output = Collections.emptyList();
		List<Integer>actOutput = findStringAnagram(s,p);
		Assert.assertEquals(output, actOutput);
	}

	private List<Integer> findStringAnagram(String s, String p) {
		int n = s.length();
		int k = p.length();
		int pointer = 0;
		List<Integer> output = new ArrayList<Integer>();
		int[] cArr = new int[26];
		for(int i=0;i<k;i++) {
			char c = p.charAt(i);
			cArr[c-'a']++;
		}
		while(pointer<=n-k) {
			int start = pointer;
			int end = pointer+k-1;
			String str = s.substring(start, end+1);
			boolean result = isAnagram(str,cArr,k);
			if(result) {
				output.add(pointer);
			}
			pointer++;
		}
		if(output.isEmpty()) {
			return new ArrayList<Integer>();
		}
		return output;
	}

	private boolean isAnagram(String str, int[] cArr,int k) {
		
		boolean flag = true;
		int[] substrArr = new int[26];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			substrArr[c-'a']++;
		}
		
		for(int i=0;i<substrArr.length;i++) {
			if(substrArr[i]!=cArr[i]) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
