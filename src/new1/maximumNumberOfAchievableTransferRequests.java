package new1;

import java.util.HashMap;

public class maximumNumberOfAchievableTransferRequests {
    int[] d;
    int res=0,cnt=0,zero,n;
    public int max(int n,int[][] r){
       d=new int[n];
       zero=n;
       this.n=n;
       dfs(r,0);
       return res;
    }
    public void dfs(int[][] r,int pos){
        if (pos==r.length){
            if (zero==n){
                res=Math.max(res,cnt);
            }
            return;
        }
        dfs(r,pos+1);
        int z=zero;
        cnt++;
        int[] re=r[pos];
        int x=re[0],y=re[1];
        zero-=d[x]==0?1:0;
        d[x]--;
        zero+=d[x]==0?1:0;
        zero-=d[y]==0?1:0;
        d[y]++;
        zero+=d[y]==0?1:0;
        dfs(r,pos+1);
        d[y]--;
        d[x]++;
        cnt--;
        zero=z;
    }
}
