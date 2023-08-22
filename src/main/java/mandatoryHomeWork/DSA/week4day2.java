package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

/*
 * 645. Set Mismatch
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Psuedocode :
1. Get the input array
2. convert the input array into arraylist (numsList)
3. create one more ArrayList as outputList
3. iterate through the arraylist(numsList) to find out the duplicate number
4. If duplicate element found, add the element to the outputList
5. remove the duplicate element from the numsList
7. In order to find out the missing number
	a. find the sum of inputArray range
	b. find the sum of elements in the final numsList (after removing the duplicates)
	c. Missing number is the diff b/w the above two value
8. Insert the missing number in the outputList
9. Convert the final outputList into Array and sort the same.

time complexity - o(N) * o(N)
 */
public class week4day2 {

	@Test
	public void test1() {
		Integer[] nums = {1,2,2,4};
		int[] output = {2,3};
		int[] actOutput = findMismatch(nums);
		Assert.assertEquals(actOutput, output);
			
		}
	
	@Test
	public void test2() {
		Integer[] nums = {1,1};
		int[] output = {1,2};
		int[] actOutput = findMismatch(nums);
		Assert.assertEquals(actOutput, output);
			
		}
	
	@Test
	public void test3() {
		Integer[] nums = {1,2,3,5,5};
		int[] output = {4,5};
		int[] actOutput = findMismatch(nums);
		Assert.assertEquals(actOutput, output);
			
		}

	public int[] findMismatch(Integer[] nums) {
		
		List<Integer> numsList = new ArrayList<>(Arrays.asList(nums));
		List<Integer> outputList = new ArrayList<>();
		int n = numsList.size(),x=0;
		int missingNumber = 0, sum =0, listSum = 0;
		
			for(int i=0;i<n-1;i++) { //o(n) * 0(n)
				for(int j=i+1;j<n;j++) {
					if(numsList.get(i).equals(numsList.get(j))) {
						outputList.add(numsList.get(i));
						//numsList.remove(i);
						x=i;
						break;
					}
							
				}
			}
			
			numsList.remove(x);
			
			for(int i=1;i<=n;i++) { //0(n)
				sum = sum + i;
			}
			
			for(int i=0;i<numsList.size();i++) {
				listSum = listSum + numsList.get(i); //o(n)
			}
			
			missingNumber = sum - listSum;
			outputList.add(missingNumber);
			
			int[] numsArr = new int[outputList.size()]; 
			for(int i=0;i<outputList.size();i++) { //o(n)
				numsArr[i]=outputList.get(i);
			}
			
			Arrays.sort(numsArr);

			return numsArr;
	}
}
