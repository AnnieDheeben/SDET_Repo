package mandatoryHomeWork.mentorhomework;

import org.junit.Assert;
import org.junit.Test;

/*Psuedocode : 
1. Get the input striong array
2. declare two pointers l and r
3. Assign l to 0 and r to array's length-1
4. start a while loop to iterate till l is less than r
5. for each iteration,
	a.swap the value of l and r
	b. decrement r and increment l
6. return the reversed array


*/
public class ReverseString {
	@Test
	public void test1() {
		char[] s = {'h','e','l','l','o'};
		char[] expOutput = {'o','l','l','e','h'};
		char[] actOutput = findReverse(s);
		Assert.assertArrayEquals(expOutput, actOutput);
	}

	private char[] findReverse(char[] s) {
		int l=0,r=s.length-1;
		while(l<r) {
			swap(l,r,s);
			l++;
			r--;
		}
		return s;
	}

	private void swap(int c1, int c2, char[] s) {
		char temp=s[c1];
		s[c1]=s[c2];
		s[c2]=temp;
		System.out.println();
	}

}
