package new1;

public class zhengze {
    public static boolean zzsearch(String A,String B){

        int m=B.length(),n=A.length();
        boolean[][] dp= new boolean[n+1][m+1];
        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                if (j==0){
                    dp[i][j]=(i==0);
                }
                else {
                if (B.charAt(j-1)!='*') {
                    if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
                else {
                        if(j>=2){
                            dp[i][j]=dp[i][j-2];
                        }
                        if (i>0&&j>1&&(A.charAt(i-1)==B.charAt(j-2)||B.charAt(j-2)=='.')){
                            dp[i][j]=dp[i][j]|dp[i-1][j];
                        }
                    }

                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] a){
        System.out.print(zzsearch("abb","c*a*b*"));
    }
}
