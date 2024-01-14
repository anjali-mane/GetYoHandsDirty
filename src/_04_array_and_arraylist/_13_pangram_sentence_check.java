package _04_array_and_arraylist;

public class _13_pangram_sentence_check
{
    /*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.*/
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    static  boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        for (char i = 'a'; i <='z'; i++) {
            int flag=0;
            for (int j = 0; j <sentence.length() ; j++) {
                if ( arr[j]== i) {
                    flag=1;
                    break;
                }
            }
            if (flag == 0) {
                return false;
            }
        }
        return true;

    }
}
