package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a 0-indexed string num of length n consisting of digits.

Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

 

Example 1:

Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.

Psuedocode: 
1. get the input number string
2. if the input length is 1 , return false
3. if the input length is greater than 1, get the frequency of each digit
4. compare each digit frequency with the current iterator 'i'
5. if both are same, return true
6.else return false

Time complexity - O[N^2]

 */
public class week7Day4_2 {
	
	@Test
	public void test1() {
		String num = "1210";
		boolean output = true;
		boolean actOutput = digitCount(num);
		Assert.assertEquals(output, actOutput);
	}

	private boolean digitCount(String num) {
		
		boolean flag = true;
		if(num.length()<=1) return false;
		int count;
		for(int i=0;i<num.length();i++) { //O[N]
			count = 0;
			for(int j=0;j<num.length();j++) { //O[N^2]
				int x = (int)num.charAt(j)-'0';
				if(i==x) count++;
			}
			if(count!=(int)num.charAt(i) -'0') {
				flag = false;
			}
		}
		return flag;
	}
	

}
