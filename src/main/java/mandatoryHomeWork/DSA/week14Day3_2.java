package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;
/*
 * 387. First Unique Character in a String
Psuedocode : 
1. Get the input string
2. add the frequency of each character in an array
3. iterate through te string again and decrease the frequency of the current character and see whether the frequency changes to 1.
4. if it is 1, return the index of the character
5. else continue with the remaining charactera
6. return -1, if no first unique occurrence found

Time complexity - O[N]
Space complexity - O[1]
 */
public class week14Day3_2 {
	@Test
	public void test1() {
		String s = "leetcode";
		int output = 0;
		int expOutput = firstUniqChar(s);
		Assert.assertEquals(expOutput, output);
	}
	@Test
	public void test2() {
		String s = "loveleetcode";
		int output = 2;
		int expOutput = firstUniqChar(s);
		Assert.assertEquals(expOutput, output);
	}
	@Test
	public void test3() {
		String s = "aabb";
		int output = -1;
		int expOutput = firstUniqChar(s);
		Assert.assertEquals(expOutput, output);
	}
	

	private int firstUniqChar(String s) {
		
		int[] cArr = new int[26];
		for(int i=0;i<s.length();i++) { //O[N]
			char c = s.charAt(i);
            cArr[c-'a']++;
		}
		for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(cArr[c-'a']==1) return i;
        }
        return -1;
	}

}
