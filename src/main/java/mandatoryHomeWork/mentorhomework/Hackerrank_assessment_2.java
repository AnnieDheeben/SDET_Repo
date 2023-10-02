package mandatoryHomeWork.mentorhomework;

import java.util.Arrays;
import java.util.List;

public class Hackerrank_assessment_2 {
	public static void main(String[] args) {
		List<List<Integer>> operations = Arrays.asList(
                Arrays.asList(0, 9),
                Arrays.asList(4, 5),
                Arrays.asList(3, 6),
                Arrays.asList(2, 7),
                Arrays.asList(1, 8),
                Arrays.asList(0, 9));
		int[] arr= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		List<Integer> arrList =Arrays.asList(arr);
		List<Integer> resList = performOperation(arrList,operations);
		System.out.println(resList);
	}

	private static List<Integer> performOperation(List<Integer> arrList, List<List<Integer>> operations) {
		
		for(List<Integer> each : operations) {
			int start = each.get(0);
			int end = each.get(1);
			
			while(start<end) {
				swap(start,end,arrList);
				start++;
				end--;
			}
		}
		return arrList;
	}

	private static void swap(int start, int end, List<Integer> arrList) {
		
		Integer temp=arrList.get(start);
		arrList.set(start,arrList.get(end));
		arrList.set(end,temp);
	}
	

}
