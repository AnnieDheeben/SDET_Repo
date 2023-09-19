package mandatoryHomeWork.DSA;
/*
 * Psuedocode : 
 * 1. Get the given input string and the substring length value (k)
 * 2. check whether the length is less than k . if true, return 0
 * 3. Iterate through the string with starting index as 0 till the string length - k value
 * 4. get substring with the current index value (starting position as 1 and ending position as i+3)
 * 5. check whether the substring is a good string or not by checking all the characters are distinct or not
 * 6. if the substring is found to be a good substring then increment the counter by 1
 * 7. return the final counter value
 * 
 * Time complexity : O[N]
 * Space complexity : O[1] or constant
 * 
 */

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class week8Day1_2 {
	
	@Test
	public void test1() {
		String input = "xyzzaz";
		int output = 1;
		int actOutput = countGoodSubStrings(input);
		Assert.assertEquals(output, actOutput);
	}
	
	
	public int countGoodSubStrings(String s) {
		
		int k = 3;
		int count = 0;
		int len = s.length();
		
		if(len<k) return 0;
		
 		for(int i=0;i<=len-k;i++){ //0[N]
		if(IsDistinct(s.substring(i, i+k))) {
			count++;
		}
	}
 		return count;
	}


	private boolean IsDistinct(String substring) {
		
		Set<Character> charSet = new HashSet<Character>();
		for(char ch : substring.toCharArray()) {
			charSet.add(ch);
		}
		return charSet.size()==3;
	}
		
}


