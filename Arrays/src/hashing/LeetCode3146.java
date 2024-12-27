package hashing;

import java.util.Arrays;

public class LeetCode3146 {

    public static void main(String[] args) {
        int i = findPermutationDifference("abc", "bca");
        System.out.println(i);
    }

    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int j=t.indexOf(s.charAt(i));
            sum+=Math.abs(i-j);
        }
        return sum;
    }
}
