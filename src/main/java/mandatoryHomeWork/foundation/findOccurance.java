package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class findOccurance {
	
	
	/*Given a sorted array arr[] and a number x, write a function that 
	counts the occurrences of x in arr[].
	//arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
	//output = 4
	 * 
	 *pseudocode
	 * Get the input array and int value
	 * to find the number of occurrence of the provided value
	 * 	initialize counter variable and assign it to 0
	 * compare each value of the array with the provided int value by iterating through the array
	 * 			a.if matches, then increase the count by 1
	 * 			b.if no matches, then move to the next element of the array and proceed comparison
	 * 			continue the above steps a & b till the end of the array
	 */
	
	@Test
	public void test1() {
		int[] arr = new int[] {1, 1, 2, 2, 2, 2, 3,};
		int duplicateCount = findDuplicateCount(arr,2);
		System.out.println("Count of Occurrence: " +duplicateCount);
	}
	
	@Test
	public void test2() {
		int[] arr = new int[] {1, 1, 2, 2, 2, 2, 3,};
		int duplicateCount = findDuplicateCount(arr,3);
		System.out.println("Count of Occurrence: " +duplicateCount);
	}
	
	@Test
	public void test3() {
		int[] arr = new int[] {1, 1, 2, 2, 2, 2, 3,};
		int duplicateCount = findDuplicateCount(arr,4);
		System.out.println("Count of Occurrence: " +duplicateCount);
	}
	public int findDuplicateCount(int arr[], int val) {
		
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==val)
				count = count +1;
			
		}
		return count;
		
	}

}
