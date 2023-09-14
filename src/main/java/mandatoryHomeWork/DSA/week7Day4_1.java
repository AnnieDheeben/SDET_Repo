package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * ou are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.

 

Example 1:

Input: words = ["cd","ac","dc","ca","zz"]
Output: 2
Explanation: In this example, we can form 2 pair of strings in the following way:
- We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
- We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
It can be proven that 2 is the maximum number of pairs that can be formed.
Psuedocode : 
1. Get the input String array
2. Iterate through each string and do reverse of the current string
	a. If the reversed string matches with any of the other strings in array,increase the count by 1
3. Repeat the above step for all the strings in the given array and return the final count

Time complextity - o[N2]
 */
public class week7Day4_1 {
	
@Test
public void test1() {
	String[] words = {"cd","ac","dc","ca","zz"};
	int expOutput = 2;
	int actOutput = findMaxPairs(words);
	Assert.assertEquals(expOutput, actOutput);
}

private int findMaxPairs(String[] words) {

	int count = 0;
	for(int i=0;i<words.length;i++) {
		String s = words[i];
		String rev = findRev(s);
		for(int j=i+1;j<words.length;j++) {
			if(rev.equals(words[j])) count++;
		}
		}
	return count;
	}

private String findRev(String s) {
	String rev = "";
	 for(int j=s.length()-1;j>=0;j--) {
		 rev = rev + s.charAt(j);
}
	return rev;
}

}
