package new1;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public boolean isTwo(int[] num){
        Map<Integer,Integer> map=new HashMap<>();
        for (int k:num){
            if (map.containsKey(k)){
                return true;
            }
            map.put(k,1);
        }
        return false;
    }
}
