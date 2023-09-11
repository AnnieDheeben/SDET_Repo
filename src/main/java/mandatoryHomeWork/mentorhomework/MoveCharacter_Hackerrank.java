package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

/*
 * A control device has 4 buttons that can be used to move a character around a screen in 4 directions: 
Up (U), Down (D), Left (L), and Right (R). 
The movement needs to be optimized by deleting unnecessary instructions
 while maintaining the same destination. Given the original set of instructions, 
 what is the maximum number of instructions that can be deleted and still have 
 the character reach the destination?

Note: The instructions that are deleted do not need to be contiguous.
 */
public class MoveCharacter_Hackerrank {
	
	@Test
	public void test1() {
		String s = "URDR";
		int maxDeletion = 2;
		int actMaxDeletion = findMaxDeletion(s);
		Assert.assertEquals(maxDeletion, actMaxDeletion);
	}

	private int findMaxDeletion(String s) {
		int len = s.length();
		int upDown = 0;
		int leftRight = 0;
		int count = 0, maxDelCount = 0;
		for(int i=0;i<len;i++) {
			char c = s.charAt(i);
			if(c=='U') upDown++;
			if(c=='D') upDown--;
			if(c=='R') leftRight++;
			if(c=='L') leftRight--;
			}
		count = upDown + leftRight;
		maxDelCount = len - count;
		return maxDelCount;
	}
	
	

}
