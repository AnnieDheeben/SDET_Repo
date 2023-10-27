package DSA.CW;

public class SortingAlgortihm {

	public static int[] selectSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			int min = i;
			for(int j=i+1;j<nums.length;j++)
			if(nums[j]<nums[min]) {
				min = j;
			}
			swap(nums,i,min);
		}
		return nums;
	}
	
	public static int[] insertSort(int[] nums) {
		int n = nums.length;
		for(int i=1;i<n;i++) {
			int key = nums[i];
			int j = i-1;
			while(j>=0 && nums[j]>key) {
				nums[j+1]=nums[j];
				j=j-1;	
			}
			nums[j+1]=key;
			
		}
		return nums;
		
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public static void main(String[] args) {
		int[] nums = {1,4,3,2,8,22};
		int[] expOutput = insertSort(nums);
		for(int i=0;i<expOutput.length;i++) {
			System.out.println(expOutput[i]+" ");
		}
	}
}
