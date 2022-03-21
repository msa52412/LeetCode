package new1;

public class swordToOffer15 {
    public int ham(int n){
        int res=0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
