package mandatoryHomeWork.mentorhomework;
/*
 * Psuedocode : 

1. Get the input array and d (number of rotations) (1 2 3 4 5 , 2) //d =2 , 3,4,5,1,2
2. use a new array 'newArr' with the same length of the given array to store the output array value 
3. check the 'd' value of the given input
4. copy the values from the input array starting at dth index till the end to the newArr(newArr iteration starts at index 0 and ends at d) 
5. copy the remaining elements before dth index of the given array to the new array (starting index d+1 , ending index - array length)

Time complexity - O[N]
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;



public class ArrayLeftRotation {
	
	@Test
	public void test1() {
		
		int[] arr = {1,2,3,4,5};
		int d = 2;
		int[] expectedArr = {3,4,5,1,2};
		int[] actualArr = shiftPos(arr,d);
		Assert.assertArrayEquals(expectedArr, actualArr);
	}

	public int[] shiftPos(int[] arr, int d) {
		int[] newArr = new int[arr.length];  //O[N]
		int x = d;
		int y = d+1;
		
		for(int i=0;i<=d;i++) { //0[1]
			newArr[i]=arr[x];
			x++;
		}
		
		int k = 0;
		for(int i=y;i<newArr.length;i++) { //0[1]
			newArr[i] = arr[k];
			k++;
		}
		
		System.out.println(Arrays.toString(newArr));
		return newArr ;
	}

}
