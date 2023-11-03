package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:

Input: s = "God Ding"
Output: "doG gniD"

Psuedocode : 
1. Get the input String 
2. split the string by space
3. Iterate through each string and perform reverse operation
4. Join the reversed string with a space
5. return the output string

Time complexity and space complexity : 
 */
public class week14Day5_1 {
	@Test
	public void test1() {
		String s = "Let's take LeetCode contest";
		String expOutput = "s'teL ekat edoCteeL tsetnoc";
		String actOutput = reverseWords(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String reverseWords(String s) {
		String[] str = s.split(" ");
		String[] sArr = new String[str.length];
		for(int i=0;i<str.length;i++) { //O[N]
			sArr[i] = stringReverse(str[i]);
		}
		String result = String.join(" ", sArr);
		return result;
	}

	private String stringReverse(String s) {
		int p1=0;
		int p2=s.length()-1;
		char[] strArr = s.toCharArray();
		while(p1<p2) {
			char temp = strArr[p1];
			strArr[p1] = strArr[p2];
			strArr[p2] = temp;
			p1++;
			p2--;
		}
		
		return new String(strArr);
	}

}
