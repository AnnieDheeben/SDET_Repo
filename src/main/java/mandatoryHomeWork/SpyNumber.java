package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input number as num
 * 2. Initialize two integer variable - temp 1 to 0 and temp2 to 1;
 * 3. Get the each individual digit by applying the logic of num%10 and assign it to an integer variable 'x'
 * 4. calclulate temp1 value as temp1 + x
 * 5. calculate temp2 value as (temp2 * x) 
 * 6. continue the above steps(3,4 and 5) till num reaches 0
 * 7. compare temp1 and temp2 . If temp1 is equal to temp2 , then return true
 */

public class SpyNumber {

	@Test
	public void test1() {
		int num = 132;
		boolean output = true;
		boolean actOutput = isSpyNumber(num);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		int num = 142;
		boolean output = false;
		boolean actOutput = isSpyNumber(num);
		Assert.assertEquals(output, actOutput);
	}


	private boolean isSpyNumber(int num) {
		
		int temp1 = 0, temp2 = 1, x = 0;
		while(num!=0) {
			x = num % 10;
			temp1 = temp1 + x;
			temp2 = temp2 * x;
			num = num/10;				
		}
		
		return (temp1==temp2);
	}
}
