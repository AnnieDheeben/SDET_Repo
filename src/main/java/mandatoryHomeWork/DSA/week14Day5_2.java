package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

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
 */
public class week14Day5_2 {
@Test
public void test1() {
	String s = "cbaebabacd";
	String p = "abc";
	List<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(6);
	List<Integer> outputList = findAnagrams(s,p);
	Assert.assertEquals(list, outputList);
}

private List<Integer> findAnagrams(String s, String p) {
	Map<Character, Integer> pMap = new HashMap<>();
	Map<Character, Integer> sMap = new HashMap<>();
	int k = p.length();
	List<Integer> result = new ArrayList<>();
	for(int i=0;i<p.length();i++) {
		int occurrence = pMap.getOrDefault(p.charAt(i), 0);
		pMap.put(p.charAt(i), occurrence+1);
	}
	
	int pointer = 0;
	while(pointer<k) {
		int occurrence = sMap.getOrDefault(s.charAt(pointer), 0);
		sMap.put(s.charAt(pointer), occurrence+1);
		pointer++;
	}
	
	boolean isValid = isAnagram(sMap,pMap);
	if(isValid) result.add(pointer-k);
	
	while(pointer<s.length()) {
		int occurrence = sMap.getOrDefault(s.charAt(pointer-k), 0);
		if(occurrence==1) {
			sMap.remove(s.charAt(pointer-k));
		}
		else {
			sMap.put(s.charAt(pointer-k), occurrence-1);
		}
		occurrence = sMap.getOrDefault(s.charAt(pointer), 0);
		sMap.put(s.charAt(pointer++), occurrence+1);
		isValid = isAnagram(sMap,pMap);
		if(isValid) result.add(pointer-k);
		
	}
	return result;
}

private boolean isAnagram(Map<Character, Integer> sMap, Map<Character, Integer> pMap) {
	for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
		int value1 = 0;
		char key = entry.getKey();
		int value = entry.getValue();
		if(pMap.containsKey(key)) {
			value1  = pMap.get(key);
			if(value!=value1) return false;
		}
		else return false;
	}
	return true;
}
}
