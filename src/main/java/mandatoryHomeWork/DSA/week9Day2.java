package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedocode : 
 * 1. Get the input arrays of player 1 and player2
 * 2. assign one pointer at 0th index
 * 3. Initiate two Integer variables sum1 and sum2 to keep track of the total sum of player1 and player2
 * 4. for Player1 array, start a while loop and iterate till the end of the array
 * 5. for each iteration, 
 * 		a. check for the current index position
 * 		b. If it is 1,check the previous element
 * 			1.If the previous element is 10, then calculate sum as sum + 2*current index value
 * 			2.If the previous element is not 10, then calculate sum as sum + current index value
 * 		c. If it is more than 1, check the previous two elements 
 * 			1.If anyone of the previous elements is 10, then calculate sum as sum + 2*current index value
 * 			2.if above condition is not true, then calculate sum as sum + current index value 	
 * 		d. if it is 0, then calculate sum as sum + index value
 * 6. Find the total sum of player 2 array with the same approach as above and assign it to sum2
 * 7. return 1, if sum1 is greater than sum2
 * 8. return2, is sum2 is greater than sum1
 * 9. return 0, is sum1 and sum2 are same
 * 
 * Time complexity - O[N]
 * Space complexity - O[1]
 */

public class week9Day2 {
@Test
public void test1() {
	int[] player1 = {10,2,2,3};
	int[] player2 = {3,8,4,5};
	int expOutput = 1;
	int actOutput = isWinner(player1, player2);
	Assert.assertEquals(expOutput, actOutput);
	}
@Test
public void test2() {
	int[] player1 = {4,10,7,9};
	int[] player2 = {6,5,2,3};
	int expOutput = 1;
	int actOutput = isWinner(player1, player2);
	Assert.assertEquals(expOutput, actOutput);
	}

private int isWinner(int[] player1, int[] player2) {
	
	int sum1=0, sum2=0;
	int output=0;
	
	sum1 = calculateSum(player1);
	sum2 = calculateSum(player2);
	
	if(sum1>sum2) return output=1;
	if(sum2>sum1) return output=2;
	if(sum1==sum2) return output=0;
	return output;
}

private int calculateSum(int[] player) {
	int pointer=0;
	int sum=0;
	while(pointer<player.length) {
		int a = player[pointer];
		if(pointer==1) {
			if(player[pointer-1]==10) {
				sum = sum+2*(player[pointer]);
			}
			else {	
				sum = sum+player[pointer];
			}
		}
		else if(pointer>1) {
			if(player[pointer-1]==10||player[pointer-2]==10) 
			{
				sum = sum+2*(player[pointer]);
			}
			else {
				sum = sum+player[pointer];
			}
		}
		else {
			sum = sum+player[pointer];
			}
		pointer++;
	}
	return sum;
			
	}
			
}

