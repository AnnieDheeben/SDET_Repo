package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

@Test
public void Test1() {
	int[] digits = {9,8,7,6,5,4,3,2,1,0};
	int[] output = {9,8,7,6,5,4,3,2,1,1};
	int[] finalArr = findPlusOne(digits);
	Assert.assertEquals(output,finalArr);
	}

/*@Test
public void Tes2() {
	int[] digits = {9};
	int[] output = {1,0};
}*/


public int[] findPlusOne(int[] digits) {
	
	long res=0;
	int arr[] = new int[digits.length];
	for(int i=0;i<digits.length;i++) {
		res = res*10 + digits[i];
	}
	res++; //124
	
	String s1 = Long.toString(res);
	for(int i=0;i<s1.length();i++) {
		arr[i]=s1.charAt(i) - '0';
	}
	
	return arr;
	
}
}
