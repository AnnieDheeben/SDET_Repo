package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*Pseudocode :
 * 1. Get the input char array
 * 2. find the length of the input char array
 * 3. find the mid position with the derived length of the above step
 * 4. initialize char temp as 0
 * 5. Iterate through the for loop with starting position as 0 till the midpos with the below swapping logic applied
 * 	  for each iteration
 * 		a. assign a[i] value to temp 
 * 		b. assign a[len-1-i] value to a[i]
 * 		c. assign temp value to a[len-1-i]
 * 6. return the swapped array.
 * 	
 */

public class reverseArray {
	
	@Test
	public void test1() {
		
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		char[] expOutputArr = {'e','d','c','b','a'};
		char[] actOuputArr = findReverse(s);
		Assert.assertEquals(actOuputArr, expOutputArr);
	}
	
	@Test
	public void test2() {
		
		char[] s = {'a' };
		char[] expOutputArr = {'a'};
		char[] actOuputArr = findReverse(s);
		Assert.assertEquals(actOuputArr, expOutputArr);
	}
	
	@Test
	public void test3() {
			
			char[] s = {};
			char[] expOutputArr = {};
			char[] actOuputArr = findReverse(s);
			Assert.assertEquals(actOuputArr, expOutputArr);
	}


	public char[] findReverse(char[] s) {
	
		int len = s.length;
		int midPos = len/2;
		//char[] newArr = null;
		if(len<=1)  return s;
		for(int i=0;i<midPos;i++) {
			char temp = s[i];
			s[i] = s[len-1-i];		
			s[len-1-i] = temp;
			}
		return s;
		}	
	}

