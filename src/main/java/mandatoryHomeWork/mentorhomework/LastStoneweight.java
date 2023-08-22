package mandatoryHomeWork.mentorhomework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Test
public class LastStoneweight {
	public void test1() {
		Integer[] stones = {2,7,4,1,8,1};
		int output =1;
		int actOutput = lastStoneWeight(stones);
		AssertJUnit.assertEquals(output, actOutput );
	}

	public int lastStoneWeight(Integer[] stones) {
		
		int stone = 0;
		List<Integer> stonesList = new ArrayList<>(Arrays.asList(stones));
		while(stonesList.size()>1) {
			Collections.sort(stonesList);
			int biggestStone = stonesList.get(stonesList.size()-1);
			int secondBiggestStone = stonesList.get(stonesList.size()-2);
			stonesList.remove(stonesList.size()-1);
			stonesList.remove(stonesList.size()-1);
			if(biggestStone!=secondBiggestStone) stonesList.add(biggestStone - secondBiggestStone);
		}
		
		if(stonesList.isEmpty()) return 0;
		else return stonesList.get(0);
	}

}
