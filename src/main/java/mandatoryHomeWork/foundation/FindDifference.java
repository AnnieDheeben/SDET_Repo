package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

public class FindDifference {
/*
 * You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

 

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
 */
@Test	
public void test1() {
	String s = "abcd";
	String t = "abcde";
	char output = findDifference(s,t);
	Assert.assertEquals('e', output);
}
@Test
public void test2() {
	String s = "abcd";
	String t = "abcde";
	//char output = findDifference(s,t);
	char output = findTheDifference(s, t);
	Assert.assertEquals('e', output);
}

public char findDifference(String s, String t) {
	char addedChar = 0;
	int sSum =0,tSum =0;
	for(int i=0;i<s.length();i++) {
		sSum = sSum + s.charAt(i);
		tSum = tSum + t.charAt(i);	
	}
	
	tSum = tSum + t.charAt(t.length()-1);
	addedChar = (char)(tSum-sSum);
	return addedChar;
}

public char findTheDifference(String s, String t) {
	
	int[] arr = new int[26];
	
	for(char ch: s.toCharArray()) {
		arr[ch-'a']++;
	}
	
	for(char ch : t.toCharArray()) {
		arr[ch-'a']--;
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == -1) {
			return (char) i;
		}
	}
	return ' ';

}

}
