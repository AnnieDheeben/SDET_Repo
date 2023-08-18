package mandatoryHomeWork.mentorhomework;
/*
 * Check Buzz Number in Java:

A number which either ends with 7 or divisible by 7 is called Buzz 
number. For example, 35 is a Buzz number as it is divisible by 7,
similarly 47 is also a Buzz number as it ends with 7. 
In this tutorial, we will write java programs to check Buzz number 
and print Buzz numbers in a given range.

1. Did I understand the problem?  - yes
2. Test data set - yes (35, 47, 107, -35)
3. Do I know how to solve it? - yes
4. Do I know alternate solutions as well?  - yes
5. Psuedocode :
1. Get the input number  - 107
2. check whether the number % 7 is 0 (eg.107 %7) or the number % 10 is 7 (eg. 107%10)
3. if the above condition satisfies, then it is a Buzz number and Return true
4. else return false
 */

import org.junit.Test;

import junit.framework.Assert;

public class buzzNumber {

	@Test
	public void test1() {
		int n = 107;
		boolean output = true;
		boolean actOutput = isBuzzNumber(n);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		int n = 35;
		boolean output = true;
		boolean actOutput = isBuzzNumber(n);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test3() {
		int n = -107;
		boolean output = true;
		boolean actOutput = isBuzzNumber(n);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test4() {
		int n = 0;
		boolean output = false;
		boolean actOutput = isBuzzNumber(n);
		Assert.assertEquals(output, actOutput);
	}

	public boolean isBuzzNumber(int n) {
		
		int num = n;
		if(n==0) return false;
		if(num % 7 == 0 || num %10==7 || num%10==-7) return true;
		else return false;
	}
}
