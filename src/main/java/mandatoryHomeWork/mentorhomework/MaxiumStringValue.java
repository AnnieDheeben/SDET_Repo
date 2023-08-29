package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Input: strs = ["alic3","bob","3","4","00000"]
Output: 5
Explanation: 
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".

Psuedocode : 
1. Get the input String array
2. Declare an Integer array with same size of the given input String array
3. Iterate through each String of the given array
4. For each String, check the below conditions
	a. if the String contains only numbers, covert that string into integer and store it on the integer array
	b. if not return the length of the string and store it on the integer array
5. sort the array and return the last index value

 */
public class MaxiumStringValue {
	
	@Test
	public void test1() {
		String[] strs = {"alic3","bob","3","4","00000"};
		int expOutput = 5;
		int actOutput = findMaxString(strs);
		Assert.assertEquals(expOutput, actOutput);
	}
		
		@Test
		public void test2() {
			String[] strs = {"Dharani","Dharani12","12","Day"};
			int expOutput = 12;
			int actOutput = findMaxString(strs);
			Assert.assertEquals(expOutput, actOutput);
		
		
	}

	public int findMaxString(String[] strs) {
		
		int[] arr = new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			boolean isalphaNumberic = false;
			for(int j=0;j<strs[i].length();j++) {
				char c = strs[i].charAt(j);
				if(Character.isAlphabetic(c)) isalphaNumberic = true;
				break;
			}
			if(isalphaNumberic==true) {
				arr[i] = strs[i].length();			
			}
			else{
				arr[i]= Integer.parseInt(strs[i]);
			}
		}
		
		Arrays.sort(arr);
		return(arr[arr.length-1]);
	}

}
