package new1;

import java.util.Arrays;

public class maxdizengzixulie {
	
	public static int maxdizeng(int[] a) {
		int[] dp=new int[a.length];
		Arrays.fill(dp, 1);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
				
			}
			
		}
		int max=0;
		for(int i=0;i<dp.length;i++) {
			max=Math.max(max, dp[i]);
		}
		return max;
		
	}
	
	public static void main(String[] aw) {

		
		int[] c= {1,5,3,4,9,10,2,15};
		System.out.print(maxdizeng(c));
	}
		

}
