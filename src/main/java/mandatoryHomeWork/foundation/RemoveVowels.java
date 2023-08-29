package mandatoryHomeWork.foundation;
/*
 * Input: "Hi testleaf students"
	Output: "H tstlf students"
	
	1.Get the input string
	2.check each character of the string with 'a','e,'i','o','u'
	3.if matches, remove the current index character and add it to the output string
	4.else, add the current index character to the output string
 */

public class RemoveVowels {

	public static void main(String[] args) {
		String input = "Hi testleaf students";
		String output = removeVowels(input);
		System.out.println(output);

	}
	
		public static String removeVowels(String ip) {
			
			StringBuilder ab = new StringBuilder();
			for(int i=0;i<ip.length();i++) {
				char currentChar = ip.charAt(i);
				if(!(currentChar == 'a' || currentChar == 'e' || currentChar =='i' || currentChar == 'o' || currentChar == 'u' ||
					currentChar == 'A' || currentChar == 'E' || currentChar =='I' ||currentChar == 'O' || currentChar == 'U'))
				{
					ab.append(currentChar);		
				}
				
			}
			
			return ab.toString();
			
		}
	}


