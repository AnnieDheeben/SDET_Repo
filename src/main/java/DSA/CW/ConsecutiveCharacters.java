package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Get the input string
 * Initialize two pointers start and end
 * Increase right if the character is same
 * if the character is distinct, calculate the window size,reset start and end as current index 
 * 
 */

public class ConsecutiveCharacters {
	/*@Test
	public void test1() {
		String s = "leetcode";
		int expOutput = 2;
		int actOutput = maxPower(s);
		Assert.assertEquals(expOutput, actOutput);
	}
	
		@Test
		public void test2() {
			String s = "abbcccddddeeeeedcba";
			int expOutput = 5;
			int actOutput = maxPower(s);
			Assert.assertEquals(expOutput, actOutput);
		}*/
		
		@Test
		public void test3() {
			String s = "cc";
			int expOutput = 2;
			int actOutput = maxPower(s);
			Assert.assertEquals(expOutput, actOutput);
		}

	private int maxPower(String s) {
		int l=0, r=0;
		int maxLength = 1;
		int currLength = 0;
		while(r<s.length()) {
			char a = s.charAt(l);
			char b = s.charAt(r);
			if(a==b) {
				r++;
			}
			else {
				currLength = r-l;
				maxLength = Math.max(currLength, maxLength);
				l=r;
			}
		}
		currLength = r-l;
		maxLength = Math.max(currLength, maxLength);
		return maxLength;
	}

}
