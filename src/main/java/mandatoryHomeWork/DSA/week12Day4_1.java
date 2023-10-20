package mandatoryHomeWork.DSA;
/*
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 
 */

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class week12Day4_1 {
	@Test
	public void test1() {
		String s = "abbaca";
		String expOutput = "ca";
		String actOutput = removeDuplicates(s);
		Assert.assertEquals(expOutput, actOutput);
	}

	private String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){ //abbaca
            if(!stack.isEmpty()){
                char top = stack.peek(); //b
                if(top==c){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);//ab
        	}
                for(int i=0;i<=stack.size();i++){
                    sb.append(stack.pop());
                }
               return sb.reverse().toString();
	}

}
