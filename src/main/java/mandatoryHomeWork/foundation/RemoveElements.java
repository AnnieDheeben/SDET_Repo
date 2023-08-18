package mandatoryHomeWork.foundation;


import java.util.Arrays;

import org.junit.Test;

public class RemoveElements {
	
	/*
	 * Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/
	 */
	@Test
	public void test1( ) {
		
		int[] input = new int[] {2,3,3,4,5};
		int target = 3;
		int[] output=removeElement(input, target);
		System.out.println(Arrays.toString(output));
	}
	
	@Test
	public void test2( ) {
		
		int[] input = new int[] {2,2};
		int target = 2;
		int[] output=removeElement(input, target);
		System.out.println(Arrays.toString(output));
	}
	
	@Test
	public void test3( ) {
		int[] input = new int[] {2,3,3,4,5};
		int target = 6;
		int[] output=removeElement(input, target);
		System.out.println(Arrays.toString(output));
		
	}
	

	public int[] removeElement(int[] input, int target) {
		int count=0;int x=0;
		for(int i=0;i<input.length;i++) {
			//count=0;
			if(input[i]==target) {
				count++;
			}
			if(count>0) {
				x=count;
			}
		}
		int newArrLen = (input.length)-x;
		int[] newArr= new int[newArrLen];
		int k=0;
		while(k<newArrLen) {
		for(int j=0;j<input.length;j++) {
				if(input[j]!=target) {
					newArr[k++]=input[j];
				}
			}
		}
		if(x>0) {
		return newArr;
		}
		else
			return input;
	}
}
