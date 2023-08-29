package mandatoryHomeWork.mentorhomework;
/*
 * There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Psuedocode : 
1. Declare two integer variable leftRight and upDown and assign both to 0
2. if the move is left, decrement the leftRight by 1
3. if the move is right, increment the lefRight by 1
4. if the move is up, increment the upDown by 1
5. if the move is down, decrement the upDown by 1
6. After all the moves, check whether the leftRighht and upDown are same
7. If both are same, return true, else false.

 */

import org.junit.Assert;
import org.junit.Test;


public class RobotReturn {
	
	@Test
	public void test1() {
		String moves = "RRDD";
		boolean expOutput = false;
		boolean actOutput = judgeCircle(moves);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test2() {
		String moves = "LL";
		boolean expOutput = false;
		boolean actOutput = judgeCircle(moves);
		Assert.assertEquals(expOutput, actOutput);
	}

	public boolean judgeCircle(String moves) {
		int upDown = 0, leftRight = 0;
		for(int i=0;i<moves.length();i++) {
			if(moves.charAt(i)=='U') upDown = upDown + 1;
			if(moves.charAt(i)=='D') upDown = upDown - 1;
			if(moves.charAt(i)=='R') leftRight = leftRight + 1;
			if(moves.charAt(i)=='L') leftRight = leftRight - 1;
		}
	
		if(upDown==leftRight) return true;
		else return false;
	}
}