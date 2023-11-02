package mandatoryHomeWork.DSA;
/*
 * 541. Reverse String II
Psuedocode : 
1. Get the input string and k value
2. declare two integer pointer start and end
3. iterate through the for loop for every 2k characters of the given string and perform the below operations
4. set start as 0 and end as min value of(i+k-1) and s.length-1
5. start a while loop and iterate till start is less than end
6. perform swap operation of start position and end position of given string
7. increment start pointer and decrement end pointer
8. continue the above steps till reaches the end of the string

Time complexity - O[N], Space complexity - O[1]

 */
import org.junit.Test;

import junit.framework.Assert;

public class week14Day4_1 {
	@Test
	public void test1() {
		String s = "abcdefg";
		int k=2;
		String expOutput = "bacdfeg";
		String actOutput = reverseString(s, k);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String reverseString(String s, int k) {
		int start = 0;
		int end = 0;
		char[] cArr = s.toCharArray();
		for(int i=0;i<s.length();i+=2*k) { //O[N]
			start = i;
			end = Math.min(s.length()-1, i+k-1);
			while(start<end) {
				char temp = cArr[start];
				cArr[start] = cArr[end];
				cArr[end] = temp;
				
				start++;
				end--;
			}
		}
		return new String(cArr);
	}
}

