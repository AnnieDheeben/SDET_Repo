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
		
		int count =0; //O(1)
		int sLen = s.length(); //O(1)
		int tLen = t.length(); //O(1)
		int[] n = new int[26]; //0(1)
		if(sLen!=tLen) return false; //O(1)
		for(int i=0;i<sLen;i++) {  //O(N)
			n[s.charAt(i)-'a']++; //O(1)
		}
		for(int j=0;j<tLen;j++) {  //O(N)
			n[t.charAt(j)-'a']--;  //O(1)
		}
		
		for(int k=0;k<n.length;k++) { //O(N)
			if(n[k]!=0) return false; //O(1)
		}
		
		return true; //O(1)
	}
}
