package new1;

public class swordToOffer53 {
    //i
    public static int search(int[] nums,int tar){
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0]==tar?1:0;
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if (nums[mid]>tar){
                r=mid-1;
            }
            else if (nums[mid]<tar){
                l=mid+1;
            }
            else {
                int i=mid,j=mid;
                while (i!=-1&&nums[i]==tar) i--;
                while (j!=nums.length&&nums[j]==tar) j++;
                return j-i-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(miss(new int[]{0,1,3}));
    }
    //ii
    public static int miss(int[] nums){
        if (nums.length==1) {
            if (nums[0] == 0) return 1;
        }

        if (nums[0] == 1) return 0;

        if (nums[nums.length-1]==nums.length-1) return nums.length;
        if (nums[1]==2) return 1;
        int l=0,r=nums.length-1;
        int mid=-1;
        while (l<=r){
            mid=(l+r)/2;
            if (nums[mid]!=mid){
                r=mid-1;
            }
            else if (nums[mid]==mid){
                l=mid+1;
            }
        }
        if (nums[mid]==mid&&nums[mid+1]!=mid+1) return mid+1;
        else return mid;
    }
}
