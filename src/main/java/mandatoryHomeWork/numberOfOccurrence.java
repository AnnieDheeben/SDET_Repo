package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

Examples: 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 

Psuedocode :
1. Get the input array and the number for which the number of occurrence need to be found out
2. Iterate through the array with the given number to find out the number of occurrence
	a. Initialize the counter variable and set it as 0
	b. whenever the given number is identified in the array, increment the counter variable by 1
	c. continue the above step(b) till the end of the array
3. after the above loop exits, check the counter value.
	a. If it is greater than 0 or not, if not return -1
	b. else , return the  actual counter value
 */
public class numberOfOccurrence {
	
	@Test
	public void test1() {
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 1;
		//int expectedCount = 2;
		int actualCount = findOccurrence(arr,x);
		Assert.assertEquals(2, actualCount);
		
	}
	
	@Test
	public void test2() {
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 4;
		//int expectedCount = 2;
		int actualCount = findOccurrence(arr,x);
		Assert.assertEquals(-1, actualCount);
		
	}

	public int findOccurrence(int[] arr, int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			//count = 0;
			if(arr[i]==x) {
				count++;
			}
		}
		
		if(count > 0) return count;
		else return -1;
	}

}
