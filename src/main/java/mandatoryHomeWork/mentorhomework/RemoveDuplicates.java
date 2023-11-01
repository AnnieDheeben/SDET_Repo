package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveDuplicates {
@Test
public void test1() {
	int[] nums = {0,0,1,1,1,2,2,3,3,4};
	int expOutput = 5;
	int actOutput = removeDuplicates(nums);
	Assert.assertEquals(expOutput, actOutput);
}

private int removeDuplicates(int[] nums) {
	int i=0;
	int j=1;
	while(j<nums.length) {
		if(nums[i]!=nums[j]){
			i++;
			nums[i]=nums[j];
		}
		j++;
	}
	return i+1;
}
}
