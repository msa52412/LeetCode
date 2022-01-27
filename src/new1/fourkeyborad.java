package new1;

public class fourkeyborad {
    public static int maxcv(int n){
        int[] dp= new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]+1;
            for (int j=2;j<i;j++){
                dp[i]=Math.max(dp[i],dp[j-2]*(i-j+1));
            }
        }
        return dp[n];
    }
    public static void main(String[] wa){
        System.out.print(maxcv(3));
    }

}
