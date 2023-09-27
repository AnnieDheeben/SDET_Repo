package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Psuedocode :
 * 1. Get the input array
 * 2. check if size of the array is greater than or equal to 3
 * 3. if the above statement returns false, return an empty array
 * 4. if the size of the array is three, return the same input array as output
 * 5. if the size of the array is greater than 3,
 * 		a. sort the given array
 * 		b. calculate product1 as the product of last three values of the sorted array
 * 		c. calculate product2 as the product of first two values and the largest value in the array
 * 		d. compare product1 and product2
 * 		e. if product1 is larger, return the numbers(last three number) involved in finding the product1 in the output array
 * 		f. if product2 is larger, return the first two numbers and last number involved in finding product2 in the output array
 * 
 * Time complexity - O[nlog(n)]
 * Space complexity - O[N]	
 */

public class YubiCredAvenueQuestion {
	@Test
	public void test1() {
		int[] input = {3,5,8,1,2,0,6,4};
		int[] output = {5,6,8};
		int[] actOutput = findMaxProdNumbers(input);
		Arrays.sort(actOutput);
		Assert.assertArrayEquals(output, actOutput);
	}

	private int[] findMaxProdNumbers(int[] input) {
		int n = input.length;
		int product1=1,product2=1;
		if(n<3)  return new int[] {};
		else if(n==3) return input;
		else {
			Arrays.sort(input); //O[n(log(n)]
			int l=0,r=n-1;
			product1=product1*input[n-1]*input[n-2]*input[n-3];
			product2=product2*input[0]*input[1]*input[n-1];
			}
		if(product1>product2) {
			return new int[]{input[n-1],input[n-2],input[n-3]};
		}
		else {
			return new int[]{input[0],input[1],input[n-1]};
		}	
	}
}
