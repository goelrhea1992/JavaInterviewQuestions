/** Given an input string, reverse the string word by word.
* For example,
* Given s = "the sky is blue",
* return "blue is sky the".
**/

public class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        String reverseSentence = "";
        for(int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(""))
                reverseSentence += words[i] + " ";
        }
        return reverseSentence.trim();
    }
}
