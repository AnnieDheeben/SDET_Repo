package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Maximum69Number {
	
@Test
public void test1() {
	int num = 9669;
	int output = max96Number(num);
	Assert.assertEquals(9969, output);
}

@Test
public void test2() {
	
	int num = 9999;
	int output = max96Number(num);
	Assert.assertEquals(0, output);
}

public int max96Number(int num) {
	
	int min=6, max=9, biggest=0;
	int x=0,temp1 = Integer.MAX_VALUE;
	String temp="";
	int numLen = Integer.toString(num).length();
	int[] arr = new int[numLen];
	while(num!=0) {
		arr[numLen-x-1] = num%10;
		num = num/10;
		x++;
	}
	
	int[] newArr = new int[numLen];
	for(int i =0;i<numLen;i++) { //6669, 6969,6996,6999
		int var = arr[i];
		if(arr[i]==min) {
			arr[i]=max;
		}
		else if(arr[i]==max) {
			arr[i]=min;
		}
		
		 temp= Arrays.toString(arr);
		 temp=temp.replaceAll("[,\\[\\]\\s]", "");
		 temp1 = Integer.parseInt(temp);
		 newArr[i]=temp1;
		 arr[i] = var;
	}
	
	int tempBig = 0;
	for(int i=0;i<newArr.length;i++) {
		for(int j=i+1;j<newArr.length;j++) {
			if(newArr[i]>newArr[j]) {
				tempBig = newArr[i];
				newArr[i]= newArr[j];
				newArr[j] = tempBig;
			}
		}
	}
	return biggest = newArr[newArr.length-1];
	}
}
