package DSA.CW;

import org.junit.Test;
import org.testng.Assert;

public class EachWordPalindrome {
	@Test
	public void test1() {
		String s = "this is a Test";
		boolean[] output = {false, false, true, true};
		boolean[] actOutput = validateWordPalindrome(s);
		Assert.assertEquals(output, actOutput);
	}

	private boolean[] validateWordPalindrome(String s) {
		
		String[] arr = s.split(" ");
		boolean[] res = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			String word = arr[i];
			if(!validatePalindrome(arr[i])) {
				res[i] = false;
			}
			else {
				res[i] = true;
			}
		}
		return res;
	}

	private boolean validatePalindrome(String s) { //this
		
		String word = s.toLowerCase();
		boolean flag = true;
		if(word.length()==1) {
			return true;
		}
		else {
		int center = word.length()/2;
		int l = center-1;
		int right=0;
		if(word.length()%2==0) {
			right = center;
		}
		else {
			right = center+1;
		}
		
		while(right<word.length()) {
			if(word.charAt(l)!=word.charAt(right)) flag= false;
			l--;
			right++;
		}
		return flag;
	}
	}

}
