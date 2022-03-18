package new1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class swordToOffer3 {
    public int find(int[] num){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<num.length;i++){
            if (map.containsKey(num[i])) return num[i];
            map.put(num[i],i);
        }
        return -1;
    }
    public static int findHash(int[] num){
        int i=0;
        while (i<num.length){
            if (num[i]==i) {
                i++;
                continue;
            }
            if (num[num[i]]==num[i]) return num[i];
            else {
                int mid=num[num[i]];
                num[num[i]]=num[i];
                num[i]=mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findHash(new int[]{3,4,2,0,0,1}));
    }
}
