package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsAndStones {
/*
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Pseudocode:

1. Iterate through the stones string and find out the types(num)
2. Iterate through the jewels string and compare woth the jewel string to find out the matches
3. find the total count of matching stone type and unmatched stone type
 */
	@Test
	public void test1() {
		String jewels = "aA", stones = "aAAbbbb"; //7
		int output = numJewelsInStones(jewels, stones);
		Assert.assertEquals(3, output);
	}
	
	@Test
	public void test2() {
		String jewels = "z", stones = "ZZ"; //7
		int output = numJewelsInStones(jewels, stones);
		Assert.assertEquals(0, output);
	}

	private int numJewelsInStones(String jewels, String stones) {
		int count=0;
		char[] stonesArr = new char[stones.length()];
		for(int i=0;i<stones.length();i++) {
			stonesArr[i]=stones.charAt(i);
		}
		
		for(int i=0;i<stonesArr.length;i++) {
			for(int j=0;j<jewels.length();j++) {
				if(stonesArr[i]==jewels.charAt(j)) {
					count ++;
				}
			}
	
		}
		return count;
}
}
