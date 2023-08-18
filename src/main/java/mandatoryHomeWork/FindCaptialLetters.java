package mandatoryHomeWork;
/*
 * 1) Write a Java Program to get the count of Capitalized Letter in a String.
eg: ILoveIndia
O/p - 3

Pseudocode :
1. Get the input String
2. Get the string length
3. Apply the regex to remove the capital letter in the string [^A-Z] and store it in an another string with name 'cleansed'
4. find the length of the above string 'cleansed'.
5. output length would be the actual string length minus the cleansed string length.
 */

import org.junit.Test;
import org.testng.Assert;

public class FindCaptialLetters {
	
	@Test
	public void test1() {
		String s = "ILoveIndia";
		int output = 3;
		int actOutput = findCap(s);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test2() {
		String s = "india";
		int output = 0;
		int actOutput = findCap(s);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test3() {
		String s = "";
		int output = 0;
		int actOutput = findCap(s);
		Assert.assertEquals(actOutput, output);
	}

	public int findCap(String s) {
		int count = 0;
		int inputStringLen = s.length();
		String cleansed = s.replaceAll("[A-Z]", "");
		int cleansedLen = cleansed.length();
		count = inputStringLen - cleansedLen;
		return count;
	}

}
