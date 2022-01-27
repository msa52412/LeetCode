package new1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twooutofthree {
    public static List<Integer> getnum(int[] nums1, int[] nums2, int[] nums3){
        int[] num=new int[101];
        Set nums=new HashSet();
        for (int n:nums1){
            num[n]=1;
        }
        for (int n:nums2){
            if (num[n]==1){
                nums.add(n);
                num[n]=-1;
            }
            else if(num[n]==0){
                num[n]=3;
            }

        }
        for (int n:nums3){
            if (num[n]==1||num[n]==3){
                nums.add(n);
            }
        }

        return new ArrayList<>(nums);
    }
    public static void main(String[] as){

        int[] nums1 ={2,15,10,11,14,12,14,11,9,1}, nums2 = {8,9,13,2,11,8}, nums3 = {13,5,15,7,12,7,8,3,13,15};

        System.out.print(getnum(nums1,nums2,nums3));
    }

}
