package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode3121 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialCharsArrayHasher("aaAbcBC"));
    }

    public static int numberOfSpecialChars(String word) {
        String w = word.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (char c : w.toCharArray()) {
            set.add(c);
        }
        int s = 0;
        for (char c : set) {
            if (word.indexOf(Character.toUpperCase(c)) != -1 &&
                    word.indexOf(Character.toLowerCase(c)) != -1 &&
                    word.indexOf(Character.toUpperCase(c)) > word.lastIndexOf(Character.toLowerCase(c))) {
                s++;
            }
        }
        return s;
    }

    public static int numberOfSpecialCharsArrayHasher(String word) {
        int[] lowFreq = new int[26];
        int[] upFreq = new int[26];
        int cntWord = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                if (upFreq[ch - 'a'] == 0) {
                    lowFreq[ch - 'a']++;
                } else {
                    lowFreq[ch - 'a'] = 0;
                }

            } else {
                upFreq[ch - 'A']++;
            }
        }
        for (int indx = 0; indx < 26; indx++)
            if (lowFreq[indx] >= 1 && upFreq[indx] >= 1)
                cntWord++;

        return cntWord;
    }
}
