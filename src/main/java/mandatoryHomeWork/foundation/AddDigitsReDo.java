package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

public class AddDigitsReDo {
	
	@Test
	public void test1() {
		int n=38;
		int output = 2;
		int expectedOutput = addDigits(n);
		Assert.assertEquals(2, expectedOutput);
	}
	
	public int addDigits(int n) {
		
		int num =n;
		if(num==0) return 0;
		else {
			while(num>9) {
				num = (num/10) + (num%10);		
			}
		
		}
		
		return num;
	}
}
