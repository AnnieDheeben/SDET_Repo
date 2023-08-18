package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

public class SorterArraySquares {
	
/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */

 @Test
 public void test1() {
	 int[] nums = new int[] {-4,-1,0,3,10};
	 int[] output = findSquaresOfArray(nums);
	 System.out.println(Arrays.toString(output));
 }
 
 @Test
 public void test2() {
	 int[] nums = new int[] {-7,-3,2,3,11};
	 int[] output = findSquaresOfArray(nums);
	 System.out.println(Arrays.toString(output));
 }

public int[] findSquaresOfArray(int[] nums) {
	int temp;
	int[] newArr = new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		newArr[i]=nums[i]*nums[i];
	}
	
	for(int j=0;j<newArr.length;j++) {
		for(int k=j+1;k<newArr.length;k++) {
			if(newArr[j]>newArr[k]) {
				temp = newArr[j];
				newArr[j] = newArr[k];
				newArr[k] = temp;			
			}
			
		}
	}
	
	return newArr;
}
}
