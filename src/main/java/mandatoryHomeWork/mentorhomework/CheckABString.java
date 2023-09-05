package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
 * Psuedocode : 
 * 1. Get the input String
 * 2. check the last index value of 'a' and the first index value of 'b'
 * 3. if the last index value of 'a' and the first index value of b-1 are same, return true
 *
 */

public class CheckABString {

	/*@Test
	public void test1() {
		String s = "aaabbb";
		boolean expOutput = true;
		boolean actOutput = checkString(s);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test2() {
		String s = "abab";
		boolean expOutput = false;
		boolean actOutput = checkString(s);
		Assert.assertEquals(expOutput, actOutput);
	}*/
	
	@Test
	public void test3() {
		String s = "bbb";
		boolean expOutput = true;
		boolean actOutput = checkString(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	public boolean checkString(String s) {
		
		if((s.length()!=1) && (s.indexOf('b')!=-1)) {
			return (s.lastIndexOf('a')==s.indexOf('b')-1);
		}
		else return true;
	}
}
