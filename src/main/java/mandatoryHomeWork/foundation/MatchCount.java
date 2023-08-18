package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

/* 1) Did I understand the problem?  
		 * 		-> If yes, go to next step !!
		 * 
		 *    What is the input(s)? String
		 *    What is the expected output? boolean
		 *    Do I have constraints to solve the problem?
		 *    Do I have all informations to go to next step!!
		 *    // How big is your test data set will be?
		 *    
		 * 2) Test data set
		 *  	
		 *  	Minimum of 3 data set !! Positive, Edge, Negative 
		 *      Validate with the interviewer if the data set is fine by his/her assumptions
		 * 
		 * 3) Do I know how to solve it?
		 * 		
		 * 		Yes - great, // is there an alternate?
		 * 
		 * 4) Ask for hint (If you do not know how to solve)
		 *  
		 * 5) // Do I know alternate solutions as well? No
		 * 
		 * 		No - That is still fine, proceed to solve by what you know !!
		 * 
		 * 6) // If you know alternate solutions -> find out the O Notations (Performance)
		 * 
		 * 		Then, explain either both or the best (depends on the time)
		 * 
		 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
		 * 		Approach 2: Write down the options and benefits and code the best 
		 * 
		 * 7) Start always with Psuedo code 
		 * 
		 * 8) Implement them in the code (editor)
		 * 
		 * 9) Test against the different data set 
		 * 
		 * 10) If it fails, debug them to solve it !!
		 * 
		 */

public class MatchCount {
	
	@Test
	public void test1() {
		
		int n=7;
		int count = 6;
		int expectedcount = findMatches(n);
		Assert.assertEquals(expectedcount, count);
	}
	
	@Test
	public void test2() {
		
		int n=14;
		int count = 13;
		int expectedcount = findMatches(n);
		Assert.assertEquals(expectedcount, count);
	}

	public int findMatches(int n) {
		
		int matches=0; 
		
		while(n!=1) {
			if(n%2==0) {
				matches = matches+n/2;
				n=n/2;
			}
			else { 
				matches = matches +(n -1)/2;
				n =(n-1)/2 + 1;
			}
		}
		
		return matches;
	}
	

}
