package mandatoryHomeWork.mentorhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

Psudocode : 
1. Get the input arrays nums1 and nums2
2. sort the given arrays
3. Assign a pointer at the starting index of nums1 and a pointer at the starting index of nums2
3. start a while loop and iterate till the end of nums and nums2
4. For each iteration, 
	a.check if the element at nums1 and nums2 are same
	b. If the above statement returns true, add the element at the output array and move the pointers at nums1 and nums2 to next element
	c. if the element at nums1 is smaller than the element at nums2, move the nums1 pointer alone to the next element
	d. if no match found, move the nums1 pointer to next element
5. return the output array
	
 */

public class IntersesionOfTwoArrays {
	@Test
	public void test1() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] expOutput = {4,9};
		int[] actOutput = intersectHashMap(nums1, nums2);
		//Assert.assertEquals(actOutput, expOutput);
		System.out.println(actOutput);
	}

	private int[] intersect(int[] nums1, int[] nums2) {
		int p1=0,p2=0;
		List<Integer> result = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		while(p1<nums1.length && p2<nums2.length) {
			if(nums1[p1]==nums2[p2]) {
				result.add(nums1[p1]);
				p1++;
				p2++;
			}
			else if (nums1[p1]<nums2[p2]) {
				p1++;
			}
			else {
			p2++;
		}
		}
		int[] arr = new int[result.size()];
		for(int i=0;i<result.size();i++) {
			arr[i]=result.get(i);
		}
		return arr;
	}
	
	private int[] intersectHashMap(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> map1 = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		int currentOccurrence = 0;
		for(int i=0;i<nums1.length;i++) {
			currentOccurrence = map1.getOrDefault(nums1[i], 0);
			map1.put(nums1[i], currentOccurrence+1);
		}
		for(int i=0;i<nums2.length;i++) {
			currentOccurrence = map1.getOrDefault(nums2[i], 0);
			if(currentOccurrence>=1) {
				result.add(nums2[i]);
				map1.put(nums2[i], currentOccurrence-1);
			}
		}
		
		int[] arr = new int[result.size()];
		for(int i=0;i<result.size();i++) {
			arr[i]=result.get(i);
		}
		return arr;
		
	}
	
}
