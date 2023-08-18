package mandatoryHomeWork;
/*
 * Hercy wants to save money for his firs car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

 

Example 1:

Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

Psuedocode :
1. Get the n value(nth day) 4
2. initialize two  varibles as x = 1 , amount = 0, monday = 1;
2. iterate throught the for loop to get the nth day total by applying the below logic.
	a. for(int i=1;i<=n;i++)
	b.	amount + = x;
	c.	x++
	d. check whether the i%7 == o
		if true, sent x + = 1, 
		current = monday
	r. return amount
		
			
 */

import org.junit.Test;

import junit.framework.Assert;

public class moneyCalculation {
	
	@Test
	public void test1() {
		int n=4;
		int output = 10;
		int actualOutput = findTotalAmount(n);
		Assert.assertEquals(output, actualOutput);
	}

	private int findTotalAmount(int n) {
		int monday = 1, amount = 1, bank =0;
		for(int i=0;i<=n;i++) {
			bank+=amount;
			amount++;
			if(i%7==0) {
				monday+=1;
				amount = monday;
			}
			
		}
		
		return bank;
	}

}
