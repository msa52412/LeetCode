package new1;

import java.util.HashMap;

public class swordToOffer56 {
    public static int[] single(int[] nums){
        int len=0;
        for (int m:nums) len^=m;
        int p=0;
        while (true){
            if (len%2==1) break;
            len/=2;
            p++;
        }
        int[] res=new int[2];
        for (int m:nums){
            if ((m>>p)%2==1) res[0]^=m;
            else res[1]^=m;
        }
        return res;
    }

    public static void main(String[] args) {
        single(new int[]{6,2,3,3});
    }
    public int sing(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for (int i:nums) if (map.get(i)==1) return i;
        return -1;
    }
}
