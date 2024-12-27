package parenthesis;

import java.util.Stack;

public class removeToMakeValidParenthesis {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]=='('){
                stack.push(i);
            }
            else if(stack.isEmpty() && arr[i]==')'){
                arr[i] = '-';
            }
            else if(arr[i]==')'){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            arr[stack.pop()] = '-';
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]!='-') sb.append(arr[i]);
        }
        return sb.toString();
    }
}
