package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the corrdinates and store it as a String value
 * 2. char ch = coordinates.charAt(o);
 * 3. int num = coordinates.charAt(1);
 * 4. int color = (ch - 'a') + 1 + num ;
 * 5. if color %2 = =0, then return false
 * 		else true
 * 6. return boolean
 * 		
 */
public class determineColor {
	
	@Test
	public void test1() {
		String coordinates = "a1";
		boolean output = false;
		boolean actOutput = findcolor(coordinates);
		Assert.assertEquals(output, actOutput);
	}

	public boolean findcolor(String coordinates) {
		char ch = coordinates.charAt(0);
		int num = (char)coordinates.charAt(1) - '0';
		int color = (ch - 'a') + 1 + num;
		if(color % 2 == 0) return false;
		else return true;
	}

}
