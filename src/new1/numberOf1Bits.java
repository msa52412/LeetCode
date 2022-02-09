package new1;

public class numberOf1Bits {
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
