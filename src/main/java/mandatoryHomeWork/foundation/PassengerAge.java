package mandatoryHomeWork.foundation;

import org.junit.Assert;

public class PassengerAge {
	
	/*
	 * Pseudocode :
	 * 1. iterate though the string array 
	 * 2. For each index, find the age value by using SubString(start index, end index)
	 * 3. convert the substring value
	 */
	public void test1( ) {
		
		String[] inputs = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		int output = getAgeOfPassengers(inputs);
		Assert.assertEquals(2,output);
		
	}

	private int getAgeOfPassengers(String[] inputs) {
		String str="";
		int age =0;
		int count =0;
		for(int i=0;i<inputs.length;i++) {
			str = inputs[i].substring(11, 13);
			age = Integer.parseInt(str);
			if(age>60) count ++;
		}
		
		return count;
	}

}
