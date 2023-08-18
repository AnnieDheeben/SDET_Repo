package mandatoryHomeWork;

import org.junit.Test;
import org.testng.Assert;

/*
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true


Psuedocode : 
1. Get the input coordinates 
2. Apply the slope formula to find out whether the points are alinged in a straight line or not
3. In order to apply the above logic, find the x difference and y difference for the first two coordinates(i.e, (x2-x1) and (y2-y1)) and fix them
4. Iterate through the for loop with starting position as index 2 till the  coordinates length and find the current x difference and current y difference
	a. find current x diff and current y diff
	b. multiply x diff with the current y diff (xDiff * currYDiff) and y diff with current x diff(yDiff * currXDiff)
	c. check whether the above step results zero or nor
	d. if it is zero, then return true
	e. else return false



 */
public class StraightLine {
	
	@Test
	public void test1() {
		int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		boolean output = true;
		boolean expOutput = checkStraightLine(coordinates);
		Assert.assertEquals(output, expOutput);
	}

	public boolean checkStraightLine(int[][] coordinates) {
		
		int len = coordinates.length;
		int x1,y1,x2,y2;
		x1 = coordinates[0][0];
		y1 = coordinates[0][1];
		x2 = coordinates[1][0];
		y2 = coordinates[1][1];
		
		int dXdiff = x2-x1;
		int dYdiff = y2-y1;
		
		for(int i=2;i<len;i++) {
			
			int curr_xDiff = coordinates[i][0] - coordinates[i-1][0];
			int curr_yDiff = coordinates[i][1] - coordinates[i-1][1];
			
			// slope formula - > (x-x1)/(x2-x1) = (y-y1)/(y2-y1)
			
			if(dYdiff * curr_xDiff != dXdiff * curr_yDiff){
				return false;
			}
		}
			
		return true;
	}

}
