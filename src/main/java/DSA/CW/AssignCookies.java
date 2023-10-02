package DSA.CW;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input children array and cookies array
 * 2. Initialize one pointer on the children array and one pointer on the cookies array as 0
 * 3. sort the given array g and s
 * 4. start a while loop and iterate till the pointer reaches all the elements in the given arrays
 * 5. check if the current s[pointer] value is greater than or equal to the current g[pointer] value
 * 		if yes, assign max number as cureent count, move p1 and p2 to next position
 * 		if no, move to the next g pointer
 * 
 * 
 */

public class AssignCookies {
	/*@Test
	public void test1() {
		int[] g= {1,2,3};
		int[] s= {1,1};
		int output = 1;
		int actOutput = findContentChildren(g,s);
		Assert.assertEquals(output, actOutput);
	}*/

	@Test
	public void test2() {
		int[] g= {1, 2, 3, 4, 5};
		int[] s= {1, 2, 5};
		int output = 3;
		int actOutput = findContentChildren(g,s);
		Assert.assertEquals(output, actOutput);
	}
	private int findContentChildren(int[] g, int[] s) {
	
		int g1=0,s1=0;
		int count = 0;
		Arrays.sort(s);
		Arrays.sort(g);
		while(g1<g.length && s1<s.length) {
			if(s[s1]>=g[g1]) {
				count++;
				g1++;
				s1++;
				
			}
			else {
				s1++;
			}
		}
		return count;
	}

}
