import java.util.ArrayList;
import java.util.Stack;

public class ValidPalindrome {
    public boolean isPalindromeWithExtraSpace(String str) {
        ArrayList<Character> characters = new ArrayList<>();
        char[] charArray = str.toLowerCase().toCharArray();
        for (Character ch : charArray) {
            if (Character.isLetterOrDigit(ch)) {
                characters.add(ch);
            }

        }
        int start = 0;
        int end = characters.size() - 1;

        while (start < end) {
            if (characters.get(start) != characters.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome(String str) {
        // Convert to lowercase to ensure case-insensitive comparison
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Skip non-alphabetic characters
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }

            // Compare characters
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

}
