package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
/*
 * Psuedocode : 
 * 888. Fair Candy Swap
 * 1. declare two integer variable totA and totB
 * 2. iterate over the aliceSizes array and calculate totA
 * 3. iterate over the  bobSizes array and calculate totB
 * 4. initiate a set and store the elements of bobSizes in set
 * 5. find the difference between totB and totA and divide the value by 2 and store is as diff
 * 6. Iterate over the alicesSizes again to check if the current element value + diff  is available in the set
 * 7. if is is available, return the output array as  current element of aliceSizes and the previous found value of current element+diff
 * 8. else return an empty array
 * 
 * Time complexity : O[N+M]
 * Space complexity : O[N]
 * 
 */

public class week10Day2 {
	@Test
	public void test1() {
		int[] aliceSizes = {2};
		int[] bobSizes = {1,3};
		int[] expOutput = {2,3};
		int[] actOutput = fairCandySwap(aliceSizes,bobSizes);
		System.out.println(actOutput);
	}

	private int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int totA = 0;
        int totB = 0;
        Set<Integer> setB = new HashSet<>();
        for(Integer a : aliceSizes){ //O[N]
            totA+=a;
        }
        for(Integer b : bobSizes){ //O[M]
            totB+=b;
            setB.add(b);
        }

        int diff = (totB-totA)/2;
        for(Integer a : aliceSizes){
             if(setB.contains(a+diff))
             return new int[]{a,a+diff};
        }
        return new int[0];
    }

}
