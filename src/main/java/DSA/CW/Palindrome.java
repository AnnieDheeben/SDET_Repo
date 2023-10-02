package DSA.CW;

import org.junit.Test;
import org.testng.Assert;

/*
 * Psuedocode
 * 1. Get the input string
 * 2. Declare two pointers left and right
 * 3. Assign left to o and right to length-1
 * 4. Start a while loop that iterates through the string till left is less than right
 * 5. for each iteration, Check if left index value and right index value are same
 * 6. if it is same, move to the next character by incrementing left by 1 and decrementing right by 1
 * 7. at any point, if both the left index and right index values are not same, return false
 * 8. Return the final output value (True or false)
 */

public class Palindrome {
@Test
public void test1() {
	String s = "RADAR";
	boolean output = true;
	boolean actOutput = validatePalindrome_way2(s);
	Assert.assertEquals(output, actOutput);
}

@Test
public void test2() {
	String s = "Radar";
	boolean output = false;
	boolean actOutput = validatePalindrome_way2(s);
	Assert.assertEquals(output, actOutput);
}
private boolean validatePalindrome(String s) {
	
	int l = 0;
	int right = s.length()-1;
	while(l < right) {
		char a = s.charAt(l);
		char b = s.charAt(right);
		if(a!=b) {
			return false;
		}
		l++;
		right--;
	}
	return true;
}

private boolean validatePalindrome_way2(String s) {
	
	int center = s.length()/2;
	int l = center-1;
	int r=0;
	if(s.length()%2==0) r = center;
	else r = center+1;
	
	while(r<s.length() && l>=0) {
		if(s.charAt(l)!=s.charAt(r)) return false;
		l--;
		r++;
	}
	return true;
}
}
