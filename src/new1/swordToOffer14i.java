package new1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class swordToOffer14i {
    public int cut(int n){
        if(n<2) return n;
        if(n==2) return 1;
        if(n==3) return 2;
        if (n%3==0) return (int) Math.pow(3,(int)(n/3));
        if (n%3==2) return (int) (Math.pow(3,(int)(n/3))*2);
        else return (int) (Math.pow(3,(int)(n/3-1))*2*2);
    }
    public int cut1(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;
        dp[4]=4;
        for (int i=5;i<=n;i++){
            for (int j=2;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
    public boolean div(int[] num){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int k:num) map.put(k,map.getOrDefault(k,0)+1);
        for (int m:map.values()) if (m%2==1) return false;
        return true;
    }
    public int cut2(int n){
       if (n<=3) return n-1;
       long res=1L;
       int p=(int) 1e9+7;
       while (n>4){
           res=res*3%p;
           n-=3;
       }
       return (int) (res*n%p);
    }
}
