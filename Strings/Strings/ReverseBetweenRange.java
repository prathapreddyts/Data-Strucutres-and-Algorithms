public class ReverseBetweenRange {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        if (end == -1) {
            return word;
        }

        char[] chars = word.toCharArray();
        int start = 0;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(chars);
    }

}
