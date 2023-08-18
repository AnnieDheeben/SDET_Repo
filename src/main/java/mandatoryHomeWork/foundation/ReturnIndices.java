package mandatoryHomeWork.foundation;

import org.junit.Test;

public class ReturnIndices {
	
	//nums =[2,7,11,15], target = 9
	
	@Test
	public void test1() {
		int arr[] = new int[] {2,7,11,15};
		int targetValue = 9;
		int actPos[] = findIndices(arr,targetValue);
		System.out.println(actPos);		
	}
	
	public int[] findIndices (int nums[], int target) {
		
		int pos[] = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for (int j=i+1;j<nums.length;j++) {
				if((nums[i]+nums[j])==target)
				{
						pos[0] = nums[i];
						pos[1] = nums[j];
				}
			}
			return pos;
		}
		
		return new int[] {-1,-1};
		
	}

}
