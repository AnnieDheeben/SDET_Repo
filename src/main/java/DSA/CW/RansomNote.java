package DSA.CW;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 383. Ransom Note
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Psuedocode : 
1. Get the input string
2. declare an integer array with size 26
3. Iterate through each character of magazine and add the frequency to the integer array
4. Iterate through each character of ransomNote and decrease the frequency of character in the integer array
5. start a for loop and check if the character occurrence of ransomNote in array index is 0 or not
6. if it is 0, return true, else return false
 */

public class RansomNote {
	@Test
	public void test1() {
		String ransomNote = "aa";
		String magazine = "aab";
		boolean output = true;
		boolean actOutput = concurrentHashMap(ransomNote,magazine);
		Assert.assertEquals(output, actOutput);
	}

	private boolean canConstruct(String ransomNote, String magazine) {
		
		int[] arr = new int[26];
		for(int i=0;i<magazine.length();i++) {
			arr[magazine.charAt(i)-'a']++;
		}
		for(int i=0;i<ransomNote.length();i++) {
			
			if(arr[ransomNote.charAt(i)-'a']<=0) {
				return false;
			}
			else {
				arr[ransomNote.charAt(i)-'a']--;
			}
		}
		return true;
	}
	
	private boolean HashMap(String ransomNote, String magazine) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int currentOccurrence=0;
		
		for(char each : magazine.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			map.put(each, currentOccurrence+1);
		}
		
		for(char each : ransomNote.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			map.put(each, currentOccurrence-1);
			if(map.get(each)<=0) {
				return false;
			}
		}
		return true;
		
	}
	
private boolean concurrentHashMap(String ransomNote, String magazine) {
		
		Map<Character,Integer> map = new ConcurrentHashMap<Character,Integer>();
		int currentOccurrence=0;

		 for (char each : magazine.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			map.put(each, currentOccurrence+1);
		 }
		 for (char each : ransomNote.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			map.put(each, currentOccurrence-1);
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			int value =  map.getOrDefault(entry, 0);
			if(value<=0) {
			map.remove(map.get(entry));
			}
		}
		return map.isEmpty();
}
}
