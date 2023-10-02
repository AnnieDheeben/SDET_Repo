package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeNumber {

	@Test
	public void test1() {
		int input = 121;
		boolean output = true;
		boolean actOutput = validatePalindrome(input);
		Assert.assertEquals(output, actOutput);
	}

	private boolean validatePalindrome(int input) {
		
		int temp = 0;
		int rev = 0;
		int n1 = input;
		while(input!=0) {
			temp = input%10;
			rev= rev*10 + temp;
			input = input/10;
		}
		return(n1==rev);
	}
}
