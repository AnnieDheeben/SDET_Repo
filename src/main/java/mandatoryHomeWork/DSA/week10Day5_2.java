package mandatoryHomeWork.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class week10Day5_2 {

@Test
public void test1() {
	int[] nums = {4,3,2,7,8,2,3,1};
	int[] expOutput = {5,6};
	int[] actOutput = findDisappearedNumbers(nums);
	Assert.assertEquals(null, expOutput);
}

private int[] findDisappearedNumbers(int[] nums) {
	List<Integer> numsList = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	boolean flag = true;
	for(Integer e : nums) {
		set.add(e);
	}
	int n = set.size();
	for(int i=0;i<n;i++) {
		if(!set.contains(i)) {
			numsList.add(i);
		}
	}
	int[] arr = new int[numsList.size()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=numsList.get(i);
	}
	return arr;
	}
}
