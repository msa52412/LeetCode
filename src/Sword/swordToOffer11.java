package Sword;

import java.util.HashMap;

public class swordToOffer11 {
    public static int find(int[] nums){
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0) nums[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        map.put(nums[0],0);
        int pre=nums[0];
        int res=0;
        for (int i=1;i<nums.length;i++){
            pre+=nums[i];
            if (map.containsKey(pre)){
                res=Math.max(res,i-map.get(pre));
            }
           else {
               map.put(pre,i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        find(new int[]{0,0,1,0,0,0,1,1});
    }
}
