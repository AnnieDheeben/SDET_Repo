package mandatoryHomeWork.DSA;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 682. Baseball Game
 * Psuedocode : 
 * 1. Get the input operations
 * 2. declare a stack
 * 3. iterate through the operations
 * 	a. if the current operation is "C". perform pop operation of stack
 * 	b. if the current operation is "D", perform push operation by inserting 2*peek value(top) of the stack
 * 	c. if the current operation is "+", perform push operation by calculating the sum of two previous values in stack
 * 4. calculating sum of all the scores by doing pop operation of each score and add it to the output
 * 5. return the final output
 * 
 * Time complexity  :O[N]
 * Sapce complexity : O[N]

 */
public class week12Day1_2 {
	@Test
	public void test1() {
		String[] ops = {"5","2","C","D","+"};
		int expOutput = 30;
		int actOutput = calPoints(ops);
		Assert.assertEquals(expOutput, actOutput);
	}

	private int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		int output = 0;
		for(String operation : ops) {
			switch(operation) {
			case "C" :
				if(!stack.isEmpty()) {
					stack.pop();
				}
			break;
			case "D" :
				if(!stack.isEmpty()) {
					stack.push(2*stack.peek());
				}
			break;
			case "+" :
				if(stack.size()>=2) {
					int val1 = stack.pop();
					int val2 = stack.pop();
					int sum = val1+val2;
					stack.push(val2);
					stack.push(val1);
                    stack.push(sum);
				}
			break;
			default : 
				stack.push(Integer.parseInt(operation));
			break;
			}
			
		}
		while(!stack.isEmpty()) {
			output+=stack.pop();
		}
		return output;
	}
}
