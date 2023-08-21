package mandatoryHomeWork.foundation;
/*
 * 
 * Time complexity - O(N)
 */

public class AppendTwoStrings {public void checkAppend(String str1, String str2){
    int diff = 0;
    String subStr1 = ""; //O(1)
    String subStr2 = ""; //O(1)
    String append = ""; //O(1)
    if(str1.length() > str2.length()){ //O(1)
        diff = str1.length()-str2.length(); //O(1)
        subStr1 = str1.substring(diff); //O(1)
        for(int i=0;i<str2.length();i++){ //O(N)

            append = append+str1.charAt(i)+str2.charAt(i); //O(1)

        }
        append = append+subStr1; //O(1)

    }else{
        diff = str2.length()-str1.length(); //O(1)
        subStr2 = str2.substring(diff);    //O(1)
        for(int i=0;i<str1.length();i++){ //O(N)

            append = append+str1.charAt(i)+str2.charAt(i); //O(1)

        }
        append = append+subStr2; //O(1)
    }

}

}
