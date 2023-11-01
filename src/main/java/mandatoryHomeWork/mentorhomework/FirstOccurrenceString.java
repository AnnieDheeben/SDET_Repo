package mandatoryHomeWork.mentorhomework;

import org.junit.Test;

import junit.framework.Assert;

public class FirstOccurrenceString {
@Test
public void test1() {
	String haystack="hello";
	String needle = "ll";
	int output = 0;
	int actOutput = strStr(haystack,needle);
	Assert.assertEquals(output, actOutput);
}

private int strStr(String haystack, String needle) {
	int l2 = needle.length();
    int l1 = haystack.length();
    int occurrence = -1;
    if(l2>l1) return -1;
    for(int i=0;i<l1-l2+1;i++){
            if(haystack.substring(i,i+l2).equals(needle)){
                occurrence = i;
                break;
            }
    }
    return occurrence;
}
}
