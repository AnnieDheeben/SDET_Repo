package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

public class PivotIndex_Redo {
	@Test
	public void test1() {
		int nums[] = {1,7,3,6,5,6};
		int pivotIndex = 3;
		int actPivotIndex = findPivot(nums);
		Assert.assertEquals(actPivotIndex, pivotIndex);
		}

	public int findPivotIndex(int[] nums) {
	
		int leftSum, rightSum;
		for(int i=0;i<nums.length;i++) {
			leftSum = 0; rightSum = 0;
			for(int j=0;j<nums.length;j++) {
				if(j<i) leftSum = leftSum + nums[j];
				else if(j>i) rightSum = rightSum + nums[j];
				}
		if(leftSum == rightSum) {
			return i;
		}		
	}
		return -1;
	}
	
	public int pivotIndex(int[] arr) {
		int left=0,right=0,pivot=-1;
		for (int i=0;i<arr.length;i++){
		right=right+arr[i];
		}
		for (int i=0;i<arr.length;i++)
		{
		right=right-arr[i];
		if(left==right){
			pivot=i;
		}
		left=left+arr[i];
		
		}
		return pivot;
	}
	
	public int findPivot(int[] nums) {
		int pivot = -1;
		int left = 0, right = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=nums.length-1;j>0;j--) {
				left = left + nums[i];
				if(left==right) return i;
				else {
					right = right + nums[j];
				}
				
			}
			
		}
		return pivot;
	}

}
