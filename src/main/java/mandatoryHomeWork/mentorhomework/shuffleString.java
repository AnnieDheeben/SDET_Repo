package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Psuedocode : 
1. Get the input string and the indices array
2. Iterate through each character in a string
3. move the current index character of String to the position of current indices value
4. Continue the above step for all the characters of the input string
5. return the output string

Time complexity - O[N]
 */

public class shuffleString {

	@Test
	public void test1() {
		
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String expOutput = "leetcode";
		String actOutput = restoreString1(s,indices);
		Assert.assertEquals(actOutput, expOutput);
		
	}

	public String restoreString(String s, int[] indices) {
		
		//StringBuilder sb = new StringBuilder(s);
		String s2="";
		char[] newArr = new char[indices.length];
		for(int i=0;i<indices.length;i++) {
			newArr[indices[i]]=s.charAt(i);
			
		}
		
		return(s2=String.valueOf(newArr));
		
	}
	
	public static String restoreString1(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
	
	
}
