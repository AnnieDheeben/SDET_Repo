package mandatoryHomeWork.mentorhomework;
/*
 * You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.


Psuedocode : 

1. Get the input String
2. convert the string into a char array
3. Iterate through each char in a array
4. when the array index is odd, replace the current index digit with the character value of previous char + 1 using setCharAt function of StringBuilder
5. return the output string

Time complexity - O(n)
 */

import org.junit.Test;
import org.testng.Assert;

public class ReplaceAllDigitsWithChar {

	@Test
	public void test1() {
		String s = "a1c1e1";
		String expOutput = "abcdef";
		String actOutput = replaceDigits(s);
		Assert.assertEquals(actOutput, expOutput);
	}
	
	@Test
	public void test2() {
		String s = "a1b2c3d4e";
		String expOutput = "abbdcfdhe";
		String actOutput = replaceDigits(s);
		Assert.assertEquals(actOutput, expOutput);
	}

	public String replaceDigits(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		char[] sArr = s.toCharArray(); //O(n)
		for(int i=0;i<s.length()-1;i+=2) { //O(n/2)
				char replace = (char) (s.charAt(i) + s.charAt(i+1) - '0'); //O(1)
				sb.setCharAt(i+1, replace);	//O(1)			
			}		
		
		return sb.toString();
	}
}

