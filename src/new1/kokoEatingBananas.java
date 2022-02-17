package new1;

public class kokoEatingBananas {
    public int minS(int[] p,int h){
        int max=getmax(p);
        int l=1,r=max+1;
        while (l<r){
            int mid=(r+l)/2;
            if (canF(p,mid,h)){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return l;

    }
    public int getmax(int[] p){
        int max=0;
        for (int k:p) max=Math.max(max,k);
        return max;
    }
    public boolean canF(int[] p,int s,int h){
        int time=0;
        for (int e:p){
            time+=(e/s)+(e%s>0?1:0);
        }
        return time<=h;
    }
}
