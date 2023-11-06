package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class week15Day1_1 {

	@Test
	public void test1() {
		int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
		int expOutput = 1;
		int actOutput = majorityElement(nums);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int majorityElement(int[] nums) {
		int max = nums.length/2;
		int num = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int occurrence = map.getOrDefault(nums[i],0);
            map.put(nums[i], occurrence+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>max){
                max= value;
                num = key;
            }
        }

        return num;
		
	}
}
