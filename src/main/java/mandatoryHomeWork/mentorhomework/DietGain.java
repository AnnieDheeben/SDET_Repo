package mandatoryHomeWork.mentorhomework;

import org.junit.Test;
import org.testng.Assert;

/*
 * 1. Understand the problem
Input - 
1. Input: 
calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
Output: 0
calories = [1,2,3,4,5], k = 5, lower = 12, upper = 15
Output: -1
calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
Output: 0
calories = [1], k = 1, lower = 3, upper = 3
Output: 1

constraints - 
2. Frame Test data (Have upto 5 TCs)
	a.positive
	b.negative
	c.edge
3. Do you know the solution?
4. Do you have any alternate approach?
5. Derive Psedocode in paper/Notepad

1. Get the input Calories array and K value
2. Iterate through the calories array till the end
	a. initiate a integer array with k's length
    b. Iterate from the current index of i till i+K
    c. sum up the values and mark it as total calories
    d. if total calories is less than lower, decrement the point by 1
    e. if total calries is higher than upper, increment the point by 1
 3. Return the total points 
	
 */

public class DietGain {
	
	@Test
	public void test1() {
		int[] calories = {1,2,3,4,5};
		int k = 1;
		int lower = 3;
		int upper = 3;
		int ouput = 0;
		int actOutput = findCaloriesPoint(calories,k,lower,upper);
		Assert.assertEquals(actOutput, ouput);
	}

	private int findCaloriesPoint(int[] calories, int k, int lower, int upper) {
		
		int totalPoints = 0;
		int totCalories = 0;
		int[] cArr = new int[k];
		for(int i=0;i<=calories.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				totCalories = 0;
				//cArr[j] = calories[i];
				totCalories = totCalories + calories[i];
			}
			if(totCalories<lower) {
				totalPoints--;
			}
			else if(totCalories>upper) {
				totalPoints++;
			}
			
		}
		
		
		return totalPoints;
	}

}
