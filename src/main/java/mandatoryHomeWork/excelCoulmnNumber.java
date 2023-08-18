package mandatoryHomeWork;

import org.junit.Test;
import org.testng.Assert;

/*
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Psuedocode :
1. Get the String ColumnTitle and find the length of the columntitle
2. Initialize colNumber to 0 (int value)
3. iterate through the for loop till the actual size of the columntitle
	a. Apply the below logic for every iteration
	b. colNumber =(char) (colNumber * 26) + (charAt(i) - 'A')) + 1;
4. return column number

 */
public class excelCoulmnNumber {

	@Test
	public void test1() {
		String columnTitle = "A";
		int columnNumber = 1;
		int actualColNum = findColNum(columnTitle);
		Assert.assertEquals(actualColNum, columnNumber);
		
		
	}
	
	@Test
	public void test2() {
		String columnTitle = "AA";
		int columnNumber = 27;
		int actualColNum = findColNum(columnTitle);
		Assert.assertEquals(actualColNum, columnNumber);
	}

	public int findColNum(String columnTitle) {
		int colNum = 0;
		for(int i =0; i<columnTitle.length();i++) {
			colNum = colNum * 26 + (columnTitle.charAt(i) - 'A') + 1;
		}
		return colNum;
	}
}
