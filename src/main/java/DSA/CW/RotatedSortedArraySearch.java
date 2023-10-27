package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

public class RotatedSortedArraySearch {
@Test
public void test1() {
	int[] nums = {4,5,6,7,0,1,2};
	int target = 0;
	int expOutput = 4;
	int actOutput = search(nums, target);
	Assert.assertEquals(expOutput, actOutput);
}

private int search(int[] nums, int target) {
	int len = nums.length;
	int left=0;
	int right = 0;
	while(left<=right) {
		int midPos = left+(right-left)/2;
		if(nums[midPos]==target) {
			return midPos;
		}
		if(nums[midPos]>target) {
			left = midPos+1;		
			}
		else {
			right = midPos-1;
		}
	}
	return -1;
}

private int findMidPos(int[] nums, int left, int right) {
	while(right<=nums.length) {
		right+=2;
		left++;
	}
		
	return left;
}
}
