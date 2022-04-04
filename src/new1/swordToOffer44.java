package new1;

public class swordToOffer44 {
    public static int find(int n){
        for (int i = 0;; i++){
            String m= Integer.toString(i);
            if (n==0) return m.charAt(0)-'0';
            if (m.length()>n){
                return m.charAt(n-1)-'0';
            }
            n-=m.length();
        }
    }
    public int find1(int n){
        int dig=1;
       long start=1;
        long count=9;
        while (count<n){
            n-=count;
            dig++;
            start*=10;
            count=dig*start*9;
        }
        long num=start +(n-1)/dig;
        return Long.toString(num).charAt((n-1)%dig)-'0';
    }

    public static void main(String[] args) {
        long i=System.currentTimeMillis();
        find(2147483647);
        long j=System.currentTimeMillis();
        System.out.println(j-i);
    }
}
