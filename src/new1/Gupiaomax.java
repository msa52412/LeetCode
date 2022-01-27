package new1;

public class Gupiaomax {
	public static void main(String[] wa) {
	
	int[] price= {1,2,5,10,5,3,15};
	System.out.print(getnum(price));
	
	}

	public static int getnum(int[] price) {
		int n=price.length;
		int dp_i_0=0;
		int dp_i_1=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int tmp=dp_i_0;
			dp_i_0=Math.max(dp_i_0, dp_i_1+price[i]);
			dp_i_1=Math.max(dp_i_1, tmp-price[i]);
			
		}
		return dp_i_0;
	}
}
