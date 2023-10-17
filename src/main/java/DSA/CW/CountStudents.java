package DSA.CW;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 1700. Number of Students Unable to Eat Lunch


 */
public class CountStudents {

	@Test
	public void test1() {
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		int expOutput = 3;
		int actOutput = countStudents(students, sandwiches);
		Assert.assertEquals(expOutput, actOutput);
	}

	public int countStudents(int[] students, int[] sandwiches) {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		for(int i=0;i<students.length;i++) {
			queue.add(students[i]);
		}
		
		for(int i=sandwiches.length-1;i>=0;i--) {
			stack.add(sandwiches[i]);
		}
		
		while(stack.size()!=0) {
			if(stack.peek()==queue.peek()) {
				count = 0;
				stack.pop();
				queue.poll();
			}
			else {
				int top = queue.poll();
				queue.add(top);
				count++;
			}
			if(count==queue.size()) {
				return count;
			}
		}
		
		return 0;
	}
}
