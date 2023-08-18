package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {

	/*
	 *You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 pseudocode:
 convert the string to an charArr (toCharArra) ('c','o','d','e','l','e','e','t')
 use nested for loop (i,j)
 (int i=0;i<indices.length;i++){
 (int j=i+1;i<indices.length;j++)
 {
 	if(indices[i]>indices[j]){
 	sorting logic(already existing)
 	Temp=x;x=y;y=temp; (0,1,2,3,4,5,6,7)
 	Char temp1=charArr[i];charArr[i]=charArr[j];charArr[j]=temp1}
 
*/
	@Test
	public void test1() {
		int[] indices ={4,5,6,7,0,2,1,3};
		String s = "codeleet";
		String output = restoreString(s, indices);
		Assert.assertEquals("leetcode", output);
	}
	
	public String restoreString(String s1, int[] indices) {
		
		char[] s2 = s1.toCharArray();
		int temp=0;
		char temp1;
		
		
		for (int i=0;i<indices.length;i++) {
			for(int j=i+1;j<indices.length;j++) {
				if(indices[i]>indices[j]) {
					temp=indices[i];
					indices[i]=indices[j];
					indices[j]=temp;
					
					temp1=s2[i];
					s2[i]=s2[j];
					s2[j]=temp1;
				}
			}
			
		}
		String s5="";
		for(int k=0;k<indices.length;k++) {
			s5=s5+s2[k];
		}
		
		 return s5;
		
	}
}
