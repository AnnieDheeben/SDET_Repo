package mandatoryHomeWork.foundation;

import java.util.Collection;
import java.util.HashMap;

import org.junit.Test;

public class FindUniqueCount {

	@Test
	public void test1() {
		int num[] = {1,2,2,3,3,3};
		boolean output = uniqueOccurrences(num);
		System.out.println(output);
	}
	
	/*@Test
	public void test2() {
		int num[] = {-3,0,1,-3,1,1,1,-3,10,0};
		boolean output = uniqueOccurrences(num);
		System.out.println(output);
	}*/
	

	public boolean uniqueOccurrences(int[] arr) {

        int count =0;
        HashMap<Integer, Integer> nMap = new HashMap<Integer, Integer>();
        for(int i=0;i< arr.length;i++){
            count =0;
            for (int j =0;j< arr.length;j++){

                if(arr[i] == arr[j]){
                    count++;

                }
            }
            nMap.put(arr[i],count);
        }
        System.out.println(nMap.values());
        Collection<Integer> arrNew = nMap.values();
        Object[] ar = arrNew.toArray();
        for(int i=0;i<arrNew.size()-1;i++){
            if(ar[i]  == ar[i+1]){
                return false;
            }
        }
        return true;
    }
	}
