package new1;

public class Gupiaocooldown {
	public static int getnum(int[] price) {
		int n=price.length;
		int dp_i_0=0;
		int dp_i_1=Integer.MIN_VALUE;
		int pre = 0;
		for(int i=0;i<n;i++) {
			int tmp=dp_i_0;
			dp_i_0=Math.max(dp_i_0, dp_i_1+price[i]);
			dp_i_1=Math.max(dp_i_1, pre-price[i]);
		    pre=tmp;
		}
		return dp_i_0;
	}

	
	public static void main(String[] aw) {
		int [] price= {1,2,5,10,3,16,19};
		System.out.print(getnum(price));
	}
}
