package new1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swordToOffer60 {
    static double[] res;
    static int[] dirr;
    static int all;
    static int len;
    //暴力
    public static double[] dir(int n){
        res=new double[5*n+1];
        dirr=new int[]{1,2,3,4,5,6};
        all=0;
        len=0;
        dfs(n);
        for (int i=0;i<res.length;i++){
            res[i]/=Math.pow(6,n);
        }
        return res;
    }
    public static void dfs(int min){
        if (len==min) {
            res[all-min]++;
            return;
        }
        for (int m:dirr){
            len++;
            all+=m;
            dfs(min);
            len--;
            all-=m;
        }
    }
    //dp
    public double[] dirdp(int n){
        double[] dp=new double[6];
        Arrays.fill(dp,1.0/6.0);
        for (int i=2;i<=n;i++){
            double[] tmp=new double[i*5+1];
            for (int j=0;j<dp.length;j++){
                for (int k=0;k<6;k++){
                    tmp[j+k]+=dp[j]/6;
                }
            }
            dp=tmp;
        }
        return dp;
    }
    public static void main(String[] args) {
        dir(2);
    }



}
