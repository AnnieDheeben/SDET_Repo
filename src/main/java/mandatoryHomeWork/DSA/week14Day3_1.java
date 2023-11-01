package mandatoryHomeWork.DSA;

import java.util.Stack;

import org.junit.Test;

public class week14Day3_1 {
@Test
public void test1() {
	String name = "leelee";
	String typed = "lleeelee";
	boolean output = true;
	boolean actOutput = isLongPressedName(name, typed);
}
@Test
public void test2() {
	String name = "alex";
	String typed = "aaleex";
	boolean output = true;
	boolean actOutput = isLongPressedName(name, typed);
}

private boolean isLongPressedName(String name, String typed) {
	StringBuilder sb = new StringBuilder();
	Stack<Character> stack = new Stack<>();
	for(int i=0;i<typed.length();i++) {
		if(stack.isEmpty() || stack.peek()!=typed.charAt(i)) {
			stack.push(typed.charAt(i));
		}
		
	}
	
	while(!stack.isEmpty()) {
		char c = stack.pop();
		sb = sb.append(c);
	}
	
	String reverse = sb.toString();
	
	return reverse.equals(name);
}
}
