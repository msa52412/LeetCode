package new1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class gridIllumination {
        int[][] dirs={{0,0},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}};
        public int[] gridlight(int n,int[][] lamps,int[][] quer){
            long N=n;
            Map<Integer,Integer> row=new HashMap<>(),col=new HashMap<>();
            Map<Integer,Integer> left=new HashMap<>(), right=new HashMap<>();
            Set<Long> set=new HashSet<>();
            for (int[] l:lamps){
                int x=l[0],y=l[1];
                int a=x+y,b=x-y;
                if (set.contains(x*N+y)) continue;
                light(row,x);light(col,y);
                light(left,a);light(right,b);
                set.add(x*N+y);
            }
            int m=quer.length;
            int[] res=new int[m];
            for (int i=0;i<m;i++){
                int[] q=quer[i];
                int x=q[0],y=q[1];
                int a=x+y,b=x-y;
                if (row.containsKey(x)||col.containsKey(y)||left.containsKey(a)||right.containsKey(b)) res[i]=1;
                for (int[] d:dirs){
                    int dx=x+d[0],dy=y+d[1];
                    int da=dx+dy,db=dx-dy;
                    if (dx<0||dx>=n||dy<0||dy>=n) continue;
                    if (set.contains(dx*N+dy)){
                        set.remove(dx*N+dy);
                        unlight(row,dx);unlight(col,dy);
                        unlight(left,da);unlight(right,db);
                    }
                }
            }
            return res;
        }
        public void light(Map<Integer,Integer> map,int key){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        public void unlight(Map<Integer,Integer> map,int key){
            if (map.get(key)==1) map.remove(key);
            else map.put(key, map.get(key)-1);
        }
}
