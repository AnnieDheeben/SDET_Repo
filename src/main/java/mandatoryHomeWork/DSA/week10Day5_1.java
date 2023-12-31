package mandatoryHomeWork.DSA;

import org.junit.Test;
import java.util.*;
import java.util.Map.Entry;

/*
 * Psuedocode : 
 * 1. Get the String s and t
 * 2. Iterate through each character of the String s and t
 * 3. For each character in s, check whether it already available in map
 * 4. If map already contains the given character, check the value.
 * 6. If the existing value and the current value of t are same,then continue with the next character
 * 7.else return false
 */
public class week10Day5_1 {
	@Test
	public void test1() {
		String s = "foo";
		String t="bar";
		boolean expOutput = false;
		boolean actOutput = isIsomorphic_1(s,t);
	}

	private boolean isIsomorphic(String s, String t) {
	    if (s.length() != t.length()) {
	        return false; // If the lengths are different, they can't be isomorphic.
	    }

	    Map<Character, Character> sToTMapping = new HashMap<>();
	    Map<Character, Character> tToSMapping = new HashMap<>();

	    for (int i = 0; i < s.length(); i++) {
	        char sChar = s.charAt(i);
	        char tChar = t.charAt(i);

	        if (sToTMapping.containsKey(sChar)) {
	            if (sToTMapping.get(sChar) != tChar) {
	                return false; // sChar in s has already been mapped to a different character in t.
	            }
	        } else {
	            sToTMapping.put(sChar, tChar);
	        }

	        if (tToSMapping.containsKey(tChar)) {
	            if (tToSMapping.get(tChar) != sChar) {
	                return false; // tChar in t has already been mapped to a different character in s.
	            }
	        } else {
	            tToSMapping.put(tChar, sChar);
	        }
	    }

	    return true; // If we haven't found any issues, the strings are isomorphic.
	}
	
	private boolean isIsomorphic_1(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		boolean flag = true;
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(sArr[i])) {
				if(!map.containsValue(tArr[i])) {
					map.put(sArr[i], tArr[i]);
				}
				else {
					flag = false;
				}
			}
			else {
				Character c = map.get(sArr[i]);
				if(c!=tArr[i]) {
					flag = true;
				}
				
				}
			}
		return flag;	
	}
}

