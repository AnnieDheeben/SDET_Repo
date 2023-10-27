package DSA.CW;

public class DivideAndConquer {


public static int divideConquerImplementation(int[] nums, int target) {
	int index = 0;
	int n = nums.length;
	int left = 0;
	int right = n-1;
	while(left<=right) {
		int mid = left+(right-left)/2;
		if(nums[mid]==target) {
			return mid;
		}
		else if(nums[mid]<target) {
			left = mid+1;
		}
		else {
			right = mid-1;
		}
		}
	return -1;
	
}
public static void main(String[] args) {
	int[] nums = {4,6,8,8,10,55};
	int target = 7;
	int expIndex = -1;
	int actIndex = divideConquerImplementation(nums,target);
	System.out.println(actIndex);
}
}
