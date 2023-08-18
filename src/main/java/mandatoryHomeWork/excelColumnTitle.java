package mandatoryHomeWork;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"

Psuedocode : 
1. Get the input column number
2. Use while loop and have the entry check if the number is equal to 0
3. If not, 
	a. decrement the columnNumber by 1 in order to get the expected value frmo step 2
	a. initialize columntitle as null string
	b. coulmntitle = (char) (columnNum%26 + 'A') + columntitle
	c. columntitle = columntitle/26
 4. Return ColumnTitle
 */
public class excelColumnTitle {
	
	@Test
	public void test1() {
		int columnNumber = 28;
		String output = "AB";
		String actualOutput = findCoulmntitle(columnNumber);
		Assert.assertEquals(output, actualOutput);
		
	}
	
	@Test
	public void test2() {
		int columnNumber = 701;
		String output = "ZY";
		String actualOutput = findCoulmntitle(columnNumber);
		Assert.assertEquals(output, actualOutput);
		
	}

	public String findCoulmntitle(int columnNumber) {
		String colTitle = "";
			while(columnNumber > 0) {
				columnNumber --;
				colTitle = (char)(columnNumber % 26 + 'A') + colTitle;
				columnNumber = columnNumber/26;
				
		}
		return colTitle;
	}

}
