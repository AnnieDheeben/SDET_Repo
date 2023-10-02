package DSA.CW;

import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramArray {
	@Test
	public void test1() {
		String s = "anagram anagram";
		String t = "nagaram nagaram";
		boolean expOutput = false;
		boolean actoutput = findStringAnagram(s);
		Assert.assertEquals(expOutput, actoutput);
	}

	private boolean findAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		int[] arr = new int[26];
		int p1=0;
		int p2=0;
		while(p1<s.length() && p2<t.length()) {
			int a = (int) s.charAt(p1)-'a';
			int b = (int) t.charAt(p2) -'a';
			arr[a]++;
			arr[b]--;
			p1++;
			p2++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) return false;
		}
		return true;
	}
	
	private boolean findStringAnagram(String s) {
		boolean[] arr = new boolean[26];
		
		for(char each : s.toCharArray()) {
			if(each!=' ') {
				arr[each-'a'] = true;
			}
		}
		
		for(boolean each : arr) {
			if(each!=true) {
				return false;
			}
		}
		return true;
	}
	
	private boolean findStringAnagramHashSet(String s) {
		HashSet<String> set = new HashSet<>();
		return set.add(s);
		
	}

}
