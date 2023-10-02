package DSA.CW;
/*
 * 1. GET THE INPUT ARRAY
 * 2. check if the first index and last index are the same, if both are same, return the indices
 * 3. if the left index value+right index value are greater than the target value, decrement rightIndex
 * 4. if the left index value+right index value are lesser than the target value, increment leftIndex
 */
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SortedArray {
	@Test
	public void test1() {
		int[] nums = {2,3,5,7};
		int target = 9;
		int[] expOutput= {0,3};
		int[] actOutput = findTarget(nums, target);
		Assert.assertEquals(Arrays.toString(expOutput), (Arrays.toString(actOutput)));
	}

	private int[] findTarget(int[] nums, int target) {
		
		int sum = 0;
		int[] newArr = new int[2];
		int rightIndex = nums.length-1;
		int leftIndex = 0;
		while(leftIndex < rightIndex) {
			sum = nums[leftIndex] + nums[rightIndex];
			if(sum==target) {
					newArr[0] = leftIndex;
					newArr[1] = rightIndex;
					break;
				}
			else if(sum>target) rightIndex--;
			else if(sum<target) leftIndex++;
		}
			//System.out.println(Arrays.toString(newArr));
			return new int[] {leftIndex,rightIndex};
		}
}
