package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.
 */

public class SecondLargeDigit {

	@Test
	public void test1() {
		String s = "dfa12321afd";
		int output = secondHighest(s);
		Assert.assertEquals(2, output);
	}
	
	public int secondHighest(String s1) {
		
        String s2 = s1.replaceAll("[^0-9]",""); //12321
        int strlen = s2.length();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<strlen;i++) {
        		if(s2.charAt(i)-'0' > max) {
        			max=s2.charAt(i)-'0';       			
        		}
        	}
        int sMax = Integer.MIN_VALUE;
        for(int i=0;i<strlen;i++) {
        	if((s2.charAt(i) - '0'> sMax) && (s2.charAt(i) - '0'!=max)) {
        		sMax = s2.charAt(i) - '0';
        	}
        }
        if(sMax == Integer.MIN_VALUE)
        {
            return -1;
        }
        return sMax;
        }
    }


