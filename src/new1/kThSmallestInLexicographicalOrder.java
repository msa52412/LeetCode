package new1;

public class kThSmallestInLexicographicalOrder {
    public int find(int n,int k){
        int cur=1;
        k--;
        while (k>0){
            int all=getall(cur,n);
            if (all<=k){
                k-=all;
                cur++;
            }
            else {
                cur=cur*10;
                k--;
            }
        }
        return cur;
    }
    public int getall(int cur,int n){
        int all=0;
        long fir=cur;
        long end=cur;
        while (fir<=n){
            all+=Math.min(end,n)-fir+1;
            fir=fir*10;
            end=end*10+9;
        }
        return all;
    }
}
