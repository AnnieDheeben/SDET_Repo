package mandatoryHomeWork.DSA;
/*
 * Psuedocode : 
 * 1. Initiate a map as cityMap
 * 2. declare two integer variable called originOccurrence and destOccurrence
 * 3. Iterate over the list of paths
 * 		a.get the origin value of the current element from the list
 * 		b.find the occurrence of origin element
 * 		c.add the element/update the occurrence of origin element in map
 * 		d. get the destination value of current element from the list
 * 		e. find the occurrence of destination element
 * 		f. add the element/ update the occurrence of destination element in map
 * 		g.Iterate over the path list again and find the occurrence of destination element in map
 * 		h, if it is 1, return the element to the list
 * 
 * Time complexity : 0[N]
 * Space complexity :0[N]
 * 		
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class week10Day1 {
	@Test
	public void test1() {
		List<List<String>>path = Arrays.asList(
				Arrays.asList("B","C"),
				Arrays.asList("D","B"),
				Arrays.asList("C","A"));
		String output = "A";
		String actOutput = destCity(path);
		System.out.println(actOutput);
		
	}

	private String destCity(List<List<String>> path) {
		
		Map<String, Integer> cityMap = new HashMap<>();
		int originOccurrence;
		int destOccurrence;
		String origin = "";
		String destination = "";
		for(List<String> each : path) { //O[N]
			origin = each.get(0);
			originOccurrence = cityMap.getOrDefault(origin, 0);
			cityMap.put(origin, originOccurrence+1);
			destination = each.get(1);
			destOccurrence = cityMap.getOrDefault(destination, 0);
			cityMap.put(destination, destOccurrence+1);
			
		}
		for(List<String> each : path) { 
			destination = each.get(1);
			destOccurrence = cityMap.getOrDefault(destination, 0);
			if(destOccurrence==1){
				return destination;
			}
		}
		return null;
	}
}
