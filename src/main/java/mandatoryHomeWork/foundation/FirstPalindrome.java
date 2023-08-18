package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;



public class FirstPalindrome {

	/*
	 * get the string array and split it by comma
	 * for(string a: stringarr) {
	 * revStr = revStr+stringarr(a);
	 * if(a.equalsOf(revStr) return a;
	 * break;
	 */
	
	@Test
	public void test1() {
		String[] words = {"abc","car","ada","racecar","cool"};
		String output = findFirstPalindrome(words);
		Assert.assertEquals("ada",output);
		
	}

	public String findFirstPalindrome(String[] words) {
		
		for(int i=0;i<words.length;i++) {
			String str = words[i];
			String rev="";
			
			for(int j=str.length()-1;j>=0;j--) {
				rev= rev + str.charAt(j);
			}
			
			if(str.equals(rev)) return str;
		}
		
		return "";
	}
}
