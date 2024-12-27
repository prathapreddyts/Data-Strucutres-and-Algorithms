package parenthesis;

import java.util.Stack;

public class IsValidParenthis {
    public boolean isValid(String str) {
        Stack<Character> parenthesis = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parenthesis.push(c);
            } else if (c == ')' && !parenthesis.isEmpty() && parenthesis.peek() == '(') {
                parenthesis.pop();
            } else if (c == '}' && !parenthesis.isEmpty() && parenthesis.peek() == '{') {
                parenthesis.pop();
            } else if (c == ']' && !parenthesis.isEmpty() && parenthesis.peek() == '[') {
                parenthesis.pop();
            } else {
                return false;
            }
        }
        return parenthesis.isEmpty();
    }

}
