package Sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swordToOffer7 {
    public static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;
            int tar=-nums[i];
            int l=i+1,r=nums.length-1;
            while (l<r){
                if (nums[l]+nums[r]==tar){
                    List<Integer> ress=new ArrayList<>();
                    ress.add(-tar);
                    ress.add(nums[l]);
                    ress.add(nums[r]);
                    res.add(ress);
                    int tmp=nums[l];
                    while (l<r&&nums[l]==tmp) l++;
                    tmp=nums[r];
                    while (l<r&&nums[r]==tmp) r--;
                }
                else if (nums[l]+nums[r]<tar){
                    l++;
                }
                else r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        threesum(new int[]{-1,0,1,0});
    }
}
