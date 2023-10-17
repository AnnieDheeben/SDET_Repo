package mandatoryHomeWork.DSA;

import java.util.Queue;
import java.util.LinkedList;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2073. Time Needed to Buy Tickets
1. Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
Example 2:

Input: tickets = [5,1,1,1], k = 0
Output: 8
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.
Psuedocode : 

1. Start with a timer set to 0.
2. Create an empty queue named `queue`.
3. Add all ticket indices from 0 to n-1 into the `queue`, where n is the total number of tickets.
4. While the `queue` is not empty:
   a. Increment the timer by 1.
   b. Dequeue the front element from the `queue` and remember it as `front`
   c. If there are available tickets for `front`, decrease the count of tickets for that index
   d. Check if `front` is the specific ticket index `k` and there are no more tickets available for it. If so, exit the loop.
   e. If `front` is not `k` and there are no more tickets available for it, skip this ticket and continue to the next iteration of the loop.
   f. Otherwise, enqueue `front` back into the `queue`.
5. Return the final value of the timer, which represents the time taken to reach the specific ticket index `k`.

Time complexity - O[N]
Space complexity - O[N]
 */
public class week12Day2_2 {
	
	@Test
	public void test1() {
		int[] tickets = {2,3,2};
		int k=2;
		int expOutput = 6;
		int actOutput = timeRequiredToBuy_queue(tickets,k);
		Assert.assertEquals(expOutput, actOutput);
		
	}

	public int timeRequiredToBuy(int[] tickets, int k) {
		int time = 0;
		for(int i=0;i<tickets.length;i++) {
			if(i<=k) {
				time+=Math.min(tickets[k], tickets[i]);
				}
			else {
				time+=Math.min(tickets[k]-1, tickets[i]);
			}
			}
		return time;
	}

	public int timeRequiredToBuy_queue(int[] tickets, int k) {
		int time = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<tickets.length;i++) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			++time;
			int front = queue.poll();
			if(tickets[front]>=1) {
				tickets[front]-=1;
			}
			if(k==front && tickets[front]==0) break;
			if(k!=front && tickets[front]==0) continue;
			queue.add(front);
		}
		return time;
	}
}
