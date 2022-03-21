package new1;

public class swordToOffer16 {
    public static  double mypow(double x,int n){
        if(x==1) return 1;
        if (n==Integer.MIN_VALUE) return 1/(mypow(x,Integer.MAX_VALUE)*x);
        if (n<0) return 1/mypow(x,-n);
        double everes=x;
        double res=1;
        while (n!=0){
            if ((n&1)==1) res*=everes;
            n=n>>1;
            everes*=everes;
        }
        return res;
    }
    public static int count(int[] num){
        int res=0;
        int i=1;
        while (i<num.length-1){
            if ((num[i]>num[i-1]&&num[i]<num[i+1])||(num[i]<num[i-1]&&num[i]>num[i+1])||num[i]==num[i-1]) {
                i++;
                continue;
            }
            int r=i+1;
            while (r<num.length-1&&num[r]==num[i]) r++;
            if (num[i]>num[i-1]&&num[i]>num[r]) {
                res++;
                i=r;

            }
           else if (num[i]<num[i-1]&&num[i]<num[r]){
                res++;
                i=r;
            }
           else i++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mypow(2,-2147483648));
    }

}
