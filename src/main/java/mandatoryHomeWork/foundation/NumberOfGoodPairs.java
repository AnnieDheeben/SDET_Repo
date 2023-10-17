package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class NumberOfGoodPairs {
@Test
public void test1() {
	int[] nums = {1,2,3,1,1,3};
	int expOutput = 4;
	int actOutput = numIdenticalPairs(nums);
	Assert.assertEquals(expOutput, actOutput);
}

private int numIdenticalPairs(int[] nums) {
	Map<Integer, Integer> map = new HashMap<>();
	int count = 0;
	for(int i=0;i<nums.length;i++) {
		int occurrence = map.getOrDefault(nums[i], 0);
		map.put(nums[i], occurrence+1);
	}
	
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		int val = entry.getValue();
		count+=(val*(val-1))/2;
	}
	
	return count;
}
}
