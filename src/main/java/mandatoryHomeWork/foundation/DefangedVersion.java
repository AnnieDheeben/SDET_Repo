package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class DefangedVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ip = "1.1.1.1";
		String[] ipArr = ip.split(".");
		String output = "";
		for(int i=0;i<ipArr.length;i++) {
			if(ipArr[i].equals(".")) {
				ipArr[i]="[.]";
			}
		}
		
		for(int j=0;j<ipArr.length;j++) {
			output = output + ipArr[j];
		}
		
		System.out.println(ip);
		System.out.println(Arrays.toString(ipArr));
		System.out.println(output);
	}

}
