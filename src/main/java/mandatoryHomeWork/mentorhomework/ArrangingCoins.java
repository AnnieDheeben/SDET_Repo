package mandatoryHomeWork.mentorhomework;
/*
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

 Psuedocode:
 1. Get the number of coins
 2. initialize integer variable as row and assign it to 1
 3. Iterate through for loop with starting index as row value and ending index as n with condition whether the current index is less than n or not
4. Inside the for loop,
	a. check if n>row
	b. if true , n=n-row;
	c. row++;
5. return the completed rows
 */

import org.junit.Test;
import org.testng.Assert;

public class ArrangingCoins {
	
	@Test
	public void test1() {
		int n=5;
		int completedRows = 2;
		int actOuput = findCompletedRows(n);
		Assert.assertEquals(actOuput, completedRows);
	}

	public int findCompletedRows(int n) {
		
		int row =1;
		for(int i=row;i<n;i++) {
			if(n>row) {
				n= n-row;
				row++;
			}
		}
		return row;
		
	}
}
