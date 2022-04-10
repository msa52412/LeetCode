package Sword;

import java.util.HashMap;

public class swordToOffer10 {
    public static int sub(int[] nums,int k){
        int sum=0;
        int[] pre=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            pre[i]=sum;
        }
        int res=0;
        for (int i=0;i<nums.length;i++){
            if (pre[i]==k) res++;
            for (int j=i+1;j< nums.length;j++){
                if (pre[j]-pre[i]==k) res++;
            }
        }
        return res;
    }
    public int subm(int[] nums,int k){
        int count=0,pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int m:nums){
            pre+=m;
            count+=map.getOrDefault(pre-k,0);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        sub(new int[]{1,2,3},3);
    }
}
