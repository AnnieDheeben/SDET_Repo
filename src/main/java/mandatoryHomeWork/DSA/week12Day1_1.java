package mandatoryHomeWork.DSA;
/*
 * 387. First Unique Character in a String
Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

Psuedocode : 
1. Get the input string
2. use map to track the frequency of each character in the given string
3. use a for loop and iterate through the given string again
	a. check whether the current character's value is 1 in the map or not
	b. if it is 1, return the index position of the current character and break the loop
	c. if not, continue with the next character
	d. if no character holds value as 1, return -1
	
	Time complexity : O[N]
	Space complexity : O[N]
 */

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 387. First Unique Character in a String
Psuedocode : 
1. Get the input string
2. Add the occurrence of all the characters in a map
3. Iterate through the string again and check the value of current current in Map
4. If it is 1, return the index position and break the loop
5. if no unique match found,return -1
 */
public class week12Day1_1 {
@Test
public void test1() {
	String s = "loveleetcode";
	int output = 2;
	int actOutput = firstUniqChar(s);
	Assert.assertEquals(output, actOutput);
}

public int firstUniqChar(String s) {
	Map<Character, Integer> map = new HashMap<>();
	for(int i=0;i<s.length();i++) {
		int occurrence = map.getOrDefault(s.charAt(i), 0);
		map.put(s.charAt(i), occurrence+1);
	}
	for(int i=0;i<s.length();i++) {
		if(map.get(s.charAt(i))==1) {
			return i;
		}
	}
	return -1;
}
}
