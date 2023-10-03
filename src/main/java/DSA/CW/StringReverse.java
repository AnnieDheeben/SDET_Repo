package DSA.CW;

//Two Pointer

public class StringReverse {
	public static void main(String args[]) {
		/*String name = "Annie Soundari";
		String str = "";
		for(int i=name.length()-1;i>=0;i--) {
			str = str + name.charAt(i);
		}
		System.out.println(str);*/
		String s = reverse();
	}
	
	public static String reverse() {
		String name = "Annie";
		int len = name.length();
		char[] str = name.toCharArray();
		int stIndex = 0, endIndex = len-1;
		while(stIndex<endIndex) {
			char temp = str[stIndex];
			str[stIndex] = str[endIndex];
			str[endIndex] = temp;
			stIndex++;
			endIndex--;
			
		}
		
		String rev = new String(str);
		return rev;
	}
	
	
}

