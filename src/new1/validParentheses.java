package new1;

import java.util.Stack;

public class validParentheses {
    public boolean isyes(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else {
                if (!stack.isEmpty()&&leftOf(c)==stack.peek()){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
    public char leftOf(char c){
        if (c==']') return '[';
        if (c=='}') return '{';
        return '(';
    }
}
