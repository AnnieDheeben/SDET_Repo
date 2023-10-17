package DSA.CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagrams {
	@Test
	public void test1() {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		 List<List<String>> expOutput = List.of(
		            List.of("bat"),
		            List.of("nat", "tan"),
		            List.of("ate", "eat", "tea")
		        );
		 List<List<String>> actOutput = groupAnagrams(strs);
		 Assert.assertEquals(expOutput, actOutput);
										
		}

	private List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] cArr = new char[26];
			for(char c : strs[i].toCharArray()) {
				cArr[c - 'a']++;
			}
			String s = String.valueOf(cArr);
			if(!map.containsKey(s)) {
				map.put(s, new ArrayList<>());
			}
			map.get(s).add(strs[i]);
		
			}
			return new ArrayList<>(map.values());
	}
	
	private List<List<String>> groupAnagram_way2(String[] strs){
		Map<String,List<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] ch = strs[i].toCharArray();
			Arrays.sort(ch);
			String str = String.valueOf(ch);
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<>());
			}
			else {
				map.get(str).add(strs[i]);
			}
		}
		return new ArrayList<>(map.values());
		}
}


