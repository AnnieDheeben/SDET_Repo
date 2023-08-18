package mandatoryHomeWork;

import org.junit.Test;
import org.testng.Assert;

/*
 * You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

 

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

Psuedocode : 
1. Get the input int and convert it to a string and inturn to a string array
2. declare and initialize sum as 0
3. Iterate through the for loop and check whether i modulo 2 is 0 or not
	a. if it is zero,  then sum = sum + a[i]
	b. else , sum = sum - a[i];
4. return sum
 */

public class alternaticDigitSum {
	
	@Test
	public void test1() {
		int n = 521;
		int output = 4;
		int actOutput = findAlternativeDigitSum(n);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test2() {
		int n = 886996;
		int output = 0;
		int actOutput = findAlternativeDigitSum(n);
		Assert.assertEquals(actOutput, output);
	}

	@Test
	public void test3() {
		int n = 111;
		int output = 1;
		int actOutput = findAlternativeDigitSum(n);
		Assert.assertEquals(actOutput, output);
	}
	public int findAlternativeDigitSum(int n) {
		int sum = 0;
		String num = Integer.toString(n);
		String[] s = num.split("");
		int[] numArr = new int[s.length];
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = Integer.parseInt(s[i]);
		}
		for(int i=0;i<numArr.length;i++) {
			if(i%2==0) sum = sum + numArr[i];
			else sum = sum - numArr[i];
		}
		return sum;
	}

}
