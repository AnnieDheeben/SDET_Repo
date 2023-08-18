package mandatoryHomeWork;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Input:
N = 0
A[] = {}
Output: -1

Psuedocode : 
1. Get the array and the size of the array (N)
2. sort the given array
3. Initialize an integer variable and set it as to 0
4. iterate through the for loop with the given array till N-1
	a.check whether the ith value of the array is i value or not
	b. if not, assign the ith value of the array to the integer variable
5. return the x value which is the missing value in the given array

	

 */
public class missingNumber {
	
	@Test
	public void test1() {
		int A[] = {1,2,3,5};
		int N = 5;
		int actualValue = findMissingValue(A,N);
		Assert.assertEquals(4, actualValue);
		
	}
	
	@Test
	public void test2() {
		int A[] = {6,1,2,8,3,4,7,10,5};
		int N = 10;
		int actualValue = findMissingValue(A,N);
		Assert.assertEquals(9, actualValue);
		
	}
	
	@Test
	public void test3() {
		int A[] = {};
		int N = 0;
		int actualValue = findMissingValue(A,N);
		Assert.assertEquals(-1, actualValue);
		
	}
	

	public int findMissingValue(int[] a, int n) {
		Arrays.sort(a);
		int x = 0;
		if(n==0) return -1;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=i+1) x = i+1;
		}
		return x;
	}


}
