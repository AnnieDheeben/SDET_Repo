package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psudeocode :
 * 1. get the input number (n)
 * 2. check if the n is less than 0r equal to 7
 * 		a. if yes, apply the sum of n natural number logic
 * 		b. else, apply the below logic
 * 			
 * (1+2+3+4+5+6+7) + (2+3+4+5+6+7+8)
 */
public class moneyCalculation_Redo {
	
	@Test
	public void test1() {
		int n = 4;
		int output = 10;
		int actOutput = calculateMoney(n);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test2() {
		int n = 10;
		int output = 37;
		int actOutput = calculateMoney(n);
		Assert.assertEquals(output, actOutput);
	}
	
	@Test
	public void test3() {
		int n = 20;
		int output = 96;
		int actOutput = calculateMoney(n);
		Assert.assertEquals(output, actOutput);
	}
	

	public int calculateMoney(int n) {
		
		int count =0, amt =0, init = 0, totamt = 0,temp=0;
		for(int i=0;i<n;i++) {	
			amt = amt  +1;
			totamt = totamt + amt; 
			count++;
			if(count==7) {
				temp = temp + 1;
				amt = temp;
				count = 0;
			}
		}
		return totamt;	
	}
}
