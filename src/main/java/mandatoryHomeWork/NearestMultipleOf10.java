package mandatoryHomeWork;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given a string  N representing a positive number. The task is to round N to the nearest multiple of 10.
Note: If you are having two multiple equaly apart from N then we will choose the smallest element among them.

 

Example 1:
 

Input : N = 15
Output : 10
Explanation:
Here N is 15. So, the number which is
multiple of 10 are 10, 20, 30. We can
see 10 and 20 are equally distant
from 20. So, we will choose the
smallest element among them i.e., 10

Psuedocode :
1. Get the input number
2. check for the nearest multiple of 10 for the given number by applying below logic
	a. Assign two integer 'rem' and 'x' and set it to 0
	b. rem = input number%10
	c. x = input number/10
	d. check if the rem/2 is less than 4
	e. if yes, return x = n * 10;
	f. else return x = n*10 + 10;
 */
public class NearestMultipleOf10 {
	
	@Test
	public void test1() {
		int n=29;
		int output =30;
		int actOutput = findNearestMultiple(n);
		Assert.assertEquals(actOutput, output);
	}

	@Test
	public void test2() {
		int n=15;
		int output =10;
		int actOutput = findNearestMultiple(n);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test3() {
		int n=9;
		int output =10;
		int actOutput = findNearestMultiple(n);
		Assert.assertEquals(actOutput, output);
	}
	
	@Test
	public void test4() {
		int n=95;
		int output =90;
		int actOutput = findNearestMultiple(n);
		Assert.assertEquals(actOutput, output);
	}
	public int findNearestMultiple(int n) {
		int rem =0, x=0;
		rem = n%10; 
		n = n/10; 
		if(rem/2<4) x = n*10;
		else x = (n*10) + 10; 
		
		return x;
	}

}
