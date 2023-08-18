package mandatoryHomeWork;
/*
 * 	Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
 * Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
 
 * Pseudocode :
 * 1. Get the input date as String value
 * 2. Convert the above string into string array by using split function
 * 3. Check whether the given year is leap year or not with the below logic
 * 		a. check whether the year is multiple of 400(i.e, year modulo 400 should be zero)
 * 		b. check whether the year is multiple of 4 but not multiple of 100(year modulo 4 should be zero but year modulo 100 should not equal)
 * 4. initialize totalDays as an Integer variable and set it to 0
 * 5.initialize and Integer array which holds the total days count of all months within a year
 * 6. Iterate till the month given in the date and do the below validation
 * 		a. check whether the given year is leap year or not
 * 		b. if it is a leap year and the current array index is 1,
 * 				Add total days with the days value in the ith index + 1
 * 		c. else Add total days with the days value in the ith index
 * 7. Return total days + date
 */

import org.junit.Test;
import org.testng.Assert;

public class DayOfTheYear {

	/*@Test
	public void test1() {
		String date = "2019-01-09";
		int output = 9;
		int actOutput = findNoOfDays(date);
		Assert.assertEquals(actOutput, output);
	}*/
	
	@Test
	public void test2() {
		String date = "2019-02-10";
		int output = 41;
		int actOutput = findNoOfDays(date);
		Assert.assertEquals(actOutput, output);
				
	}

	public int findNoOfDays(String date) {
		int totDays = 0;
		String[] s = date.split("-");
		int year = Integer.parseInt(s[0]);
		int month = Integer.parseInt(s[1]);
		int dateofMonth = Integer.parseInt(s[2]);
		boolean isLeap = isLeapYear(year);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};		
			for(int i=0;i<month-1;i++) {
				if(isLeap && i==1) {
					totDays = totDays + days[i] + 1;
					continue;
				}
				
				totDays = totDays + days[i];
				
			}	
		return totDays + dateofMonth;
	}

	public boolean isLeapYear(int year) {
		
		if(year%400==0) return true;
		if(year%4==0 && year%100==0) return false;
		return false;
	}
	
	
}
