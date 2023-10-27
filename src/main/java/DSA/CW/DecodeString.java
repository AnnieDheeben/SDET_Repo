package DSA.CW;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class DecodeString {
@Test
public void test1() {
	String s = "3[a]2[bc]";
	String expOutput = "aaabcbc";
	String actOutput = decodeString(s);
	Assert.assertEquals(expOutput, actOutput);
}

public String decodeString(String s) {
	Stack<Integer> intStack = new Stack<>();
	Stack<String> strStack = new Stack<>();
	
	return null;
}
}
