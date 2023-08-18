package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class CheckString {
	
	/*
	 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

 

Example 1:

Input: s = "aaabbb"
Output: true
Explanation:
The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.
pseudocode

last index of 'a' should be equal to (first index of 'b')-1
	 */
	@Test
	public void test1() {
		String s ="aaabbb";
		boolean output = checkStringOccurrence(s);
		Assert.assertEquals(true,output);
	}

	public boolean checkStringOccurrence(String s) {
		
		if (s.length()!=1 && s.indexOf('b')!= -1 ) {
            return s.lastIndexOf('a')  == (s.indexOf('b')-1);
        }else{
            return true;
        }
        
	}
	
	

}
