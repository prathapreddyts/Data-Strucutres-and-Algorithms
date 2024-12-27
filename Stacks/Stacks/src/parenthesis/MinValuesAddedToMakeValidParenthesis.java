package parenthesis;

import java.util.Stack;

public class MinValuesAddedToMakeValidParenthesis {

    public int minAddToMakeValid(String s) {
        int open = 0, mismatch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                open++;
            else {
                if (open > 0)
                    open--;
                else
                    mismatch++;
            }
        }
        return open + mismatch;
    }
    public int minAddToMakeValidUsingStack(String str) {
        Stack<Character> characterStack = new Stack<>();
        int unmatchedClosing = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                characterStack.push(c);
            } else if (c == ')') {
                if (!characterStack.isEmpty() && characterStack.peek() == '(') {
                    characterStack.pop();
                } else {
                    unmatchedClosing++;
                }
            }
        }
        return characterStack.size() + unmatchedClosing;
    }

}

