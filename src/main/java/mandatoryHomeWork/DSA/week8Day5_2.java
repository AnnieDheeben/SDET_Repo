package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2269. Find the K-Beauty of a Number
 * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

Note:

Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
Example 2:

Input: num = 430043, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043.
- "00" from "430043": 0 is not a divisor of 430043.
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
Therefore, the k-beauty is 2.

Psuedocode : 
1. Get the input number and the window size
2. convert the above number into string
3. assign a pointer variable at index 0
4. iterate through the input array till n-k to find out the substrings of num
5. return the final substring count
 */
public class week8Day5_2 {
	@Test
	public void test1() {
		int num = 430043;
		int k = 2;
		int output = 2;
		int actOutput = divisorSubstrings(num,k);
		Assert.assertEquals(output, actOutput);
	}

	private int divisorSubstrings(int num, int k) {
		
		String str = String.valueOf(num);
		int n= str.length();
		int count = 0;
		int start = 0;
		int end = start+k-1;
		
		while(end<str.length()) {
			int substr = Integer.parseInt(str.substring(start, end+1));
			if(substr!=0 && num%substr==0) {
				count++;
			}
			start = start+1;
			end = start+k-1;
		}
		
		return count;
	}

}
