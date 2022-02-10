package new1;

import java.util.HashMap;

public class subarraySumEqualsK {
    public int sub(int[] num,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,ans=0;
        for (int e:num){
            sum+=e;
            if (map.containsKey(sum-k)) ans+=map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);

        }
        return ans;
    }
}
