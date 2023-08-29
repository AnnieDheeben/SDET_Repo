package mandatoryHomeWork.mentorhomework;
/*
 * You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:

The first ten characters consist of the phone number of passengers.
The next character denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old.

 
 
 Example 1:

Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
Output: 2
Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
Example 2:

Input: details = ["1313579440F2036","2921522980M5644"]
Output: 0
Explanation: None of the passengers are older than 60.

Psuedocode:
1. Get the input array
2. Initialize an integer variable called count and increment it by 1
3. Iterate through each string in the array
4. For each string, get the substring value of from index 12 to index 13
5. check whether the above extracted value is greater than 60
6. If it is greater than 60, increment the count by 1
7. Return the count value
 */

import org.junit.Assert;
import org.junit.Test;



public class PasssengerAge {
	
	@Test
	public void test1() {
		
		String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		int expOuput = 2;
		int actOutput = countSeniors(details);
		Assert.assertEquals(expOuput, actOutput);
	}
	
	@Test
	public void test2() {
		
		String[] details = {"1313579440F2036","2921522980M5644"};
		int expOuput = 0;
		int actOutput = countSeniors(details);
		Assert.assertEquals(expOuput, actOutput);
	}
	
	
	
	public int countSeniors(String[] details) {
		int count = 0;
		for(int i=0;i<details.length;i++) {
			String age = details[i].substring(11, 13);
			int paggengerAge = Integer.parseInt(age);
			if(paggengerAge > 60) {
				count = count+1;
			}
		}
		return count;
	}

}
