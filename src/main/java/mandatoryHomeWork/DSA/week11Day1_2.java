package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class week11Day1_2 {
	@Test
	public void test1()
	{
		int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
		int output = 3;
		int actOutput = numEquivDominoPairs(dominoes);
		Assert.assertEquals(output, actOutput);
	}

	private int numEquivDominoPairs(int[][] dominoes) {
		int pairs = 0;
	
		Map<List<Integer>, Integer> map = new HashMap<>();
		
		for(int i=0;i<dominoes.length;i++) {
			Arrays.sort(dominoes[i]);
		}
		
		for(int i=0;i<dominoes.length;i++) {
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<2;j++) {
				list.add(dominoes[i][j]);
			}
			if(map.containsKey(list)) {
				int occurrence = map.getOrDefault(list, 0); 
				map.put(list, occurrence+1);
				pairs = pairs + map.get(list);
				
			}
			else {
				map.put(list, 0);
			}
		}
		return pairs;
	}
}
