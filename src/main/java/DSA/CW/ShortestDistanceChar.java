package DSA.CW;

import org.junit.Test;
import org.testng.Assert;

/*
 * Psuedocode : 
 * 1. Get the input string and the character value
 * 2. Initiate an integer variable called n and assign string length to it
 * 3. declare one variable called position and assign -n to it
 * 4. Declare an Integer resultant array with the same length of string to store the minumum character distance value
 * 5. start a for loop and iterate though the array
 * 6. for each iteration, check whether the current index character is c or not
 * 7. if it is c, set position value to current index
 * 8. if it is not c, then set position value as current index - position
 * 9. Add the above position of each iteration to the resultant array
 * 10. repeat the above steps (4-7) from the end of the array
 * 11. while adding positions to the resultant array, compare the current index value with the previous
 * 		array value and add the minimum value
 * 12. return the output resultant array
 * 
 */
public class ShortestDistanceChar {
	@Test
	public void test1() {
		String s = "loveleetcode";
		char c = 'e';
		int[] output = {3,2,1,0,1,0,0,1,2,2,1,0};
		int[] actOutput = shortestToChar(s,c);
		Assert.assertEquals(output, actOutput);
	}

	private int[] shortestToChar(String s, char c) {
		int n= s.length();
		int pos = -n;
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			if(c==s.charAt(i)) {
				pos=i;
			}
			result[i]=Math.abs(i-pos);
		}
		for(int j=n-1;j>=0;j--) {
			if(c==s.charAt(j)) {
				pos=j;
			}
			result[j]=Math.min(result[j], Math.abs(j-pos));
		}
		return result;
	}

}
