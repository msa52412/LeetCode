package new1;

import java.util.*;

public class swordToOffer30 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public swordToOffer30(){
        stack2= new Stack<Integer>();
        stack1=new Stack<Integer>();
    }
    public void push(int x){
        stack1.add(x);
        if (stack2.isEmpty()||stack2.peek()>=x) stack2.add(x);
    }
    public void pop(){
        if (stack1.pop().equals(stack2.peek())) stack2.pop();
    }
    public int top(){
        return stack1.peek();
    }
    public int min(){
        return stack2.peek();
    }

}
