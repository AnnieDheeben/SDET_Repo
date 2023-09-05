package mandatoryHomeWork.mentorhomework;
/*
 * Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Psuedocode : 

1. Get the binary string
2. Initialize and declare three Integer variables as count=0, prevCount=0,currCount-0
3. iterate through each character of the string
4. when the current index value and the previous index values are same, move to the next position by incrementing the currCount to 1 
5. If the above step returns false, set currCount value to prevCount and reset the currCount value to 1
5. For each iteration , check the prevCount and currCount values.When the prevCount value is greater than or equal to currCount value , increment the count by 1
6. return the count value
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class countBinarySubStrings {
	
	@Test
	public void test1() {
		String s = "00110011";
		int expOutput = 6;
		int actOutput = countBinarySubStrings(s);
		Assert.assertEquals(expOutput, actOutput);		
	}


private int countBinarySubStrings(String s) {
	
	int prevCount = 0;
	int currCount = 1;
	int count = 0;
	for(int i= 1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)){
			currCount++;
			}	
		else {
			prevCount = currCount;
			currCount = 1;
		}
		if(prevCount>=currCount) {
			count++;
		}
	}
	
	return count;	
}
	
}

