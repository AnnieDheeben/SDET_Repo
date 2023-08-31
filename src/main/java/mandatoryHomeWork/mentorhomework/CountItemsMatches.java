package mandatoryHomeWork.mentorhomework;
/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 * Psuedocode : 
 * 1. Get the input items as String array and convert it into List<List<String>>
 * 2. Get the ruleKey and ruleValue
 * 3. declare a counter variable called 'count' and assign it to 0
 * 4. For each item in the itemsList, get the corresponding index ruleValue for the provided ruleKey
 * 5. check whether the ruleKey of the current index item matches with the provided rulekey
 * 6. if both are same, increment the count value by1
 * 7. return the final count value
 * 
 * Time complexity : O[N]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CountItemsMatches {
	@Test
	public void test1() {
			String[][] items = {
								{"phone","blue","pixel"},
								{"computer","silver","lenovo"},
								{"phone","gold","iphone"}};
			
			List<List<String>> itemsList = new ArrayList<>();
			itemsList.add(Arrays.asList("phone","blue","pixel"));
			itemsList.add(Arrays.asList("computer","silver","lenovo"));
			itemsList.add(Arrays.asList("phone","gold","iphone"));
			
			String ruleKey = "color";
			String ruleValue = "silver";
			
			int expCount = 1;
			int actCount = countMatches(itemsList,ruleKey,ruleValue);
			Assert.assertEquals(expCount, actCount);		
}
	@Test
	public void test2() {
			String[][] items = {
								{"phone","blue","pixel"},
								{"computer","silver","lenovo"},
								{"phone","gold","iphone"}};
			
			List<List<String>> itemsList = new ArrayList<>();
			itemsList.add(Arrays.asList("phone","blue","pixel"));
			itemsList.add(Arrays.asList("computer","silver","lenovo"));
			itemsList.add(Arrays.asList("phone","gold","iphone"));
			
			String ruleKey = "type";
			String ruleValue = "phone";
			
			int expCount = 2;
			int actCount = countMatches(itemsList,ruleKey,ruleValue);
			Assert.assertEquals(expCount, actCount);		
}

	private int countMatches(List<List<String>> itemsList, String ruleKey, String ruleValue) {
	
		int count = 0;
		for(int i=0;i<itemsList.size();i++) { //O[N]
			if(ruleKey.equals("type") && itemsList.get(i).get(0).equals(ruleValue)) count++;
			if(ruleKey.equals("color") && itemsList.get(i).get(1).equals(ruleValue)) count++;
			if(ruleKey.equals("name") && itemsList.get(i).get(2).equals(ruleValue)) count++;
			}
			
		return count;
		
		}
}
