public class ReverseString {
    public void reverseString(char[] str) {
        int start = 0;
        int end = str.length - 1; // Corrected end initialization
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

}
