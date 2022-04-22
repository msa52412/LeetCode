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
    public ListNode get(ListNode heada,ListNode headb){
        ListNode a=heada,b=headb;
        while (a!=null&&b!=null){
            a=a.next;
            b=b.next;
        }
        if (a==null){
            a=headb;
            while (a!=null&&b!=null){
                a=a.next;
                b=b.next;
            }
            b=heada;
            while (a!=b){
                a=a.next;
                b=b.next;
            }
            return a;
        }
        else {
            b=heada;
            while (a!=null&&b!=null){
                a=a.next;
                b=b.next;
            }
            a=headb;
            while (a!=b){
                a=a.next;
                b=b.next;
            }
            return a;
        }
    }
}
