package new1;

public class swordToOffer62 {
    //约瑟夫环
    public int last(int n,int m){
        int g=0;
        for (int i=2;i!=n+1;i++){
            g=(g+m)%i;
        }
        return g;
    }
    //63
    public int max(int[] prices){
        int min=Integer.MAX_VALUE;
        int res=0;
        for (int i:prices){
            min=Math.min(i,min);
            res=Math.max(res,i-min);
        }
        return res;
    }
    //1+2+3+4***+n not  if
    public int sum(int n){
        boolean f=(n>0)&&(n+=sum(n-1))>0;
        return n;
    }
    //not + sum
    public int sum1(int a,int b){
        if (b==0) return a;
        return sum1(a^b,(a&b)<<1);
    }
    public static int[] count(int[] a){
        if (a.length==0) return a;
       int[] pre=new int[a.length];
       int[] last=new int[a.length];
       int res=1;
       pre[0]=1;
       for (int i=1;i<a.length;i++){
           res*=a[i-1];
           pre[i]=res;
       }
       res=1;
       last[a.length-1]=1;
        for (int i=a.length-2;i>=0;i--){
            res*=a[i+1];
            last[i]=res;
        }
        int[] ress=new int[a.length];
        for (int i=0;i<a.length;i++){
            ress[i]=last[i]*pre[i];
        }
        return ress;
    }

    public static void main(String[] args) {
        count(new int[]{1,2,3,4,5});
    }


}
