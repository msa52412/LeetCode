package new1;

import java.util.Arrays;

public class coucoin {
	
   public static void main(String[] ad) {

	   System.out.print(coin(30));

	   
   }
   public static int coin(int all) {
	   int[] coin= {1,2,5,10,15};
	   int[] dp=new int[all+1];
	   Arrays.fill(dp,all+1);

	   dp[0]=0;
	   for(int i=0;i<dp.length;i++){
		   for (int b=0;b<coin.length;b++){
			   if(i-coin[b]<0){
				   continue;
			   }
			   dp[i]=Math.min(dp[i],dp[i-coin[b]]+1);

		   }
	   }
	   return (dp[all]==all+1)? -1: dp[all];
   }
	 

}
