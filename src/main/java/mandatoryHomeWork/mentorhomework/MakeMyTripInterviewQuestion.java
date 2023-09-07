package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;

import org.junit.Test;

/*
 * Return 1st and last index of the matching target with array int[] arr= {0,0,0,1,1,1,2,2,3,4,5,5}; 
int target=1; op:3 & 5  

Test data :
1.  int[] arr= {0,0,0,1,1,1,2,2,3,4,5,5}, target = 1, output = {3,5}
2. int[] arr ={}, target =1,output = {}
3. int[] arr={1,1,1,2,2,3,3,3}, target = 4, output ={}

Psuedocode : 
1. Get the input array and target element
2. declare one boolean variable as found and set it to false
3. Iterate through the array and if the target element is found in the array
	a. check the value for the boolean variable found. If it is true, just append ',' to the existing string builder variable(sb)
	B. If the value of 'found' is false. append current index to sb
	c.continue the above steps till the end of the loop
4. convert Stringbuilder into String
5. get the first and last index value of Stringbuiler
6. concatenate the strings by adding '&' in mid
7. return the output string
 */

public class MakeMyTripInterviewQuestion {

	@Test
	public void test1() {
		int[] arr = {0,0,0,1,1,1,2,2,3,4,5,5};
		int target = 1;
		String expOutput = "3 & 5";
		String actOutput = findTargerIndices(arr,target);
		
	}

	private String findTargerIndices(int[] arr, int target) {
		
		 StringBuilder sb = new StringBuilder();
		 String output = " ";
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++) { //0[N]
	            if (arr[i] == target) {
	                if (found) {
	                    sb.append(",");
	                }
	                sb.append(i);
	                found = true;
	            }
	        }
			String s =  sb.toString();
			char s1 = s.charAt(0);
			char s2 = s.charAt(s.length()-1);
			output =output + s1 + "&" +s2;
			return output;
	}
	
	//Time complexity - 0[N]
}
