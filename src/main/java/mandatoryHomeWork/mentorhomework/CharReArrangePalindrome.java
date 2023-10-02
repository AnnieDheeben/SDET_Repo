package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*
 * Psuedocode : 
 * 1. Get the input string
 * 2. Get the count of each character
 * 3. If all characters appear twice or anyone character appears once, return true
 * 4. else return false
 * 
 * Time complexity - O[N]
 * Space complexity - O[1]
 */

public class CharReArrangePalindrome {
	@Test
	public void test1() {
		String s = "ddddssaa";
		boolean output = true;
		boolean actOutput = isPalindrome(s);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		String s = "dsaodsa";
		boolean output = true;
		boolean expOutput = isPalindrome(s);
		Assert.assertEquals(output, expOutput);
	}
	private boolean isPalindrome(String s) {
		
		int[] c = new int[256];
		int countOdd=0;
		for(int i=0;i<s.length();i++) { //O[N]
			char c1 = s.charAt(i);
			c[c1]++;
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i]%2!=0) {
				countOdd++;
				if(countOdd>1) {
					break;
				}
			}
		}
		
			return (countOdd<=1);
	}

}
