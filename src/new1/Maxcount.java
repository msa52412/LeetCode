package new1;

import java.util.Arrays;

public class Maxcount {
    public static int getcount(int[]a,int k){
        int[] dp=new int[a.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=a[0];
        int t = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++) {

            for (int k1 = 1; k1 <= k; k1++) {

                if (i - k1 >=0) {
                    dp[i] = Math.max(dp[i],dp[i - k1] + a[i]);



                }


            }



        }
        return dp[a.length-1];
    }
    public static void main(String[] aw){
        int a[]={1,-1,-2,4,-7,3};
        int k=2;
        System.out.print(getcount(a,k));
    }
}
