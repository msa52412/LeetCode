package new1;

import java.util.HashMap;

public class swordToOffer39 {
    public int mar(int[] num){
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=num.length%2==1?num.length/2+1:num.length/2;
        for (int i:num) {
            int nums=map.getOrDefault(i,0)+1;
            if (nums>=len) return i;
            map.put(i,nums);

        }
        return 0;
    }
    public int mar1(int[] num){
        int x=0,count=0;
        for (int i:num){
        if (count==0) x=i;
        count+=i==x?1:-1;
        }
        return x;
    }
}
