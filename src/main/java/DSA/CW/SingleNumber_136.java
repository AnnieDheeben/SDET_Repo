package DSA.CW;

import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;


public class SingleNumber_136 {
	@Test
	public void test1() {
		int[] nums = {2,2,1};
		int output =1;
		int actOutput = singleNumber(nums);
		Assert.assertEquals(output, actOutput);
	}

	private int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(Integer n : nums) {
			if(set.contains(n)) {
				set.remove(n);
			}
			else {
			set.add(n);
			}
		}
		
		for(int num : set) {
			return num;
		}
		return 0;
	}

}
