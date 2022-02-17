package new1;

public class minimumNumberOfDaysToMakeMBouquets {
    public int midD(int[] bloom,int m,int k){
        if (m> bloom.length/k) return -1;
        int low= Integer.MAX_VALUE,high=0;
        int n=bloom.length;
        for (int i=0;i<n;i++){
            low=Math.min(low,bloom[i]);
            high=Math.max(high,bloom[i]);
        }
        while (low<high){
            int days=(high+low)/2;
            if (canMake(bloom,days,m,k)){
                high=days;
            }
            else low=days+1;
        }
        return low;
    }
    public boolean canMake(int[] bloom,int day,int m,int k){
        int b=0,f=0,l=bloom.length;
        for (int i=0;i<l&&b<m;i++){
            if (bloom[i]<=day){
                f++;
                if (f==k){
                    b++;
                    f=0;
                }
            }
            else f=0;
        }
        return b>=m;
    }
}
