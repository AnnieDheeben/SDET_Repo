package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*
 * given a array of nums {1,2,3} return output array with product of elts except elt at index
output = {6,3,2}

1.get the input array
2. declare an output array
3. find the product of all elements in the given array before the current index and store it in the output array
4. find the product of all elements in the given array after the current index and store it in the output array
4. return the output array
 */

public class FindProductInterviewquestion {
	@Test
	public void test1() {
		int[] nums = {1,2,3};
		int[] output = {6,3,2};
		int[] actOutput = findProduct(nums);
		Assert.assertEquals(output, actOutput);
	}

	private int[] findProduct(int[] nums) {
		if(nums.length == 1) return nums;
		int[] output = new int[nums.length];
		int product = 1;
		
		int left= 1;
		for(int i=0;i<nums.length;i++) {
			output[i] = left; //out[0] = 1
			left*= nums[i]; //6
		}
		
		int right = 1;
		for(int i=nums.length-1;i>=0;i--) {
			output[i]*= right;
			right*=nums[i];
		}
		return output;
	}
	
	private int[] findProduct1(int[] nums) {
		int[] output=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			int n=1;
			for(int j=0;j<nums.length;j++){
			if(i!=j){
			n=n*nums[j];
			}
		}
			output[i]=n;
		}
		return output;
	}

}
