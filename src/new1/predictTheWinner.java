package new1;

public class predictTheWinner {
    public boolean PredictTheWinner(int[] p) {

        int n=p.length;
        if(n==1||n%2==0) return true;

        int[][][] dp=new int[n][n][2];

        for(int i=0;i<n;i++) {

            dp[i][i][0]=p[i];
            dp[i][i][1]=0;
        }

        for(int l=2;l<=n;l++) {
            for(int i=0;i<n-1;i++) {
                int j=l+i-1;
                if(j<n) {

                    int right=p[j]+dp[i][j-1][1];
                    int left=p[i]+dp[i+1][j][1];
                    if(left>right) {
                        dp[i][j][0]=left;
                        dp[i][j][1]=dp[i+1][j][0];
                    }
                    else {
                        dp[i][j][0]=right;
                        dp[i][j][1]=dp[i][j-1][0];
                    }
                }
                else {
                    break;
                }
            }
        }

        return dp[0][n-1][1]<=dp[0][n-1][0];

    }
}
