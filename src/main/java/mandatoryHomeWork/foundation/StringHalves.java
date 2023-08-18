package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class StringHalves {
/*
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 * 
 * 
 * *split the string into two ( int strLen = s.length()/2)
 * String a = s.Substring(0,strLen) //bo
 * String b = s.Substring(strLen) //ok //staring from 2
 *String vowels=s.ReplaceAll(["^a-zA-Z0-9", ""]) ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')//aeiouAEIOU
 *
 *
 *
 * 
 * 
 */
	
	@Test
	public void test1() {
		String s = "book";
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		boolean output = findStringAlike(s,vowels);
		Assert.assertEquals(true, output);
	}
	
	public void test2() {
		String s = "test";
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		boolean output = findStringAlike(s,vowels);
		Assert.assertEquals(false, output);
	}
	
public boolean findStringAlike(String s,char[] vowels) {
	
	int strLen = s.length()/2;
	char[] a = s.substring(0,strLen).toCharArray();
	char[] b = s.substring(strLen).toCharArray();
	//String vowels1=vowels.replaceAll("[^a-zA-Z0-9]", ""); //aeiouAEIOU
	int count = 0,count1 = 0;
	
	
	for(int i=0;i<a.length;i++) {
		//count=0;
		for(int j=0;j<vowels.length;j++) {
		if(a[i]==vowels[j])
			count++;
		}
	}
	
	for(int i=0;i<b.length;i++) {
		//count1=0;
		for(int j=0;j<vowels.length;j++) {
		if(b[i]==vowels[j])
			count1++;
		}
	}
	return (count==count1);
	}
	
}
