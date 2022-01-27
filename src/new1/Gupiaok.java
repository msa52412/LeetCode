package new1;

public class Gupiaok {
	public static int getnum(int k,int[] price) {
		int n=price.length;
		int[][][] dp= new int[n+1][k+1][2];
		for(int i=0;i<=n;i++) {
			for(int k1=k;k1>=1;k1--) {
				if(i==0) {

			
					dp[i][k][0]=0;
					dp[i][k][1]=Integer.MIN_VALUE;
					
				continue;
				}
				dp[i][k][0]=Math.max(dp[i-1][k][0], dp[i-1][k][1]+price[i-1]);
				System.out.print("i"+i+"\n"+dp[i][k][0]+"\n");
				dp[i][k][1]=Math.max(dp[i-1][k][1], dp[i-1][k-1][0]-price[i-1]);
				System.out.print(dp[i][k][1]+"\n");
			}
		}
		return dp[n-1][k][0];
	}
	public static void main(String[] wa) {
		int k=2;
		int[] price={1,3,5,10,50,3,1,20,1,50,60,20,50,1,90};
		System.out.print(getnum(k, price));
		
	}

}
