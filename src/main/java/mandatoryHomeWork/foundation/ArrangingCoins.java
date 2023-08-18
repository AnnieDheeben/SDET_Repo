package mandatoryHomeWork.foundation;

import org.junit.Test;

public class ArrangingCoins {
	
	/*
	 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

		Given the integer n, return the number of complete rows of the staircase you will build.
	 */
	
	/*Pseudocode
	 * get the number of coins
	 * iterate using for loop through the number of coins
	 * 	check whether the pending coins is greater than row value
	 * 		if yes, subtract the pending coins value with the row value
	 * 		Increment row counter
	 * 
	 */
	
	@Test
	public void test1() {
		int coins = 5;
		int completedRows = findCompletedRows(coins);
		System.out.println("completedRows of test1 :" +completedRows);
	}
	
	@Test
	public void test2() {
		int coins = 6;
		int completedRows = findCompletedRows(coins);
		System.out.println("completedRows of test2 :" +completedRows);
	}

	@Test
	public void test3() {
		int coins = 1;
		int completedRows = findCompletedRows(coins);
		System.out.println("completedRows of test3 :" +completedRows);
	}
	
	@Test
	public void test4() {
		int coins = 0;
		int completedRows = findCompletedRows(coins);
		System.out.println("completedRows of test4 :" +completedRows);
	}
	
	public int findCompletedRows(int n) {
		//n -5
		int row = 1;
			for(int i=row;i<n;i++) { //i=3;2<2; 
				if(n> row) //5>2
				n=n-row; //n =4-2 ; n= 2
				row++; //3
				
			}
		return n;
		
		
	}
	
}
