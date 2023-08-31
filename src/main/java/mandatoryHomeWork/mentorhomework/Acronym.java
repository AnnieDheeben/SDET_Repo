package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode :
 *1. Get the input array of strings(words) and string value(s)
 *2. Iterate through the array and capture fist letter of each word
 *3. store the captured first letter of each word in a String variable called 's1'
 *4. compare the capturedFirstLetter(s1) with the given string value
 *5. if both equals, then return true
 *
 *Time complexity - O[N]
 */
public class Acronym {
	
	@Test
	public void test1() {
		String[] words = {"alice","bob","charlie"};
		String s = "abc";
		boolean expoutput = true;
		boolean actOutput = findAcronym(words,s);
		Assert.assertEquals(expoutput, actOutput);
				
		}

	public boolean findAcronym(String[] words, String s) {
		
		String s1 ="";
		int x=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>0)
			s1 = s1 + words[i].charAt(x);
		}	
		return s1.equals(s);
	}
		
	}


