package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode
 * 1. Get the input array, m and d value
 * 2. declare a pointer with value as 0
 * 3. 
 */
public class subArrayDivision {
	@Test
	public void test1() {
		int[] s = {2,2,1,3,2};
		int d = 4;
		int m=2;
		int expCount = 2;
		int actCount = findSubArrays(s,d,m);
		Assert.assertEquals(expCount, actCount);
	}

	private int findSubArrays(int[] s, int d, int m) {
		int pointer=0;
		int count=0;
		int currentSum=0;
		while(pointer<m) {
			currentSum = currentSum+s[pointer];
			pointer++;
		}
		
		if(currentSum==d) count++;
		
		while(pointer<s.length) {
			currentSum = currentSum+s[pointer]-s[pointer-m];
			if(currentSum==d) count++;
			pointer++;
			
		}
		return count;
	}
}
