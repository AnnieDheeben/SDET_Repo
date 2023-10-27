package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 1768. Merge Strings Alternately
Psuedocode : 
1.Initialize two pointers, p1 and p2, to 0.
2.Create a StringBuilder called sb to build the combined string.
3.Start a loop while p1 is less than the length of word1 and p2 is less than the length of word2.
	a. Append the character at position p1 in word1 to sb.
	b. Append the character at position p2 in word2 to sb.
	c. Increment p1 by 1.
	d. Increment p2 by 1.
4.After exiting the loop, check if there are remaining characters in word1 by comparing p1 to the length of word1.
	a. If there are remaining characters in word1, add them one by one to the end of sb and increment p1 for each character.
5.Similarly, check if there are remaining characters in word2 by comparing p2 to the length of word2.
	a. If there are remaining characters in word2, add them one by one to the end of sb and increment p2 for each character.
6.Finally, convert the StringBuilder sb to a string using toString().
7.Return the resulting string.

Time complexity - O[N]
Space complexity - O[N]
 */
public class week13Day5_1 {
	@Test
	public void test1() {
		String word1 = "abc";
		String word2 = "pqr";
		String expOutput = "apbqcr";
		String actOutput = mergeAlternately(word1, word2);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String mergeAlternately(String word1, String word2) {
		
		int p1 = 0, p2=0;
        StringBuilder sb = new StringBuilder();
        while(p1<word1.length() && p2<word2.length()){
            sb.append(word1.charAt(p1)).append(word2.charAt(p2));
            p1++;
            p2++;
        }
        while(p1<word1.length()){
            sb.append(word1.charAt(p1));
            p1++;
        }
        while(p2<word2.length()){
            sb.append(word2.charAt(p2));
            p2++;
        }

        return sb.toString();
	}
}
