package new1;

import java.util.Stack;

public class MonotoneStack {
    public static int[] monotone (int[] num){
        int[] res=new int[num.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=num.length-1;i>=0;i--){
            while (!stack.isEmpty()&&stack.peek()<=num[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1: stack.peek();
            stack.push(num[i]);
        }
        return res;
    }
    public static void main(String[] a){
        int[] num={2,1,2,4,3};
        int[] t=monotone(num);
        for (int i:t) System.out.println(i);
    }
}
