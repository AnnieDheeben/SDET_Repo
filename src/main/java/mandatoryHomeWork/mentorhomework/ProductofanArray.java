package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

public class ProductofanArray {
@Test
public void test1() {
	int[] nums = {1,2,3,4};
	int[] output = {24,12,8,6};
	int[] actOutput = productExceptSelf(nums);
	Assert.assertEquals(output, actOutput);
}

private int[] productExceptSelf(int[] nums) {
	int[] product = new int[nums.length];
    for(int i=0;i<nums.length;i++){
        int left = (i==0)?1 : nums[i-1];
        int right = (i==nums.length-1)?1:nums[i+1];
        while(left==0){
            left = left * nums[i];
            left--;
        }
        while(right<nums.length){
            right = right * nums[i];
            right++;
        }
        product[i]=left*right;
    }
    return product;
}
}
