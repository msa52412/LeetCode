package hot100;

import java.util.Stack;

public class num155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public num155(){
        stack=new Stack<>();
        minStack=new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x){
        stack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
