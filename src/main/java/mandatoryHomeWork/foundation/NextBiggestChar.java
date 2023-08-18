package mandatoryHomeWork.foundation;

import org.junit.Test;

public class NextBiggestChar {
	
	/*
	 * 1. Given a sorted character array and a target character, 
find the next biggest character in the array. 

Example:
char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
Output -> h

	 */

	
	/* Psuedocode :
	 * Get the inputs (Array and the Char)
	 * iterate the char arr [] through the loop starting from 0
	 * 	check whether the ith element of an array is greater than the given char
	 *  if yes, then print the value of the array
	 * 
	 */

@Test
public void test1()
{
	char[] inputArray = new char[] {'b','d','h'};
	char inputVal = 'e';
	char outputVal = findNextBigChar(inputArray,inputVal);
	System.out.println("Test1 : :"+outputVal );
	
}

@Test
public void test2()
{
	char[] inputArray = new char[] {'b','d','h'};
	char inputVal = 'i';
	char outputVal = findNextBigChar(inputArray,inputVal);
	System.out.println("Test2 : :"+outputVal );
	
}

@Test
public void test3()
{
	char[] inputArray = new char[] {'b','d','h'};
	char inputVal = 'd';
	char outputVal = findNextBigChar(inputArray,inputVal);
	System.out.println("Test2 : :"+outputVal );
	
}

public char findNextBigChar(char arr[], char x ) {
	//char bigChar;
	char bigChar = x; //i
	for (int i=0;i<arr.length;i++) {
		char y = arr[i];
		if(Character.compare(y, bigChar)>0)
		 bigChar =y;
				
	}
	return bigChar;
}
}