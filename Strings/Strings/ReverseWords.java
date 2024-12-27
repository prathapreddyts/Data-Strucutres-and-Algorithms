public class ReverseWords {

    public String reverseWords(String inpStr) {
        String trimmedString = inpStr.trim();
        String[] splitString = trimmedString.split("\\s+");
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = splitString.length-1; i >=0; i--) {
            resultBuilder.append(splitString[i].toCharArray());
            if (i != 0) {
                resultBuilder.append(" ");
            }
        }

        return resultBuilder.toString();
    }
    public String reverseEachWords(String inpStr) {
        String trimmedString = inpStr.trim();
        String[] splitString = trimmedString.split("\\s+");
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < splitString.length; i++) {
            resultBuilder.append(reverseString(splitString[i].toCharArray()));
            if (i != splitString.length - 1) {
                resultBuilder.append(" ");
            }
        }

        return resultBuilder.toString();
    }

    public String reverseString(char[] str) {
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        return String.copyValueOf(str);
    }
}
