package new1;

public class Gupiao {
	public static int getmoney(int[] price) {
	
		int n=price.length;
		int[][]dp=new int[n][2];
		for(int i=0;i<n;i++) {
			if(i==0) {
				dp[i][0]=0;
				dp[i][1]=-price[i];
				continue;
			}
			dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]+price[i]);
			
			dp[i][1]=Math.max(dp[i-1][1], -price[i]);
		
		}
		return dp[n-1][0];
		
		
	}
	public static void main(String[] aw) {


		int[] price= {1,6,3,4,5};
		System.out.print(getmoney(price));
		
}
}
