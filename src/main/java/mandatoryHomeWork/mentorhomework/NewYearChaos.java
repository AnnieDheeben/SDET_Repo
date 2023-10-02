package mandatoryHomeWork.mentorhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class NewYearChaos {
	
	/*@Test
	public void test1() {
		
		Integer[] q = {1,4,2,3};
		String ouput = "Too Chaotic";
		List<Integer> sList = Arrays.asList(q);
		String actOutput = minimumBribes(sList);
		Assert.assertEquals(ouput, actOutput);
	}*/
	
	@Test
	public void test2() {
		
		Integer[] q = {1,2,3,5,4,6,7,8};
		String ouput = "1";
		List<Integer> sList = Arrays.asList(q);
		//String actOutput = minimumBribes(sList);
		//Assert.assertEquals(ouput, actOutput);
	}

	public void minimumBribes(List<Integer> sList) {
		String result = "";
		
		List<Integer> queue = new ArrayList<>(sList.size());
		for(int i=1;i<=sList.size();i++) {
			queue.add(i);
		}
		int index = 0;
		boolean flag = true;
		for(int i=0;i<sList.size();i++) {
			int currentPos = sList.get(i);
			int actPos = queue.get(index);
			if((currentPos-actPos)>2) {
				flag = false;
				break;
			}
			index++;
		}
			if(flag==false) {
				System.out.println("Too Chaotic");
			}
			else {
				System.out.println(findMinBribes(sList));
			}
	}

	public int findMinBribes(List<Integer> q) {
		
		int count=0;

        for(int i=q.size()-1;i>=0;i--) {
       	
            for(int j=i-1;j>=0;j--) {
                if(q.get(i)<q.get(j)) {
                    count++;
                }

            }           
}
        return count;
	}
}
