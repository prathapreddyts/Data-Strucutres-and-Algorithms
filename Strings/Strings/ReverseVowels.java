import java.util.*;

public class ReverseVowels {
    public String reverseVowelsUsingStack(String usrInput) {
        Stack<Character> vowelStack = new Stack<>();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < usrInput.length(); i++) {
            if (usrInput.charAt(i) == 'a' || usrInput.charAt(i) == 'e' || usrInput.charAt(i) == 'i'
                    || usrInput.charAt(i) == 'o'
                    || usrInput.charAt(i) == 'u' || usrInput.charAt(i) == 'A' || usrInput.charAt(i) == 'E'
                    || usrInput.charAt(i) == 'I' || usrInput.charAt(i) == 'O' || usrInput.charAt(i) == 'U'){
                vowelStack.push(usrInput.charAt(i));

            }
        }

        for(int i=0;i<usrInput.length();i++){
            if (usrInput.charAt(i) == 'a' || usrInput.charAt(i) == 'e' || usrInput.charAt(i) == 'i'
                    || usrInput.charAt(i) == 'o'
                    || usrInput.charAt(i) == 'u' || usrInput.charAt(i) == 'A' || usrInput.charAt(i) == 'E'
                    || usrInput.charAt(i) == 'I' || usrInput.charAt(i) == 'O' || usrInput.charAt(i) == 'U'){
                if(!vowelStack.isEmpty()){
                    resultString.append(vowelStack.pop());
                }
            }else{
                resultString.append(usrInput.charAt(i));
            }
        }
      return resultString.toString();
    }

    public String reverseVowels(String usrInput) {
        if (usrInput == null) {
            return null;
        }
        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        Deque<Character> vowelStack = new ArrayDeque<>();
        for (char ch : usrInput.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelStack.push(ch);
            }
        }
        StringBuilder resultString = new StringBuilder();
        for (char ch : usrInput.toCharArray()) {
            if (vowels.contains(ch)) {
                resultString.append(vowelStack.pop());
            } else {
                resultString.append(ch);
            }
        }

        return resultString.toString();
    }


}
