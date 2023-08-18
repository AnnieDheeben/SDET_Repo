package mandatoryHomeWork.mentorhomework;

import java.math.BigInteger;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Factorial :
5 = 2*3*4*5 =120
0 = 0


1. Did I understand the problem?  - yes
2. Test data set - yes 
3. Do I know how to solve it? - yes
4. Do I know alternate solutions as well?  - no
5. Pseudocode : 
1. Get the input number
2. store the expected result in a variable with BigInteger Class
3. Find the factorial of a number using the below logic
	a. initialize the Big Integer variable as fact and set it to BigInteger.ONE
 	b.iterate using the for loop with initial value as n and ends at the given number
4. Apply the below logic inside the for loop
	a. Multiply each value of the iteration with fact and store it in fact (i.e,fact = fact * n)
5. once the above loop ends, return the fact value 

 */
public class FactorialNumber {
	
	@Test
	public void test1() {
		int n = 5;
		BigInteger expectedOutput = new BigInteger("120");
		BigInteger actualOutput = findFactorial(n);
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void test2() {
		int n = 10;
		BigInteger expectedOutput =new BigInteger("3628800");
		BigInteger actualOutput = findFactorial(n);
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	public BigInteger findFactorial(int n) {
		BigInteger fact = BigInteger.ONE;
		//String s = Integer.toString(n);
		for(int i=n;i>0;i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		return fact;
	}

}
