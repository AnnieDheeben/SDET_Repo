package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class PanagramStrings {

	@Test
	public void test1() {
		String[] s = {"The quick brown fox jumps over the lazy dog","This is not a panagram"};
		String output = "10";
		List<String> strList = Arrays.asList(s);
		String actOutput = findPanagram(strList);
		Assert.assertEquals(actOutput, output);
				
		
	}

	private String findPanagram(List<String> strList) {
		
		String status = "";
		for(int i=0;i<strList.size();i++) {
			String s1 = strList.get(i);
			boolean result = isPanagram(s1);
			if(result) {
				status = status + '1';
			}else {
				status = status + '0';
			}
			
		}

		
		
		return status;
	}

	private boolean isPanagram(String s1) {
		
		boolean flag = true;
//		char[] cArr = new char[26];
		int[] cArr = new int[26];
		//char[] sArr = s1.toCharArray();
		if(s1.length()>=26) {
			for(int i=0;i<s1.length();i++) {	
				if((s1.charAt(i)>='a') && (s1.charAt(i)<='z')) {
					cArr[s1.charAt(i)-'a']++;
				}
			}
		}
		
		for(int i=0;i<26;i++) {
			if(cArr[i]==0) {
				flag = false;
			break;
			}
	
		}
		return flag;
	}
	
	
}
