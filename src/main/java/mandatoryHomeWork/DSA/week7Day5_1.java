package mandatoryHomeWork.DSA;
/*
 * Given a string word to which you can insert letters "a", "b" or "c" anywhere and any number of times, return the minimum number of letters that must be inserted so that word becomes valid.

A string is called valid if it can be formed by concatenating the string "abc" several times.

 

Example 1:

Input: word = "b"
Output: 2
Explanation: Insert the letter "a" right before "b", and the letter "c" right next to "a" to obtain the valid string "abc".

Psuedocode : 
1. Get the input string
2.declare a counter variable
3. convert it into character Array and add it to a list
4. Iterate through the list to find the continuous occurrence of "abc", if available change value of the corresponding position to the some other common character
5. Iterate through the list to find the continuous occurrence of "ab" or "bc" or "ac", if available change value of the corresponding position to the some other common character and increment the counter by 1
6.Iterate through the list to find the occurrence of 'a' or'b' or 'c, if available change value of the corresponding position to the some other common character and increment the counter by 1
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class week7Day5_1 {
	
	@Test
	public void test1() {
		String word = "aaa";
		int expOutput = 6;
		int actOutput = addMinimum(word);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test2() {
		String word = "b";
		int expOutput = 2;
		int actOutput = addMinimum(word);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test3() {
		String word = "aaaa";
		int expOutput = 8;
		int actOutput = addMinimum(word);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int addMinimum(String word) {
		int count=0;
		List<Character> Wordlist=new ArrayList<Character>();
		for (Character c : word.toCharArray()) {
			Wordlist.add(c);
		}
		for (int k = 2; k < Wordlist.size(); k++) {
			if(Wordlist.get(k-2)=='a' && Wordlist.get(k-1)=='b' && Wordlist.get(k)=='c') {
				Wordlist.set(k-1,'z');
				Wordlist.set(k-2, 'z');
				Wordlist.set(k, 'z');
			}
		}
		
		for (int i = 1; i < Wordlist.size(); i++) {
			if(Wordlist.get(i-1)=='a' && Wordlist.get(i)=='b' || Wordlist.get(i-1)=='b' && Wordlist.get(i)=='c'
					|| Wordlist.get(i-1)=='a' && Wordlist.get(i)=='c') {
				Wordlist.set(i-1, 'z');
				Wordlist.set(i, 'z');
				count++;
			}
		}
		
		for (int j = 0; j < Wordlist.size(); j++) {
			if(Wordlist.get(j)=='a'|| Wordlist.get(j)=='b'|| Wordlist.get(j)=='c') {
				count+=2;
			}
		}
		//System.out.println(sum);
		return count;	
	}
}
