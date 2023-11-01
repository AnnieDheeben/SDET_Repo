package mandatoryHomeWork.mentorhomework;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveElements {
@Test
public void test1() {
	int[] nums = {3,2,2,3};
	int val = 2;
	int expOutput = 2;
	int actOutput = removeElement(nums,val);
	Assert.assertEquals(actOutput, val);
}

private int removeElement(int[] nums, int val) {
	List<Integer> list = new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            list.add(nums[i]);
        }
    }
    return list.size();
}
}
