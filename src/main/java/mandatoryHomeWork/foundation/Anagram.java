package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Anagram {

	@Test
	public void test1() {
		String s = "aaaaaaa";
		String t = "nagaram";
		boolean output = true;
		boolean expOutput = findValidAnagram(s,t);
		Assert.assertEquals(expOutput, output);
	}

	public boolean findValidAnagram(String s, String t) {
		
		int count =0;
		int sLen = s.length();
		int tLen = t.length();
		int[] n = new int[26];
		if(sLen!=tLen) return false;
		for(int i=0;i<sLen;i++) {
			n[s.charAt(i)-'a']++;
		}
		for(int j=0;j<tLen;j++) {
			n[t.charAt(j)-'a']--;
		}
		
		for(int k=0;k<n.length;k++) {
			if(n[k]!=0) return false;
		}
		
		return true;
	}
}
