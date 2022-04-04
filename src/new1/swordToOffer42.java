package new1;

public class swordToOffer42 {
    public int max(int[] num){
        int[] dp=new int[num.length];
        dp[0]=num[0];
        int max=0;
        for (int i=1;i<num.length;i++){
            dp[i]=Math.max(dp[i-1]+num[i],num[i]);
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
