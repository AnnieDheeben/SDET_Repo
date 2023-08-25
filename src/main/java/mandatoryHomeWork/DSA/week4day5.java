package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. 
If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number.

Example 1:

Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.

Psuedocode : 
1. Get the greed factor array 'g' and the cookies array 's'
2. Initialize an integer variable as 'count' and assign it to 0
2. Use two for loops(i & j) to iterate through 's' array and 'j' array
3. For each iteration, Do an entry check whether the current index value of s is greater than 0 or not
4. if true, for each index of s, iterate through all the index of g
5. check whether s[i]>=g[j]
6. if the above step returns true, increment the count by1
7. return the counter value
 */
public class week4day5 {
	@Test
	public void test1() {
		int[] g = {1,2,3};
		int[] s = {1,1};
		int expectedCount = 1;
		int actCount = findContentChildren(g,s);
		Assert.assertEquals(expectedCount, actCount);
		
	}
	
	@Test
	public void test2() {
		int[] g = {1,2,};
		int[] s = {1,2,3};
		int expectedCount = 2;
		int actCount = findContentChildren(g,s);
		Assert.assertEquals(expectedCount, actCount);
		
	}
	
	@Test
	public void test3() {
		int[] g = {1,2,3};
		int[] s = {3};
		int expectedCount = 1;
		int actCount = findContentChildren(g,s);
		Assert.assertEquals(expectedCount, actCount);	
	}

	
	public int findContentChildren(int[] g, int[] s) {
		
		int count = 0;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<g.length;j++) {
				if(g[j]>0 && s[i]>=g[j]) {
					g[j]=0;
					s[i]=0;
					count = count + 1;
				}			
			}
		}
		
		return count;
	}
	

}
