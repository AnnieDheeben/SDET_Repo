package mandatoryHomeWork.DSA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class week14Day4_2 {
	
	@Test
	public void test1() {
		String rings = "B0B6G0R6R0R6G9";
		int expOutput = 1;
		int actOutput = countPoints(rings);
		Assert.assertEquals(expOutput, actOutput);
	}

	public int countPoints(String rings) {
		Set<Integer> red = new HashSet<>();
		Set<Integer> green = new HashSet<>();
		Set<Integer> blue = new HashSet<>();
		int count=0;
		for(int i=0;i<rings.length();i+=2) {
			char color = rings.charAt(i);
			char rod = rings.charAt(i+1);
		switch(color) {
		case 'R':
			red.add(rod-'0');
			break;
		case 'B':
			blue.add(rod-'0');
			break;
		case 'G':
		green.add(rod-'0');
		break;
	}
				
}
		for(int i=0;i<=9;i++) {
			if(red.contains(i) && blue.contains(i) && green.contains(i)) {
				count++;
			}
		}
		
		return count;
	}

}
