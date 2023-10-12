package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 
 */
public class week11_Day3_2 {
	@Test
	public void test1() {
		String rings = "B0B6G0R6R0R6G9";
		int output = 1;
		int actOutput = countPoints_UsingSet(rings);
		Assert.assertEquals(output, actOutput);
	}

	private int countPoints(String rings) {
		Map<Character, Set<Character>> map = new HashMap<>();
		int currentIndex = 0;
		while(currentIndex<rings.length()-1) { 
			char color = rings.charAt(currentIndex);
			char rod = rings.charAt(currentIndex+1);
			currentIndex+=2;
			InsertMap_way2(color,rod,map);
		}
		int totPoints = 0;
		for(Entry<Character, Set<Character>> entry : map.entrySet()) {
			Set<Character> value = entry.getValue();
			if(value.size()==3) {
				totPoints++;
			}
		}
		
		return totPoints;
	}

	private void InsertMap(char color,char rod,Map<Character, Set<Character>> map) {
				if(!map.containsKey(rod)) {
				Set<Character> set = new HashSet<>();
				set.add(color);
				map.put(rod, set);
			}
			else {
				Set<Character> existingSet = map.get(rod);
				existingSet.add(color);
				map.put(rod, existingSet);
			}
	}
	private void InsertMap_way2(char color,char rod,Map<Character, Set<Character>> map) {
		map.computeIfAbsent(rod,k -> new HashSet<>()).add(color);
	}

	private int countPoints_UsingSet(String rings) {
		
		int totPoints=0;
		Set<Integer> red = new HashSet<>();
		Set<Integer> blue = new HashSet<>();
		Set<Integer> green = new HashSet<>();
		for(int i=0;i<rings.length();i+=2) {
			if(rings.charAt(i)=='R') {
				red.add(rings.charAt(i+1)-'0');
			}
			if(rings.charAt(i)=='B') {
				blue.add(rings.charAt(i+1)-'0');
			}
			if(rings.charAt(i)=='G') {
				green.add(rings.charAt(i+1)-'0');
			}
		}
		
		for(int i=0;i<=9;i++) {
			if(red.contains(i) && green.contains(i) && blue.contains(i)) {
				totPoints++;
			}
		}
		return totPoints;
		
	}
}
