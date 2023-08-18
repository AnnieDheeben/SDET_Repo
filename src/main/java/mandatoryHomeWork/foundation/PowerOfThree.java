package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfThree {
	
	
	@Test
    public void test1(){
        int n = 27;
        boolean check = checkCube(n);
        Assert.assertEquals(true, check);


    }
	
	@Test
    public void test2(){
        int n = 30;
        boolean check = checkCube(n);
        Assert.assertEquals(false, check);


    }
    public boolean checkCube(int n){

        while (n%3 == 0){
            n = n/3;
        }
        return n==1;
    
    }
}

