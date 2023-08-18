package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class BuyAndSellStock {
	
	@Test
	public void test1() {
		int[] prices = {7,1,5,3,6,};
		int output = 5;
		int expectedOutput = findMaxProfit(prices);
		Assert.assertEquals(expectedOutput, output);
		
	}

	public int findMaxProfit(int[] prices) {
		
		int maxprofit = 0, profit =0, x = Integer.MAX_VALUE;
		int arrLen = prices.length;
		for(int i=0;i<arrLen;i++) {
				if(prices[i]<x) {
					x = prices[i];
					
				}
				profit = prices[i] - x;
				if(profit<maxprofit) {
					profit = maxprofit;
			}
			
		}
		return maxprofit;
	}

}
