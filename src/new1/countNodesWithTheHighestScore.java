package new1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class countNodesWithTheHighestScore {
    long maxS=0;
    int res=0;
    int n;
    List<Integer>[] children;
    public int count(int[] parent){
        n=parent.length;
        children=new List[n];
        for (int i=0;i<n;i++){
            children[i]=new ArrayList<Integer>();
        }
        for (int i=0;i<n;i++){
            int p=parent[i];
            if (p!=-1) children[p].add(i);
        }
        dfs(0);
        return res;
    }
    public int dfs(int node){
        long s=1;
        int size=n-1;
        for (int c:children[node]){
            int t=dfs(c);
            s*=t;
            size-=t;
        }
        if (node!=0) s*=size;
        if (s==maxS) res++;
        else if (s>maxS){
            maxS=s;
            res=1;
        }
        return n-size;
    }
    public int max(int[] h){
        int n=h.length;
        if (n==0) return 0;
        int lmax=h[0];
        int rmax=h[n-1];
        int l=0,r=n-1;
        int res=0;
        while (l<=r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            if (lmax<rmax){
                res+=lmax-h[l];
                l++;
            }
            else {
                res+=rmax-h[r];
                r--;

            }
        }
    return res;
    }
}
