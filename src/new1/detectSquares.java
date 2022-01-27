package new1;

import java.util.HashMap;
import java.util.Map;

public class detectSquares {
    Map<Integer,Map<Integer,Integer>> xMap=new HashMap<>();
    Map<Integer,Map<Integer,Integer>> yMap=new HashMap<>();
    public detectSquares() {

    }

    public void add(int[] point) {
        var x=xMap.getOrDefault(point[0],new HashMap<>());
        x.put(point[1],x.getOrDefault(point[1],0)+1);
        xMap.put(point[0],x);
        var y=yMap.getOrDefault(point[1],new HashMap<>());
        y.put(point[0],y.getOrDefault(point[0],0)+1);
        yMap.put(point[1],y);

    }

    public int count(int[] point) {
        int x=point[0],y=point[1];
        int ans=0;
        if(!yMap.containsKey(y)||!xMap.containsKey(x)) return 0;
        var allx=yMap.get(y);
        for (var onex:allx.keySet()){

            int d=onex-x;
            if(d!=0){
                var ally=xMap.get(x);
                if(ally.containsKey(y-d)){
                    if (xMap.get(onex)!=null&&xMap.get(onex).containsKey(y-d)){
                        ans+=allx.get(onex)*ally.get(y-d)*xMap.get(onex).get(y-d);
                    }
                }
                if (ally.containsKey(y+d)){
                    if(xMap.get(onex)!=null&&xMap.get(onex).containsKey(y+d)){
                        ans+=allx.get(onex)*ally.get(y+d)*xMap.get(onex).get(y+d);
                    }
                }

            }
        }
        return ans;

    }
}
