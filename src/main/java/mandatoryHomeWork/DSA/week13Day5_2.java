package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 704. Binary Search
Psuedocode : 
1. Get the input array and target
2. assign left pointer as 0 and right pointer as the last index of the array
3. declare index as 0
4. start a while loop and iterate till left pointer is less than or equal to right pointer
5. find the mid position
6. check whether the number at mid position is less than the target. If true, move the left pointer to mid position+1
7. if the target number is greater than the number at mid position. move the right pointer to mid position-1
8. if the target number and the mid position number are same, return the index 
9. if no matching element found, return -1

time complexity - O[N]
Space complexity - O[1]
 */
public class week13Day5_2 {
	@Test
	public void test1() {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int expOutput = 4;
		int actOutput = search(nums, target);
		Assert.assertEquals(expOutput, actOutput);
		}

	private int search(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}
}


