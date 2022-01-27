package new1;

public class MaxSon {
    public static int getnum(String A,String B){
        int a=A.length(),b=B.length();
        int[][] dp= new int[a+1][b+1];
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                if (A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[j][j-1]);
                }
            }
        }

        return dp[a][b];
    }
    public static void main(String [] a){
        System.out.print(getnum("abcde","ace"));
    }
}
