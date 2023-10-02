package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode :
 * 1. Get the input string
 * 2. Assign two pointer left and right at the index 0
 * 3. Declare a StringBuilder variable called sb to store the output string
 * 4. start a while loop and iterate till the end of the array
 * 5. for each iteration,
 * 		a.check whether the value at left index and right index are same or not
 * 		b. if it is same, move the right pointer to the next index and keep track of the count
 * 		c. if it is not same, set right pointer as left pointer and append the character at left pointer and the current count to sb
 * 6. Return the output string
 */

public class YubiTwoPointers {
	@Test
	public void test1() {
		String s = "aaabbccaad";
		String output = "a3b2c2a2d1";
		String actOutput = findCharCount(s);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		String s = "aaabbccaade";
		String output = "a3b2c2a2d1e1";
		String actOutput = findCharCount(s);
		Assert.assertEquals(output, actOutput);
	}

	private String findCharCount(String s) {
		int l=0,r=0,count=0;
		StringBuilder sb = new StringBuilder();
		while(r<s.length()) {
			char a = s.charAt(l);
			char b = s.charAt(r);
			if(a!=b) {
				l=r;
				sb.append(a).append(count);
				count=0;
			}	
			count++;
			r++;
		}
		sb.append(s.charAt(l)).append(count);
		return sb.toString();
	}

}
