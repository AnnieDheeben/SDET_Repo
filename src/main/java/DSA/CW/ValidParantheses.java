package DSA.CW;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class ValidParantheses {
	/*@Test
	public void test1() {
		String s = "()";
		boolean output = true;
		boolean actOutput = isValid(s);
		Assert.assertEquals(actOutput, output);
	}*/
	@Test
	public void test2() {
		String s = ")(){}(";
		boolean output = false;
		boolean actOutput = isValid(s);
		Assert.assertEquals(actOutput, output);
	}

	private boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] sArr = s.toCharArray();
		for(Character each : sArr) {
			if((each=='(') || (each=='[') || (each=='{')) {
				stack.push(each);	
			}
			else {
				if(stack.isEmpty()) return false;
				char first = stack.pop();
			 
				if((each== ')') && (first!='(')) return false;
				else if((each== '}') && (first!='{')) return false;
				else if((each== ']') && (first!='[')) return false;
			}
		}
		return stack.isEmpty();
}
}
