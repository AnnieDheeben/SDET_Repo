package mandatoryHomeWork.DSA;
/*
 * Problem statement understandable - yes
 * dataset - yes
solution - yes
alternative solution - no
Psuedocode : 
1. Get the input array and the n value (flowers)
2. use While loop to have the entry check of n value as n should not equal to 0 and follow the below steps
	a. Iterate through the for loop with the starting index as 0 till the end of the array
	b. for each iteration, check whether the current index value is '0' or not
	c. if it is 0, then check whether the adjecent index value is also 0 or not
	d. if both the above conditions are true, then insert 1 in the current index position
	e. decrement the n value
	f. continue the above steps till n reaches 0
3. In any of the validation is failed, return false else return true
 */

import org.junit.Test;
import org.testng.Assert;

public class CanPlaceFlowers {
	
	@Test
	public void test1() {
		int[] arr = {1,0,0,0,1};
		int n = 1;
		boolean expOutput = true;
		boolean actOutput = plantFlowers(arr,n);
		Assert.assertEquals(actOutput, expOutput);
	}
	

	@Test
	public void test2() {
		int[] arr = {1,0,0,0,1};
		int n = 2;
		boolean expOutput = false;
		boolean actOutput = canPlanFlowers(arr,n);
		Assert.assertEquals(actOutput, expOutput);
	}

	public boolean plantFlowers(int[] arr, int n) {
		
		int count = 0; int flowers = n;
		while(n!=0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					if(arr[i-1]!=1 && arr[i+1]!=1) {
						arr[i]=1; count++;
						n--;
						break;
					}
				}
			}
		}
		
		if(count>=flowers) return true;
		return false;
	}
	
	public boolean canPlanFlowers(int[] arr, int n) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				boolean PrevNextAvailability = (i==0||arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0);
				if(PrevNextAvailability) {
					arr[i]=i;
					count++;
				}
				if(count>=n) return true;
			}
		}
		return count>=n;
		
	}

}
