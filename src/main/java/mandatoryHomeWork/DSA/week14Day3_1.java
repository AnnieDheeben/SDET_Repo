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
	int p1=0,p2=0;
	while(p2<typed.length()) {
		if(p1<name.length() && name.charAt(p1)==typed.charAt(p2)) {
			p1++;
			p2++;
		}
		else if(p1!=0 && typed.charAt(p2)==name.charAt(p1-1)) {
			p2++;
		}
		else {
			return false;
		}
	}
	return p1==name.length();
}
}
