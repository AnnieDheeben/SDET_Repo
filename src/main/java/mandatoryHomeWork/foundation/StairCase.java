package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class StairCase {
	@Test
    public void test2(){

        int n = 2;
        int output =2;
        int actual =getWays(n);
        Assert.assertEquals(actual, output);

    }

    public int getWays(int n){

        if(n < 2){
            return 1;
        }
        return getWays(n-1)+getWays(n-2);
    }

}
