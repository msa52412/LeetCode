package new1;

import java.util.Deque;
import java.util.LinkedList;

public class swordToOffer9 {
    Deque<Integer> s1;
    Deque<Integer> s2;
    public swordToOffer9(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }
    public void append(int val){
        s1.push(val);
    }
    public int del(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) return -1;
        else {
            return s2.pop();
        }
    }
}
