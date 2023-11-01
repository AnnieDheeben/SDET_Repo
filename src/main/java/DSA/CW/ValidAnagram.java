package DSA.CW;

import org.junit.Test;

import junit.framework.Assert;

public class ValidAnagram {
	@Test
	public void test1() {
		String s= "rat";
		String t = "car";
		boolean output = false;
		boolean actOutput = isAnagram(s,t);
		Assert.assertEquals(output, actOutput);
	}

	private boolean isAnagram(String s, String t) {
		int[] cArr = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			cArr[c-'a']++;
		}
		for(int i=0;i<t.length();i++) {
			char c = t.charAt(i);
			cArr[c-'a']--;
		}
		for(int i=0;i<cArr.length;i++) {
			if(cArr[i]!=0) {
				return false;
			}
			
		}
		return true;
	}

}
