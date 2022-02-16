package new1;

import java.util.Stack;

public class implementQueueUsingStacks {
    private Stack<Integer> s1,s2;
    public implementQueueUsingStacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void push(int x){
        s1.push(x);
    }
    public int peek(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }

        }
        return s2.peek();
    }
    public int pop(){
        peek();
        return s2.pop();
    }
    public boolean empty(){
        return s1.isEmpty()&&s2.isEmpty();
    }

}
