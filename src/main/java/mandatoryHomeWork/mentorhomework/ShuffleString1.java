package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input String and the indices array
 * 2. Declare a new character array with the given string length
 * 3. Iterate through for loop till end of the array
 * 		1. get the current index character of the string
 * 		2. add character to the new char array in the position of the current indices value 
 * 		3. convert the resultant character array to string
 * 4. return the output string
 * 
 * Time complexity - O[N]
 * space complexity - O[N]
 */

public class ShuffleString1 {
@Test
public void test1() {
	String s = "codeleet";
	int[] indices = {4,5,6,7,0,2,1,3};
	String output = "leetcode";
	String actOutput = restoreString(s, indices);
	Assert.assertEquals(output, actOutput);
}

private String restoreString(String s, int[] indices) {
	char[] cArr=new char[s.length()] ;
    for(int i=0;i<cArr.length;i++){ //O[N]
        cArr[indices[i]]=s.charAt(i);
    }
  return String.valueOf(cArr);
}
}
