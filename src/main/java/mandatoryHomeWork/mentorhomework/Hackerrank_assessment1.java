package mandatoryHomeWork.mentorhomework;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * a = {1,2,3};
 * b = {2,5,5}
 */

public class Hackerrank_assessment1 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
	    List<Integer> b = new ArrayList<>();
	    b.add(2);
	    b.add(5);
	    b.add(5);
	    List<Integer> mergedList = mergeArrays(a,b);
	    System.out.println(mergedList);
	}
	
	private static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		int p1=0;
		int p2=0;
		while(p1<a.size() && p2<b.size()) {
			if(a.get(p1)<b.get(p2)) {
				result.add(a.get(p1));
				p1++;
			}
			else {
				result.add(b.get(p2));
				p2++;
			}
		}
		while(p1<a.size()) {
			result.add(a.get(p1));
			p1++;
		}
		while(p2<b.size()) {
			result.add(b.get(p2));
			p2++;
		}
		return result;
	}
}
