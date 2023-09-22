package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
 */

public class week8Day4_2 {

	@Test
	public void test1() {
		String s = "Bb";
		String output = "Bb";
		String actOutput = longestNiceSubstring(s);
		Assert.assertEquals(output, actOutput);
	}

	private String longestNiceSubstring(String s) {
		String str = "";
		String subStr = "";
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
				subStr = s.substring(i, j+1);
				if(isNicest(subStr)) {
					if(subStr.length()>str.length()) {
						str = subStr;
					}
				}
			}
		}
		return str;
	}

	private boolean isNicest(String subStr) {
		int[] ch = new int[128];
		for(char c : subStr.toCharArray()) {
			int i = (int)c;
			ch[i]++;
		}
		
		for(int j=0;j<subStr.length()-1;j++) {
			char a = subStr.charAt(j);
			if(Character.isUpperCase(a)) {
				if(ch[(int)a+32]==0) return false;
			}
			else {
				if(ch[(int)a-32]==0) return false;
			}
		}
		return true;
	}
}
