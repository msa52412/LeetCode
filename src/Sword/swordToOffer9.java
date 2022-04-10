package Sword;

import java.util.Scanner;

public class swordToOffer9 {
    public static int max(int[] nums,int k){
        if (k<=1) return 0;
        int res=0;
        int l=0,r=0;
        int count=1;
        while (r<nums.length){
            count*=nums[r];
            while (count>=k){
               count/=nums[l];
               l++;
            }
            res+=r-l+1;
            r++;

        }
        return res;
    }


}
