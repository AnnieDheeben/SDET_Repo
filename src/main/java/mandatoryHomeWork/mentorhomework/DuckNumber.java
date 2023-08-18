package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * A positive number that contains a zero digit is called Duck Number. The important point to note is that numbers with only leading zeroes are not Duck numbers. For example, 3056, 10045, 7770 are Duck Numbers while the numbers such as 012, 0045, 01444 are not Duck numbers.
Note: 04505 is also a Duck number as it contains a non-leading zero digit.


Pseudocode : 
1. Get the given number
2. convert the integer num to an int array 
3. if the first index holds value as zero, then return false
4. if the above condition fails, 
	a.Iterate through the array starting from 1st index
	b. if any of the index holds value as 0,increment the counter by 1
5. Check whether the counter value is greater than 0
	a. If yes, return true
	b. else, return false
 */
public class DuckNumber {
	
	@Test
	public void test1() {
		int n = 3056;
		boolean expectedOutput = true;
		boolean actualOutput = isDuckNumber(n);
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void test2() {
		int n = 04505;
		boolean expectedOutput = true;
		boolean actualOutput = isDuckNumber(n);
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void test3() {
		int n = 7770;
		boolean expectedOutput = true;
		boolean actualOutput = isDuckNumber(n);
		Assert.assertEquals(expectedOutput, actualOutput);
	}

	public boolean isDuckNumber(int n) {
		
		int count=0;
		String s = Integer.toString(n);
		int len = s.length();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = Character.getNumericValue(s.charAt(i));
		}
		
		int x = arr[0];
			for(int i=1;i<len;i++) {
				if(x==0 || arr[i]!=0) count++;
			}
		if(count>0) {
		return true;
		}
		else {
			return false;
		}
	}

}
