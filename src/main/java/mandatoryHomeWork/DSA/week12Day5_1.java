package mandatoryHomeWork.DSA;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;
/*
 * Psuedocode : 
1.Initialize a stack called 'stack'
2.Initialize a count variable to 0
3.For each log entry 'log' in the 'logs' array:
    a.If 'log' is "../" and the 'stack' is not empty:
        Pop an element from 'stack'
    b.Else if 'log' is "./":
        Continue to the next log entry
    c.Else:
        Push 'log' onto the 'stack'
4.If the 'stack' is empty, Return 0
5.Else Pop an element from 'stack' and increment 'count' by 1
6.Return 'count'
Time complexity - O[N]
Space complexity - O[N]
 */
public class week12Day5_1 {
@Test
public void test1() {
	String[] logs = {"d1/","d2/","../","d21/","./"};
	int expOutput = 2;
	int actOutput = minOperations(logs);
	Assert.assertEquals(expOutput, actOutput);		
	}

private int minOperations(String[] logs) {
	Stack<String> stack = new Stack<>();
	int count=0;
	for(String log : logs) {
		switch(log) {
		case "../":
			if(!stack.isEmpty()) {
				stack.pop();
			}
		break;
		case "./":
			continue;
		default:
			stack.push(log);		
		}
	}
		
	if (stack.size()==0) {
		return 0;
	}
	else {
		while(!stack.isEmpty()) {
			stack.pop();
			count++;
		}
	}
	return count;
}
}
	

