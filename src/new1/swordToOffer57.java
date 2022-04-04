package new1;

import java.util.ArrayList;
import java.util.List;

public class swordToOffer57 {
    public int[] twosum(int[] nums,int tar){
        int i=0,j=nums.length-1;
        while (i<=j){
            int tarr=nums[i]+nums[j];
            if (tarr>tar) j--;
            else if (tarr<tar) i++;
            else return new int[]{nums[i],nums[j]};
        }
        return null;
    }
    static List<int[]> ress;
    public static int[][] firn(int tar){
        int l=1,r=1;
        int sum=1;
        ress=new ArrayList<>();
        while (r<tar-1){
            while (sum>tar&&l<r){
                sum-=l;
                l++;
            }
            if (sum==tar) {
                fill(l,r);
                sum-=l;
                l++;
            }
            while (sum<tar&&r<tar-1){
                r++;
                sum+=r;
            }
            if (sum==tar) {
                fill(l,r);
                r++;
                sum+=r;
            }
        }
        return ress.toArray(new int[0][]);
    }
    public static void fill(int l,int r){
        int[] res=new int[r-l+1];
        for(int i=0;i<=r-l;i++){
            res[i]=i+l;
        }
        ress.add(res);
    }

    public static void main(String[] args) {
        firn(9);
    }
}
