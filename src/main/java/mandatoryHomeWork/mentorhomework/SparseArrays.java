package mandatoryHomeWork.mentorhomework;
/*
 * Example : 
 * StringList = ['ab','ab','abc']
 * queries = ['ab','abc','bc']
 * result = [2,1,0]
 * 
 * Psuedocode : 
 * 1. Get the input String List and queries as ArrayList
 * 2. Declare an Integer array with size of the queries arraylist
 * 3. declare an integer variable called count 
 * 4. check each element in the querylist is available in the String List or not by iterating using for loop
 * 5. If available , increment the counter by 1.
 * 6. continue the above steps till reaching the last element of the String List 
 * 7. Add the counter value to the output array after completing each query search with the StringList
 * 8. return the outpur array 
 * */

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class SparseArrays {
	
	@Test
	public void test1() {
		
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("ab","ab","abc"));
		ArrayList<String> queries = new ArrayList<String>(Arrays.asList("ab","abc","bc"));
		int[] outputArr = {2,1,0};
		int[] expOutputArr = queryStringList(stringList,queries);
		Assert.assertArrayEquals(outputArr, expOutputArr);		
	}
	
	public void test2() {
		
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("aba","baba","aba","xzxb"));
		ArrayList<String> queries = new ArrayList<String>(Arrays.asList("aba","xzxb","ab"));
		int[] outputArr = {2,1,0};
		int[] expOutputArr = queryStringList(stringList,queries);
		Assert.assertArrayEquals(outputArr, expOutputArr);		
	}	
	

	private int[] queryStringList(ArrayList<String> stringList, ArrayList<String> queries) {
		
		int[] results = new int[queries.size()];
		int count;
		for(int i=0;i<queries.size();i++) {
			count=0;
			String query = queries.get(i);
			for(int j=0;j<stringList.size();j++) {
				String str = stringList.get(j);
				
				if(query.equals(str))
				{
					count+=1;
					
				}
			}
			results[i]=count;
		}
		
		return results;
	}

}
