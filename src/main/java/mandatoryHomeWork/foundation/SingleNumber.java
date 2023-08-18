package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {
	
	@Test
	public void test1() {
		
		int[] givenArr = new int[] {2,2,1};
		int singleNum = singleOccurrence(givenArr);
		Assert.assertEquals(1, singleNum);
		
	}

	@Test
	public void test2() {
	
		int[] givenArr = new int[] {4,1,2,1,2};
		int singleNum = singleOccurrence(givenArr);
		Assert.assertEquals(4, singleNum);
		
	}
	
	@Test
	public void test3() {
		
		int[] givenArr = new int[] {4};
		int singleNum = singleOccurrence(givenArr);
		Assert.assertEquals(4, singleNum);
		
	}
	public int singleOccurrence(int[] arr) {
		
		//int[] inputArr = new int[arr];
		int singleNum = 0;
		int count;
		int x = 0;
		for(int i=0; i<arr.length;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1)
			{
				singleNum = arr[i];
			}
	} 				
		return singleNum;
		
	}
}

