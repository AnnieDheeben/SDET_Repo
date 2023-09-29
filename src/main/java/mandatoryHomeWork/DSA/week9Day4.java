package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.Arrays;
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

Psuedocode(findStringAnagram):
1. Get the input s and p
2. declare a variable called 'k'(window size) and assign the length of p to it
3. declare an integer array with size 26 and store the occurrence of each character based on their ascii value
4. declare an Integer pointer and assign 0 to it
5. Get the character occurrence of the string p
6. start a while loop and iterate till s' length -k
6. for each iteration, check the character occurrence of current window element and p's character occurrence are same
7. if it same, return the pointer value in the output list
8. return the final output list

Psuedocode - better approach (findStringAnagram1):
1. Get the input string s and p
2. declare an integer array 'cArr' with size 26 to track the character occurrence of p string
3. declare one more integer array  'sArr' with the same size 26 to keep track the character occurrence of s string
4. start a while loop and iterate till the end of p string to get the character occurrence and store it in cArr based on ascii value
5. start an another while loop that iterate till the end of s string
	a. get the current character of each iteration
	b. add it to the sArr based on ascii value
	c. check whether the current pointer reaches the length of the string p
	d. if the above statement is true, compare the two arrays(cArr & sArr)
	e. if both are same, 
		1.add the starting index of the substring(s) to the output list
	 	2.remove the character at the starting index of the substring
	 	3. add the current pointer+1 character to form the new substring
	f. if both are not same, check for the next window
	g. continue the above steps till all the windows are covered
6. return the output list if it holds any value
7. return an empty list if the output list does not hold any value
 */
public class week9Day4 {

	@Test
	public void test1() {
		String s ="cbaebabacd";
		String p = "abc";
		List<Integer> output = new ArrayList<Integer>();
		output.add(0);
		output.add(6);
		List<Integer>actOutput = findStringAnagram1(s,p);
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
	
	private List<Integer> findStringAnagram1(String s, String p) {
		int pointer = 0;
		int[] cArr = new int[26];
		int start = 0;
		for(int i=0;i<p.length();i++) {
			char c = p.charAt(i);
			cArr[c-'a']++;
		}
		int[] sArr = new int[26];
		List<Integer> output = new ArrayList<Integer>();
		while(pointer<s.length()) {
			char c = s.charAt(pointer);
			sArr[c-'a']++;
			if(pointer>=p.length()-1) {
				if(Arrays.equals(cArr, sArr)) {
					output.add(pointer-p.length()+1);
				}
				char c1 = s.charAt(pointer-p.length()+1);
				sArr[c1-'a']--;	
			}
			pointer++;
		}
		
		if(output.isEmpty()) {
			return new ArrayList<Integer>();
		}
		else {
			return output;
		}
	}
}
	
