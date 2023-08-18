package mandatoryHomeWork.mentorhomework;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

prices = [7,1,5,3,6,4]


Psuedocode : 

1. Get the input array
2. initialize max profit = 0, profit = 0 and x = Integer.MaxValue;
3. Iterate through the array and check if x is greater than maxprofit
4. if yes,arr[i] = x
5.  profit = arr[i] -x;
6. check if profit > maxprofit
7. if yes, return profit = maxprofit.
 */

import org.testng.annotations.Test;

import junit.framework.Assert;

public class BuyandSellStock {

	@Test
	public void test1() {
		int[] prices = {7,1,5,3,6,4};
		int output = 5;
		int actOutput = findMaxProfit(prices);
		Assert.assertEquals(output, actOutput);
		
	}

	public int findMaxProfit(int[] prices) {
		
		int maxprofit = 0, profit = 0, x = Integer.MAX_VALUE;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i]<x) {
				x = prices[i];
			}
			
			profit = prices[i] - x;
			if(profit>maxprofit) {
				maxprofit = profit;
			}
		}
		return maxprofit;
	}
}
