package mandatoryHomeWork.DSA;
/*
 * Psuedocode : 
1.Start with a count of planted flowers at 0 and begin at the first plot in the flowerbed.
2.Check each plot to see if it's empty and if the adjacent plots to the left and right are also empty.
3.If all conditions are met, plant a flower in that plot and increase the count of planted flowers.
4.Continue this process for each plot in the flowerbed.
5.Finally, check if the count of planted flowers is greater than or equal to the desired number of flowers to plant (n).
6.If the count is sufficient, return true; otherwise, return false.
 */
import org.junit.Test;

import junit.framework.Assert;

public class week13Day3_1 {
@Test
public void test1() {
	int[] flowerbed = {1,0,0,0,1};
	int n=1;
	boolean expOutput = true;
	boolean actOutput = canPlaceFlowers(flowerbed, n);
	Assert.assertEquals(expOutput, actOutput);
}

private boolean canPlaceFlowers(int[] flowerbed, int n) {
	int total = 0;
    int i=0;
    while(i<flowerbed.length){
            if(flowerbed[i]==0){
                int next = (i==flowerbed.length-1)?0:flowerbed[i+1];
                int prev = (i==0)?0 : flowerbed[i-1];
                if(next==0 && prev==0){
                    flowerbed[i]=1;
                    total++;
                }
            }
            i+=1;
        }
    return total>=n;
}
}
