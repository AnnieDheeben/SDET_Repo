package mandatoryHomeWork.mentorhomework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class LongestNicesSubString {
	@Test
	public void test1() {
		String s = "abcabcbb";
		int expOutput = 3;
		int actOutput = lengthOfLongestSubstring(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int lengthOfLongestSubstring(String s) {
		int max = 0;
		int l = 0;
		int r = 0;
		Set<Character> cSet = new HashSet<>();
		while(r<s.length()) {
			char ch = s.charAt(r);
			if(!cSet.contains(ch)) {
				cSet.add(ch);
				max = Math.max(max, r-l+1);
				r++;
			}
			else {
					char ch1 = s.charAt(l);
					cSet.remove(ch1);
					l++;
				}
			}
			
		return max;
	}

}
