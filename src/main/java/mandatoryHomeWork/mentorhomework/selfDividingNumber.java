package mandatoryHomeWork.mentorhomework;
/*
 * A self-dividing number is a number that is divisible by every digit it contains.


For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

Example 1:

Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Psuedocode :
1. get the left and right integers and iterate through the range starts with left and end at Right value
2. initialize an integer array with size(right - left)
3. int x =0, n=0;
2. for each value,
	a. check if the number is < 9
		arr[x] = i;
		x++;
	b. else
		char[] a = new char[number.length];
		for(int j=0;j<number.length;j++) {
		if (a[j]!=0)
			if number/a[j]==0 then add that number to the arr
3. return arr
			
			
		
 */

import org.junit.Test;
import org.testng.Assert;

public class selfDividingNumber {

	@Test
	public void test1() {
		int left = 47, right = 55;
		int[] output = {48,55};
		int[][] actOutput = findselfDividingNumber(left, right);
		Assert.assertEquals(output, actOutput);
		
	}

	public int[][] findselfDividingNumber(int left, int right) {
		int arrLen = right-left;
		int x = 0;
		//int numLen = String.valueOf(right).length();
  		int r=0,count=0,n=0;
		int[] arr[] = null;
		for(int i=left;i<right;i++) { //128 = left
				x=left;
				while (i>0) {	
					r=i%10;
					if(x%r==0) {
						count++;
					}
					i=i/10;	
			}
				if(count==String.valueOf(i).length()) 
					//arr[n] = x;
					n++;
					
		}
		return arr;
	}
}
