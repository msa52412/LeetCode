package hot100;

public class num287 {
    //wa
    public int find(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==i+1) continue;
            if (nums[nums[i]-1]==nums[i]) return nums[i];
            if(nums[i]!=i+1){
                swap(nums,i,nums[i]-1);
            }
        }
        return nums[nums.length-1];
    }
    public void swap(int[] nums,int i,int j){
        int m=nums[i];
        nums[i]=nums[j];
        nums[j]=m;
    }
    public int findCir(int[] nums){
        int slow=0,fast=0;
        do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while (slow!=fast);
        slow=0;
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
