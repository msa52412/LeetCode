package new1;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class swordToOffer49 {
    //heap
    public int nut(int n){
        int[] add={2,3,5};
        Set<Long> set=new HashSet<>();
        PriorityQueue<Long> heap= new PriorityQueue<>();
        set.add(1L);
        heap.offer(1L);
        int now=0;
        for (int i=0;i<n;i++){
            long cur=heap.poll();
            now=(int)cur;
            for (int k:add){
                long next=cur*k;
                if (set.add(next)){
                    heap.offer(next);
                }
            }
        }
        return now;
    }
    //dp
    public int dp(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        int p2=1,p3=1,p5=1;
        for (int i=2;i<=n;i++){
            int num2=dp[p2]*2,num3=dp[p3]*3,num5=dp[p5]*5;
            dp[i]=Math.min(num2,Math.min(num3,num5));
            if (dp[i]==num2) p2++;
            if (dp[i]==num3) p3++;
            if (dp[i]==num5) p5++;
        }
        return dp[n];
    }
}
