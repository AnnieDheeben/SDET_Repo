package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
	public static void main(String[] args) {
		int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
		int count = 0;
        int max = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer each : nums){
            map.put(each,map.getOrDefault(each,0)+1);
            count = map.get(each);
            if(count>max) {
                max=each;
                break;
            }
        }
        System.out.println(max);
    
	}

}
