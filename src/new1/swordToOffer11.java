package new1;

public class swordToOffer11 {
    public int minA(int[] num){
        int l=0,r=num.length-1;
       while (l<r){
           int mid=(l+r)/2;
           if (num[mid]<num[r]){
               r=mid;
           }
           else if (num[mid]>num[r]){
               l=mid+1;
           }
           else r--;
       }
        return num[r];
    }
}
