package mandatoryHomeWork.mentorhomework;
/*
 * A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

Psuedocode : 
 1. Get the input string
 2. assign a  char array of size 26
 3. Iterate through the given string with starting index as 0 till the end
 4. for each character, check whether it is between 'a' and 'z'
 5. if it is true, add that character to the char array 
 6. continue the above steps( 4 & 5) for all the characters in the given string
 7. iterate through each charcter, if index value remains 0, return false else return true
 8. return the output boolean value
 
 Time complexity = O[N]
 */

import org.junit.Test;

import junit.framework.Assert;

public class Panagram {
	
	@Test
	public void test1() {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean expOutput = true;
		boolean actOutput = isPanagram(sentence);
		Assert.assertEquals(expOutput, actOutput);
		
		
	}

	private boolean isPanagram(String sentence) {
	
		char[] arrCharacters = new char[26];
		for(int i=0;i<sentence.length();i++) { //O[N]
			if((sentence.charAt(i)>='a') && (sentence.charAt(i)<='z')){
				arrCharacters[sentence.charAt(i)-'a']= (char) (i+1);
			}
		}
		
		for(int i=0;i<arrCharacters.length;i++) { //O[1]
			if(arrCharacters[i]==0) return false;
		}
		return true;
	}

}
