package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {

	@Test
	public void test1(){
		int n = 121;
		boolean verifyPalindrome = checkPalindrome(n);
		Assert.assertEquals(true, verifyPalindrome);
	}
	
	@Test
	public void test2(){
		int n = -121;
		boolean verifyPalindrome = checkPalindrome(n);
		Assert.assertEquals(false, verifyPalindrome);
	}
	
	@Test
	public void test3(){
		int n = 12;
		boolean verifyPalindrome = checkPalindrome(n);
		Assert.assertEquals(false, verifyPalindrome);
	}
	
	@Test
	public void test4(){
		int n = 1;
		boolean verifyPalindrome = checkPalindrome(n);
		Assert.assertEquals(false, verifyPalindrome);
	}
	public boolean checkPalindrome(int n) {
		
		int num = n;
		int rev = 0;
		if (num<0) return false;		
		while(num!=0)
			{
				int temp = num%10;
				rev = rev *10 + temp;
				num = num/10;
			}
		return (rev==n);
		
	}
}
