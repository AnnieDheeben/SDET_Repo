package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelColumnTitle {
	
	/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27  ->26 *[(charAt(i)-'A') + 1
AB -> 28 
...


Psuedocode :
1. Get the Integer column number
2.Check whether the given number is greater than 0,
	a. If true, find the  26 modulo of the given number (for every 26 , the columnTitle length varies) 
	b. to convert the above modulo result to integer , add 'A' to it and type cast the converted value to char 
	c. add colTitle (initialized as empty sting) to the result of the above step to get the rightmost value of the colTitle
	d. divide the col number by 26 to get the new column number
	e. repeat the above steps till the column number becomes 0
	
	 * 
	 */
	@Test
	public void test1() {
		int colNum = 28;
		String ColTitle = "AB";
		String output = findColTitle(colNum);
		Assert.assertEquals(ColTitle, output);
		
		
	}
	
	@Test
	public void test2() {
		int colNum = 1;
		String ColTitle = "A";
		String output = findColTitle(colNum);
		Assert.assertEquals(ColTitle, output);
		
		
	}


	public String findColTitle(int colNum) {
		
		int columnTitle = 0;
		String colTitle = "";
		while(colNum > 0) {
			colNum --;
			colTitle = (char) (colNum % 26 + 'A') + colTitle;
			colNum = colNum/26;
		}
		return colTitle;
	}

}
