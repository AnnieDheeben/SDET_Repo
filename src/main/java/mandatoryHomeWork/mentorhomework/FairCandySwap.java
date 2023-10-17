package mandatoryHomeWork.mentorhomework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FairCandySwap {
@Test
public void test1() {
	int[] aliceSizes = {1,1};
	int[] bobSizes = {2,2};
	int[] expOutput = {1,2};
	int[] actOutput = fairCandySwap(aliceSizes, bobSizes);
}

private int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	Set<Integer> a = new HashSet<>();
	int totA = 0;
	int totB = 0;
	for(int i=0;i<aliceSizes.length;i++) {
		totA = totA + aliceSizes[i];
	}
	for(int i=0;i<bobSizes.length;i++) {
		totB = totB + bobSizes[i];
		a.add(bobSizes[i]);
	}
	
	int diff = (totB-totA)/2;
	int[]output = new int[2];
	for(int i=0;i<aliceSizes.length;i++) {
		int bobSize = aliceSizes[i] + diff;
		if(a.contains(bobSize)) {
			output[0]=aliceSizes[i];
			output[1] = bobSize;
			return output;
		}
		
	}
	return output;
}
}
