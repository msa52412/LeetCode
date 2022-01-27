package new1;

public class Robber1 {
    static int getmoney(int[] a){

        int all=a.length;
        if (all==1){
            return a[0];
        }

        int dp_0=0,dp_1=a[0],dp=-1;
        for(int i=2;i<=all;i++){
            dp=Math.max(dp_1,dp_0+a[i-1]);
            dp_0=dp_1;
            dp_1=dp;

        }
        return dp;
    }
    public static void main(String [] aw){
        int num[]={2};
        System.out.print(getmoney(num));
    }
}
