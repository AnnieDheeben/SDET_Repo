package DSA.CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllAnagram {

@Test
public void test1() {
	String s = "cbaebabacd";
	String p = "abc";
	List<Integer> outputList = new ArrayList<>();
	outputList.add(0);
	outputList.add(6);
	List<Integer> result = findAllAnagram(s,p);
	Assert.assertEquals(outputList, result);
}

private List<Integer> findAllAnagram(String s, String p) {
	List<Integer> result = new ArrayList<>();
	int pointer = 0;
	int winSize = p.length();
	int[] pArr = new int[26];
	int[] sArr = new int[26];
	for(char c : p.toCharArray()) {
		pArr[c-'a']++;
	}
	
		while(pointer<winSize) {
			char c = s.charAt(pointer);
			sArr[c-'a']++;
			pointer++;
		}
		if(isCheck(pArr,sArr)) {
			result.add(pointer-winSize);
		}
		while(pointer<s.length()) { //4
			sArr[s.charAt(pointer-winSize)-'a']--;
			sArr[s.charAt(pointer++)-'a']++;
			if(isCheck(pArr,sArr)) {
				result.add(pointer-winSize);
			}
			//pointer++;
		}
		
	return result;
}

private boolean isCheck(int[] pArr, int[] sArr) {
	return Arrays.equals(pArr, sArr);
}
}
