package DSA.CW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

/*
 * input ={1,1,0,3} , target = 4 => output [{0,3},{1,3}]
 */
public class findSumTwoDimensional {
@Test
public void test1() {
	int[] input = {1,1,0,3};
	int target = 4;
	int[][] expOutput = {{0,3},{1,3}};
	List<int[]> result = findPairs(input, target);
	int[][] actOutput = new int[result.size()][2];
	for(int i=0;i<result.size();i++) {
		actOutput[i] = result.get(i);
	}
}

private List<int[]> findPairs(int[] nums, int target) {
	
	HashMap<Integer, Integer> map = new HashMap<>();
	List<int[]> result = new ArrayList<>();
	
	for(int i=0;i<nums.length;i++) {
		map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
	}
	
	for(int num : nums) {
		int pair = target-num;
		
		if(map.containsKey(pair)) {
			if((pair==num) && (map.get(pair)<2)){
				continue;
			}
			
			result.add(new int[]{num, pair});
			map.put(num, map.get(num)-1);
			map.put(pair, map.get(pair)-1);
		}	
	}
	return result;
}
}
