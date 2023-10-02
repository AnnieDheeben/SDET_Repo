package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * String input = "I Lov!@#$%e My Country"; 
String output = "I evo!@#$%L yM yrtnuoC";

Psuedocode : 
1. Get the input string
2. split it by a space
3. iterate through each string
4. make two pointers at first and the last
5. if both are alphabets, swap the positions and increment the left pointer by 1 and decrement the right by 1
6. if the right pointer value is not an alphabet, decrement the right pointer by 1
7. if the left pointer value is not an alphabet, increment the felft pointer by 1
8. continue the above steps till the left pointer is less than the right pointer
 */

public class zeptoQusetion_twoPointers {
	
	@Test
	public void test1() {
	String input = "I Lov!@#$%e My Country";
	String output = "I evo!@#$%L yM yrtnuoC";
	String expOutput = findReverse(input);
	Assert.assertEquals(output, expOutput);
	}

	private String findReverse(String input) {
		
		String[] sArr = input.split(" ");
		String[] output = new String[input.length()];
		int leftPointer, rightPointer;
		for(int i=0;i<sArr.length;i++) {
			String s = sArr[i];
			if(s.length()==1) {
				output[i] = s;
			}
			else {
			leftPointer = i; 
			rightPointer = s.length()-1;
			while(leftPointer < rightPointer) {
				char a = s.charAt(leftPointer);
				char b = s.charAt(rightPointer);
				if((Character.isAlphabetic(a)) && (Character.isAlphabetic(b))) {
					swap(leftPointer,rightPointer,s);
					leftPointer++;;
					rightPointer--;
				}
				
			}
		}	
	}
		return sArr.toString().join(" ");
	}

    private void swap(int leftPointer, int rightPointer,String s) {
    	
    	char a = s.charAt(leftPointer);
    	char b = s.charAt(rightPointer);
    	
    	char temp = a;
    	a = b;
    	b = temp;
    	
    }	
}
