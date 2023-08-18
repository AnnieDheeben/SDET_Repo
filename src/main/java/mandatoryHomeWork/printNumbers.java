package mandatoryHomeWork;
/*
 * print numbers from 0-99 without using numbers to iterate through the loop.
 * 
 * Psuedocode :
 * 1. intialize n as 0
 * 2. declare an integer array with size 100
 * 3. Use while loop and have the entry check whether N is greater than or equal to 0
 * 		a. if yes, apply the logic (char)(n + '0') - '0';
 * 		b.	store the above value in the int arr and increment n by 1
 * 		c. exit the above loop if N reaches 100
 * 4. Print the array values
 * 	
 */

import org.junit.Test;

public class printNumbers {
	@Test
	public void print1to99() {
		int n = 0;
		int num ;
		int[] arr = new int [100];
		while(n>=0) {
			 num= (char)(n +'0') - '0'; 
			arr[n] = num;
			n++;
			if(n==100) break;						
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
}
}

