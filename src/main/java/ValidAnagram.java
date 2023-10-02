import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import junit.framework.Assert;

public class ValidAnagram {
	/*
	 * Psuedocode : 
	 * 1. Get the input strings s and t
	 * 2. Iterate through all the characters in s and put it in a map
	 * 3. iterate through all the characters in t 
	 * 		1. for each iteration, get the current index charater
	 * 		2. check if it is available in the map
	 * 		3. if it is not available, return false and break the loop
	 * 		4. if it is available, move to the next character and continue the above steps
	 * 4. return teh final boolean output
	 */
	@Test
	public void test1() {
	String s = "ab";
	String t = "a";
	boolean output = false;
	boolean actOutput = isAnagram(s,t);
	Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
	String s = "anagram";
	String t = "nagaram";
	boolean output = true;
	boolean actOutput = isAnagram(s,t);
	Assert.assertEquals(output, actOutput);
	}

	private boolean isAnagram(String s, String t) {
		
		ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<>();
		int currentOccurrence;
		if(s.length()!=t.length()) return false;
		for(char each : s.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			map.put(each, currentOccurrence+1);
		}
		for(char each : t.toCharArray()) {
			currentOccurrence = map.getOrDefault(each, 0);
			if(currentOccurrence==1) {
				map.remove(each);
			}
			else {
				map.put(each, currentOccurrence-1);
			}
		}
		return map.isEmpty();
		
		
	}
}
