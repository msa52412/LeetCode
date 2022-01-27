package new1;
//sumit
public class charminzhuanhua {

	public static void main(String[] sd) {
	System.out.print(mindis("horse","ros"));

	}
	public static int mindis(String s1, String s2) {
		int m=s1.length(),n=s2.length();
		int[][] dp=new int[m+1][n+1];
		for(int i=1;i<m+1;i++) {
			dp[i][0]=i;
		}
		for(int j=1;j<n+1;j++) {
			dp[0][j]=j;
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]))+1;
				}
			}
		}
		return dp[m][n];
	}
}
