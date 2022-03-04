package new1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class nextGreaterElementI {
    public int[] next(int[] n1,int[] n2){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Deque<Integer> s=new ArrayDeque<Integer>();
        for (int i=n2.length-1;i>=0;i--){
            int num=n2[i];
            while (!s.isEmpty()&&num>s.peek()){
                s.pop();
            }
            map.put(num,s.isEmpty()?-1:s.peek());
            s.push(num);
        }
        int[] res=new int[n1.length];
        for (int i=0;i<n1.length;i++){
            res[i]=map.get(n1[i]);
        }
        return res;
    }
}//石家庄 9；08
