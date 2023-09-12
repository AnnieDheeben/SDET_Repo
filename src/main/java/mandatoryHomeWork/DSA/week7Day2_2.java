package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

/*
 * 806. Number of Lines To Write String
You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

Return an array result of length 2 where:

result[0] is the total number of lines.
result[1] is the width of the last line in pixels.
 

Example 1:

Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.

Psuedocode : 
1. Get input width and string
2. map each width to each characters in the english alphabet from 'a' to 'z'
3. intialize and declare the below integer variables 
 	a. totalWidth to  0
 	b. count to 0
 	c. lines to 1
4.Iterate through each character of the given string
	a. find the corresponding value from map to that character
	b. if the current character value + count is greater than 100, increase lines by 1
	b. if the count still less than or equal to 100, add character value to the count
5. return the total number of lines and the final count value as an integer array

Time complexity - O[N]
 */
public class week7Day2_2 {
	@Test
	public void test1() {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] expOutput = {3,60};
		int[] actOutput = numberOfLines(widths, s);
		Assert.assertEquals(actOutput, expOutput);
		
	}
	
	@Test
	public void test2() {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] expOutput = {3,60};
		int[] actOutput = numberOfLines(widths, s);
		Assert.assertEquals(actOutput, expOutput);
		
	}

	private int[] numberOfLines(int[] widths, String s) {
		
		int totalWidth = 0;
		Map<Character, Integer> cMap = new HashMap();
		char currentChar = 'a';
		for(int i=0;i<26;i++) { //O[1]
			cMap.put(currentChar, widths[i]);
			currentChar++;
			totalWidth = totalWidth + widths[i];
		}
		
		int count = 0;
		int lines = 1;
		for(int i=0;i<s.length();i++) { //O[N]
			if((s.charAt(i)>='a') && (s.charAt(i)<='z')) {
				char current = s.charAt(i);
				int charCount = cMap.get(current);
				if(count + charCount > 100) {
					lines++;
					count = charCount;
				}
				else count = count + charCount;
			}
		}
		int[] output = {lines,count};
		return output;
		}
	}

