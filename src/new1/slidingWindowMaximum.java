package new1;

import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {
    public int[] maxsliding(int[] num,int k){
        int n=num.length;
        Deque<Integer> deque=new LinkedList<Integer>();
        for (int i=0;i<k;i++){
            while (!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] res=new int[n-k+1];
        res[0]=num[deque.peekFirst()];
        for (int i=k;i<n;i++){
            while (!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            res[i-k+1]=num[deque.peekFirst()];
        }
        return res;
    }
}
