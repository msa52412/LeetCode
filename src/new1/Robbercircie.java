package new1;

public class Robbercircie {
    static int getmoney(int[] a){
        int all=a.length;

        int dp_0=0,dp_1=a[0],dp=-1;
        for(int i=2;i<=all;i++){
            dp=Math.max(dp_1,dp_0+a[i-1]);
            dp_0=dp_1;
            dp_1=dp;

        }
        return dp;
    }
    static int getcircle(int[] b){
        int c[] = new int[b.length-1];
        for (int i=1;i<b.length;i++){
            c[i-1]=b[i];
        }
        int num=getmoney(c);
        for (int i=0;i<b.length-1;i++){
            c[i]=b[i];
        }
        return Math.max(num,getmoney(c));
    }
    public static void main(String [] wea){
        int num[]={2,7,9,3,1};
        System.out.print(getcircle(num));
    }
}
