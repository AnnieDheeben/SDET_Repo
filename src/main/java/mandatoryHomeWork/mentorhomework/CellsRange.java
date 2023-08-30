package mandatoryHomeWork.mentorhomework;
/*
 * Psuedocode : 
 * 1. Get the input String 'input' value[K1:L2]
 * 2. Assign the below values using the input String index
 *		a. startCol = input[0]
 *		b. endCol = input[3[
 *		c. startRow = input[1]
 *		d. endRow = input[4]
 * 3. Iterate using two for loops(i & j) with the above row and Col values as starting index and ending index
 * 4. for each iteration, concatenate the row and column values
 * 5. Add the concatenated value to the list
 * 6. Return the output list
 * 
 * Time complexity : 0(n*m)
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CellsRange {
	
	@Test
	public void test1() {
		String input = "K1:L2";
		List<String> output = new ArrayList<>(Arrays.asList("K1","K2","L1","L2"));
		List<String> actOutput = getCells(input);
		Assert.assertEquals(output, actOutput);
	}

	public List<String> getCells(String input) {
		
		List<String> cells = new ArrayList<>();
		char startCol = input.charAt(0);
		char endCol = input.charAt(3);
		int startRow = input.charAt(1) - '0';
		int endRow = input.charAt(4) - '0';
		
		for(char i=startCol;i<=endCol;i++) {
			for(int j=startRow;j<=endRow;j++) {
				String cell = i + Integer.toString(j);
				cells.add(cell);		
			}
		}
		
		return cells;
	}

}
