package new1;

public class Gupiaok {
	public static int getnum(int maxk,int[] prices) {
		int n=prices.length;
		if(n==0) return 0;
		else if(maxk>n/2) return getMaxx(prices);
		else return getMax(maxk,prices);
	}
	public static int getMax(int maxk, int[] prices){
		int n=prices.length;
		int[][][] dp=new int[n][maxk+1][2];
		for(int k=0;k<=maxk;k++){
			dp[0][k][0]=0;
			dp[0][k][1]=-prices[0];
		}
		for(int i=1;i<n;i++){
			for(int k=maxk;k>0;k--){

				dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
				dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
			}
		}
		return dp[n-1][maxk][0];
	}
	public static int getMaxx(int[] prices){
		int dpi0=0,dpi1=Integer.MIN_VALUE;
		for(int price:prices){
			int tmp=dpi0;
			dpi0=Math.max(dpi0,dpi1+price);
			dpi1=Math.max(dpi1,tmp-price);
		}
		return dpi0;

	}

}
