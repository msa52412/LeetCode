package hot100;

import java.util.Stack;

public class num739 {
    public int[] day(int[] tmp){
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[tmp.length];
        res[tmp.length-1]=0;
        stack.add(tmp.length-1);
        for (int i=tmp.length-2;i>=0;i--){
            while (!stack.isEmpty()&&tmp[stack.peek()]<=tmp[i]) stack.pop();
            res[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.add(i);
        }
        return res;
    }
}
