package hot100;

public class num279 {
    public int num(int n){
        int[] dp=new int[n+1];
        for (int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for (int j=1;j*j<=i;j++){
                min=Math.min(min,dp[i-j*j]);
            }
            dp[i]=min+1;
        }
        return dp[n];
    }
    public int num1(int n){
        if (isSqrt(n)) return 1;
        if (is4(n)) return 4;
        for (int i=1;i*i<=n;i++){
            int j=n-i*i;
            if (isSqrt(j)) return 2;
        }
        return 3;
    }
    public boolean isSqrt(int x){
        int y=(int)Math.sqrt(x);
        return y*y==x;
    }
    public boolean is4(int x){
        while (x%4==0) x/=4;
        return x%8==7;
    }
}
