package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {

	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.


	 * Psuedocode :
	 * Get string to convert to lower case (A man, a plan, a canal: Panama ->a man, a plan, a canal: panama)
	 * use regex to replaceAll alphanumeric(not A-Z or 0-9, replace other than with "") (amanaplanacanalpanama)
	 * Use for loop to reverse the output string
	 * if input string equals output string, return True
	 * else false

	 *
	 */
	@Test
	public void test1( ) {
		String input = "A man, a plan, a canal: Panama";
		boolean output = validatePalindrome(input);
		Assert.assertEquals(true,output);
		
	}

	public boolean validatePalindrome(String input) {
		String revString ="";
		//String convertLower = input.toLowerCase();
		String convertString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for(int i=convertString.length()-1; i>0; i--) {
			 revString = revString + convertString.charAt(i);			
		}
			return (input.equals(revString));
		}
	}

