package new1;

public class Qiangshitou {
	public static void main(String[] aw) {
		int[] p= {3,9,1,2};
		System.out.print(game(p));
	} 
	
public static int game(int[] p) {
	int n=p.length;

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
	
return dp[0][n-1][1]-dp[0][n-1][0];	
}	

}
