package mandatoryHomeWork.DSA;
/*
 * 1207. Unique Number of Occurrences
Psuedocode : 
1. Get the input array
2. Iterate through the given array
	a.add the occurrence in map
    b. Add the current index value to the set as well
3. Iterate through the map and add the value to thr another set
4. check of both the sizes of setA and setB are equal
5. If both are same, return true else return false

Time complexity - O[N]
Space complexity - O[N]
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class week15Day1_2 {
@Test
public void test1() {
	int[] arr = {1,2,2,1,1,3};
	boolean expOutput = true;
	boolean actOutput = uniqueOccurrences(arr);
	Assert.assertEquals(expOutput, actOutput);
}

private boolean uniqueOccurrences(int[] arr) {
	Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>();
    for(int i=0;i<arr.length;i++){ //O[N]
        int occurrence = map.getOrDefault(arr[i],0);
        map.put(arr[i], occurrence+1);
        setA.add(arr[i]);

    }
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        int value = entry.getValue();
        setB.add(value);
    }
    if(setA.size()==setB.size()) return true;
    else
    return false;
	}
}
