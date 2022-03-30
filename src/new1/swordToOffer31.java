package new1;

import java.util.Stack;

public class swordToOffer31 {
    public boolean isval(int[] push,int[] pop){
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int eve:push){
            stack.push(eve);
            while (j<pop.length&&!stack.isEmpty()&&stack.peek()==pop[j]){
                stack.pop();
                j++;
            }
        }
        return j==pop.length;
    }
}
