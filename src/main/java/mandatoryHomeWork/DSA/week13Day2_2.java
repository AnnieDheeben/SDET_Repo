package mandatoryHomeWork.DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 763. Partition Labels
Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
Psuedocode ; 
1. Initialize an empty list called result to store partition lengths.
2.Initialize an empty map called map to store the last occurrence index of characters.
3.For each character in the input string:
	Update map with the character's last occurrence index.
	Initialize two variables, start and end, to track the start and end indices of the current partition.
4.For each character in the input string:
5. Update end to be the maximum of its current value and the last occurrence index of the character.
6.If the current index is equal to end, it indicates the end of a partition:
7.Calculate the length of the partition (partition_length) as end - start + 1.
8. Add partition_length to the result list.
9.Update start to end + 1.
10,Return the result list, which contains partition lengths.

Time complexity - O[N]
Space complexity - O[N]
 */
import org.junit.Test;

import junit.framework.Assert;

public class week13Day2_2 {
@Test
public void test1() {
	String s = "ababcbacadefegdehijhklij";
	List<Integer> list = Arrays.asList(9,7,8);
	List<Integer> outputList = partitionLabels(s);
	Assert.assertEquals(list, outputList);
	
}

private List<Integer> partitionLabels(String s) {
	List<Integer> result = new ArrayList<>();
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), i);
		}
	
	int start = 0;
	int end = 0;
	for(int i=0;i<s.length();i++) {
		end = Math.max(end, map.get(s.charAt(i)));
		if(i==end) {
		result.add(end-start+1);
		start = end+1;
		}
	}	
	return result;
}
}
