package mandatoryHomeWork.DSA;
/*
 * 819. Most Common Word
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"
Psuedocode : 
1. Get the input paragraph string and the banned words array


 */

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;
/*
 * Psuedocode : 

1. Initialize an empty map called 'map'
2. Initialize a variable 'maxCount' to 0
3. Initialize a variable 'output' to an empty string
4. Split the 'paragraph' into words, store them in an array called 'words'
5. For each 'word' in 'words', do the following:
   a. Convert 'word' to lowercase to ensure case-insensitive comparison
   b. Initialize a boolean 'isBanned' as false
   c. For each 'bannedStr' in the 'banned' list, do the following:
      i. If 'bannedStr' is equal to 'word' (ignoring case), set 'isBanned' to true and break the loop
   d. If 'isBanned' is false (i.e., the word is not in the 'banned' list), do the following:
      i. Increment the word's frequency in 'map'
      ii. If the frequency of 'word' is greater than 'maxCount', update 'maxCount' and 'output' with 'word'
6. Return 'output' as the result, which is the most common non-banned word in the 'paragraph'
*/

public class week11Day5_2 {
@Test
public void test1() {
	String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
	String[] banned = {"hit"};
	String output = "ball";
	String actOutput = mostCommonWord(paragraph, banned);
	Assert.assertEquals(output, actOutput);
}

private String mostCommonWord(String paragraph, String[] banned) {
	Map<String, Integer> map = new HashMap<>();
    int max = 0;
    String output = "";
    String[] words = paragraph.split("[^a-zA-Z]+");
    for(String s : words){
        String word = s.toLowerCase();
        boolean isBanned = false;
        for(String bannedStr:banned){
            if(bannedStr.equalsIgnoreCase(word)){
                isBanned = true;
                break;
            }
        }
        if(!isBanned){
            map.put(word,map.getOrDefault(word,0)+1);
            if(map.get(word)>max){
                max = map.get(word);
                output = word;
            }
        }
    }
    return output;
}
}
