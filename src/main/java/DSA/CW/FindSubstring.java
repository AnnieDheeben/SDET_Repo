package DSA.CW;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".

Psuedocode : 
1. Get the input string
2. set the window size as 3
3. Iterate through the given string till window size
4. put the occurrence of each character in a map
5. if the duplicate found, move to the next window.
6. iterate till last window and return the count of all the good substrings

 */
public class FindSubstring {
@Test
public void test1() {
	String s = "aababcabc";
	int expOutput = 4;
	int actOutput = findSubStringMap(s);
	Assert.assertEquals(expOutput, actOutput);
}

private int findSubStrings(String s) {
	int count = 0,output = 0;
	int winSize = 3, pointer = 0;
	int[] cArr = new int[26];
	while(pointer<winSize) {
		cArr[s.charAt(pointer++)-'a']++;
		}
	for(int i=0;i<cArr.length;i++) {
		if(cArr[i]==1) {
			count++;
		}
	}
	if (count==3) {
		output+=1;
		count=0;
	}


	while(pointer<s.length()) {
		cArr[s.charAt(pointer-winSize)-'a']--;
		cArr[s.charAt(pointer++) -'a']++;
		
		for(int i=0;i<cArr.length;i++) {
			if(cArr[i]==1) {
				count++;
			}
		}
		if (count==3) output+=1;
		count=0;
	}
	
	return output;
}

private int findSubStringMap(String s) {
	int count = 0;
	int pointer = 0;
	int winSize = 3;
	Map<Character, Integer> map = new HashMap<>();
	while(pointer<winSize) {
		int occurrence = map.getOrDefault(s.charAt(pointer),0);
		map.put(s.charAt(pointer), occurrence+1);
		pointer++;
	}
	if(map.size()==3) count++;
	while(pointer<s.length()) {
		int occurrence = map.getOrDefault(s.charAt(pointer), 0);
		map.put(s.charAt(pointer), occurrence+1);
		occurrence = map.getOrDefault(s.charAt(pointer-winSize), 0);
		if(occurrence==1) map.remove(s.charAt(pointer-winSize));
		else map.put(s.charAt(pointer-winSize), occurrence-1);
		if(map.size()==3) count++;
		pointer++;
	}
	return count;
	
}
}
