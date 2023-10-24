package mandatoryHomeWork.DSA;

import static org.testng.Assert.assertEquals;

import java.util.Queue;
import java.util.LinkedList;

import org.junit.Test;

/*
 * 933. Number of Recent Calls

Psuedocode : 
1. Get the input array
2. Get each ping value and add it to a queue
3. start a while loop and iterate till queue's first value is less than t-3000(range is t-3000,t)
	a. remove first value
4. return the final queue size
 */
public class RecentCounter {
	@Test
    public void testPingOperations() {
        // Initialize the RecentCounter object
        RecentCounter counter = new RecentCounter();

        // Perform "ping" operations with different timestamps
        int[] timestamps = { 1, 100, 3001, 3002 };

        // Expected output
        int[] expected = { 1, 2, 3, 3 };

        for (int i = 0; i < timestamps.length; i++) {
            int result = counter.ping(timestamps[i]);
            assertEquals(expected[i], result);
        }
    }
	Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList();
    }
	private int ping(int t) {
		 int start = t-3000;
	        q.add(t);//1
	        while(q.peek()<start) {
	            q.remove();
	        }
	        return q.size();
	}
}
