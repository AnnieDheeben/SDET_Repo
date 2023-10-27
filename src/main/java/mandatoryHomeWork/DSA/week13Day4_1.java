package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

/*
 * 832. Flipping an Image
Psuedocode : 
1. Get the input matrix
2. Iterate through each row of the matrix
3. assign left pointer as 0 and right pointer as matrix length -1
4. start a while loop and traverse till left pointer meets the right pointer
5. Swap the values at the left and right positions in the row.
6.If the value was originally 0, change it to 1, and if it was originally 1, change it to 0.
7. return the modified matrix after flipping and inverting each row of the image.

Time complexity - O[m*n]
sPACE COMPLEXITY : O[1]
	a. 
 */
public class week13Day4_1 {
	@Test
	public void test1() {
		
	int[][] image = {{1,1,0},
					 {1,0,1},
					 {0,0,0}};
	int[][] expOutput = {{1,0,0},
			  			 {0,1,0},
			  			 {1,1,1}};
	int[][] actOutput = flipAndInvertImage(image);
	Assert.assertEquals(expOutput, actOutput);
	}

	private int[][] flipAndInvertImage(int[][] image) {
		for(int[] row : image){
            int l=0,r=image.length-1;
            while(l<=r){
                int temp = row[l];
                row[l]=row[r]^1;
                row[r]=temp^1;
                l++;
                r--;
            }
            
        }
        return image;
	}
}
