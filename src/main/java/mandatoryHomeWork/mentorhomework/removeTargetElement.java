package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*
 * Remove the target element in the array
example 1: input = [2, 3, 3, 4, 5], target=3
                           output = [2, 4, 5]

Pseudocode :
1. Get the input array and the target element
2. Iterate through the array to check whether the given number is available 
3. if the target element is not available in the ith,add it to the new array
4. continuw the above till the last element of the array
 */
public class removeTargetElement {
	
	@Test
	public void test1() {
		int[] input = {2, 3, 3, 4, 5};
		int target = 3;
		int[] output = removeTargetElement(input, target);
		int[] expected = {2,4,5};
		Assert.assertEquals(output, expected );
	}

	private int[] removeTargetElement(int[] input, int target) {
		
		int count = 0,x = 0;
		for(int i=0;i<input.length;i++) {
			if(input[i]==target) {
				count++;
			}
			if(count >0) {
				x=count;
			}
		}
			int[] newArr = new int[input.length -x];
			int k=0;
			while(k< input.length -x) {
			for(int j=0;j<input.length;j++) {
				if(input[j]!=target) {
					newArr[k++]= input[j];
				}
			}
			}
			
			if(x>0) return newArr;
			else return input;
			
	}

}
