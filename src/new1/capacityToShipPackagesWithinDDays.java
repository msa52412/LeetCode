package new1;

import java.util.Deque;
import java.util.LinkedList;

public class capacityToShipPackagesWithinDDays {
    public int getmax(int[] p){
        int max=0;
        for (int k:p) max=Math.max(max,k);
        return max;
    }
    public int getsum(int[] p){
        int max=0;
        for (int k:p) max+=k;
        return max;
    }
    public boolean canF(int[] p,int cap,int day){
        int e=0;
        for (int i=0;i<day;i++){
            int maxcap=cap;
            while ((maxcap-=p[e])>=0){
                e++;
                if (e==p.length) return true;
            }
        }
        return false;
    }
    public int minS(int[] p,int h){
        int l=getmax(p),r=getsum(p)+1;
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



}
