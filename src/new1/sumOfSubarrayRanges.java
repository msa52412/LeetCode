package new1;

import java.util.ArrayDeque;
import java.util.Deque;

public class sumOfSubarrayRanges {
    public long sub(int[] n){
        long res=0;
        for (int i=0;i<n.length;i++){
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for (int j=i;j<n.length;j++){
                max=Math.max(max,n[j]);
                min=Math.min(min,n[j]);
                res+=max-min;
            }
        }
        return res;
    }
}
