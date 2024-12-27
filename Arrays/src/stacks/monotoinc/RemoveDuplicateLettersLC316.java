package stacks.monotoinc;
import java.util.Arrays;

public class RemoveDuplicateLettersLC316 {
    public static void main(String[] args) {
        RemoveDuplicateLettersLC316 removeDuplicateLettersLC316 = new RemoveDuplicateLettersLC316();
        System.out.println(removeDuplicateLettersLC316.removeDuplicateLettersArrangeInSorted("cbacdcbc"));
    }
    public String removeDuplicateLettersArrangeInSorted(String s) {
        int[] hasher = new int[26];
        for(int i=0;i<s.length();i++){
            hasher[s.charAt(i)-'a']++;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<hasher.length;i++){
            if(hasher[i]>=1){
               result.append((char)('a'+i));
            }
        }
        return result.toString();
    }
}
