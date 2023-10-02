package DSA.CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummaryRanges_2Pointers {
	@Test
	public void test1() {
		int[] nums = {0,1,2,4,5,7};
		List<String> aList = new ArrayList<>();
		aList.add("0->2");
		aList.add("4->5");
		aList.add("7");
		List<String> outList = twoPointers(nums);
		Assert.assertEquals(aList, outList);
	}

	private List<String> findRanges(int[] nums) {
		List<String> resList = new ArrayList<String>();
		int stIndex = 0;
		//int endIndex = 0;
		for(int endIndex=1;endIndex<nums.length;endIndex++) {
			if(endIndex==nums.length || nums[endIndex]-1 == nums[stIndex]) endIndex++;
				if(stIndex!=endIndex){
				resList.add(nums[stIndex]+"->"+nums[endIndex-1]);
			} else resList.add(Integer.toString(nums[stIndex]));
				stIndex = endIndex;
			}
			
		return resList;
	}
	
	private List<String> findRanges_way2(int[] nums){
		int stPos = 0;
		int endPos = 0;
		
		List<String> outputList = new ArrayList<>();
		for(int i=stPos;i<nums.length;i++) {
			if(endPos<nums.length) {
				if(nums[stPos]+1 == nums[endPos]) {
					stPos = endPos;
					endPos++;
			}
			if(nums[stPos]+1 != nums[endPos]) {
				outputList.add(nums[stPos]+"->"+nums[endPos]);
				stPos = endPos;
				endPos++;
			}
			if(stPos==endPos || stPos<nums.length || endPos<nums.length) {
				outputList.add(Integer.toString(nums[stPos]));
			}
		
				}
		
	}
		return outputList;
}
	
	private List<String> twoPointers(int[]nums){
		 ArrayList<String> ans = new ArrayList<>();

	        if(nums == null || nums.length == 0)
	          return ans;


	        int start = 0;
	        int end = 0;
	        int n = nums.length;
	        int i = 0;        
	        while(i < n)
	        {
	            if(i + 1 < n && nums[i + 1] - nums[i] == 1)
	            {
	                end++;
	            }
	            else {
	              
	              if(start == end)
	              {
	                  ans.add(String.valueOf(nums[end]));
	              }
	              else{
	                  ans.add(nums[start] + "->" + nums[end]);
	              }

	              end++;
	              start = end;
	            }
	          i++;      
	        } 
	       return ans;
	
	}
	
}
