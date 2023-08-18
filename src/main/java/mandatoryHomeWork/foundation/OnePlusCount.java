package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

public class OnePlusCount {

	/*
	 * Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input
	 */
	
	@Test
	public void test1() {
		int[] arr = new int[] {1,2,3};
		int output = findPlusOne(arr);
		Assert.assertEquals(2, output);
	}
	@Test
	public void test2() {
		int[] arr = new int[] {1, 1, 3, 3, 5, 5, 7, 7};
		int output = findPlusOne(arr);
		Assert.assertEquals(0, output);
	}
	
	@Test
	public void test3() {
		int[] arr = new int[] {1, 1, 2};
		int output = findPlusOne(arr);
		Assert.assertEquals(2, output);
	}
	public int findPlusOne(int[] arr) { //1,2,3
		
		int count;
		int tempCount=0;
		
		for (int i=0;i<arr.length;i++) { //1;
			count=0;
			for(int j=0;j<arr.length;j++) { //2,
				if((arr[i]+1)==arr[j]) { //t //f
					count++; 
					tempCount +=count; //1
				}			
			}			
		}
		
		return tempCount;
	}
}


