package mandatoryHomeWork;

import org.testng.annotations.Test;

import junit.framework.Assert;

/*
 * Program to find the second-highest number in an array.
	I/P  int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
	O/P     Second largest number is  94


Psuedocode : 

1. Get the input array
2. initialize highest and the second highest value as ith index value
3. Iterate through the each element of the array and check if the ith index is greater than the Highest or the second highest value
	a. if yes, check whether it is  first highest value  or the seson highest value
	b. if it is greater than first, move the first highest value to the second highest and replace it with ith index value
	c. if it is greater than second highest value, check whether the ith index is greater than or less than first highest value 
		and apply the logic accordingly.
 */


public class secondHighestNumber {
	@Test
	public void test1() {
		int[] arr = {100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
		int output = 94;
		int actOutput = findSecondHighest(arr);
		Assert.assertEquals(output, actOutput);
	}

	public int findSecondHighest(int[] arr) {
		
		int v1 = arr[0]; //100 
		int v2 = arr[0]; //100
		for(int i=1;i<arr.length;i++) {
			if(v1<arr[i]) {
				v2 = v1 ;
				v1 = arr[i];
				
			}
			
			else if(arr[i]>v2) {
				v2 = arr[i];
			}
		}
		return v2;
	}

}
