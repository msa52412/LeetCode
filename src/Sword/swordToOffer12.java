package Sword;

public class swordToOffer12 {
    public int piv(int[] nums){
        int sum=0;
        for (int i:nums) sum+=i;
        int now=0;
        for (int i=0;i<nums.length;i++){
            sum-=nums[i];
            if (now==sum) return i;
            now+=nums[i];
        }
        return -1;
    }
}
