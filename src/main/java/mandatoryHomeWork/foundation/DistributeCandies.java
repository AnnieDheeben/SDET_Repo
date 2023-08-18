package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandies {
	
	/*
	 * Input: candyType = [1,1,2,3]
	 * Output: 2
	Explanation: Alice can only eat 4 / 2 = 2 candies.
	Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
	
	 */
	
	
	@Test
	public void test() {
		int[] candyType = new int[] {1,1,2,3};
		
		int outputVal = maxCandies(candyType);
		Assert.assertEquals(2, outputVal);
		
	}
	
	@Test
	public void tes1t() {
		int[] candyType = new int[] {1,1,2,2,3,3};
		
		int outputVal = maxCandies(candyType);
		Assert.assertEquals(3, outputVal);
		
	}
	
	public int maxCandies(int [] n) {
		
		int count;
		int x = 0;
		int totCandies = n.length/2; //2
		int[] candyType = new int[n.length]; 
		for(int k=0;k<candyType.length;k++) {
			candyType[k]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n.length;i++) {
			count=0;
			for(int j=0;j<candyType.length;j++) //1,1,2,2,3,3
			{
				if(n[i]==candyType[j])
					count++; 
			}
			
			if(count==0) {
				candyType[x] = n[i];
				x++;
			}
		}
		if(x>totCandies) {
			return totCandies;
		}
		else return x;
		//System.out.println(count);
		
	}

}
