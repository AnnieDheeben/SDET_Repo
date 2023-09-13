package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

/*
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO. 


Pseudocode : 

1. Get the input String
2. get the count of each character in the string
3. if all the characters count are same, return 'YES'
4. if (n-1) characters are with same count, but one holds one value higher than the remaining all, them also return YES
5. if more than 1 characters hold different count, then return 'NO'
 */

public class SherlockString_Hackerrank {
	@Test
	public void test1() {
		String s = "abc";
		String expOutput = "YES";
		String actOutput = isValidString(s);
		Assert.assertEquals(expOutput, actOutput);
	}
	@Test
	public void test2() {
		String s = "abcc";
		String expOutput = "YES";
		String actOutput = isValidString(s);
		Assert.assertEquals(expOutput, actOutput);
	}
	@Test
	public void test3() {
		String s = "abccc";
		String expOutput = "NO";
		String actOutput = isValidString(s);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	private String isValidString(String s) {
		Map<Character, Integer> sMap = new HashMap<Character, Integer>();
		int index = 0;
		String result ="NO";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(sMap.containsKey(c)) sMap.put(c, sMap.get(c)+1);
			else sMap.put(c, 1);
		}
		
		int[] valArr = new int[sMap.size()];
		for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
			valArr[index] = entry.getValue();
			index++;
		}
		
		Arrays.sort(valArr);
		 int first=valArr[0]; 
		 int second=valArr[1];
		 int last=valArr[valArr.length-1]; 
		 int secondLast=valArr[valArr.length-2]; 
		 
		 if((first==last) || (first==1 && second==last)) result= "YES";
		 if(first==second && second==secondLast && secondLast==last-1) result = "YES";	  
		
		 return result;
		
	}	
}
