package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

/*
 * Psuedocode : 
 * 1. Get the integer steps and string path value
 * 2. convert string into character Array to get the step up/step down value
 * 3. Initialize two integer variable startPos and endPos and assign it to 0
 * 4. Initialize one more integer variable called 'valleyCount' and assign it to 0
 * 5. Iterate through the for loop with the character Array
 * 		a. check whether the current index holds 'U' or 'D' (current Step = 'U')
 * 		b. if it is 'U' , increment the endPos to 1
 * 		c. if it is 'D', decrement the endPos to -1
 * 		d. for each iteration, check whether the startPos and endPos values are same AND the current step is U or not
 * 		E. if both the above conditions pass, increment the valleyCount by 1.
 * 
 * Time complexity - O[N]
 */
public class CountingValleys {
	
	@Test
	public void test1() {
		int steps = 8;
		String path = "UDDDUDUU";
		int expvalleyCount = 1;
		int actValleyCount = findValleyCount(steps, path);
		
	}
	
	@Test
	public void test2() {
		int steps = 8;
		String path = "DDUUUUDD";
		int expvalleyCount = 1;
		int actValleyCount = findValleyCount(steps, path);
		
	}
	
	@Test
	public void test3() {
		int steps = 8;
		String path = "DDUUUUDDDDUU";
		int expvalleyCount = 2;
		int actValleyCount = findValleyCount(steps, path);
		
	}
	

	public int findValleyCount(int steps, String path) {
		int valleyCount = 0;
		int startPos = 0, endPos = 0;
		char[] pathArr = path.toCharArray(); //0[N]
		for(int i=0;i<pathArr.length;i++) { //O[1]
			if(path.charAt(i)=='U') {
				endPos = endPos+1;
			}
			if(path.charAt(i)=='D') {
				endPos = endPos-1;
			}
			if(startPos==endPos && path.charAt(i)=='U') valleyCount = valleyCount + 1;
		}
		
		
		return valleyCount;
	}

}
