package new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class minimumIndexSumOfTwoLists {
    public static String[] find(String[] l1,String[] l2){
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i<l1.length;i++){
            map.put(l1[i],i);
        }
        ArrayList<String> res=new ArrayList<>();
        int wei=Integer.MAX_VALUE;
        for (int i=0;i<l2.length;i++){
            if (map.containsKey(l2[i])){
            if (wei>i+map.get(l2[i])){
                res.clear();
                wei=i+map.get(l2[i]);
                res.add(l2[i]);
            }
            else if (wei==i+map.get(l2[i])){
                res.add(l2[i]);}
            }

        }
        return res.toArray(new String[0]);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"})));
    }
}
