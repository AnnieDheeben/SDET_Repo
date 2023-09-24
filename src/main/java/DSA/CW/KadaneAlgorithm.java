package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input array
 * 2. set two integer variables as currentMaximum and Maximum and assign both to 0
 * 3. start a while loop and iterate till the end of the array
 * 4. for each iteration, check whether the currentMaximum value is greater than 0
 * 		a. if yes, 
 * 			1.add the current index value to currentMaximum
 * 			2. Assign Maximum with the max of Maximum and CurrentMaximum
 * 		c. if No, reset currentMaximum to 0
 * 5. return the final Maximum value
 */

public class KadaneAlgorithm {

	@Test
	public void test1() {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		int expOutput=6;
		int actOutput = findsubArray(a);
		Assert.assertEquals(expOutput, actOutput);
	}
	@Test
	public void test2() {
		int[] a = {7,-1,-6,4,3,8};
		int expOutput=15;
		int actOutput = findsubArray(a);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int findsubArray(int[] a) {
		
		int maximum =0, currentMaximum=0,pointer=0;
		while(pointer<a.length) {
			currentMaximum = currentMaximum+a[pointer];
			if(currentMaximum<0) {
				currentMaximum=0;
			}
			
			else {
				maximum = Integer.max(maximum, currentMaximum);
			}
			pointer++;
		}
		return maximum;
	}
}
