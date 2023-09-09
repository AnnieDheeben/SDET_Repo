package mandatoryHomeWork.mentorhomework;

import junit.framework.Assert;

public class interviewQuestion {
	
	public void test1() {
		String input = "I Lov!@#$%e My Country";
		String expOutput = "I evo!@#$%L yM yrtnuoC";
		String actOutput = findPalindrome(input);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String findPalindrome(String input) {
		
		String[] str = input.split(" ");
 		for(int i=0;i<str.length;i++) {
			StringBuilder sb = new StringBuilder(str[i]);
			if(str[i].length()!=1)
			{
				
			}
		}
		return null;
	}

}
