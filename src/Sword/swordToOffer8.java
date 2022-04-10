package Sword;

public class swordToOffer8 {
    public static int min(int[] nums,int tar){
        int res=Integer.MAX_VALUE;
        int sum=0;
        int l=0,r=0;
        while (true){
            while (true){
                if (sum<tar&&r<nums.length){
                    sum+=nums[r];
                    r++;
                }
                if (sum>=tar||r==nums.length) break;
            }
            if (sum>=tar) res=Math.min(res,r-l);
            sum-=nums[l];
            l++;
            if (l==r||l==nums.length) break;
        }
        return res==Integer.MAX_VALUE?0:res;

    }

    public static void main(String[] args) {
        min(new int[]{2,3,1,2,4,3},7);
    }
    public int min1(int[] nums,int tar){
        int res=Integer.MAX_VALUE;
        int l=0,r=0;
        int sum=0;
        while (r<nums.length){
            sum+=nums[r];
            r++;
            while (l<r&&sum>=tar){
                res=Math.min(res,r-l);
                sum-=nums[l];
                l++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
