package mandatoryHomeWork.DSA;
/*
 * 844. Backspace String Compare
Psuedocode : 
1. Get the input strings s and t
2. declare two stacks to store the values of s and t
3. start a for loop and iterate through the string s
	a. for each character, check whether the current character is # or not
	b. if it is # and the stack1 is not empty, do a pop() operation
	c. if is not # then push the character to the stack1
4. repeat the step3 for the string t using stack2
5. check if both the stacks sizes are equal. If not, return false
6. check any one of the stacks is empty, then return false
7. if both the above conditions are not met, then iterate through the stacks and see if values of each pop operation are same
	a. in any one of the iteration, if values are not equal, return false
	b. else return true
	
	Time complexity - O[m+n]
	Space complexity  :o[n]
 */

import java.util.Stack;

import org.junit.Test;

public class week12Day2_1 {
/*	@Test
	public void test1() {
		String s = "ab##";
		String t = "c#d#";
		boolean expOutput = true;
		boolean actOutput = backspaceCompare(s,t);
	}
	@Test
	public void test2() {
		String s = "ab#c";
		String t = "ad#c";
		boolean expOutput = true;
		boolean actOutput = backspaceCompare(s,t);
	}*/
	@Test
	public void test3() {
		String s = "y#fo##f";
		String t = "y#f#o##f";
		boolean expOutput = true;
		boolean actOutput = backspaceCompare(s,t);
	}
	
	public boolean backspaceCompare(String s, String t) {
		Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean output = true;
        for(Character c : s.toCharArray()){
            if(c=='#'){
            	if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
            else{
                stack1.push(c);
            }
        }
        for(Character c1 : t.toCharArray()){
            if(c1=='#'){
            	if(!stack2.isEmpty()){
                stack2.pop();
            }
            }
            else{
                stack2.push(c1);
            }
        }
        if(stack1.size()!=stack2.size()){
            output = false;
        }
        if(stack1.isEmpty() && stack2.isEmpty()){
            output = true;
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop()!=stack2.pop()) {
                output=false;
                break;
            }
        }
        return output;
	}
}
