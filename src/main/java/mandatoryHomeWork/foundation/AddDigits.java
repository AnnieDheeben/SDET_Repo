package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

public class AddDigits {
	
	/*
	 *  * Given an integer num, repeatedly add all its digits until the result 
	 * has only one digit, and return it.
	 */
	 /*  Example 1:
	  * Input: num = 38
		*Output: 2
	*Explanation: The process is
	*38 --> 3 + 8 --> 11
	*11 --> 1 + 1 --> 2 
	*Since 2 has only one digit, return it.
	*
	*
	*Example 2:
	*Input: num = 0
	*Output: 0
	 */
	@Test
	public void test1() {
		int num = 38;
		int output = addDigits(num);
		Assert.assertEquals(2, output);
		
	}
	
	@Test
	public void test2() {
		int num = 2;
		int output = addDigits(num);
		Assert.assertEquals(1, output);
		
	}
	
	@Test
	public void test3( ) {
		int num=0;
		int output = addDigits(num);
		Assert.assertEquals(0, output);
	}
	

	public int addDigits(int num) {
		int sinDigit = 0;
		if(num==0) {
			return 0;
		}
		
		if(num<9) {
			return 1;
		}
		else {
			while(num>9) {
				num = (num/10) + (num%10);		
			}		
		}
		
		return num;
	}
}
