package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

Psuedocode : 
1. Get the input string array
2. declare an output integer array with the length of the input string array
2. Iterate through the each sentence of the string sentence array
3. Declare a counter variable called count and assign it to 0
4. For each sentence in the given array, apply split by a single space to get the individual words
5. find length of total words of the sentence at current index and add it with the counter variable
6. Add the total words of the sentence at current index to the output integer array
6. repeat the above steps 5 and 6 for all the sentences in the given string sentence array
7. sort the output array and return the last index value of the array
 */

public class MaximumWords {
	
	@Test
	public void test1() {
		
		String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int maxWords = 6;
		int actMaxWords = findMaxWords(input);
		Assert.assertEquals(maxWords, actMaxWords);
	}

	@Test
	public void test2() {
		
		String[] input = {"please wait", "continue to fight", "continue to win"};
		int maxWords = 3;
		int actMaxWords = findMaxWords(input);
		Assert.assertEquals(maxWords, actMaxWords);	
	}
	
	public int findMaxWords(String[] input) {
		int[] arr = new int[input.length];
		for(int i=0;i<input.length;i++) {
			int count=0;
			String[] wordsArr = input[i].split(" ");
				count = count + wordsArr.length;
				arr[i] = count;
			}
		Arrays.sort(arr);	
		return arr[arr.length-1];
		
	}
}
