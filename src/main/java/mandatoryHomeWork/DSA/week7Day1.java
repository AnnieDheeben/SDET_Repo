package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.

 Example 1:

Input: s = "string"
Output: "rtsng"
Explanation: 
After typing first character, the text on the screen is "s".
After the second character, the text is "st". 
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn". 
After the sixth character, the text is "rtsng". 
Therefore, we return "rtsng".

Psuedocode : 
1. Get the input string
2. Iterate through each character of the given input string
3. for each character, check whether the current index letter is r or not
	a. if it is 'i', do reverse string till before the current index
	b. if it is not 'i', continue moving to the next letter
4. return the final string

Time complexity - O[N^2]
 */

public class week7Day1 {
	
	@Test
	public void test1() {
		String s = "string";
		String expOutput = "rtsng";
		String actOutput = returnFaultyStringway2(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String returnFaultyString(String s) {
		
		//StringBuilder sb = new StringBuilder();
		String s1 = "";
		char[] sArr = s.toCharArray(); //O[N]
		for(int i=0;i<sArr.length;i++) {
			if(s.charAt(i)!='i') s1 = s1 + s.charAt(i);
			else s1 = doReverse(s1);
		}
		return s1;
	}

	private String doReverse(String s1) {
		StringBuilder sb = new StringBuilder();
		if(s1.length()!=0) {
			for(int i=s1.length()-1;i>=0;i--) {//O[N]
				sb.append(s1.charAt(i));
			}
		}
		return sb.toString();
		
	}
	
	private String returnFaultyStringway2 (String s) {
	    StringBuilder result = new StringBuilder();
	    StringBuilder current = new StringBuilder();

	    for (char c : s.toCharArray()) {
	        if (c != 'i') {
	            current.append(c);
	        } else {
	            result.append(current.reverse());
	            current.setLength(0);
	        }
	    }

	    result.append(current.reverse()); // Append any remaining characters in 'current'

	    return result.toString();
	}

}
