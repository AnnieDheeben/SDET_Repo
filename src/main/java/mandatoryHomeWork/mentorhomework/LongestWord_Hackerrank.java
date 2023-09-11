package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Question 2
Consider a string, sentence, of words separated by spaces where each word is a substring consisting of English alphabetic letters only. 
Find the first word in the sentence that has a length which is both an even number and greater than or equal to the length of any other word of even length in the sentence. 
If there are multiple words meeting the criteria, return the one which occurs first in the sentence.
Example
sentence = "Time to write great code"

The lengths of the words are 4, 2, 5, 5, 4, in order. 
The longest even length words are Time and code. The one that occurs first is Time, the answer to return
 */

public class LongestWord_Hackerrank {
	
	@Test
	public void test1() {
		String sentence = "Time to write great code";
		String longWord = "Time";
		String actLongWord = findMaxLengthWord(sentence);
		Assert.assertEquals(longWord, actLongWord);
	}

	@Test
	public void test2() {
		String sentence = "Great Time";
		String longWord = "Time";
		String actLongWord = findMaxLengthWord(sentence);
		Assert.assertEquals(longWord, actLongWord);
	}
	
	private String findMaxLengthWord(String sentence) {
		
		String maxWord = "";
		String[] sArr = sentence.split(" ");
		for(int i=0;i<sArr.length;i++) 
		{
			int len = sArr[i].length();
			if((len%2) == 0){
				if(maxWord.length() < sArr[i].length()) maxWord = sArr[i];
			}
		}
		
		return maxWord;
	}
	

}
