package new1;

import java.util.HashMap;

public class countNumberOfPairsWithAbsoluteDifferenceK {
    public int countDiff(int[] num,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for (int i:num){
            res+=map.getOrDefault(i+k,0)+map.getOrDefault(i-k,0);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return res;
    }
}
