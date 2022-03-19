package new1;

public class swordToOffer101 {
    public static int fib(int n){
        if (n==0||n==1) return n;
        int l1=0,l2=1;
        int i=0;
        while (i<n-1){
            int pre=(l1+l2)%1000000007;
            l1=l2;
            l2=pre;
            i++;
        }             //512559680
        return l2;//%(1000000007);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
