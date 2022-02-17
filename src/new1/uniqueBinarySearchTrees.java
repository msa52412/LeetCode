package new1;

public class uniqueBinarySearchTrees {
    public int numTree(int n){
        if (n==0||n==1) return n;
        int[] dp=new int[n+1];
        dp[0]=1;dp[1]=1;
        for (int i=2;i<=n;i++){
            for (int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
        /*long long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int)C;*/
    }



}
