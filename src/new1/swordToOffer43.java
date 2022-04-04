package new1;

public class swordToOffer43 {
    public int count(int n){
        int res=0,low=0;
        int high=n/10,now=high%10,dig=1;
        while (high!=0||now!=0){
            if (now==0) res+=high*dig;
            else if (now==1) res+=high*dig+low+1;
            else res+=(high+1)*dig;
            low+=now*dig;
            now=high%10;
            high/=10;
            dig*=10;
        }
        return res;
    }
}
