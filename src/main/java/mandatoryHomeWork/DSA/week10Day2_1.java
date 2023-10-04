package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 771. Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

Psuedocode : 
1. Get the input strings of Jewels and Stones
2. Iterate through the stones string and track the occurrence of each character
3. Iterate through the jewels string and count the occurrence of each character of jewels in stones array
4. return the total count
5. if no match found, return 0
Time and space complexity - 0[M+N]
 */

public class week10Day2_1 {
	@Test
	public void test1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int output = 3;
		int actOutput = numJewelsInStones(jewels, stones);
		Assert.assertEquals(output, actOutput);
	}

	private int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		char[] sArr = stones.toCharArray();
		for(Character ch : sArr) { //O[N]
			int currentOccurrence = map.getOrDefault(ch, 0);
			map.put(ch, currentOccurrence+1);	
		}
		char[] jArr = jewels.toCharArray();
		for(Character ch : jArr) { //O[M]
			int currentOccurrence = map.getOrDefault(ch, 0);
			count+=currentOccurrence;
		}
		if(count>0) return count;
		else return 0;
	}

}
