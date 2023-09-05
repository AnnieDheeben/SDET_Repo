package mandatoryHomeWork.mentorhomework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Psuedocode : 
1. Get the two String s and t
2. Create a Hashmap with String 's' as Keys and 't' as values
3. Create a set to see if we have duplicate key
4. if duplicate key is available, return false
5. else return true
 */

public class IsomorphicString {

	/*@Test
	public void test1() {
		String s = "egg";
		String t = "add";
		boolean expOutput = true;
		boolean actOutput = isIsoMorphic(s,t);
		Assert.assertEquals(expOutput, actOutput);
	}*/
	
	@Test
	public void test2() {
		String s = "foo";
		String t = "bar";
		boolean expOutput = false;
		boolean actOutput = isIsoMorphic(s,t);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	
/*	private boolean findIsomorphic(String s, String t) {

	boolean checkDuplicate = true;
	Map<Character,Character> cMap = new HashMap<>();
	if(s.length()==t.length()) {
	for(int i=0;i<s.length();i++) {
		cMap.put(s.charAt(i),t.charAt(i));	
	}
	}	
	
	Set<Character> duplicateCheck = new HashSet<>();
	
	for(Map.Entry<Character, Character> mapChar : cMap.entrySet()) {
		Character key = mapChar.getKey();
		Character value = mapChar.getValue();
		
		if(duplicateCheck.contains(key)) {
			checkDuplicate = false;
		}
		
		else {
			duplicateCheck.add(key);
		}
	}
	
	return checkDuplicate;

}*/
	

public boolean isIsoMorphic(String s, String t) {
	
	int[] map1 = new int[127];
	int[] map2 = new int[127];
	for(int i=0;i<s.length();i++) {
		if(map1[s.charAt(i)]!= map2[t.charAt(i)]) {
			return false;
		}
		else {
			int sIndex = (int)s.charAt(i);
			int tIndex = (int)t.charAt(i);
			map1[sIndex]= i+1;
			map2[tIndex] = i+1;	
		}
			
	}
	
	return true;
}

}