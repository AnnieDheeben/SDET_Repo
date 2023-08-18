package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given N,  reverse the digits of N.
 

Example 1:

Input: 200
Output: 2
Explanation: By reversing the digts of 
number, number will change into 2.

Psuedocode :
1. get the given input number
2. apply the reverse digit logic as below
	do the entry check if n!=0
	a. rem = n%10 - > 200%10 = 0
	b. n1 = n1+rem -> 0
	c . n=n/10 ->20
3. return the reversed number (n1)
 */
public class reverseNumber {
	@Test
	public void test1() {
		int input = 200;
		int output = 2;
		int reversedNum = findReverse(input);
		Assert.assertEquals(output, reversedNum);

	}

	@Test
	public void test2() {
		int input = 122;
		int output = 221;
		int reversedNum = findReverse(input);
		Assert.assertEquals(output, reversedNum);

	}
	public int findReverse(int input) {
		int temp = 0, n1=0;
		if(input==0) {
			return 0;
		}
		
		else
			while(input!=0) {
				temp = input % 10;
				n1 = n1*10 + temp;
				input = input / 10;
				
				
			}
		return n1;
	}

}
