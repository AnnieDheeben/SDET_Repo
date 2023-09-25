package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2379. Minimum Recolors to Get K Consecutive Black Blocks
Psuedocode : 
1. Get the input string and k value
2. initiate two pointers variable start and end  with value 0 and a variable to keep track of the minumumNumber of operation
3. start a while loop to iterate till the end of the array
	1. for each window, check the current index character.
	2. if it is 'w', replace it with 'B'
	3. track the count of replace operation for each window and compare it with the minumnumNumber value
	4. return the final minumumNumber value
 */
public class week9Day1 {
	@Test
	public void test1() {
		String s = "WBBWWBBWBW";
		int k=7;
		int expOutput = 3;
		int actOutput = minimumRecolors(s,k);
		Assert.assertEquals(expOutput, actOutput);
	}
	@Test
	public void test2() {
		String s = "WBWBBBW";
		int k=2;
		int expOutput = 0;
		int actOutput = minimumRecolors(s,k);
		Assert.assertEquals(expOutput, actOutput);
	}
	

	private int minimumRecolors(String s, int k) {
		
		int pointer=0;
		int minimumNum = Integer.MAX_VALUE;
		int count = 0;
		
		while(pointer<k) {
			char c = s.charAt(pointer);
			if(c=='W') {
				count++;
			}
			pointer++;
		}
		
		minimumNum = Integer.min(minimumNum, count);
		
		while(pointer<s.length()) {
			char d = s.charAt(pointer-k);
			if(d=='W') 
			{
				count--;
				
			}
			char a = s.charAt(pointer);
			if(a=='W') {
				count++;
			}
				minimumNum = Integer.min(minimumNum, count);
				pointer++;
			}
			
		return minimumNum;
	}

}
